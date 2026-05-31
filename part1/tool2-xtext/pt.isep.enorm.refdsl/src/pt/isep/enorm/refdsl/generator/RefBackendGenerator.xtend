 package pt.isep.enorm.refdsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import pt.isep.enorm.refdsl.refDsl.Attribute
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition
import pt.isep.enorm.refdsl.refDsl.FeedbackKind
import pt.isep.enorm.refdsl.refDsl.RefModel
import pt.isep.enorm.refdsl.refDsl.ResourceRelation
import pt.isep.enorm.refdsl.refDsl.ResourceType

/**
 * Generates a Spring Boot backend skeleton from a REF model (P2 Activity 5 / 6).
 * Output: generated-backend/&lt;scenario&gt;/ (Maven project, Generation Gap packages).
 */
class RefBackendGenerator {

	val RefBackendNaming naming = new RefBackendNaming

	def void generate(RefModel model, IFileSystemAccess2 fsa) {
		val slug = naming.scenarioSlug(model)
		val root = '''generated-backend/«slug»'''
		val pkg = naming.basePackage(model)
		val app = naming.scenarioPascal(model)

		write(fsa, '''«root»/pom.xml''', pom(model))
		write(fsa, '''«root»/README.md''', readme(model, root))
		write(fsa, '''«root»/GENERATION_MANIFEST.txt''', manifest(model))
		write(fsa, '''«root»/src/main/resources/application.properties''', applicationProperties(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/«app»BackendApplication.java''', applicationClass(model))

		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/domain/enums/Role.java''', roleEnum(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/domain/generated/GeneratedUserType.java''', generatedUser(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/domain/UserType.java''', userSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/repository/generated/GeneratedUserTypeRepository.java''', generatedUserRepository(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/repository/UserTypeRepository.java''', userRepositorySubclass(model))

		for (rt : model.resourceTypes) {
			generateResource(model, fsa, root, pkg, rt)
		}
		for (fd : model.feedbackDefinitions) {
			generateFeedback(model, fsa, root, pkg, fd)
		}

		// Fase D.1: ContextType -> ONE generic entity (name + kind + resources) + ContextResource link entity.
		// Context instances from the model (e.g. AmazonCatalog) become rows, matching the manual/Sirius backends.
		val path = pkg.replace('.', '/')
		if (!model.contextTypes.empty) {
			write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedContextType.java''', contextTypeEntity(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/ContextType.java''', contextTypeSubclass(model))
			write(fsa, '''«root»/src/main/java/«path»/repository/ContextTypeRepository.java''', governanceRepo(model, "ContextType"))
			write(fsa, '''«root»/src/main/java/«path»/web/ContextTypeController.java''', governanceController(model, "ContextType", "/api/contexts"))
			write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedContextResource.java''', contextResourceEntity(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/ContextResource.java''', contextResourceSubclass(model))
			write(fsa, '''«root»/src/main/java/«path»/service/generated/GeneratedContextService.java''', generatedContextService(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/ContextService.java''', contextServiceSubclass(model))
		}

		// Fase E: governance artifacts (validation/authorization/moderation/verification/sorting/automation)
		generateGovernance(model, fsa, root, pkg)

		// Fase E.5: behaviour engines (moderation simulation + automation execution)
		generateBehaviour(model, fsa, root, pkg)

		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/security/SecurityConfiguration.java''', securityConfig(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/security/JwtService.java''', jwtService(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/security/UserTypeDetailsService.java''', appUserDetailsService(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/security/JwtAuthenticationFilter.java''', jwtAuthenticationFilter(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/dto/RegisterRequest.java''', registerRequestDto(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/dto/LoginRequest.java''', loginRequestDto(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/dto/AuthenticationResult.java''', authResponseDto(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/generated/GeneratedAuthenticationService.java''', generatedAuthService(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/AuthenticationService.java''', authServiceSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/generated/GeneratedAuthenticationController.java''', generatedAuthController(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/AuthenticationController.java''', authControllerSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/error/ApiError.java''', apiError(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/error/ApiExceptionHandler.java''', apiExceptionHandler(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/error/ResourceNotFoundException.java''', resourceNotFoundException(model))
		if (hasAnyGovernance(model)) {
			write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/generated/GeneratedPolicyService.java''', generatedPolicyService(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/PolicyService.java''', policyServiceSubclass(model))
		}
		write(fsa, '''«root»/src/test/java/«pkg.replace('.', '/')»/«app»BackendApplicationTests.java''', applicationTest(model))
	}

	def void generateResource(RefModel model, IFileSystemAccess2 fsa, String root, String pkg, ResourceType rt) {
		val entity = naming.toPascalCase(rt.name)
		val path = pkg.replace('.', '/')
		val outgoing = model.resourceRelations.filter[r|r.source === rt].toList

		write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entity».java''', generatedResourceEntity(model, rt, entity, outgoing))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/«entity».java''', entitySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/repository/generated/Generated«entity»Repository.java''', generatedRepository(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/repository/«entity»Repository.java''', repositorySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/service/generated/Generated«entity»Service.java''', generatedResourceService(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/«entity»Service.java''', serviceSubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/web/generated/Generated«entity»Controller.java''', generatedResourceController(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/web/«entity»Controller.java''', resourceControllerSubclass(model, entity))
	}

	def void generateFeedback(RefModel model, IFileSystemAccess2 fsa, String root, String pkg, FeedbackDefinition fd) {
		val entity = naming.toPascalCase(fd.name)
		val path = pkg.replace('.', '/')
		val subject = if (fd.subjectResource !== null) naming.toPascalCase(fd.subjectResource.name) else null
		val parent = if (fd.subjectFeedback !== null) naming.toPascalCase(fd.subjectFeedback.name) else null

		write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entity».java''', generatedFeedbackEntity(model, fd, entity, subject, parent))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/«entity».java''', entitySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/repository/generated/Generated«entity»Repository.java''', generatedFeedbackRepository(model, fd, entity, subject, parent))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/repository/«entity»Repository.java''', repositorySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/service/generated/Generated«entity»Service.java''', generatedFeedbackService(model, fd, entity, subject, parent))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/«entity»Service.java''', serviceSubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/web/generated/Generated«entity»Controller.java''', generatedFeedbackController(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/web/«entity»Controller.java''', feedbackControllerSubclass(model, entity))

		if (feedbackHasMedia(fd)) {
			write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entity»MediaReference.java''', mediaReferenceEntity(model, entity))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/«entity»MediaReference.java''', mediaReferenceSubclass(model, entity))
			write(fsa, '''«root»/src/main/java/«path»/repository/generated/«entity»MediaReferenceRepository.java''', mediaReferenceRepo(model, entity))
		}
	}

	def void write(IFileSystemAccess2 fsa, String path, String content) {
		fsa.generateFile(path, content)
	}

	/**
	 * Generation Gap: emit manual subclass/interface only when missing or still the empty stub.
	 * Do not rely on {@link IFileSystemAccess2#isFile} alone — it may report true while the file
	 * is absent on disk (stale generator state), which leaves Generated* types without their manual type.
	 */
	def void writeManualOnce(IFileSystemAccess2 fsa, String path, String content) {
		if (!shouldPreserveExistingManualFile(fsa, path)) {
			fsa.generateFile(path, content)
		}
	}

	def boolean shouldPreserveExistingManualFile(IFileSystemAccess2 fsa, String path) {
		try {
			if (!fsa.isFile(path)) {
				return false
			}
			val existingText = fsa.readTextFile(path)
			if (existingText === null) {
				return false
			}
			val existing = existingText.toString
			if (existing.trim.empty) {
				return false
			}
			// Keep user edits; re-emit if the file is still only our default empty stub.
			return !isDefaultManualStub(existing)
		} catch (Exception e) {
			return false
		}
	}

	def boolean isDefaultManualStub(String source) {
		if (!source.contains("Manual extension point")) {
			return false
		}
		// Empty class body: "public class Foo extends GeneratedFoo {\n}"
		source.replaceAll('''/\*[\s\S]*?\*/''', "").replaceAll("//.*", "").trim.matches(
			"(?s).*\\{\\s*\\}\\s*$"
		)
	}

	def String pom(RefModel model) '''<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.5</version>
        <relativePath/>
    </parent>
    <groupId>pt.isep.enorm.ref</groupId>
    <artifactId>«naming.artifactId(model)»</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <description>Generated REF backend for «model.name»</description>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>0.12.6</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.12.6</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.12.6</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
'''

	def String applicationProperties(RefModel model) '''
spring.application.name=«naming.artifactId(model)»
server.port=«naming.serverPort(model)»
spring.datasource.url=jdbc:h2:file:./data/«naming.scenarioSlug(model)»appdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=false
'''

	def String applicationClass(RefModel model) '''
package «naming.basePackage(model)»;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class «naming.scenarioPascal(model)»BackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(«naming.scenarioPascal(model)»BackendApplication.class, args);
    }
}
'''

	def String roleEnum(RefModel model) '''
package «naming.basePackage(model)».domain.enums;

public enum Role {
«roleEnumLiterals(model)»
}
'''

	def String roleEnumLiterals(RefModel model) {
		val kinds = new java.util.LinkedHashSet<String>
		for (ut : model.userTypes) {
			kinds.add(ut.kind.literal)
		}
		if (kinds.isEmpty) {
			kinds.add("GENERIC")
		}
		val sb = new StringBuilder
		for (k : kinds) {
			if (sb.length > 0) {
				sb.append(",\n")
			}
			sb.append("    ").append(k)
		}
		sb.toString
	}

	def boolean hasRequiredAttributes(ResourceType rt) {
		for (a : rt.attributes) {
			if (a.required) {
				return true
			}
		}
		false
	}

	def boolean feedbackHasText(FeedbackDefinition fd) {
		val k = fd.type.kind
		val isTextKind = k === FeedbackKind.COMMENT || k === FeedbackKind.REVIEW
		isTextKind && fd.type.allowsText
	}

	def boolean feedbackHasRating(FeedbackDefinition fd) {
		fd.type.hasRating || fd.rating !== null
	}

	def boolean feedbackIsVote(FeedbackDefinition fd) {
		val k = fd.type.kind
		k === FeedbackKind.VOTE || k === FeedbackKind.REACTION
	}

	def boolean feedbackIsReport(FeedbackDefinition fd) {
		fd.type.kind === FeedbackKind.REPORT
	}

	def boolean feedbackHasMedia(FeedbackDefinition fd) {
		fd.type.allowsMedia
	}

	def String columnAnnotation(Attribute a) {
		val extra = naming.columnDefinition(a)
		if (extra === null || extra.empty) {
			"@Column(nullable = " + !a.required + ")"
		} else {
			"@Column(nullable = " + !a.required + ", " + extra + ")"
		}
	}

	def int ratingMin(FeedbackDefinition fd) {
		if (fd.rating === null) 1 else (fd.rating.minValue as int)
	}

	def int ratingMax(FeedbackDefinition fd) {
		if (fd.rating === null) 5 else (fd.rating.maxValue as int)
	}

	def String generatedUserRepository(RefModel model) '''
package «naming.basePackage(model)».repository.generated;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.UserType;

public interface GeneratedUserTypeRepository extends JpaRepository<UserType, Long> {
    Optional<UserType> findByUsername(String username);
}
'''

	def String userRepositorySubclass(RefModel model) '''
package «naming.basePackage(model)».repository;

import «naming.basePackage(model)».repository.generated.GeneratedUserTypeRepository;

public interface UserTypeRepository extends GeneratedUserTypeRepository {
}
'''

	def String generatedUser(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import «naming.basePackage(model)».domain.enums.Role;

@MappedSuperclass
public abstract class GeneratedUserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 80)
    private String username;

    @Column(nullable = false, length = 200)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 32)
    private Role role;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
'''

	def String userSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedUserType;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class UserType extends GeneratedUserType {
}
'''

	def String generatedResourceEntity(RefModel model, ResourceType rt, String entity, java.util.List<ResourceRelation> relations) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
«IF hasRequiredAttributes(rt)»
import jakarta.validation.constraints.NotNull;
«ENDIF»

@MappedSuperclass
public abstract class Generated«entity» {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

«FOR a : rt.attributes»
    «IF a.required»@NotNull
    «ENDIF»«columnAnnotation(a)»
    private «naming.javaType(a)» «a.name»;

«ENDFOR»
«FOR r : relations»
«IF relationIsToMany(r)»
    @jakarta.persistence.OneToMany(«IF r.containment»cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true«ENDIF»)
    @jakarta.persistence.JoinColumn(name = "«entity.toLowerCase»_id")
    private java.util.List<«naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)»> «relationFieldName(r)» = new java.util.ArrayList<>();

«ELSE»
    @jakarta.persistence.ManyToOne(«IF r.containment»cascade = jakarta.persistence.CascadeType.ALL«ENDIF»)
    @jakarta.persistence.JoinColumn(name = "«relationFieldName(r)»_id")
    private «naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)» «relationFieldName(r)»;

«ENDIF»
«ENDFOR»
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
«FOR a : rt.attributes»
    public «naming.javaType(a)» get«naming.toPascalCase(a.name)»() { return «a.name»; }
    public void set«naming.toPascalCase(a.name)»(«naming.javaType(a)» «a.name») { this.«a.name» = «a.name»; }
«ENDFOR»
«FOR r : relations»
«IF relationIsToMany(r)»
    public java.util.List<«naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)»> get«naming.toPascalCase(relationFieldName(r))»() { return «relationFieldName(r)»; }
    public void set«naming.toPascalCase(relationFieldName(r))»(java.util.List<«naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)»> «relationFieldName(r)») { this.«relationFieldName(r)» = «relationFieldName(r)»; }
«ELSE»
    public «naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)» get«naming.toPascalCase(relationFieldName(r))»() { return «relationFieldName(r)»; }
    public void set«naming.toPascalCase(relationFieldName(r))»(«naming.basePackage(model)».domain.«naming.toPascalCase(r.target.name)» «relationFieldName(r)») { this.«relationFieldName(r)» = «relationFieldName(r)»; }
«ENDIF»
«ENDFOR»
}
'''

	def String generatedFeedbackEntity(RefModel model, FeedbackDefinition fd, String entity, String subject, String parent) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
«IF feedbackHasRating(fd)»
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
«ENDIF»
import «naming.basePackage(model)».domain.UserType;
«IF subject !== null»
import «naming.basePackage(model)».domain.«subject»;
«ENDIF»
«IF parent !== null && parent != subject»
import «naming.basePackage(model)».domain.«parent»;
«ENDIF»

@MappedSuperclass
public abstract class Generated«entity» {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private UserType author;

«IF subject !== null»
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private «subject» subject;

«ENDIF»
«IF parent !== null»
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_feedback_id")
    private «parent» parentFeedback;

«ENDIF»
«IF feedbackHasText(fd)»
    @Column(nullable = false, length = 2000)
    private String comment;

«ENDIF»
«IF feedbackIsVote(fd)»
    @Column(name = "vote_value", nullable = false)
    private int value;

«ENDIF»
«IF feedbackIsReport(fd)»
    @Column(nullable = false, length = 1000)
    private String reason;

«ENDIF»
«IF feedbackHasRating(fd)»
    @Min(«ratingMin(fd)»)
    @Max(«ratingMax(fd)»)
    @Column(nullable = false)
    private int grade;

«ENDIF»
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public UserType getAuthor() { return author; }
    public void setAuthor(UserType author) { this.author = author; }
«IF subject !== null»
    public «subject» getSubject() { return subject; }
    public void setSubject(«subject» subject) { this.subject = subject; }
«ENDIF»
«IF parent !== null»
    public «parent» getParentFeedback() { return parentFeedback; }
    public void setParentFeedback(«parent» parentFeedback) { this.parentFeedback = parentFeedback; }
«ENDIF»
«IF feedbackHasText(fd)»
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
«ENDIF»
«IF feedbackIsVote(fd)»
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
«ENDIF»
«IF feedbackIsReport(fd)»
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
«ENDIF»
«IF feedbackHasRating(fd)»
    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }
«ENDIF»
}
'''

	def String entitySubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.Generated«entity»;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "«naming.tableName(entity)»")
public class «entity» extends Generated«entity» {
}
'''

	def String generatedRepository(RefModel model, String entity) '''
package «naming.basePackage(model)».repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.«entity»;

public interface Generated«entity»Repository extends JpaRepository<«entity», Long> {
}
'''

	def String generatedFeedbackRepository(RefModel model, FeedbackDefinition fd, String entity, String subject, String parent) '''
package «naming.basePackage(model)».repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.«entity»;

public interface Generated«entity»Repository extends JpaRepository<«entity», Long> {
«IF fd.uniquePerAuthorTarget && subject !== null»
    boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);
«ENDIF»
«IF fd.uniquePerAuthorTarget && parent !== null»
    boolean existsByAuthor_IdAndParentFeedback_Id(Long authorId, Long parentFeedbackId);
«ENDIF»
}
'''

	def String mediaReferenceEntity(RefModel model, String entity) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import «naming.basePackage(model)».domain.«entity»;

@MappedSuperclass
public abstract class Generated«entity»MediaReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "media_type", length = 16)
    private String mediaType;

    @Column(length = 1000)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "«entity.toLowerCase»_id")
    private «entity» «decapitalize(entity)»;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMediaType() { return mediaType; }
    public void setMediaType(String mediaType) { this.mediaType = mediaType; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public «entity» get«entity»() { return «decapitalize(entity)»; }
    public void set«entity»(«entity» «decapitalize(entity)») { this.«decapitalize(entity)» = «decapitalize(entity)»; }
}
'''

	def String mediaReferenceSubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.Generated«entity»MediaReference;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "«entity.toLowerCase»_media")
public class «entity»MediaReference extends Generated«entity»MediaReference {
}
'''

	def String mediaReferenceRepo(RefModel model, String entity) '''
package «naming.basePackage(model)».repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.«entity»MediaReference;

public interface «entity»MediaReferenceRepository extends JpaRepository<«entity»MediaReference, Long> {
}
'''

	def String repositorySubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».repository;

import «naming.basePackage(model)».repository.generated.Generated«entity»Repository;

/** Manual extension point — add custom queries here. */
public interface «entity»Repository extends Generated«entity»Repository {
}
'''

	def String generatedResourceService(RefModel model, String entity) '''
package «naming.basePackage(model)».service.generated;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.«entity»;
import «naming.basePackage(model)».repository.«entity»Repository;

@Service
public class Generated«entity»Service {
    private final «entity»Repository repository;

    public Generated«entity»Service(«entity»Repository repository) {
        this.repository = repository;
    }

    /** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */
    public List<«entity»> findAll(String sortBy, String direction) {
        if (sortBy == null || sortBy.isBlank()) {
            return repository.findAll();
        }
        Sort.Direction dir = "DESC".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        try {
            return repository.findAll(Sort.by(dir, sortBy));
        } catch (RuntimeException ex) {
            return repository.findAll();
        }
    }

    public «entity» findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("«entity» not found: " + id));
    }

    public «entity» create(«entity» entity) {
        return repository.save(entity);
    }

    /** Override in manual «entity»Service for scenario-specific rules. */
    protected void beforeCreate(«entity» entity) {
    }
}
'''

	def String generatedFeedbackService(RefModel model, FeedbackDefinition fd, String entity, String subject, String parent) '''
package «naming.basePackage(model)».service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.«entity»;
import «naming.basePackage(model)».repository.«entity»Repository;

@Service
public class Generated«entity»Service {
    private final «entity»Repository repository;

    public Generated«entity»Service(«entity»Repository repository) {
        this.repository = repository;
    }

    public List<«entity»> findAll() {
        return repository.findAll();
    }

    public «entity» submit(«entity» feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(«entity» feedback) {
«IF fd.uniquePerAuthorTarget && subject !== null»
        if (feedback.getAuthor() != null && feedback.getSubject() != null
                && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
            throw new IllegalArgumentException("Author already submitted this feedback for the target");
        }
«ENDIF»
«IF fd.uniquePerAuthorTarget && parent !== null»
        if (feedback.getAuthor() != null && feedback.getParentFeedback() != null
                && repository.existsByAuthor_IdAndParentFeedback_Id(feedback.getAuthor().getId(), feedback.getParentFeedback().getId())) {
            throw new IllegalArgumentException("Author already submitted this feedback for the parent");
        }
«ENDIF»
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(«entity» feedback) {
    }
}
'''

	def String serviceSubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.«entity»Repository;
import «naming.basePackage(model)».service.generated.Generated«entity»Service;

@Service
public class «entity»Service extends Generated«entity»Service {
    public «entity»Service(«entity»Repository repository) {
        super(repository);
    }
}
'''

	def String generatedResourceController(RefModel model, String entity) '''
package «naming.basePackage(model)».web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import «naming.basePackage(model)».domain.«entity»;
import «naming.basePackage(model)».service.«entity»Service;

public abstract class Generated«entity»Controller {
    private final «entity»Service service;

    protected Generated«entity»Controller(«entity»Service service) {
        this.service = service;
    }

    @GetMapping
    public List<«entity»> list(
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false, defaultValue = "ASC") String direction) {
        return service.findAll(sortBy, direction);
    }

    @GetMapping("/{id}")
    public «entity» get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<«entity»> create(@RequestBody «entity» body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    }
}
'''

	def String generatedFeedbackController(RefModel model, String entity) '''
package «naming.basePackage(model)».web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import «naming.basePackage(model)».domain.«entity»;
import «naming.basePackage(model)».service.«entity»Service;

public abstract class Generated«entity»Controller {
    private final «entity»Service service;

    protected Generated«entity»Controller(«entity»Service service) {
        this.service = service;
    }

    @GetMapping
    public List<«entity»> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<«entity»> submit(@RequestBody «entity» body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
'''

	def String resourceControllerSubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».service.«entity»Service;
import «naming.basePackage(model)».web.generated.Generated«entity»Controller;

@RestController
@RequestMapping("«naming.apiCollectionPath(entity)»")
public class «entity»Controller extends Generated«entity»Controller {
    public «entity»Controller(«entity»Service service) {
        super(service);
    }
}
'''

	def String feedbackControllerSubclass(RefModel model, String entity) '''
package «naming.basePackage(model)».web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».service.«entity»Service;
import «naming.basePackage(model)».web.generated.Generated«entity»Controller;

@RestController
@RequestMapping("«naming.apiCollectionPath(entity)»")
public class «entity»Controller extends Generated«entity»Controller {
    public «entity»Controller(«entity»Service service) {
        super(service);
    }
}
'''

	def String generatedAuthService(RefModel model) '''
package «naming.basePackage(model)».service.generated;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.UserType;
import «naming.basePackage(model)».domain.enums.Role;
import «naming.basePackage(model)».dto.AuthenticationResult;
import «naming.basePackage(model)».repository.UserTypeRepository;
import «naming.basePackage(model)».security.JwtService;

@Service
public class GeneratedAuthenticationService {
    private final UserTypeRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public GeneratedAuthenticationService(UserTypeRepository userRepository,
                                          PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public UserType register(String username, String password, Role role) {
        UserType user = new UserType();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(role);
        return userRepository.save(user);
    }

    public AuthenticationResult login(String username, String password) {
        UserType user = userRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("Invalid credentials"));
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid credentials");
        }
        String token = jwtService.generateToken(user.getUsername(), user.getRole().name());
        return new AuthenticationResult(token, user.getUsername(), user.getRole().name());
    }
}
'''

	def String authServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.UserTypeRepository;
import «naming.basePackage(model)».security.JwtService;
import «naming.basePackage(model)».service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(UserTypeRepository userRepository,
                                 PasswordEncoder passwordEncoder, JwtService jwtService) {
        super(userRepository, passwordEncoder, jwtService);
    }
}
'''

	def String generatedAuthController(RefModel model) '''
package «naming.basePackage(model)».web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import «naming.basePackage(model)».domain.UserType;
import «naming.basePackage(model)».domain.enums.Role;
import «naming.basePackage(model)».dto.AuthenticationResult;
import «naming.basePackage(model)».dto.LoginRequest;
import «naming.basePackage(model)».dto.RegisterRequest;
import «naming.basePackage(model)».service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserType> register(@RequestBody RegisterRequest request) {
        Role role = Role.valueOf(request.role());
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(request.username(), request.password(), role));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResult> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request.username(), request.password()));
    }
}
'''

	def String authControllerSubclass(RefModel model) '''
package «naming.basePackage(model)».web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».service.AuthenticationService;
import «naming.basePackage(model)».web.generated.GeneratedAuthenticationController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController extends GeneratedAuthenticationController {
    public AuthenticationController(AuthenticationService authenticationService) {
        super(authenticationService);
    }
}
'''

	def String actionToHttpMethod(String action) {
		switch action {
			case "READ": "GET"
			case "CREATE": "POST"
			case "UPDATE": "PUT"
			case "DELETE": "DELETE"
			default: "POST"
		}
	}

	def String securityConfig(RefModel model) '''
package «naming.basePackage(model)».security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public SecurityConfiguration(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()))
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**", "/h2-console/**").permitAll()
«FOR ar : model.authorizationRules»
                .requestMatchers(HttpMethod.«actionToHttpMethod(ar.allowedAction.literal)», "«IF ar.feedbackTarget !== null»«naming.apiCollectionPath(naming.toPascalCase(ar.feedbackTarget.name))»«ELSE»«naming.apiCollectionPath(naming.toPascalCase(ar.resourceTarget.name))»«ENDIF»").hasRole("«ar.actor.kind.literal»")
«ENDFOR»
                .anyRequest().authenticated())
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
'''

	def String jwtService(RefModel model) '''
package «naming.basePackage(model)».security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    private static final String SECRET = "0123456789012345678901234567890123456789012345678901234567890123";
    private static final long EXPIRATION_MS = 1000L * 60 * 60 * 24;

    private SecretKey key() {
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }

    public String generateToken(String username, String role) {
        Date now = new Date();
        return Jwts.builder()
            .subject(username)
            .claim("role", role)
            .issuedAt(now)
            .expiration(new Date(now.getTime() + EXPIRATION_MS))
            .signWith(key())
            .compact();
    }

    public String extractUsername(String token) {
        return parse(token).getSubject();
    }

    public boolean isValid(String token, String username) {
        try {
            Claims claims = parse(token);
            return username.equals(claims.getSubject()) && claims.getExpiration().after(new Date());
        } catch (Exception ex) {
            return false;
        }
    }

    private Claims parse(String token) {
        return Jwts.parser().verifyWith(key()).build().parseSignedClaims(token).getPayload();
    }
}
'''

	def String appUserDetailsService(RefModel model) '''
package «naming.basePackage(model)».security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.UserType;
import «naming.basePackage(model)».repository.UserTypeRepository;

@Service
public class UserTypeDetailsService implements UserDetailsService {
    private final UserTypeRepository userRepository;

    public UserTypeDetailsService(UserTypeRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserType user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return User.withUsername(user.getUsername())
            .password(user.getPassword())
            .authorities(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()))
            .build();
    }
}
'''

	def String jwtAuthenticationFilter(RefModel model) '''
package «naming.basePackage(model)».security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;

    public JwtAuthenticationFilter(JwtService jwtService, UserDetailsService userDetailsService) {
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        String token = header.substring(7);
        String username = null;
        try {
            username = jwtService.extractUsername(token);
        } catch (Exception ignored) {
        }
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (jwtService.isValid(token, userDetails.getUsername())) {
                UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        filterChain.doFilter(request, response);
    }
}
'''

	def String registerRequestDto(RefModel model) '''
package «naming.basePackage(model)».dto;

public record RegisterRequest(String username, String password, String role) {
}
'''

	def String loginRequestDto(RefModel model) '''
package «naming.basePackage(model)».dto;

public record LoginRequest(String username, String password) {
}
'''

	def String authResponseDto(RefModel model) '''
package «naming.basePackage(model)».dto;

public record AuthenticationResult(String token, String username, String role) {
}
'''

	def String apiError(RefModel model) '''
package «naming.basePackage(model)».web.error;

public record ApiError(String message) {
}
'''

	def String apiExceptionHandler(RefModel model) '''
package «naming.basePackage(model)».web.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiError(ex.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiError> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiError(ex.getMessage()));
    }
}
'''

	def String applicationTest(RefModel model) '''
package «naming.basePackage(model)»;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class «naming.scenarioPascal(model)»BackendApplicationTests {
    @Test
    void contextLoads() {
    }
}
'''

	def String readme(RefModel model, String root) '''
# Generated REF Backend — «model.name»

Generated by Xtext `RefBackendGenerator` from a `.refdsl` model (P2 Activity 5/6).

## Run

```powershell
mvn -f «root»/pom.xml spring-boot:run
```

Port: «naming.serverPort(model)»

## Structure (Generation Gap)

- `domain/generated`, `repository/generated`, `service/generated`, `web/generated` — regenerated on each DSL save
- Classes without `generated` in the package — manual extension points (preserved across regeneration)

## Regenerate

Open the `.refdsl` file in the RefDsl Editor (runtime Eclipse) and save — output appears under `«root»/`.
'''

	def String manifest(RefModel model) '''
REF backend generation manifest
Model: «model.name» v«if (model.version !== null) model.version else "n/a"»
Scenario slug: «naming.scenarioSlug(model)»
Package: «naming.basePackage(model)»

Resources: «model.resourceTypes.map[name].join(", ")»
Feedbacks: «model.feedbackDefinitions.map[name].join(", ")»
User kinds: «model.userTypes.map[kind.literal].join(", ")»

Common (always): pom, application, security baseline, user entity, API error handler
Variable: one stack per ResourceType and FeedbackDefinition in the model
Manual: subclasses in domain/repository/service/web without "generated" in package name
'''

	// ----- Fase D.2: ResourceRelation helpers -----

	def boolean relationIsToMany(ResourceRelation r) {
		val tc = r.targetCardinality
		tc !== null && tc.contains("*")
	}

	def String relationFieldName(ResourceRelation r) {
		val base = decapitalize(naming.toPascalCase(r.target.name))
		if (relationIsToMany(r)) base + "s" else base
	}

	def String decapitalize(String s) {
		if (s === null || s.empty) {
			s
		} else {
			Character.toString(Character.toLowerCase(s.charAt(0))) + s.substring(1)
		}
	}

	// ----- Fase E: governance artifacts (entity + repository + CRUD controller) -----

	def void generateGovernance(RefModel model, IFileSystemAccess2 fsa, String root, String pkg) {
		val path = pkg.replace('.', '/')
		if (!model.validationRules.empty) {
			writeGovernance(fsa, root, path, model, "ValidationRule", "validation_rules", "/api/policies/validation-rules",
				#["name", "kind", "severity", "expression", "implementationId", "appliesToResource", "appliesToFeedback", "invokedBy"])
		}
		if (!model.authorizationRules.empty) {
			writeGovernance(fsa, root, path, model, "AuthorizationRule", "authorization_rules", "/api/policies/authorization-rules",
				#["name", "allowedAction", "actor", "contextName", "resourceTarget", "feedbackTarget"])
		}
		if (!model.moderationPolicies.empty) {
			writeGovernance(fsa, root, path, model, "ModerationPolicy", "moderation_policies", "/api/policies/moderation-policies",
				#["name", "mode", "triggerEvent", "decision", "monitorsResource", "monitorsFeedback", "executedBy", "inContext"])
		}
		if (!model.verificationPolicies.empty) {
			writeGovernance(fsa, root, path, model, "VerificationPolicy", "verification_policies", "/api/policies/verification-policies",
				#["name", "mode", "appliesWhen", "verifies"])
		}
		if (!model.sortingPolicies.empty) {
			writeGovernance(fsa, root, path, model, "SortingPolicy", "sorting_policies", "/api/policies/sorting-policies",
				#["name", "criterion", "direction", "appliesToResource", "appliesToFeedback", "inContext"])
		}
		if (!model.automationRules.empty) {
			generateAutomation(model, fsa, root, path)
		}
	}

	def void writeGovernance(IFileSystemAccess2 fsa, String root, String path, RefModel model, String entityName, String table, String apiPath, java.util.List<String> fields) {
		write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entityName».java''', governanceGeneratedEntity(model, entityName, fields))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/«entityName».java''', governanceManualSubclass(model, entityName, table))
		write(fsa, '''«root»/src/main/java/«path»/repository/«entityName»Repository.java''', governanceRepo(model, entityName))
		write(fsa, '''«root»/src/main/java/«path»/web/«entityName»Controller.java''', governanceController(model, entityName, apiPath))
	}

	def String governanceGeneratedEntity(RefModel model, String entityName, java.util.List<String> fields) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Generated«entityName» {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

«FOR f : fields»
    @Column(length = 1000)
    private String «f»;

«ENDFOR»
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
«FOR f : fields»
    public String get«naming.toPascalCase(f)»() { return «f»; }
    public void set«naming.toPascalCase(f)»(String «f») { this.«f» = «f»; }
«ENDFOR»
}
'''

	def String governanceManualSubclass(RefModel model, String entityName, String table) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.Generated«entityName»;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "«table»")
public class «entityName» extends Generated«entityName» {
}
'''

	def String governanceRepo(RefModel model, String entityName) '''
package «naming.basePackage(model)».repository;

import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.«entityName»;

public interface «entityName»Repository extends JpaRepository<«entityName», Long> {
}
'''

	def String governanceController(RefModel model, String entityName, String apiPath) '''
package «naming.basePackage(model)».web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».domain.«entityName»;
import «naming.basePackage(model)».repository.«entityName»Repository;

@RestController
@RequestMapping("«apiPath»")
public class «entityName»Controller {
    private final «entityName»Repository repository;

    public «entityName»Controller(«entityName»Repository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<«entityName»> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public «entityName» get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("«entityName» not found: " + id));
    }

    @PostMapping
    public ResponseEntity<«entityName»> create(@RequestBody «entityName» body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
'''

	def String contextTypeEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import «naming.basePackage(model)».domain.ContextResource;

@MappedSuperclass
public abstract class GeneratedContextType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String kind;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "context_type_id")
    private List<ContextResource> resources = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getKind() { return kind; }
    public void setKind(String kind) { this.kind = kind; }
    public List<ContextResource> getResources() { return resources; }
    public void setResources(List<ContextResource> resources) { this.resources = resources; }
}
'''

	def String contextTypeSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedContextType;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "context_types")
public class ContextType extends GeneratedContextType {
}
'''

	def String contextResourceEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneratedContextResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "resource_name", nullable = false, length = 120)
    private String resourceName;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getResourceName() { return resourceName; }
    public void setResourceName(String resourceName) { this.resourceName = resourceName; }
}
'''

	def String contextResourceSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedContextResource;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "context_resources")
public class ContextResource extends GeneratedContextResource {
}
'''

	// ----- Fase E.3: Automation (rule -> conditions -> values, rule -> actions) -----

	def void generateAutomation(RefModel model, IFileSystemAccess2 fsa, String root, String path) {
		write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedAutomationRule.java''', automationRuleEntity(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/AutomationRule.java''', automationRuleSubclass(model))
		write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedAutomationCondition.java''', automationConditionEntity(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/AutomationCondition.java''', automationConditionSubclass(model))
		write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedConditionValue.java''', conditionValueEntity(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/ConditionValue.java''', conditionValueSubclass(model))
		write(fsa, '''«root»/src/main/java/«path»/domain/generated/GeneratedAutomationAction.java''', automationActionEntity(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/AutomationAction.java''', automationActionSubclass(model))
		write(fsa, '''«root»/src/main/java/«path»/repository/AutomationRuleRepository.java''', governanceRepo(model, "AutomationRule"))
		write(fsa, '''«root»/src/main/java/«path»/web/AutomationRuleController.java''', governanceController(model, "AutomationRule", "/api/policies/automation-rules"))
	}

	def String automationRuleEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import «naming.basePackage(model)».domain.AutomationAction;
import «naming.basePackage(model)».domain.AutomationCondition;

@MappedSuperclass
public abstract class GeneratedAutomationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String triggerEvent;
    @Column(length = 1000)
    private String contextResource;
    @Column(length = 1000)
    private String inContext;
    @Column(length = 1000)
    private String onFeedback;
    @Column(length = 1000)
    private String uses;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_rule_id")
    private List<AutomationCondition> conditions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_rule_action_id")
    private List<AutomationAction> actions = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTriggerEvent() { return triggerEvent; }
    public void setTriggerEvent(String triggerEvent) { this.triggerEvent = triggerEvent; }
    public String getContextResource() { return contextResource; }
    public void setContextResource(String contextResource) { this.contextResource = contextResource; }
    public String getInContext() { return inContext; }
    public void setInContext(String inContext) { this.inContext = inContext; }
    public String getOnFeedback() { return onFeedback; }
    public void setOnFeedback(String onFeedback) { this.onFeedback = onFeedback; }
    public String getUses() { return uses; }
    public void setUses(String uses) { this.uses = uses; }
    public List<AutomationCondition> getConditions() { return conditions; }
    public void setConditions(List<AutomationCondition> conditions) { this.conditions = conditions; }
    public List<AutomationAction> getActions() { return actions; }
    public void setActions(List<AutomationAction> actions) { this.actions = actions; }
}
'''

	def String automationRuleSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedAutomationRule;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "automation_rules")
public class AutomationRule extends GeneratedAutomationRule {
}
'''

	def String automationConditionEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import «naming.basePackage(model)».domain.ConditionValue;

@MappedSuperclass
public abstract class GeneratedAutomationCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String operator;
    @Column(length = 1000)
    private String attributeName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_condition_id")
    private List<ConditionValue> values = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
    public String getAttributeName() { return attributeName; }
    public void setAttributeName(String attributeName) { this.attributeName = attributeName; }
    public List<ConditionValue> getValues() { return values; }
    public void setValues(List<ConditionValue> values) { this.values = values; }
}
'''

	def String automationConditionSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedAutomationCondition;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "automation_conditions")
public class AutomationCondition extends GeneratedAutomationCondition {
}
'''

	def String conditionValueEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneratedConditionValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_value", length = 1000)
    private String matchValue;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMatchValue() { return matchValue; }
    public void setMatchValue(String matchValue) { this.matchValue = matchValue; }
}
'''

	def String conditionValueSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedConditionValue;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "condition_values")
public class ConditionValue extends GeneratedConditionValue {
}
'''

	def String automationActionEntity(RefModel model) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneratedAutomationAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String actionKind;
    @Column(length = 1000)
    private String message;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getActionKind() { return actionKind; }
    public void setActionKind(String actionKind) { this.actionKind = actionKind; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
'''

