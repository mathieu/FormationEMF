package fr.obeo.training.relational.extension.compare;

import org.eclipse.emf.compare.diff.engine.GenericDiffEngine;
import org.eclipse.emf.ecore.EAttribute;

import fr.obeo.training.relational.RelationalPackage;


public class RelationalDiffEngine extends GenericDiffEngine {

	@Override
	protected boolean shouldBeIgnored(EAttribute attribute) {
		if (attribute.eContainer() == RelationalPackage.eINSTANCE.getTable() && attribute == RelationalPackage.eINSTANCE.getTable_Name())
			return true;
		return super.shouldBeIgnored(attribute);
	}
}
