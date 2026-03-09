/*
 * Base validator for REF DSL; registers REF metamodel package.
 * (When running GenerateRefDsl.mwe2, Xtext may generate a similar class in src-gen; this one ensures the project compiles before the first run.)
 */
package pt.isep.enorm.refdsl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRefDslValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/ref"));
		return result;
	}
}
