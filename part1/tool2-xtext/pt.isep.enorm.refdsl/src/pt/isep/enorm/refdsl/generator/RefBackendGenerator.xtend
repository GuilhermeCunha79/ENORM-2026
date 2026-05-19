 package pt.isep.enorm.refdsl.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import pt.isep.enorm.refdsl.refDsl.Attribute
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition
import pt.isep.enorm.refdsl.refDsl.RefModel
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
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/domain/generated/Generated«app»User.java''', generatedUser(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/domain/«app»User.java''', userSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/repository/generated/Generated«app»UserRepository.java''', generatedUserRepository(model))
		writeManualOnce(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/repository/«app»UserRepository.java''', userRepositorySubclass(model))

		for (rt : model.resourceTypes) {
			generateResource(model, fsa, root, pkg, rt)
		}
		for (fd : model.feedbackDefinitions) {
			generateFeedback(model, fsa, root, pkg, fd)
		}

		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/security/SecurityConfiguration.java''', securityConfig(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/generated/GeneratedAuthenticationService.java''', generatedAuthService(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/service/AuthenticationService.java''', authServiceSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/generated/GeneratedAuthenticationController.java''', generatedAuthController(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/AuthenticationController.java''', authControllerSubclass(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/error/ApiError.java''', apiError(model))
		write(fsa, '''«root»/src/main/java/«pkg.replace('.', '/')»/web/error/ApiExceptionHandler.java''', apiExceptionHandler(model))
		write(fsa, '''«root»/src/test/java/«pkg.replace('.', '/')»/«app»BackendApplicationTests.java''', applicationTest(model))
	}

	def void generateResource(RefModel model, IFileSystemAccess2 fsa, String root, String pkg, ResourceType rt) {
		val entity = naming.toPascalCase(rt.name)
		val path = pkg.replace('.', '/')

		write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entity».java''', generatedResourceEntity(model, rt, entity))
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

		write(fsa, '''«root»/src/main/java/«path»/domain/generated/Generated«entity».java''', generatedFeedbackEntity(model, fd, entity, subject))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/domain/«entity».java''', entitySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/repository/generated/Generated«entity»Repository.java''', generatedRepository(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/repository/«entity»Repository.java''', repositorySubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/service/generated/Generated«entity»Service.java''', generatedFeedbackService(model, fd, entity, subject))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/service/«entity»Service.java''', serviceSubclass(model, entity))
		write(fsa, '''«root»/src/main/java/«path»/web/generated/Generated«entity»Controller.java''', generatedFeedbackController(model, entity))
		writeManualOnce(fsa, '''«root»/src/main/java/«path»/web/«entity»Controller.java''', feedbackControllerSubclass(model, entity))
	}

	def void write(IFileSystemAccess2 fsa, String path, String content) {
		fsa.generateFile(path, content)
	}

	def void writeManualOnce(IFileSystemAccess2 fsa, String path, String content) {
		// Skip if output already exists (Generation Gap manual classes).
		try {
			if (fsa.isFile(path)) {
				return
			}
		} catch (UnsupportedOperationException e) {
			// Older Xtext: isFile not supported — always emit manual stubs.
		}
		fsa.generateFile(path, content)
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

import org.springframework.data.jpa.repository.JpaRepository;
import «naming.basePackage(model)».domain.«naming.scenarioPascal(model)»User;

public interface Generated«naming.scenarioPascal(model)»UserRepository extends JpaRepository<«naming.scenarioPascal(model)»User, Long> {
}
'''

	def String userRepositorySubclass(RefModel model) '''
package «naming.basePackage(model)».repository;

import «naming.basePackage(model)».repository.generated.Generated«naming.scenarioPascal(model)»UserRepository;

public interface «naming.scenarioPascal(model)»UserRepository extends Generated«naming.scenarioPascal(model)»UserRepository {
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
public abstract class Generated«naming.scenarioPascal(model)»User {
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
import «naming.basePackage(model)».domain.generated.Generated«naming.scenarioPascal(model)»User;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class «naming.scenarioPascal(model)»User extends Generated«naming.scenarioPascal(model)»User {
}
'''

	def String generatedResourceEntity(RefModel model, ResourceType rt, String entity) '''
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
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
«FOR a : rt.attributes»
    public «naming.javaType(a)» get«naming.toPascalCase(a.name)»() { return «a.name»; }
    public void set«naming.toPascalCase(a.name)»(«naming.javaType(a)» «a.name») { this.«a.name» = «a.name»; }
«ENDFOR»
}
'''

	def String generatedFeedbackEntity(RefModel model, FeedbackDefinition fd, String entity, String subject) '''
package «naming.basePackage(model)».domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import «naming.basePackage(model)».domain.«naming.scenarioPascal(model)»User;
«IF subject != null»
import «naming.basePackage(model)».domain.«subject»;
«ENDIF»

@MappedSuperclass
public abstract class Generated«entity» {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private «naming.scenarioPascal(model)»User author;

«IF subject != null»
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private «subject» subject;

«ENDIF»
    @Column(nullable = false, length = 2000)
    private String comment;

«IF fd.rating != null»
    @Min(«ratingMin(fd)»)
    @Max(«ratingMax(fd)»)
    @Column(nullable = false)
    private int grade;

«ENDIF»
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public «naming.scenarioPascal(model)»User getAuthor() { return author; }
    public void setAuthor(«naming.scenarioPascal(model)»User author) { this.author = author; }
«IF subject != null»
    public «subject» getSubject() { return subject; }
    public void setSubject(«subject» subject) { this.subject = subject; }
«ENDIF»
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
«IF fd.rating != null»
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

	def String generatedFeedbackService(RefModel model, FeedbackDefinition fd, String entity, String subject) '''
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
        beforeSubmit(feedback);
        return repository.save(feedback);
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

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».domain.«naming.scenarioPascal(model)»User;
import «naming.basePackage(model)».domain.enums.Role;
import «naming.basePackage(model)».repository.«naming.scenarioPascal(model)»UserRepository;

@Service
public class GeneratedAuthenticationService {
    private final «naming.scenarioPascal(model)»UserRepository userRepository;

    public GeneratedAuthenticationService(«naming.scenarioPascal(model)»UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public «naming.scenarioPascal(model)»User register(String username, String password, Role role) {
        «naming.scenarioPascal(model)»User user = new «naming.scenarioPascal(model)»User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }
}
'''

	def String authServiceSubclass(RefModel model) '''
package «naming.basePackage(model)».service;

import org.springframework.stereotype.Service;
import «naming.basePackage(model)».repository.«naming.scenarioPascal(model)»UserRepository;
import «naming.basePackage(model)».service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(«naming.scenarioPascal(model)»UserRepository userRepository) {
        super(userRepository);
    }
}
'''

	def String generatedAuthController(RefModel model) '''
package «naming.basePackage(model)».web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import «naming.basePackage(model)».domain.«naming.scenarioPascal(model)»User;
import «naming.basePackage(model)».domain.enums.Role;
import «naming.basePackage(model)».service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<«naming.scenarioPascal(model)»User> register(
        @RequestParam String username,
        @RequestParam String password,
        @RequestParam(defaultValue = "GENERIC") Role role
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(username, password, role));
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

	def String securityConfig(RefModel model) '''
package «naming.basePackage(model)».security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()))
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }
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
}
