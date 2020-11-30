/*
 * generated by Xtext 2.23.0
 */
package tdt4250.pseudocode.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PcodeGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PseudoClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.PseudoClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPseudoClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cMembersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMembersConstructorParserRuleCall_2_0 = (RuleCall)cMembersAssignment_2.eContents().get(0);
		private final Keyword cLineFeedKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMembersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMembersMethodParserRuleCall_4_0 = (RuleCall)cMembersAssignment_4.eContents().get(0);
		
		//PseudoClass:
		//	{PseudoClass} name=EString
		//	members+=Constructor*
		//	'\n'*
		//	members+=Method*;
		@Override public ParserRule getRule() { return rule; }
		
		//{PseudoClass} name=EString members+=Constructor* '\n'* members+=Method*
		public Group getGroup() { return cGroup; }
		
		//{PseudoClass}
		public Action getPseudoClassAction_0() { return cPseudoClassAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//members+=Constructor*
		public Assignment getMembersAssignment_2() { return cMembersAssignment_2; }
		
		//Constructor
		public RuleCall getMembersConstructorParserRuleCall_2_0() { return cMembersConstructorParserRuleCall_2_0; }
		
		//'\n'*
		public Keyword getLineFeedKeyword_3() { return cLineFeedKeyword_3; }
		
		//members+=Method*
		public Assignment getMembersAssignment_4() { return cMembersAssignment_4; }
		
		//Method
		public RuleCall getMembersMethodParserRuleCall_4_0() { return cMembersMethodParserRuleCall_4_0; }
	}
	public class MemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Member");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPseudoClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMethodParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cConstructorParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Member:
		//	PseudoClass | Method | Constructor;
		@Override public ParserRule getRule() { return rule; }
		
		//PseudoClass | Method | Constructor
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PseudoClass
		public RuleCall getPseudoClassParserRuleCall_0() { return cPseudoClassParserRuleCall_0; }
		
		//Method
		public RuleCall getMethodParserRuleCall_1() { return cMethodParserRuleCall_1; }
		
		//Constructor
		public RuleCall getConstructorParserRuleCall_2() { return cConstructorParserRuleCall_2; }
	}
	public class ConstructorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Constructor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConstructorAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameLeftParenthesisKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_2_0_0 = (RuleCall)cParametersAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_2_1_1_0 = (RuleCall)cParametersAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Constructor:
		//	{Constructor} name='(' (parameters+=Parameter ("," parameters+=Parameter)*)*
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//{Constructor} name='(' (parameters+=Parameter ("," parameters+=Parameter)*)* ')'
		public Group getGroup() { return cGroup; }
		
		//{Constructor}
		public Action getConstructorAction_0() { return cConstructorAction_0; }
		
		//name='('
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//'('
		public Keyword getNameLeftParenthesisKeyword_1_0() { return cNameLeftParenthesisKeyword_1_0; }
		
		//(parameters+=Parameter ("," parameters+=Parameter)*)*
		public Group getGroup_2() { return cGroup_2; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_2_0() { return cParametersAssignment_2_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_2_0_0() { return cParametersParameterParserRuleCall_2_0_0; }
		
		//("," parameters+=Parameter)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_2_1_1() { return cParametersAssignment_2_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_2_1_1_0() { return cParametersParameterParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMethodAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLineFeedKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyBodyParserRuleCall_6_0 = (RuleCall)cBodyAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cReturnKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_7_1 = (RuleCall)cGroup_7.eContents().get(1);
		
		//Method:
		//	{Method} name=EString
		//	'(' (parameters+=Parameter ("," parameters+=Parameter)*)*
		//	')'
		//	'\n'*
		//	body=Body ('return' Type)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Method} name=EString '(' (parameters+=Parameter ("," parameters+=Parameter)*)* ')' '\n'* body=Body ('return' Type)*
		public Group getGroup() { return cGroup; }
		
		//{Method}
		public Action getMethodAction_0() { return cMethodAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(parameters+=Parameter ("," parameters+=Parameter)*)*
		public Group getGroup_3() { return cGroup_3; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }
		
		//("," parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'\n'*
		public Keyword getLineFeedKeyword_5() { return cLineFeedKeyword_5; }
		
		//body=Body
		public Assignment getBodyAssignment_6() { return cBodyAssignment_6; }
		
		//Body
		public RuleCall getBodyBodyParserRuleCall_6_0() { return cBodyBodyParserRuleCall_6_0; }
		
		//('return' Type)*
		public Group getGroup_7() { return cGroup_7; }
		
		//'return'
		public Keyword getReturnKeyword_7_0() { return cReturnKeyword_7_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_7_1() { return cTypeParserRuleCall_7_1; }
	}
	public class BodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Body");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBodyAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cStatementsAlternatives_1_0 = (Alternatives)cStatementsAssignment_1.eContents().get(0);
		private final RuleCall cStatementsVariableParserRuleCall_1_0_0 = (RuleCall)cStatementsAlternatives_1_0.eContents().get(0);
		private final RuleCall cStatementsIfParserRuleCall_1_0_1 = (RuleCall)cStatementsAlternatives_1_0.eContents().get(1);
		private final RuleCall cStatementsForParserRuleCall_1_0_2 = (RuleCall)cStatementsAlternatives_1_0.eContents().get(2);
		private final RuleCall cStatementsWhileParserRuleCall_1_0_3 = (RuleCall)cStatementsAlternatives_1_0.eContents().get(3);
		
		//Body:
		//	{Body} statements+=(Variable | If | For | While)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Body} statements+=(Variable | If | For | While)*
		public Group getGroup() { return cGroup; }
		
		//{Body}
		public Action getBodyAction_0() { return cBodyAction_0; }
		
		//statements+=(Variable | If | For | While)*
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//(Variable | If | For | While)
		public Alternatives getStatementsAlternatives_1_0() { return cStatementsAlternatives_1_0; }
		
		//Variable
		public RuleCall getStatementsVariableParserRuleCall_1_0_0() { return cStatementsVariableParserRuleCall_1_0_0; }
		
		//If
		public RuleCall getStatementsIfParserRuleCall_1_0_1() { return cStatementsIfParserRuleCall_1_0_1; }
		
		//For
		public RuleCall getStatementsForParserRuleCall_1_0_2() { return cStatementsForParserRuleCall_1_0_2; }
		
		//While
		public RuleCall getStatementsWhileParserRuleCall_1_0_3() { return cStatementsWhileParserRuleCall_1_0_3; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cEStringParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cTypeParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Variable:
		//	{Variable} EString '=' Type;
		@Override public ParserRule getRule() { return rule; }
		
		//{Variable} EString '=' Type
		public Group getGroup() { return cGroup; }
		
		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }
		
		//EString
		public RuleCall getEStringParserRuleCall_1() { return cEStringParserRuleCall_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//Type
		public RuleCall getTypeParserRuleCall_3() { return cTypeParserRuleCall_3; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Expression");
		private final Action cExpressionAction = (Action)rule.eContents().get(1);
		
		//Expression:
		//	{Expression};
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression}
		public Action getExpressionAction() { return cExpressionAction; }
	}
	public class IfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.If");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIfAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cTypeParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cEqualsSignEqualsSignKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Keyword cLessThanSignKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		private final Keyword cLessThanSignEqualsSignKeyword_3_2 = (Keyword)cAlternatives_3.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_3_3 = (Keyword)cAlternatives_3.eContents().get(3);
		private final Keyword cGreaterThanSignEqualsSignKeyword_3_4 = (Keyword)cAlternatives_3.eContents().get(4);
		private final RuleCall cTypeParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//If:
		//	{If}
		//	'if' Type ('==' | '<' | '<=' | '>' | '>=') Type;
		@Override public ParserRule getRule() { return rule; }
		
		//{If} 'if' Type ('==' | '<' | '<=' | '>' | '>=') Type
		public Group getGroup() { return cGroup; }
		
		//{If}
		public Action getIfAction_0() { return cIfAction_0; }
		
		//'if'
		public Keyword getIfKeyword_1() { return cIfKeyword_1; }
		
		//Type
		public RuleCall getTypeParserRuleCall_2() { return cTypeParserRuleCall_2; }
		
		//('==' | '<' | '<=' | '>' | '>=')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_3_0() { return cEqualsSignEqualsSignKeyword_3_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_3_1() { return cLessThanSignKeyword_3_1; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_3_2() { return cLessThanSignEqualsSignKeyword_3_2; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_3() { return cGreaterThanSignKeyword_3_3; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_3_4() { return cGreaterThanSignEqualsSignKeyword_3_4; }
		
		//Type
		public RuleCall getTypeParserRuleCall_4() { return cTypeParserRuleCall_4; }
	}
	public class ForElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.For");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cForAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cForKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//For:
		//	{For}
		//	'for(' ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{For} 'for(' ')'
		public Group getGroup() { return cGroup; }
		
		//{For}
		public Action getForAction_0() { return cForAction_0; }
		
		//'for('
		public Keyword getForKeyword_1() { return cForKeyword_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class WhileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.While");
		private final Action cWhileAction = (Action)rule.eContents().get(1);
		
		//While:
		//	{While};
		@Override public ParserRule getRule() { return rule; }
		
		//{While}
		public Action getWhileAction() { return cWhileAction; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParameterAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Parameter:
		//	{Parameter} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Parameter} name=EString
		public Group getGroup() { return cGroup; }
		
		//{Parameter}
		public Action getParameterAction_0() { return cParameterAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEStringParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDOUBLETerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type:
		//	EString | DOUBLE | INT;
		@Override public ParserRule getRule() { return rule; }
		
		//EString | DOUBLE | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EString
		public RuleCall getEStringParserRuleCall_0() { return cEStringParserRuleCall_0; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_1() { return cDOUBLETerminalRuleCall_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class VisibilityKindElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.VisibilityKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPackagePrivateEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPackagePrivatePackagePrivateKeyword_0_0 = (Keyword)cPackagePrivateEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPrivateEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cProtectedEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cProtectedProtectedKeyword_2_0 = (Keyword)cProtectedEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cPublicEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cPublicPublicKeyword_3_0 = (Keyword)cPublicEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum VisibilityKind:
		//	packagePrivate | private | protected | public;
		public EnumRule getRule() { return rule; }
		
		//packagePrivate | private | protected | public
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//packagePrivate
		public EnumLiteralDeclaration getPackagePrivateEnumLiteralDeclaration_0() { return cPackagePrivateEnumLiteralDeclaration_0; }
		
		//'packagePrivate'
		public Keyword getPackagePrivatePackagePrivateKeyword_0_0() { return cPackagePrivatePackagePrivateKeyword_0_0; }
		
		//private
		public EnumLiteralDeclaration getPrivateEnumLiteralDeclaration_1() { return cPrivateEnumLiteralDeclaration_1; }
		
		//'private'
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }
		
		//protected
		public EnumLiteralDeclaration getProtectedEnumLiteralDeclaration_2() { return cProtectedEnumLiteralDeclaration_2; }
		
		//'protected'
		public Keyword getProtectedProtectedKeyword_2_0() { return cProtectedProtectedKeyword_2_0; }
		
		//public
		public EnumLiteralDeclaration getPublicEnumLiteralDeclaration_3() { return cPublicEnumLiteralDeclaration_3; }
		
		//'public'
		public Keyword getPublicPublicKeyword_3_0() { return cPublicPublicKeyword_3_0; }
	}
	
	private final PseudoClassElements pPseudoClass;
	private final MemberElements pMember;
	private final ConstructorElements pConstructor;
	private final MethodElements pMethod;
	private final BodyElements pBody;
	private final VariableElements pVariable;
	private final ExpressionElements pExpression;
	private final IfElements pIf;
	private final ForElements pFor;
	private final WhileElements pWhile;
	private final ParameterElements pParameter;
	private final TypeElements pType;
	private final VisibilityKindElements eVisibilityKind;
	private final EStringElements pEString;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PcodeGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPseudoClass = new PseudoClassElements();
		this.pMember = new MemberElements();
		this.pConstructor = new ConstructorElements();
		this.pMethod = new MethodElements();
		this.pBody = new BodyElements();
		this.pVariable = new VariableElements();
		this.pExpression = new ExpressionElements();
		this.pIf = new IfElements();
		this.pFor = new ForElements();
		this.pWhile = new WhileElements();
		this.pParameter = new ParameterElements();
		this.pType = new TypeElements();
		this.eVisibilityKind = new VisibilityKindElements();
		this.pEString = new EStringElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "tdt4250.pseudocode.Pcode.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("tdt4250.pseudocode.Pcode".equals(grammar.getName())) {
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

	
	//PseudoClass:
	//	{PseudoClass} name=EString
	//	members+=Constructor*
	//	'\n'*
	//	members+=Method*;
	public PseudoClassElements getPseudoClassAccess() {
		return pPseudoClass;
	}
	
	public ParserRule getPseudoClassRule() {
		return getPseudoClassAccess().getRule();
	}
	
	//Member:
	//	PseudoClass | Method | Constructor;
	public MemberElements getMemberAccess() {
		return pMember;
	}
	
	public ParserRule getMemberRule() {
		return getMemberAccess().getRule();
	}
	
	//Constructor:
	//	{Constructor} name='(' (parameters+=Parameter ("," parameters+=Parameter)*)*
	//	')';
	public ConstructorElements getConstructorAccess() {
		return pConstructor;
	}
	
	public ParserRule getConstructorRule() {
		return getConstructorAccess().getRule();
	}
	
	//Method:
	//	{Method} name=EString
	//	'(' (parameters+=Parameter ("," parameters+=Parameter)*)*
	//	')'
	//	'\n'*
	//	body=Body ('return' Type)*;
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}
	
	//Body:
	//	{Body} statements+=(Variable | If | For | While)*;
	public BodyElements getBodyAccess() {
		return pBody;
	}
	
	public ParserRule getBodyRule() {
		return getBodyAccess().getRule();
	}
	
	//Variable:
	//	{Variable} EString '=' Type;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Expression:
	//	{Expression};
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//If:
	//	{If}
	//	'if' Type ('==' | '<' | '<=' | '>' | '>=') Type;
	public IfElements getIfAccess() {
		return pIf;
	}
	
	public ParserRule getIfRule() {
		return getIfAccess().getRule();
	}
	
	//For:
	//	{For}
	//	'for(' ')';
	public ForElements getForAccess() {
		return pFor;
	}
	
	public ParserRule getForRule() {
		return getForAccess().getRule();
	}
	
	//While:
	//	{While};
	public WhileElements getWhileAccess() {
		return pWhile;
	}
	
	public ParserRule getWhileRule() {
		return getWhileAccess().getRule();
	}
	
	//Parameter:
	//	{Parameter} name=EString;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//Type:
	//	EString | DOUBLE | INT;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//enum VisibilityKind:
	//	packagePrivate | private | protected | public;
	public VisibilityKindElements getVisibilityKindAccess() {
		return eVisibilityKind;
	}
	
	public EnumRule getVisibilityKindRule() {
		return getVisibilityKindAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	INT '.' INT;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
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
