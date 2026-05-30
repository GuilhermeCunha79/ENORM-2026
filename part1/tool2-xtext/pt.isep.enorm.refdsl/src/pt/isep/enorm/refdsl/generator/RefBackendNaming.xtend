package pt.isep.enorm.refdsl.generator

import pt.isep.enorm.refdsl.refDsl.Attribute
import pt.isep.enorm.refdsl.refDsl.PrimitiveType
import pt.isep.enorm.refdsl.refDsl.RefModel

/**
 * Naming and type-mapping helpers for REF → Spring Boot backend generation (P2 Activity 5).
 */
class RefBackendNaming {

	def String scenarioSlug(RefModel model) {
		val raw = if (model.name === null || model.name.empty) "refapp" else model.name
		raw.toLowerCase.replaceAll("[^a-z0-9]", "")
	}

	def String scenarioPascal(RefModel model) {
		toPascalCase(if (model.name === null || model.name.empty) "RefApp" else model.name)
	}

	def String basePackage(RefModel model) {
		'''pt.isep.enorm.ref.«scenarioSlug(model)»'''
	}

	def String artifactId(RefModel model) {
		'''«scenarioSlug(model)»-backend'''
	}

	def int serverPort(RefModel model) {
		switch scenarioSlug(model) {
			case "amazon": 8081
			case "reddit": 8083
			case "youtube": 8082
			default: 8090
		}
	}

	def String javaType(Attribute attribute) {
		switch attribute.type {
			case PrimitiveType.TEXT: "String"
			case PrimitiveType.NUMBER: "java.math.BigDecimal"
			case PrimitiveType.BOOLEAN: "Boolean"
			case PrimitiveType.DATE: "java.time.LocalDate"
			case PrimitiveType.DATETIME: "java.time.Instant"
			case PrimitiveType.IMAGE: "String"
			case PrimitiveType.VIDEO: "String"
			case PrimitiveType.URL: "String"
			default: "String"
		}
	}

	def String columnDefinition(Attribute attribute) {
		switch attribute.type {
			case PrimitiveType.TEXT: "length = 2000"
			case PrimitiveType.NUMBER: ""
			case PrimitiveType.BOOLEAN: ""
			case PrimitiveType.DATE: ""
			case PrimitiveType.DATETIME: ""
			default: "length = 500"
		}
	}

	def String toKebabCase(String raw) {
	val pascal = toPascalCase(raw)
	val sb = new StringBuilder
	for (i : 0 ..< pascal.length) {
		val c = pascal.charAt(i)
		if (Character.isUpperCase(c) && i > 0) {
			sb.append("-")
		}
		sb.append(Character.toLowerCase(c))
	}
	sb.toString
}

def String apiCollectionPath(String entityName) {
	'''/api/«toKebabCase(entityName)»s'''
}

	def String toPascalCase(String raw) {
	if (raw === null || raw.empty)
		return "RefApp"
	val result = new StringBuilder
	// 1) parte por separadores (snake_case, kebab-case, espaços)
	for (word : raw.split("[^A-Za-z0-9]+")) {
		if (!word.empty) {
			// 2) parte em fronteiras camelCase: "ProductReview" -> ["Product","Review"]
			for (token : word.split("(?<=[a-z0-9])(?=[A-Z])")) {
				if (!token.empty) {
					result.append(Character.toUpperCase(token.charAt(0)))
					result.append(token.substring(1))
				}
			}
		}
	}
	if (result.length === 0) "RefApp" else result.toString
}

	def String tableName(String entityName) {
		'''«entityName.toLowerCase»s'''
	}
}
