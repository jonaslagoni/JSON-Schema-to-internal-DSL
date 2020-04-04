/*
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.json.schema.draft7.Draft7Package;
import org.xtext.json.schema.draft7.ExclusiveMaximum;
import org.xtext.json.schema.draft7.ExclusiveMinimum;
import org.xtext.json.schema.draft7.JsonSchemaRoot;
import org.xtext.json.schema.draft7.Length;
import org.xtext.json.schema.draft7.Maximum;
import org.xtext.json.schema.draft7.Minimum;
import org.xtext.json.schema.draft7.Model;
import org.xtext.json.schema.draft7.Multiples;
import org.xtext.json.schema.draft7.NumberProperties;
import org.xtext.json.schema.draft7.ObjectProperties;
import org.xtext.json.schema.draft7.Pattern;
import org.xtext.json.schema.draft7.Properties;
import org.xtext.json.schema.draft7.Property;
import org.xtext.json.schema.draft7.RequiredProperties;
import org.xtext.json.schema.draft7.RequiredPropertiesName;
import org.xtext.json.schema.draft7.StringProperties;
import org.xtext.json.schema.draft7.Type;
import org.xtext.json.schema.services.Draft7GrammarAccess;

@SuppressWarnings("all")
public class Draft7SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Draft7GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Draft7Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Draft7Package.EXCLUSIVE_MAXIMUM:
				sequence_ExclusiveMaximum(context, (ExclusiveMaximum) semanticObject); 
				return; 
			case Draft7Package.EXCLUSIVE_MINIMUM:
				sequence_ExclusiveMinimum(context, (ExclusiveMinimum) semanticObject); 
				return; 
			case Draft7Package.JSON_SCHEMA_ROOT:
				sequence_JsonSchemaRoot(context, (JsonSchemaRoot) semanticObject); 
				return; 
			case Draft7Package.LENGTH:
				sequence_Length(context, (Length) semanticObject); 
				return; 
			case Draft7Package.MAXIMUM:
				sequence_Maximum(context, (Maximum) semanticObject); 
				return; 
			case Draft7Package.MINIMUM:
				sequence_Minimum(context, (Minimum) semanticObject); 
				return; 
			case Draft7Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Draft7Package.MULTIPLES:
				sequence_Multiples(context, (Multiples) semanticObject); 
				return; 
			case Draft7Package.NUMBER_PROPERTIES:
				sequence_NumberProperties(context, (NumberProperties) semanticObject); 
				return; 
			case Draft7Package.OBJECT_PROPERTIES:
				sequence_ObjectProperties(context, (ObjectProperties) semanticObject); 
				return; 
			case Draft7Package.PATTERN:
				sequence_Pattern(context, (Pattern) semanticObject); 
				return; 
			case Draft7Package.PROPERTIES:
				sequence_Properties(context, (Properties) semanticObject); 
				return; 
			case Draft7Package.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case Draft7Package.REQUIRED_PROPERTIES:
				sequence_RequiredProperties(context, (RequiredProperties) semanticObject); 
				return; 
			case Draft7Package.REQUIRED_PROPERTIES_NAME:
				sequence_RequiredPropertiesName(context, (RequiredPropertiesName) semanticObject); 
				return; 
			case Draft7Package.STRING_PROPERTIES:
				sequence_StringProperties(context, (StringProperties) semanticObject); 
				return; 
			case Draft7Package.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ExclusiveMaximum returns ExclusiveMaximum
	 *
	 * Constraint:
	 *     exclusiveMaximum=INT
	 */
	protected void sequence_ExclusiveMaximum(ISerializationContext context, ExclusiveMaximum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.EXCLUSIVE_MAXIMUM__EXCLUSIVE_MAXIMUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.EXCLUSIVE_MAXIMUM__EXCLUSIVE_MAXIMUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumINTTerminalRuleCall_2_0(), semanticObject.getExclusiveMaximum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExclusiveMinimum returns ExclusiveMinimum
	 *
	 * Constraint:
	 *     exclusiveMinimum=INT
	 */
	protected void sequence_ExclusiveMinimum(ISerializationContext context, ExclusiveMinimum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.EXCLUSIVE_MINIMUM__EXCLUSIVE_MINIMUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.EXCLUSIVE_MINIMUM__EXCLUSIVE_MINIMUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumINTTerminalRuleCall_2_0(), semanticObject.getExclusiveMinimum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonSchemaRoot returns JsonSchemaRoot
	 *
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_JsonSchemaRoot(ISerializationContext context, JsonSchemaRoot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.JSON_SCHEMA_ROOT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.JSON_SCHEMA_ROOT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonSchemaRootAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Length returns Length
	 *
	 * Constraint:
	 *     length=INT
	 */
	protected void sequence_Length(ISerializationContext context, Length semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.LENGTH__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.LENGTH__LENGTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLengthAccess().getLengthINTTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Maximum returns Maximum
	 *
	 * Constraint:
	 *     maximum=INT
	 */
	protected void sequence_Maximum(ISerializationContext context, Maximum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.MAXIMUM__MAXIMUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.MAXIMUM__MAXIMUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMaximumAccess().getMaximumINTTerminalRuleCall_2_0(), semanticObject.getMaximum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Minimum returns Minimum
	 *
	 * Constraint:
	 *     minimum=INT
	 */
	protected void sequence_Minimum(ISerializationContext context, Minimum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.MINIMUM__MINIMUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.MINIMUM__MINIMUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMinimumAccess().getMinimumINTTerminalRuleCall_2_0(), semanticObject.getMinimum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     root+=JsonSchemaRoot*
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonSchemaRoot returns Multiples
	 *     NumberProperties returns Multiples
	 *     Multiples returns Multiples
	 *
	 * Constraint:
	 *     multipleOf=INT
	 */
	protected void sequence_Multiples(ISerializationContext context, Multiples semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.MULTIPLES__MULTIPLE_OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.MULTIPLES__MULTIPLE_OF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplesAccess().getMultipleOfINTTerminalRuleCall_2_0(), semanticObject.getMultipleOf());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonSchemaRoot returns NumberProperties
	 *     NumberProperties returns NumberProperties
	 *
	 * Constraint:
	 *     (minimum=Minimum | exclusiveMinimum=ExclusiveMinimum | maximum=Maximum | exclusiveMaximum=ExclusiveMaximum)
	 */
	protected void sequence_NumberProperties(ISerializationContext context, NumberProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonSchemaRoot returns ObjectProperties
	 *     ObjectProperties returns ObjectProperties
	 *
	 * Constraint:
	 *     (properties=Properties | requiredProperties=RequiredProperties)
	 */
	protected void sequence_ObjectProperties(ISerializationContext context, ObjectProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Pattern
	 *
	 * Constraint:
	 *     pattern=JSON_STRING
	 */
	protected void sequence_Pattern(ISerializationContext context, Pattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.PATTERN__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.PATTERN__PATTERN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternAccess().getPatternJSON_STRINGTerminalRuleCall_2_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Properties returns Properties
	 *
	 * Constraint:
	 *     properties+=Property*
	 */
	protected void sequence_Properties(ISerializationContext context, Properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=JSON_ID properties+=JsonSchemaRoot*)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RequiredPropertiesName returns RequiredPropertiesName
	 *
	 * Constraint:
	 *     name=JSON_ID
	 */
	protected void sequence_RequiredPropertiesName(ISerializationContext context, RequiredPropertiesName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Draft7Package.Literals.REQUIRED_PROPERTIES_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Draft7Package.Literals.REQUIRED_PROPERTIES_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredPropertiesNameAccess().getNameJSON_IDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RequiredProperties returns RequiredProperties
	 *
	 * Constraint:
	 *     requiredProperties+=RequiredPropertiesName
	 */
	protected void sequence_RequiredProperties(ISerializationContext context, RequiredProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonSchemaRoot returns StringProperties
	 *     StringProperties returns StringProperties
	 *
	 * Constraint:
	 *     (length=Length | pattern=Pattern)
	 */
	protected void sequence_StringProperties(ISerializationContext context, StringProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     ((types+=JsonTypes types+=JsonTypes*) | type=JsonTypes)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