	def String automationActionSubclass(RefModel model) '''
package «naming.basePackage(model)».domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import «naming.basePackage(model)».domain.generated.GeneratedAutomationAction;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "automation_actions")
public class AutomationAction extends GeneratedAutomationAction {
}
'''

	// ----- Fase E.5: Behaviour engines (moderation + automation) -----

	def void generateBehaviour(RefModel model, IFileSystemAccess2 fsa, String root, String pkg) {
		val path = pkg.replace('.', '/')
		if (!model.moderationPolicies.empty) {
			write(fsa, '''«root»/src/main/java/«path»/dto/ModerationSimulationResult.java''', moderationSimulationDto(model))
			write(fsa, '''«root»/src/main/java/«path»/service/generated/GeneratedModerationService.java''', generatedModerationService(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/ModerationService.java''', moderationServiceSubclass(model))
			write(fsa, '''«root»/src/main/java/«path»/web/ModerationController.java''', moderationController(model))
		}
		if (!model.automationRules.empty) {
			write(fsa, '''«root»/src/main/java/«path»/dto/AutomationActionResult.java''', automationActionResultDto(model))
			write(fsa, '''«root»/src/main/java/«path»/service/generated/GeneratedAutomationEngineService.java''', generatedAutomationEngineService(model))
			writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/AutomationEngineService.java''', automationEngineServiceSubclass(model))
			write(fsa, '''«root»/src/main/java/«path»/web/AutomationController.java''', automationEngineController(model))
		}
	}

	def String moderationSimulationDto(RefModel model) '''
package «naming.basePackage(model)».dto;

public record ModerationSimulationResult(String policyName, String mode, String decision, boolean requiresHumanReview, String message) {
}
'''

	def String generatedModerationService(RefModel model) '''
package «naming.basePackage(model)».service.generated;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import «naming.basePackage(model)».dto.ModerationSimulationResult;
import «naming.basePackage(model)».domain.ModerationPolicy;
import «naming.basePackage(model)».repository.ModerationPolicyRepository;

@Service
public class GeneratedModerationService {
    private final ModerationPolicyRepository moderationPolicyRepository;

    public GeneratedModerationService(ModerationPolicyRepository moderationPolicyRepository) {
        this.moderationPolicyRepository = moderationPolicyRepository;
    }

    /** Simulate moderation for a trigger event; AUTOMATIC applies the policy decision, MANUAL/HYBRID needs a human. */
    @Transactional(readOnly = true)
    public List<ModerationSimulationResult> simulate(String triggerEvent) {
        List<ModerationSimulationResult> results = new ArrayList<>();
        for (ModerationPolicy policy : moderationPolicyRepository.findAll()) {
            boolean triggerMatches = triggerEvent == null || triggerEvent.isBlank()
                || triggerEvent.equalsIgnoreCase(policy.getTriggerEvent());
            if (!triggerMatches) {
                continue;
            }
            String mode = policy.getMode();
            boolean manual = "MANUAL".equalsIgnoreCase(mode);
            boolean hybrid = "HYBRID".equalsIgnoreCase(mode);
            boolean requiresHuman = manual || hybrid;
            String decision = manual ? "PENDING_REVIEW" : policy.getDecision();
            results.add(new ModerationSimulationResult(policy.getName(), mode, decision, requiresHuman, describe(policy)));
        }
        return results;
    }

    /** Override in manual ModerationService for scenario-specific moderation logic. */
    protected String describe(ModerationPolicy policy) {
        return "Simulated decision for policy " + policy.getName();
    }
}
'''

	def String moderationServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.ModerationPolicyRepository;
import «naming.basePackage(model)».service.generated.GeneratedModerationService;

@Service
public class ModerationService extends GeneratedModerationService {
    public ModerationService(ModerationPolicyRepository moderationPolicyRepository) {
        super(moderationPolicyRepository);
    }
}
'''

	def String moderationController(RefModel model) '''
package «naming.basePackage(model)».web;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».dto.ModerationSimulationResult;
import «naming.basePackage(model)».service.ModerationService;

@RestController
@RequestMapping("/api/moderation")
public class ModerationController {
    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @PostMapping("/simulate")
    public List<ModerationSimulationResult> simulate(@RequestParam(required = false) String trigger) {
        return moderationService.simulate(trigger);
    }
}
'''

	def String automationActionResultDto(RefModel model) '''
package «naming.basePackage(model)».dto;

public record AutomationActionResult(String ruleName, String actionName, String actionKind, String message) {
}
'''

	def String generatedAutomationEngineService(RefModel model) '''
package «naming.basePackage(model)».service.generated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import «naming.basePackage(model)».dto.AutomationActionResult;
import «naming.basePackage(model)».domain.AutomationAction;
import «naming.basePackage(model)».domain.AutomationCondition;
import «naming.basePackage(model)».domain.AutomationRule;
import «naming.basePackage(model)».domain.ConditionValue;
import «naming.basePackage(model)».repository.AutomationRuleRepository;

@Service
public class GeneratedAutomationEngineService {
    private final AutomationRuleRepository automationRuleRepository;

    public GeneratedAutomationEngineService(AutomationRuleRepository automationRuleRepository) {
        this.automationRuleRepository = automationRuleRepository;
    }

    /** Evaluate automation rules for a trigger against content (attribute -> value); return the actions that fire. */
    @Transactional(readOnly = true)
    public List<AutomationActionResult> evaluate(String triggerEvent, Map<String, String> content) {
        List<AutomationActionResult> results = new ArrayList<>();
        Map<String, String> safe = content == null ? Map.of() : content;
        for (AutomationRule rule : automationRuleRepository.findAll()) {
            boolean triggerMatches = triggerEvent == null || triggerEvent.isBlank()
                || rule.getTriggerEvent() == null || triggerEvent.equalsIgnoreCase(rule.getTriggerEvent());
            if (!triggerMatches) {
                continue;
            }
            if (allConditionsMatch(rule, safe)) {
                for (AutomationAction action : rule.getActions()) {
                    results.add(new AutomationActionResult(rule.getName(), action.getName(), action.getActionKind(), action.getMessage()));
                }
            }
        }
        return results;
    }

    private boolean allConditionsMatch(AutomationRule rule, Map<String, String> content) {
        for (AutomationCondition condition : rule.getConditions()) {
            if (!conditionMatches(condition, content)) {
                return false;
            }
        }
        return true;
    }

    private boolean conditionMatches(AutomationCondition condition, Map<String, String> content) {
        String operator = condition.getOperator();
        String attribute = condition.getAttributeName();
        String value = attribute == null ? null : content.get(attribute);
        List<String> keywords = new ArrayList<>();
        for (ConditionValue cv : condition.getValues()) {
            if (cv.getMatchValue() != null) {
                keywords.add(cv.getMatchValue());
            }
        }
        if (operator == null) {
            return true;
        }
        switch (operator) {
            case "HAS_PROPERTY":
                return value != null && !value.isBlank();
            case "NOT_HAS_PROPERTY":
                return value == null || value.isBlank();
            case "CONTAINS_KEYWORDS":
                return value != null && keywords.stream().anyMatch(value::contains);
            case "NOT_CONTAINS_KEYWORDS":
                return value == null || keywords.stream().noneMatch(value::contains);
            case "MATCH_REGEX":
                return value != null && !keywords.isEmpty() && Pattern.compile(keywords.get(0)).matcher(value).find();
            case "NOT_MATCH_REGEX":
                return value == null || keywords.isEmpty() || !Pattern.compile(keywords.get(0)).matcher(value).find();
            case "HAS_SPECIFIC_PROPERTY":
                return value != null && keywords.contains(value);
            case "NOT_HAS_SPECIFIC_PROPERTY":
                return value == null || !keywords.contains(value);
            default:
                return true;
        }
    }
}
'''

	def String automationEngineServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.AutomationRuleRepository;
import «naming.basePackage(model)».service.generated.GeneratedAutomationEngineService;

@Service
public class AutomationEngineService extends GeneratedAutomationEngineService {
    public AutomationEngineService(AutomationRuleRepository automationRuleRepository) {
        super(automationRuleRepository);
    }
}
'''

	def String automationEngineController(RefModel model) '''
package «naming.basePackage(model)».web;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import «naming.basePackage(model)».dto.AutomationActionResult;
import «naming.basePackage(model)».service.AutomationEngineService;

@RestController
@RequestMapping("/api/automation")
public class AutomationController {
    private final AutomationEngineService automationEngineService;

    public AutomationController(AutomationEngineService automationEngineService) {
        this.automationEngineService = automationEngineService;
    }

    @PostMapping("/evaluate")
    public List<AutomationActionResult> evaluate(
            @RequestParam(required = false) String trigger,
            @RequestBody(required = false) Map<String, String> content) {
        return automationEngineService.evaluate(trigger, content);
    }
}
'''

	// ----- Generic infrastructure aligned with the manual backend -----

	def boolean hasAnyGovernance(RefModel model) {
		!model.validationRules.empty || !model.authorizationRules.empty || !model.moderationPolicies.empty
			|| !model.verificationPolicies.empty || !model.sortingPolicies.empty || !model.automationRules.empty
	}

	def String resourceNotFoundException(RefModel model) '''
package «naming.basePackage(model)».web.error;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
'''

	def String generatedContextService(RefModel model) '''
package «naming.basePackage(model)».service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.ContextType;
import «naming.basePackage(model)».repository.ContextTypeRepository;
import «naming.basePackage(model)».web.error.ResourceNotFoundException;

@Service
public class GeneratedContextService {
    private final ContextTypeRepository contextTypeRepository;

    public GeneratedContextService(ContextTypeRepository contextTypeRepository) {
        this.contextTypeRepository = contextTypeRepository;
    }

    public List<ContextType> findAll() {
        return contextTypeRepository.findAll();
    }

    public ContextType findById(Long id) {
        return contextTypeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("ContextType not found: " + id));
    }

    public ContextType create(ContextType context) {
        return contextTypeRepository.save(context);
    }
}
'''

	def String contextServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.ContextTypeRepository;
import «naming.basePackage(model)».service.generated.GeneratedContextService;

@Service
public class ContextService extends GeneratedContextService {
    public ContextService(ContextTypeRepository contextTypeRepository) {
        super(contextTypeRepository);
    }
}
'''

	def String generatedPolicyService(RefModel model) '''
package «naming.basePackage(model)».service.generated;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import «naming.basePackage(model)».web.error.ResourceNotFoundException;
«IF !model.validationRules.empty»
import «naming.basePackage(model)».domain.ValidationRule;
import «naming.basePackage(model)».repository.ValidationRuleRepository;
«ENDIF»
«IF !model.authorizationRules.empty»
import «naming.basePackage(model)».domain.AuthorizationRule;
import «naming.basePackage(model)».repository.AuthorizationRuleRepository;
«ENDIF»
«IF !model.moderationPolicies.empty»
import «naming.basePackage(model)».domain.ModerationPolicy;
import «naming.basePackage(model)».repository.ModerationPolicyRepository;
«ENDIF»
«IF !model.verificationPolicies.empty»
import «naming.basePackage(model)».domain.VerificationPolicy;
import «naming.basePackage(model)».repository.VerificationPolicyRepository;
«ENDIF»
«IF !model.sortingPolicies.empty»
import «naming.basePackage(model)».domain.SortingPolicy;
import «naming.basePackage(model)».repository.SortingPolicyRepository;
«ENDIF»
«IF !model.automationRules.empty»
import «naming.basePackage(model)».domain.AutomationRule;
import «naming.basePackage(model)».repository.AutomationRuleRepository;
«ENDIF»

/** Centralized CRUD for all governance policies (mirrors the manual GeneratedPolicyService). */
public class GeneratedPolicyService {
«IF !model.validationRules.empty»
    @Autowired private ValidationRuleRepository validationRuleRepository;
«ENDIF»
«IF !model.authorizationRules.empty»
    @Autowired private AuthorizationRuleRepository authorizationRuleRepository;
«ENDIF»
«IF !model.moderationPolicies.empty»
    @Autowired private ModerationPolicyRepository moderationPolicyRepository;
«ENDIF»
«IF !model.verificationPolicies.empty»
    @Autowired private VerificationPolicyRepository verificationPolicyRepository;
«ENDIF»
«IF !model.sortingPolicies.empty»
    @Autowired private SortingPolicyRepository sortingPolicyRepository;
«ENDIF»
«IF !model.automationRules.empty»
    @Autowired private AutomationRuleRepository automationRuleRepository;
«ENDIF»
«IF !model.validationRules.empty»

    public List<ValidationRule> listValidationRules() { return validationRuleRepository.findAll(); }
    public ValidationRule getValidationRule(Long id) { return validationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ValidationRule not found: " + id)); }
    public ValidationRule createValidationRule(ValidationRule request) { return validationRuleRepository.save(request); }
«ENDIF»
«IF !model.authorizationRules.empty»

    public List<AuthorizationRule> listAuthorizationRules() { return authorizationRuleRepository.findAll(); }
    public AuthorizationRule getAuthorizationRule(Long id) { return authorizationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AuthorizationRule not found: " + id)); }
    public AuthorizationRule createAuthorizationRule(AuthorizationRule request) { return authorizationRuleRepository.save(request); }
«ENDIF»
«IF !model.moderationPolicies.empty»

    public List<ModerationPolicy> listModerationPolicies() { return moderationPolicyRepository.findAll(); }
    public ModerationPolicy getModerationPolicy(Long id) { return moderationPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ModerationPolicy not found: " + id)); }
    public ModerationPolicy createModerationPolicy(ModerationPolicy request) { return moderationPolicyRepository.save(request); }
«ENDIF»
«IF !model.verificationPolicies.empty»

    public List<VerificationPolicy> listVerificationPolicies() { return verificationPolicyRepository.findAll(); }
    public VerificationPolicy getVerificationPolicy(Long id) { return verificationPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("VerificationPolicy not found: " + id)); }
    public VerificationPolicy createVerificationPolicy(VerificationPolicy request) { return verificationPolicyRepository.save(request); }
«ENDIF»
«IF !model.sortingPolicies.empty»

    public List<SortingPolicy> listSortingPolicies() { return sortingPolicyRepository.findAll(); }
    public SortingPolicy getSortingPolicy(Long id) { return sortingPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("SortingPolicy not found: " + id)); }
    public SortingPolicy createSortingPolicy(SortingPolicy request) { return sortingPolicyRepository.save(request); }
«ENDIF»
«IF !model.automationRules.empty»

    public List<AutomationRule> listAutomationRules() { return automationRuleRepository.findAll(); }
    public AutomationRule getAutomationRule(Long id) { return automationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AutomationRule not found: " + id)); }
    public AutomationRule createAutomationRule(AutomationRule request) { return automationRuleRepository.save(request); }
«ENDIF»
}
'''

	def String policyServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».service.generated.GeneratedPolicyService;

@Service
public class PolicyService extends GeneratedPolicyService {
}
'''
}
