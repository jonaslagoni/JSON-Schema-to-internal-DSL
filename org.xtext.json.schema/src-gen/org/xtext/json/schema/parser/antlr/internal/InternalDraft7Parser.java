package org.xtext.json.schema.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.json.schema.services.Draft7GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDraft7Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'\"properties\"'", "':'", "'\"type\"'", "'['", "']'", "'\"string\"'", "'\"integer\"'", "'\"number\"'", "'\"object\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'", "'\"multiples\":'", "'\"minimum\":'", "'\"exclusiveMinimum\":'", "'\"maximum\":'", "'\"exclusiveMaximum\":'", "'\"length\":'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDraft7Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDraft7Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDraft7Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDraft7.g"; }



     	private Draft7GrammarAccess grammarAccess;

        public InternalDraft7Parser(TokenStream input, Draft7GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Draft7GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDraft7.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDraft7.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDraft7.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDraft7.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )* otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_root_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:77:2: ( (otherlv_0= '{' ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )* otherlv_3= '}' ) )
            // InternalDraft7.g:78:2: (otherlv_0= '{' ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )* otherlv_3= '}' )
            {
            // InternalDraft7.g:78:2: (otherlv_0= '{' ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )* otherlv_3= '}' )
            // InternalDraft7.g:79:3: otherlv_0= '{' ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDraft7.g:83:3: ( ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16||(LA2_0>=26 && LA2_0<=31)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDraft7.g:84:4: ( (lv_root_1_0= ruleRoot ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalDraft7.g:84:4: ( (lv_root_1_0= ruleRoot ) )
            	    // InternalDraft7.g:85:5: (lv_root_1_0= ruleRoot )
            	    {
            	    // InternalDraft7.g:85:5: (lv_root_1_0= ruleRoot )
            	    // InternalDraft7.g:86:6: lv_root_1_0= ruleRoot
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getRootRootParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_root_1_0=ruleRoot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"root",
            	    							lv_root_1_0,
            	    							"org.xtext.json.schema.Draft7.Root");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDraft7.g:103:4: (otherlv_2= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==12) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDraft7.g:104:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	            					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRoot"
    // InternalDraft7.g:118:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalDraft7.g:118:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalDraft7.g:119:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalDraft7.g:125:1: ruleRoot returns [EObject current=null] : ( ( () ruleType ) | ( () ruleLength ) | ( () ruleMultiples ) | ( () ruleMinimum ) | ( () ruleExclusiveMinimum ) | ( () ruleMaximum ) | ( () ruleExclusiveMaximum ) | this_JSONProperties_14= ruleJSONProperties ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_JSONProperties_14 = null;



        	enterRule();

        try {
            // InternalDraft7.g:131:2: ( ( ( () ruleType ) | ( () ruleLength ) | ( () ruleMultiples ) | ( () ruleMinimum ) | ( () ruleExclusiveMinimum ) | ( () ruleMaximum ) | ( () ruleExclusiveMaximum ) | this_JSONProperties_14= ruleJSONProperties ) )
            // InternalDraft7.g:132:2: ( ( () ruleType ) | ( () ruleLength ) | ( () ruleMultiples ) | ( () ruleMinimum ) | ( () ruleExclusiveMinimum ) | ( () ruleMaximum ) | ( () ruleExclusiveMaximum ) | this_JSONProperties_14= ruleJSONProperties )
            {
            // InternalDraft7.g:132:2: ( ( () ruleType ) | ( () ruleLength ) | ( () ruleMultiples ) | ( () ruleMinimum ) | ( () ruleExclusiveMinimum ) | ( () ruleMaximum ) | ( () ruleExclusiveMaximum ) | this_JSONProperties_14= ruleJSONProperties )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 14:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDraft7.g:133:3: ( () ruleType )
                    {
                    // InternalDraft7.g:133:3: ( () ruleType )
                    // InternalDraft7.g:134:4: () ruleType
                    {
                    // InternalDraft7.g:134:4: ()
                    // InternalDraft7.g:135:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:150:3: ( () ruleLength )
                    {
                    // InternalDraft7.g:150:3: ( () ruleLength )
                    // InternalDraft7.g:151:4: () ruleLength
                    {
                    // InternalDraft7.g:151:4: ()
                    // InternalDraft7.g:152:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getLengthParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLength();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:167:3: ( () ruleMultiples )
                    {
                    // InternalDraft7.g:167:3: ( () ruleMultiples )
                    // InternalDraft7.g:168:4: () ruleMultiples
                    {
                    // InternalDraft7.g:168:4: ()
                    // InternalDraft7.g:169:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getMultiplesParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMultiples();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:184:3: ( () ruleMinimum )
                    {
                    // InternalDraft7.g:184:3: ( () ruleMinimum )
                    // InternalDraft7.g:185:4: () ruleMinimum
                    {
                    // InternalDraft7.g:185:4: ()
                    // InternalDraft7.g:186:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_3_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getMinimumParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMinimum();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:201:3: ( () ruleExclusiveMinimum )
                    {
                    // InternalDraft7.g:201:3: ( () ruleExclusiveMinimum )
                    // InternalDraft7.g:202:4: () ruleExclusiveMinimum
                    {
                    // InternalDraft7.g:202:4: ()
                    // InternalDraft7.g:203:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_4_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getExclusiveMinimumParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleExclusiveMinimum();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:218:3: ( () ruleMaximum )
                    {
                    // InternalDraft7.g:218:3: ( () ruleMaximum )
                    // InternalDraft7.g:219:4: () ruleMaximum
                    {
                    // InternalDraft7.g:219:4: ()
                    // InternalDraft7.g:220:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_5_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getMaximumParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMaximum();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:235:3: ( () ruleExclusiveMaximum )
                    {
                    // InternalDraft7.g:235:3: ( () ruleExclusiveMaximum )
                    // InternalDraft7.g:236:4: () ruleExclusiveMaximum
                    {
                    // InternalDraft7.g:236:4: ()
                    // InternalDraft7.g:237:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRootAccess().getRootAction_6_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getRootAccess().getExclusiveMaximumParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleExclusiveMaximum();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDraft7.g:252:3: this_JSONProperties_14= ruleJSONProperties
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getJSONPropertiesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONProperties_14=ruleJSONProperties();

                    state._fsp--;


                    			current = this_JSONProperties_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleJSONProperties"
    // InternalDraft7.g:264:1: entryRuleJSONProperties returns [EObject current=null] : iv_ruleJSONProperties= ruleJSONProperties EOF ;
    public final EObject entryRuleJSONProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONProperties = null;


        try {
            // InternalDraft7.g:264:55: (iv_ruleJSONProperties= ruleJSONProperties EOF )
            // InternalDraft7.g:265:2: iv_ruleJSONProperties= ruleJSONProperties EOF
            {
             newCompositeNode(grammarAccess.getJSONPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONProperties=ruleJSONProperties();

            state._fsp--;

             current =iv_ruleJSONProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSONProperties"


    // $ANTLR start "ruleJSONProperties"
    // InternalDraft7.g:271:1: ruleJSONProperties returns [EObject current=null] : ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJSONProperty ) )* otherlv_5= '}' ) ;
    public final EObject ruleJSONProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:277:2: ( ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJSONProperty ) )* otherlv_5= '}' ) )
            // InternalDraft7.g:278:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJSONProperty ) )* otherlv_5= '}' )
            {
            // InternalDraft7.g:278:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJSONProperty ) )* otherlv_5= '}' )
            // InternalDraft7.g:279:3: () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJSONProperty ) )* otherlv_5= '}'
            {
            // InternalDraft7.g:279:3: ()
            // InternalDraft7.g:280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJSONPropertiesAccess().getJSONPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJSONPropertiesAccess().getPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getJSONPropertiesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getJSONPropertiesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDraft7.g:298:3: ( (lv_properties_4_0= ruleJSONProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDraft7.g:299:4: (lv_properties_4_0= ruleJSONProperty )
            	    {
            	    // InternalDraft7.g:299:4: (lv_properties_4_0= ruleJSONProperty )
            	    // InternalDraft7.g:300:5: lv_properties_4_0= ruleJSONProperty
            	    {

            	    					newCompositeNode(grammarAccess.getJSONPropertiesAccess().getPropertiesJSONPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_4_0=ruleJSONProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJSONPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"org.xtext.json.schema.Draft7.JSONProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJSONPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONProperties"


    // $ANTLR start "entryRuleJSONProperty"
    // InternalDraft7.g:325:1: entryRuleJSONProperty returns [EObject current=null] : iv_ruleJSONProperty= ruleJSONProperty EOF ;
    public final EObject entryRuleJSONProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONProperty = null;


        try {
            // InternalDraft7.g:325:53: (iv_ruleJSONProperty= ruleJSONProperty EOF )
            // InternalDraft7.g:326:2: iv_ruleJSONProperty= ruleJSONProperty EOF
            {
             newCompositeNode(grammarAccess.getJSONPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONProperty=ruleJSONProperty();

            state._fsp--;

             current =iv_ruleJSONProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSONProperty"


    // $ANTLR start "ruleJSONProperty"
    // InternalDraft7.g:332:1: ruleJSONProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_property_3_0= ruleRoot ) ) otherlv_4= '}' ) ;
    public final EObject ruleJSONProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:338:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_property_3_0= ruleRoot ) ) otherlv_4= '}' ) )
            // InternalDraft7.g:339:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_property_3_0= ruleRoot ) ) otherlv_4= '}' )
            {
            // InternalDraft7.g:339:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_property_3_0= ruleRoot ) ) otherlv_4= '}' )
            // InternalDraft7.g:340:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_property_3_0= ruleRoot ) ) otherlv_4= '}'
            {
            // InternalDraft7.g:340:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDraft7.g:341:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDraft7.g:341:4: (lv_name_0_0= RULE_ID )
            // InternalDraft7.g:342:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getJSONPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSONPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.json.schema.Draft7.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getJSONPropertyAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getJSONPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDraft7.g:366:3: ( (lv_property_3_0= ruleRoot ) )
            // InternalDraft7.g:367:4: (lv_property_3_0= ruleRoot )
            {
            // InternalDraft7.g:367:4: (lv_property_3_0= ruleRoot )
            // InternalDraft7.g:368:5: lv_property_3_0= ruleRoot
            {

            					newCompositeNode(grammarAccess.getJSONPropertyAccess().getPropertyRootParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_property_3_0=ruleRoot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSONPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_3_0,
            						"org.xtext.json.schema.Draft7.Root");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSONPropertyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONProperty"


    // $ANTLR start "entryRuleType"
    // InternalDraft7.g:393:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDraft7.g:393:44: (iv_ruleType= ruleType EOF )
            // InternalDraft7.g:394:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDraft7.g:400:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"type\"' kw= ':' ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JsonTypes_3 = null;

        AntlrDatatypeRuleToken this_JsonTypes_5 = null;



        	enterRule();

        try {
            // InternalDraft7.g:406:2: ( (kw= '\"type\"' kw= ':' ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes ) ) )
            // InternalDraft7.g:407:2: (kw= '\"type\"' kw= ':' ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes ) )
            {
            // InternalDraft7.g:407:2: (kw= '\"type\"' kw= ':' ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes ) )
            // InternalDraft7.g:408:3: kw= '\"type\"' kw= ':' ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes )
            {
            kw=(Token)match(input,16,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            kw=(Token)match(input,15,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTypeAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:418:3: ( (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' ) | this_JsonTypes_5= ruleJsonTypes )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=25)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDraft7.g:419:4: (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' )
                    {
                    // InternalDraft7.g:419:4: (kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']' )
                    // InternalDraft7.g:420:5: kw= '[' (this_JsonTypes_3= ruleJsonTypes )+ kw= ']'
                    {
                    kw=(Token)match(input,17,FOLLOW_10); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_2_0_0());
                    				
                    // InternalDraft7.g:425:5: (this_JsonTypes_3= ruleJsonTypes )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=19 && LA5_0<=25)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDraft7.g:426:6: this_JsonTypes_3= ruleJsonTypes
                    	    {

                    	    						newCompositeNode(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_0_1());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    this_JsonTypes_3=ruleJsonTypes();

                    	    state._fsp--;


                    	    						current.merge(this_JsonTypes_3);
                    	    					

                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    kw=(Token)match(input,18,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:444:4: this_JsonTypes_5= ruleJsonTypes
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_JsonTypes_5=ruleJsonTypes();

                    state._fsp--;


                    				current.merge(this_JsonTypes_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleJsonTypes"
    // InternalDraft7.g:459:1: entryRuleJsonTypes returns [String current=null] : iv_ruleJsonTypes= ruleJsonTypes EOF ;
    public final String entryRuleJsonTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonTypes = null;


        try {
            // InternalDraft7.g:459:49: (iv_ruleJsonTypes= ruleJsonTypes EOF )
            // InternalDraft7.g:460:2: iv_ruleJsonTypes= ruleJsonTypes EOF
            {
             newCompositeNode(grammarAccess.getJsonTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonTypes=ruleJsonTypes();

            state._fsp--;

             current =iv_ruleJsonTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonTypes"


    // $ANTLR start "ruleJsonTypes"
    // InternalDraft7.g:466:1: ruleJsonTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' ) ;
    public final AntlrDatatypeRuleToken ruleJsonTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDraft7.g:472:2: ( (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' ) )
            // InternalDraft7.g:473:2: (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' )
            {
            // InternalDraft7.g:473:2: (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDraft7.g:474:3: kw= '\"string\"'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDraft7.g:480:3: kw= '\"integer\"'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDraft7.g:486:3: kw= '\"number\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getNumberKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDraft7.g:492:3: kw= '\"object\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getObjectKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDraft7.g:498:3: kw= '\"array\"'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getArrayKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDraft7.g:504:3: kw= '\"boolean\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getBooleanKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDraft7.g:510:3: kw= '\"null\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getNullKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonTypes"


    // $ANTLR start "entryRuleMultiples"
    // InternalDraft7.g:519:1: entryRuleMultiples returns [String current=null] : iv_ruleMultiples= ruleMultiples EOF ;
    public final String entryRuleMultiples() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiples = null;


        try {
            // InternalDraft7.g:519:49: (iv_ruleMultiples= ruleMultiples EOF )
            // InternalDraft7.g:520:2: iv_ruleMultiples= ruleMultiples EOF
            {
             newCompositeNode(grammarAccess.getMultiplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiples=ruleMultiples();

            state._fsp--;

             current =iv_ruleMultiples.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiples"


    // $ANTLR start "ruleMultiples"
    // InternalDraft7.g:526:1: ruleMultiples returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"multiples\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleMultiples() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:532:2: ( (kw= '\"multiples\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:533:2: (kw= '\"multiples\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:533:2: (kw= '\"multiples\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:534:3: kw= '\"multiples\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,26,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultiplesAccess().getMultiplesKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getMultiplesAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiples"


    // $ANTLR start "entryRuleMinimum"
    // InternalDraft7.g:550:1: entryRuleMinimum returns [String current=null] : iv_ruleMinimum= ruleMinimum EOF ;
    public final String entryRuleMinimum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinimum = null;


        try {
            // InternalDraft7.g:550:47: (iv_ruleMinimum= ruleMinimum EOF )
            // InternalDraft7.g:551:2: iv_ruleMinimum= ruleMinimum EOF
            {
             newCompositeNode(grammarAccess.getMinimumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimum=ruleMinimum();

            state._fsp--;

             current =iv_ruleMinimum.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimum"


    // $ANTLR start "ruleMinimum"
    // InternalDraft7.g:557:1: ruleMinimum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"minimum\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleMinimum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:563:2: ( (kw= '\"minimum\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:564:2: (kw= '\"minimum\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:564:2: (kw= '\"minimum\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:565:3: kw= '\"minimum\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,27,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinimumAccess().getMinimumKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getMinimumAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimum"


    // $ANTLR start "entryRuleExclusiveMinimum"
    // InternalDraft7.g:581:1: entryRuleExclusiveMinimum returns [String current=null] : iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF ;
    public final String entryRuleExclusiveMinimum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExclusiveMinimum = null;


        try {
            // InternalDraft7.g:581:56: (iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF )
            // InternalDraft7.g:582:2: iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMinimumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMinimum=ruleExclusiveMinimum();

            state._fsp--;

             current =iv_ruleExclusiveMinimum.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveMinimum"


    // $ANTLR start "ruleExclusiveMinimum"
    // InternalDraft7.g:588:1: ruleExclusiveMinimum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"exclusiveMinimum\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExclusiveMinimum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:594:2: ( (kw= '\"exclusiveMinimum\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:595:2: (kw= '\"exclusiveMinimum\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:595:2: (kw= '\"exclusiveMinimum\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:596:3: kw= '\"exclusiveMinimum\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,28,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getExclusiveMinimumAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveMinimum"


    // $ANTLR start "entryRuleMaximum"
    // InternalDraft7.g:612:1: entryRuleMaximum returns [String current=null] : iv_ruleMaximum= ruleMaximum EOF ;
    public final String entryRuleMaximum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaximum = null;


        try {
            // InternalDraft7.g:612:47: (iv_ruleMaximum= ruleMaximum EOF )
            // InternalDraft7.g:613:2: iv_ruleMaximum= ruleMaximum EOF
            {
             newCompositeNode(grammarAccess.getMaximumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximum=ruleMaximum();

            state._fsp--;

             current =iv_ruleMaximum.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximum"


    // $ANTLR start "ruleMaximum"
    // InternalDraft7.g:619:1: ruleMaximum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"maximum\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleMaximum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:625:2: ( (kw= '\"maximum\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:626:2: (kw= '\"maximum\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:626:2: (kw= '\"maximum\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:627:3: kw= '\"maximum\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,29,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaximumAccess().getMaximumKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getMaximumAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximum"


    // $ANTLR start "entryRuleExclusiveMaximum"
    // InternalDraft7.g:643:1: entryRuleExclusiveMaximum returns [String current=null] : iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF ;
    public final String entryRuleExclusiveMaximum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExclusiveMaximum = null;


        try {
            // InternalDraft7.g:643:56: (iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF )
            // InternalDraft7.g:644:2: iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMaximumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMaximum=ruleExclusiveMaximum();

            state._fsp--;

             current =iv_ruleExclusiveMaximum.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveMaximum"


    // $ANTLR start "ruleExclusiveMaximum"
    // InternalDraft7.g:650:1: ruleExclusiveMaximum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"exclusiveMaximum\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExclusiveMaximum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:656:2: ( (kw= '\"exclusiveMaximum\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:657:2: (kw= '\"exclusiveMaximum\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:657:2: (kw= '\"exclusiveMaximum\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:658:3: kw= '\"exclusiveMaximum\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,30,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getExclusiveMaximumAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveMaximum"


    // $ANTLR start "entryRuleLength"
    // InternalDraft7.g:674:1: entryRuleLength returns [String current=null] : iv_ruleLength= ruleLength EOF ;
    public final String entryRuleLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLength = null;


        try {
            // InternalDraft7.g:674:46: (iv_ruleLength= ruleLength EOF )
            // InternalDraft7.g:675:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalDraft7.g:681:1: ruleLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"length\":' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDraft7.g:687:2: ( (kw= '\"length\":' this_INT_1= RULE_INT ) )
            // InternalDraft7.g:688:2: (kw= '\"length\":' this_INT_1= RULE_INT )
            {
            // InternalDraft7.g:688:2: (kw= '\"length\":' this_INT_1= RULE_INT )
            // InternalDraft7.g:689:3: kw= '\"length\":' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,31,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLengthAccess().getLengthKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getLengthAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLength"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000FC016000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000FC017000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000FC014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003FA0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003FE0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}