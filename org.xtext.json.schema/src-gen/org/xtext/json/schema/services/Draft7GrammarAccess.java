/*
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Draft7GrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cRootAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cRootJsonSchemaRootParserRuleCall_2_0_0 = (RuleCall)cRootAssignment_2_0.eContents().get(0);
		private final Keyword cCommaKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Model:
		//	{Model}
		//	'{' (root+=JsonSchemaRoot ','?)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} '{' (root+=JsonSchemaRoot ','?)* '}'
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(root+=JsonSchemaRoot ','?)*
		public Group getGroup_2() { return cGroup_2; }
		
		//root+=JsonSchemaRoot
		public Assignment getRootAssignment_2_0() { return cRootAssignment_2_0; }
		
		//JsonSchemaRoot
		public RuleCall getRootJsonSchemaRootParserRuleCall_2_0_0() { return cRootJsonSchemaRootParserRuleCall_2_0_0; }
		
		//','?
		public Keyword getCommaKeyword_2_1() { return cCommaKeyword_2_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class JsonSchemaRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.JsonSchemaRoot");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cObjectPropertiesParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStringPropertiesParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNumberPropertiesParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//JsonSchemaRoot:
		//	type=Type | ObjectProperties | StringProperties | NumberProperties;
		@Override public ParserRule getRule() { return rule; }
		
		//type=Type | ObjectProperties | StringProperties | NumberProperties
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }
		
		//ObjectProperties
		public RuleCall getObjectPropertiesParserRuleCall_1() { return cObjectPropertiesParserRuleCall_1; }
		
		//StringProperties
		public RuleCall getStringPropertiesParserRuleCall_2() { return cStringPropertiesParserRuleCall_2; }
		
		//NumberProperties
		public RuleCall getNumberPropertiesParserRuleCall_3() { return cNumberPropertiesParserRuleCall_3; }
	}
	public class NumberPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.NumberProperties");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMultiplesParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Assignment cMinimumAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cMinimumMinimumParserRuleCall_1_0 = (RuleCall)cMinimumAssignment_1.eContents().get(0);
		private final Assignment cExclusiveMinimumAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cExclusiveMinimumExclusiveMinimumParserRuleCall_2_0 = (RuleCall)cExclusiveMinimumAssignment_2.eContents().get(0);
		private final Assignment cMaximumAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cMaximumMaximumParserRuleCall_3_0 = (RuleCall)cMaximumAssignment_3.eContents().get(0);
		private final Assignment cExclusiveMaximumAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cExclusiveMaximumExclusiveMaximumParserRuleCall_4_0 = (RuleCall)cExclusiveMaximumAssignment_4.eContents().get(0);
		
		//NumberProperties:
		//	Multiples | minimum=Minimum | exclusiveMinimum=ExclusiveMinimum | maximum=Maximum |
		//	exclusiveMaximum=ExclusiveMaximum;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiples | minimum=Minimum | exclusiveMinimum=ExclusiveMinimum | maximum=Maximum | exclusiveMaximum=ExclusiveMaximum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Multiples
		public RuleCall getMultiplesParserRuleCall_0() { return cMultiplesParserRuleCall_0; }
		
		//minimum=Minimum
		public Assignment getMinimumAssignment_1() { return cMinimumAssignment_1; }
		
		//Minimum
		public RuleCall getMinimumMinimumParserRuleCall_1_0() { return cMinimumMinimumParserRuleCall_1_0; }
		
		//exclusiveMinimum=ExclusiveMinimum
		public Assignment getExclusiveMinimumAssignment_2() { return cExclusiveMinimumAssignment_2; }
		
		//ExclusiveMinimum
		public RuleCall getExclusiveMinimumExclusiveMinimumParserRuleCall_2_0() { return cExclusiveMinimumExclusiveMinimumParserRuleCall_2_0; }
		
		//maximum=Maximum
		public Assignment getMaximumAssignment_3() { return cMaximumAssignment_3; }
		
		//Maximum
		public RuleCall getMaximumMaximumParserRuleCall_3_0() { return cMaximumMaximumParserRuleCall_3_0; }
		
		//exclusiveMaximum=ExclusiveMaximum
		public Assignment getExclusiveMaximumAssignment_4() { return cExclusiveMaximumAssignment_4; }
		
		//ExclusiveMaximum
		public RuleCall getExclusiveMaximumExclusiveMaximumParserRuleCall_4_0() { return cExclusiveMaximumExclusiveMaximumParserRuleCall_4_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Assignment cTypesAssignment_2_0_1_0 = (Assignment)cGroup_2_0_1.eContents().get(0);
		private final RuleCall cTypesJsonTypesParserRuleCall_2_0_1_0_0 = (RuleCall)cTypesAssignment_2_0_1_0.eContents().get(0);
		private final Group cGroup_2_0_1_1 = (Group)cGroup_2_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_1_1_0 = (Keyword)cGroup_2_0_1_1.eContents().get(0);
		private final Assignment cTypesAssignment_2_0_1_1_1 = (Assignment)cGroup_2_0_1_1.eContents().get(1);
		private final RuleCall cTypesJsonTypesParserRuleCall_2_0_1_1_1_0 = (RuleCall)cTypesAssignment_2_0_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_0_2 = (Keyword)cGroup_2_0.eContents().get(2);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTypeJsonTypesParserRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		
		///**
		// * General
		// */ Type:
		//	'"type"' ':' ('[' (types+=JsonTypes (',' types+=JsonTypes)*) ']' | type=JsonTypes);
		@Override public ParserRule getRule() { return rule; }
		
		//'"type"' ':' ('[' (types+=JsonTypes (',' types+=JsonTypes)*) ']' | type=JsonTypes)
		public Group getGroup() { return cGroup; }
		
		//'"type"'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//('[' (types+=JsonTypes (',' types+=JsonTypes)*) ']' | type=JsonTypes)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'[' (types+=JsonTypes (',' types+=JsonTypes)*) ']'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_0_0() { return cLeftSquareBracketKeyword_2_0_0; }
		
		//(types+=JsonTypes (',' types+=JsonTypes)*)
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//types+=JsonTypes
		public Assignment getTypesAssignment_2_0_1_0() { return cTypesAssignment_2_0_1_0; }
		
		//JsonTypes
		public RuleCall getTypesJsonTypesParserRuleCall_2_0_1_0_0() { return cTypesJsonTypesParserRuleCall_2_0_1_0_0; }
		
		//(',' types+=JsonTypes)*
		public Group getGroup_2_0_1_1() { return cGroup_2_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_1_1_0() { return cCommaKeyword_2_0_1_1_0; }
		
		//types+=JsonTypes
		public Assignment getTypesAssignment_2_0_1_1_1() { return cTypesAssignment_2_0_1_1_1; }
		
		//JsonTypes
		public RuleCall getTypesJsonTypesParserRuleCall_2_0_1_1_1_0() { return cTypesJsonTypesParserRuleCall_2_0_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_0_2() { return cRightSquareBracketKeyword_2_0_2; }
		
		//type=JsonTypes
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//JsonTypes
		public RuleCall getTypeJsonTypesParserRuleCall_2_1_0() { return cTypeJsonTypesParserRuleCall_2_1_0; }
	}
	public class JsonTypesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.JsonTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cNumberKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cObjectKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cArrayKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cBooleanKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cNullKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		
		//JsonTypes:
		//	'"string"' | '"integer"' | '"number"' | '"object"' | '"array"' | '"boolean"' | '"null"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"string"' | '"integer"' | '"number"' | '"object"' | '"array"' | '"boolean"' | '"null"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"string"'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//'"integer"'
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }
		
		//'"number"'
		public Keyword getNumberKeyword_2() { return cNumberKeyword_2; }
		
		//'"object"'
		public Keyword getObjectKeyword_3() { return cObjectKeyword_3; }
		
		//'"array"'
		public Keyword getArrayKeyword_4() { return cArrayKeyword_4; }
		
		//'"boolean"'
		public Keyword getBooleanKeyword_5() { return cBooleanKeyword_5; }
		
		//'"null"'
		public Keyword getNullKeyword_6() { return cNullKeyword_6; }
	}
	public class ObjectPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.ObjectProperties");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPropertiesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cPropertiesPropertiesParserRuleCall_0_0 = (RuleCall)cPropertiesAssignment_0.eContents().get(0);
		private final Assignment cRequiredPropertiesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cRequiredPropertiesRequiredPropertiesParserRuleCall_1_0 = (RuleCall)cRequiredPropertiesAssignment_1.eContents().get(0);
		
		///**
		// * Object
		// */ ObjectProperties:
		//	properties=Properties | requiredProperties=RequiredProperties;
		@Override public ParserRule getRule() { return rule; }
		
		//properties=Properties | requiredProperties=RequiredProperties
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//properties=Properties
		public Assignment getPropertiesAssignment_0() { return cPropertiesAssignment_0; }
		
		//Properties
		public RuleCall getPropertiesPropertiesParserRuleCall_0_0() { return cPropertiesPropertiesParserRuleCall_0_0; }
		
		//requiredProperties=RequiredProperties
		public Assignment getRequiredPropertiesAssignment_1() { return cRequiredPropertiesAssignment_1; }
		
		//RequiredProperties
		public RuleCall getRequiredPropertiesRequiredPropertiesParserRuleCall_1_0() { return cRequiredPropertiesRequiredPropertiesParserRuleCall_1_0; }
	}
	public class RequiredPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.RequiredProperties");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRequiredPropertiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0 = (RuleCall)cRequiredPropertiesAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RequiredProperties:
		//	'"required"' ':' '[' requiredProperties+=RequiredPropertiesName ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'"required"' ':' '[' requiredProperties+=RequiredPropertiesName ']'
		public Group getGroup() { return cGroup; }
		
		//'"required"'
		public Keyword getRequiredKeyword_0() { return cRequiredKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//requiredProperties+=RequiredPropertiesName
		public Assignment getRequiredPropertiesAssignment_3() { return cRequiredPropertiesAssignment_3; }
		
		//RequiredPropertiesName
		public RuleCall getRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0() { return cRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class RequiredPropertiesNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.RequiredPropertiesName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameJSON_IDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//RequiredPropertiesName:
		//	name=JSON_ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=JSON_ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//JSON_ID
		public RuleCall getNameJSON_IDTerminalRuleCall_0() { return cNameJSON_IDTerminalRuleCall_0; }
	}
	public class PropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Properties");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertiesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPropertiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPropertiesPropertyParserRuleCall_4_0 = (RuleCall)cPropertiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Properties:
		//	{Properties} '"properties"' ':' '{' properties+=Property* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Properties} '"properties"' ':' '{' properties+=Property* '}'
		public Group getGroup() { return cGroup; }
		
		//{Properties}
		public Action getPropertiesAction_0() { return cPropertiesAction_0; }
		
		//'"properties"'
		public Keyword getPropertiesKeyword_1() { return cPropertiesKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_4() { return cPropertiesAssignment_4; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_4_0() { return cPropertiesPropertyParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPropertyAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameJSON_IDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPropertiesJsonSchemaRootParserRuleCall_4_0 = (RuleCall)cPropertiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Property:
		//	{Property} name=JSON_ID ':' '{' properties+=JsonSchemaRoot* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Property} name=JSON_ID ':' '{' properties+=JsonSchemaRoot* '}'
		public Group getGroup() { return cGroup; }
		
		//{Property}
		public Action getPropertyAction_0() { return cPropertyAction_0; }
		
		//name=JSON_ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//JSON_ID
		public RuleCall getNameJSON_IDTerminalRuleCall_1_0() { return cNameJSON_IDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//properties+=JsonSchemaRoot*
		public Assignment getPropertiesAssignment_4() { return cPropertiesAssignment_4; }
		
		//JsonSchemaRoot
		public RuleCall getPropertiesJsonSchemaRootParserRuleCall_4_0() { return cPropertiesJsonSchemaRootParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StringPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.StringProperties");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cLengthAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cLengthLengthParserRuleCall_0_0 = (RuleCall)cLengthAssignment_0.eContents().get(0);
		private final Assignment cPatternAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cPatternPatternParserRuleCall_1_0 = (RuleCall)cPatternAssignment_1.eContents().get(0);
		
		///**
		// * Strings
		// */ StringProperties:
		//	length=Length | pattern=Pattern;
		@Override public ParserRule getRule() { return rule; }
		
		//length=Length | pattern=Pattern
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//length=Length
		public Assignment getLengthAssignment_0() { return cLengthAssignment_0; }
		
		//Length
		public RuleCall getLengthLengthParserRuleCall_0_0() { return cLengthLengthParserRuleCall_0_0; }
		
		//pattern=Pattern
		public Assignment getPatternAssignment_1() { return cPatternAssignment_1; }
		
		//Pattern
		public RuleCall getPatternPatternParserRuleCall_1_0() { return cPatternPatternParserRuleCall_1_0; }
	}
	public class LengthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Length");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLengthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLengthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLengthINTTerminalRuleCall_2_0 = (RuleCall)cLengthAssignment_2.eContents().get(0);
		
		//Length:
		//	'"length"' ':' length=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"length"' ':' length=INT
		public Group getGroup() { return cGroup; }
		
		//'"length"'
		public Keyword getLengthKeyword_0() { return cLengthKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//length=INT
		public Assignment getLengthAssignment_2() { return cLengthAssignment_2; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_2_0() { return cLengthINTTerminalRuleCall_2_0; }
	}
	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Pattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPatternKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPatternAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPatternJSON_STRINGTerminalRuleCall_2_0 = (RuleCall)cPatternAssignment_2.eContents().get(0);
		
		//Pattern:
		//	'"pattern"' ':' pattern=JSON_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'"pattern"' ':' pattern=JSON_STRING
		public Group getGroup() { return cGroup; }
		
		//'"pattern"'
		public Keyword getPatternKeyword_0() { return cPatternKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//pattern=JSON_STRING
		public Assignment getPatternAssignment_2() { return cPatternAssignment_2; }
		
		//JSON_STRING
		public RuleCall getPatternJSON_STRINGTerminalRuleCall_2_0() { return cPatternJSON_STRINGTerminalRuleCall_2_0; }
	}
	public class MultiplesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Multiples");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMultiplesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMultipleOfAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMultipleOfINTTerminalRuleCall_2_0 = (RuleCall)cMultipleOfAssignment_2.eContents().get(0);
		
		///**
		// * Numbers
		// */ Multiples:
		//	'"multiples"' ':' multipleOf=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"multiples"' ':' multipleOf=INT
		public Group getGroup() { return cGroup; }
		
		//'"multiples"'
		public Keyword getMultiplesKeyword_0() { return cMultiplesKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//multipleOf=INT
		public Assignment getMultipleOfAssignment_2() { return cMultipleOfAssignment_2; }
		
		//INT
		public RuleCall getMultipleOfINTTerminalRuleCall_2_0() { return cMultipleOfINTTerminalRuleCall_2_0; }
	}
	public class MinimumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Minimum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMinimumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinimumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinimumINTTerminalRuleCall_2_0 = (RuleCall)cMinimumAssignment_2.eContents().get(0);
		
		//Minimum:
		//	'"minimum"' ':' minimum=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"minimum"' ':' minimum=INT
		public Group getGroup() { return cGroup; }
		
		//'"minimum"'
		public Keyword getMinimumKeyword_0() { return cMinimumKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//minimum=INT
		public Assignment getMinimumAssignment_2() { return cMinimumAssignment_2; }
		
		//INT
		public RuleCall getMinimumINTTerminalRuleCall_2_0() { return cMinimumINTTerminalRuleCall_2_0; }
	}
	public class ExclusiveMinimumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.ExclusiveMinimum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclusiveMinimumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExclusiveMinimumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExclusiveMinimumINTTerminalRuleCall_2_0 = (RuleCall)cExclusiveMinimumAssignment_2.eContents().get(0);
		
		//ExclusiveMinimum:
		//	'"exclusiveMinimum"' ':' exclusiveMinimum=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"exclusiveMinimum"' ':' exclusiveMinimum=INT
		public Group getGroup() { return cGroup; }
		
		//'"exclusiveMinimum"'
		public Keyword getExclusiveMinimumKeyword_0() { return cExclusiveMinimumKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//exclusiveMinimum=INT
		public Assignment getExclusiveMinimumAssignment_2() { return cExclusiveMinimumAssignment_2; }
		
		//INT
		public RuleCall getExclusiveMinimumINTTerminalRuleCall_2_0() { return cExclusiveMinimumINTTerminalRuleCall_2_0; }
	}
	public class MaximumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.Maximum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMaximumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMaximumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMaximumINTTerminalRuleCall_2_0 = (RuleCall)cMaximumAssignment_2.eContents().get(0);
		
		//Maximum:
		//	'"maximum"' ':' maximum=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"maximum"' ':' maximum=INT
		public Group getGroup() { return cGroup; }
		
		//'"maximum"'
		public Keyword getMaximumKeyword_0() { return cMaximumKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//maximum=INT
		public Assignment getMaximumAssignment_2() { return cMaximumAssignment_2; }
		
		//INT
		public RuleCall getMaximumINTTerminalRuleCall_2_0() { return cMaximumINTTerminalRuleCall_2_0; }
	}
	public class ExclusiveMaximumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.ExclusiveMaximum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclusiveMaximumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExclusiveMaximumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExclusiveMaximumINTTerminalRuleCall_2_0 = (RuleCall)cExclusiveMaximumAssignment_2.eContents().get(0);
		
		//ExclusiveMaximum:
		//	'"exclusiveMaximum"' ':' exclusiveMaximum=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'"exclusiveMaximum"' ':' exclusiveMaximum=INT
		public Group getGroup() { return cGroup; }
		
		//'"exclusiveMaximum"'
		public Keyword getExclusiveMaximumKeyword_0() { return cExclusiveMaximumKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//exclusiveMaximum=INT
		public Assignment getExclusiveMaximumAssignment_2() { return cExclusiveMaximumAssignment_2; }
		
		//INT
		public RuleCall getExclusiveMaximumINTTerminalRuleCall_2_0() { return cExclusiveMaximumINTTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tJSON_ID;
	private final TerminalRule tJSON_STRING;
	private final JsonSchemaRootElements pJsonSchemaRoot;
	private final NumberPropertiesElements pNumberProperties;
	private final TypeElements pType;
	private final JsonTypesElements pJsonTypes;
	private final ObjectPropertiesElements pObjectProperties;
	private final RequiredPropertiesElements pRequiredProperties;
	private final RequiredPropertiesNameElements pRequiredPropertiesName;
	private final PropertiesElements pProperties;
	private final PropertyElements pProperty;
	private final StringPropertiesElements pStringProperties;
	private final LengthElements pLength;
	private final PatternElements pPattern;
	private final MultiplesElements pMultiples;
	private final MinimumElements pMinimum;
	private final ExclusiveMinimumElements pExclusiveMinimum;
	private final MaximumElements pMaximum;
	private final ExclusiveMaximumElements pExclusiveMaximum;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Draft7GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.tJSON_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.JSON_ID");
		this.tJSON_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.json.schema.Draft7.JSON_STRING");
		this.pJsonSchemaRoot = new JsonSchemaRootElements();
		this.pNumberProperties = new NumberPropertiesElements();
		this.pType = new TypeElements();
		this.pJsonTypes = new JsonTypesElements();
		this.pObjectProperties = new ObjectPropertiesElements();
		this.pRequiredProperties = new RequiredPropertiesElements();
		this.pRequiredPropertiesName = new RequiredPropertiesNameElements();
		this.pProperties = new PropertiesElements();
		this.pProperty = new PropertyElements();
		this.pStringProperties = new StringPropertiesElements();
		this.pLength = new LengthElements();
		this.pPattern = new PatternElements();
		this.pMultiples = new MultiplesElements();
		this.pMinimum = new MinimumElements();
		this.pExclusiveMinimum = new ExclusiveMinimumElements();
		this.pMaximum = new MaximumElements();
		this.pExclusiveMaximum = new ExclusiveMaximumElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.json.schema.Draft7".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	{Model}
	//	'{' (root+=JsonSchemaRoot ','?)*
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal JSON_ID:
	//	'"' ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* '"';
	public TerminalRule getJSON_IDRule() {
		return tJSON_ID;
	}
	
	//terminal JSON_STRING:
	//	'"' ('[' | ']' | '(' | ')' | '{' | '}' | '/' | '\\' | '$' | '^' | '-' | '?' | 'a'..'z' | 'A'..'Z' | '0'..'9' | '.' |
	//	',' | ';' | ':')* '"';
	public TerminalRule getJSON_STRINGRule() {
		return tJSON_STRING;
	}
	
	//JsonSchemaRoot:
	//	type=Type | ObjectProperties | StringProperties | NumberProperties;
	public JsonSchemaRootElements getJsonSchemaRootAccess() {
		return pJsonSchemaRoot;
	}
	
	public ParserRule getJsonSchemaRootRule() {
		return getJsonSchemaRootAccess().getRule();
	}
	
	//NumberProperties:
	//	Multiples | minimum=Minimum | exclusiveMinimum=ExclusiveMinimum | maximum=Maximum |
	//	exclusiveMaximum=ExclusiveMaximum;
	public NumberPropertiesElements getNumberPropertiesAccess() {
		return pNumberProperties;
	}
	
	public ParserRule getNumberPropertiesRule() {
		return getNumberPropertiesAccess().getRule();
	}
	
	///**
	// * General
	// */ Type:
	//	'"type"' ':' ('[' (types+=JsonTypes (',' types+=JsonTypes)*) ']' | type=JsonTypes);
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//JsonTypes:
	//	'"string"' | '"integer"' | '"number"' | '"object"' | '"array"' | '"boolean"' | '"null"';
	public JsonTypesElements getJsonTypesAccess() {
		return pJsonTypes;
	}
	
	public ParserRule getJsonTypesRule() {
		return getJsonTypesAccess().getRule();
	}
	
	///**
	// * Object
	// */ ObjectProperties:
	//	properties=Properties | requiredProperties=RequiredProperties;
	public ObjectPropertiesElements getObjectPropertiesAccess() {
		return pObjectProperties;
	}
	
	public ParserRule getObjectPropertiesRule() {
		return getObjectPropertiesAccess().getRule();
	}
	
	//RequiredProperties:
	//	'"required"' ':' '[' requiredProperties+=RequiredPropertiesName ']';
	public RequiredPropertiesElements getRequiredPropertiesAccess() {
		return pRequiredProperties;
	}
	
	public ParserRule getRequiredPropertiesRule() {
		return getRequiredPropertiesAccess().getRule();
	}
	
	//RequiredPropertiesName:
	//	name=JSON_ID;
	public RequiredPropertiesNameElements getRequiredPropertiesNameAccess() {
		return pRequiredPropertiesName;
	}
	
	public ParserRule getRequiredPropertiesNameRule() {
		return getRequiredPropertiesNameAccess().getRule();
	}
	
	//Properties:
	//	{Properties} '"properties"' ':' '{' properties+=Property* '}';
	public PropertiesElements getPropertiesAccess() {
		return pProperties;
	}
	
	public ParserRule getPropertiesRule() {
		return getPropertiesAccess().getRule();
	}
	
	//Property:
	//	{Property} name=JSON_ID ':' '{' properties+=JsonSchemaRoot* '}';
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	///**
	// * Strings
	// */ StringProperties:
	//	length=Length | pattern=Pattern;
	public StringPropertiesElements getStringPropertiesAccess() {
		return pStringProperties;
	}
	
	public ParserRule getStringPropertiesRule() {
		return getStringPropertiesAccess().getRule();
	}
	
	//Length:
	//	'"length"' ':' length=INT;
	public LengthElements getLengthAccess() {
		return pLength;
	}
	
	public ParserRule getLengthRule() {
		return getLengthAccess().getRule();
	}
	
	//Pattern:
	//	'"pattern"' ':' pattern=JSON_STRING;
	public PatternElements getPatternAccess() {
		return pPattern;
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}
	
	///**
	// * Numbers
	// */ Multiples:
	//	'"multiples"' ':' multipleOf=INT;
	public MultiplesElements getMultiplesAccess() {
		return pMultiples;
	}
	
	public ParserRule getMultiplesRule() {
		return getMultiplesAccess().getRule();
	}
	
	//Minimum:
	//	'"minimum"' ':' minimum=INT;
	public MinimumElements getMinimumAccess() {
		return pMinimum;
	}
	
	public ParserRule getMinimumRule() {
		return getMinimumAccess().getRule();
	}
	
	//ExclusiveMinimum:
	//	'"exclusiveMinimum"' ':' exclusiveMinimum=INT;
	public ExclusiveMinimumElements getExclusiveMinimumAccess() {
		return pExclusiveMinimum;
	}
	
	public ParserRule getExclusiveMinimumRule() {
		return getExclusiveMinimumAccess().getRule();
	}
	
	//Maximum:
	//	'"maximum"' ':' maximum=INT;
	public MaximumElements getMaximumAccess() {
		return pMaximum;
	}
	
	public ParserRule getMaximumRule() {
		return getMaximumAccess().getRule();
	}
	
	//ExclusiveMaximum:
	//	'"exclusiveMaximum"' ':' exclusiveMaximum=INT;
	public ExclusiveMaximumElements getExclusiveMaximumAccess() {
		return pExclusiveMaximum;
	}
	
	public ParserRule getExclusiveMaximumRule() {
		return getExclusiveMaximumAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
