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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_ID", "RULE_INT", "RULE_JSON_STRING", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'\"type\"'", "':'", "'['", "']'", "'\"string\"'", "'\"integer\"'", "'\"number\"'", "'\"object\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'", "'\"required\"'", "'\"properties\"'", "'\"length\"'", "'\"pattern\"'", "'\"multiples\"'", "'\"minimum\"'", "'\"exclusiveMinimum\"'", "'\"maximum\"'", "'\"exclusiveMaximum\"'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_JSON_ID=4;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_JSON_STRING=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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
    // InternalDraft7.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_root_2_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:77:2: ( ( () otherlv_1= '{' ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )* otherlv_4= '}' ) )
            // InternalDraft7.g:78:2: ( () otherlv_1= '{' ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )* otherlv_4= '}' )
            {
            // InternalDraft7.g:78:2: ( () otherlv_1= '{' ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )* otherlv_4= '}' )
            // InternalDraft7.g:79:3: () otherlv_1= '{' ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )* otherlv_4= '}'
            {
            // InternalDraft7.g:79:3: ()
            // InternalDraft7.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDraft7.g:90:3: ( ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=27 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDraft7.g:91:4: ( (lv_root_2_0= ruleJsonSchemaRoot ) ) (otherlv_3= ',' )?
            	    {
            	    // InternalDraft7.g:91:4: ( (lv_root_2_0= ruleJsonSchemaRoot ) )
            	    // InternalDraft7.g:92:5: (lv_root_2_0= ruleJsonSchemaRoot )
            	    {
            	    // InternalDraft7.g:92:5: (lv_root_2_0= ruleJsonSchemaRoot )
            	    // InternalDraft7.g:93:6: lv_root_2_0= ruleJsonSchemaRoot
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getRootJsonSchemaRootParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_root_2_0=ruleJsonSchemaRoot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"root",
            	    							lv_root_2_0,
            	    							"org.xtext.json.schema.Draft7.JsonSchemaRoot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDraft7.g:110:4: (otherlv_3= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDraft7.g:111:5: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	            					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleJsonSchemaRoot"
    // InternalDraft7.g:125:1: entryRuleJsonSchemaRoot returns [EObject current=null] : iv_ruleJsonSchemaRoot= ruleJsonSchemaRoot EOF ;
    public final EObject entryRuleJsonSchemaRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonSchemaRoot = null;


        try {
            // InternalDraft7.g:125:55: (iv_ruleJsonSchemaRoot= ruleJsonSchemaRoot EOF )
            // InternalDraft7.g:126:2: iv_ruleJsonSchemaRoot= ruleJsonSchemaRoot EOF
            {
             newCompositeNode(grammarAccess.getJsonSchemaRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonSchemaRoot=ruleJsonSchemaRoot();

            state._fsp--;

             current =iv_ruleJsonSchemaRoot; 
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
    // $ANTLR end "entryRuleJsonSchemaRoot"


    // $ANTLR start "ruleJsonSchemaRoot"
    // InternalDraft7.g:132:1: ruleJsonSchemaRoot returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | this_ObjectProperties_1= ruleObjectProperties | this_StringProperties_2= ruleStringProperties | this_NumberProperties_3= ruleNumberProperties ) ;
    public final EObject ruleJsonSchemaRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject this_ObjectProperties_1 = null;

        EObject this_StringProperties_2 = null;

        EObject this_NumberProperties_3 = null;



        	enterRule();

        try {
            // InternalDraft7.g:138:2: ( ( ( (lv_type_0_0= ruleType ) ) | this_ObjectProperties_1= ruleObjectProperties | this_StringProperties_2= ruleStringProperties | this_NumberProperties_3= ruleNumberProperties ) )
            // InternalDraft7.g:139:2: ( ( (lv_type_0_0= ruleType ) ) | this_ObjectProperties_1= ruleObjectProperties | this_StringProperties_2= ruleStringProperties | this_NumberProperties_3= ruleNumberProperties )
            {
            // InternalDraft7.g:139:2: ( ( (lv_type_0_0= ruleType ) ) | this_ObjectProperties_1= ruleObjectProperties | this_StringProperties_2= ruleStringProperties | this_NumberProperties_3= ruleNumberProperties )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 27:
            case 28:
                {
                alt3=2;
                }
                break;
            case 29:
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDraft7.g:140:3: ( (lv_type_0_0= ruleType ) )
                    {
                    // InternalDraft7.g:140:3: ( (lv_type_0_0= ruleType ) )
                    // InternalDraft7.g:141:4: (lv_type_0_0= ruleType )
                    {
                    // InternalDraft7.g:141:4: (lv_type_0_0= ruleType )
                    // InternalDraft7.g:142:5: lv_type_0_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getJsonSchemaRootAccess().getTypeTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJsonSchemaRootRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.json.schema.Draft7.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:160:3: this_ObjectProperties_1= ruleObjectProperties
                    {

                    			newCompositeNode(grammarAccess.getJsonSchemaRootAccess().getObjectPropertiesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectProperties_1=ruleObjectProperties();

                    state._fsp--;


                    			current = this_ObjectProperties_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDraft7.g:169:3: this_StringProperties_2= ruleStringProperties
                    {

                    			newCompositeNode(grammarAccess.getJsonSchemaRootAccess().getStringPropertiesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringProperties_2=ruleStringProperties();

                    state._fsp--;


                    			current = this_StringProperties_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDraft7.g:178:3: this_NumberProperties_3= ruleNumberProperties
                    {

                    			newCompositeNode(grammarAccess.getJsonSchemaRootAccess().getNumberPropertiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberProperties_3=ruleNumberProperties();

                    state._fsp--;


                    			current = this_NumberProperties_3;
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
    // $ANTLR end "ruleJsonSchemaRoot"


    // $ANTLR start "entryRuleNumberProperties"
    // InternalDraft7.g:190:1: entryRuleNumberProperties returns [EObject current=null] : iv_ruleNumberProperties= ruleNumberProperties EOF ;
    public final EObject entryRuleNumberProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberProperties = null;


        try {
            // InternalDraft7.g:190:57: (iv_ruleNumberProperties= ruleNumberProperties EOF )
            // InternalDraft7.g:191:2: iv_ruleNumberProperties= ruleNumberProperties EOF
            {
             newCompositeNode(grammarAccess.getNumberPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberProperties=ruleNumberProperties();

            state._fsp--;

             current =iv_ruleNumberProperties; 
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
    // $ANTLR end "entryRuleNumberProperties"


    // $ANTLR start "ruleNumberProperties"
    // InternalDraft7.g:197:1: ruleNumberProperties returns [EObject current=null] : (this_Multiples_0= ruleMultiples | ( (lv_minimum_1_0= ruleMinimum ) ) | ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) ) | ( (lv_maximum_3_0= ruleMaximum ) ) | ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) ) ) ;
    public final EObject ruleNumberProperties() throws RecognitionException {
        EObject current = null;

        EObject this_Multiples_0 = null;

        EObject lv_minimum_1_0 = null;

        EObject lv_exclusiveMinimum_2_0 = null;

        EObject lv_maximum_3_0 = null;

        EObject lv_exclusiveMaximum_4_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:203:2: ( (this_Multiples_0= ruleMultiples | ( (lv_minimum_1_0= ruleMinimum ) ) | ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) ) | ( (lv_maximum_3_0= ruleMaximum ) ) | ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) ) ) )
            // InternalDraft7.g:204:2: (this_Multiples_0= ruleMultiples | ( (lv_minimum_1_0= ruleMinimum ) ) | ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) ) | ( (lv_maximum_3_0= ruleMaximum ) ) | ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) ) )
            {
            // InternalDraft7.g:204:2: (this_Multiples_0= ruleMultiples | ( (lv_minimum_1_0= ruleMinimum ) ) | ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) ) | ( (lv_maximum_3_0= ruleMaximum ) ) | ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDraft7.g:205:3: this_Multiples_0= ruleMultiples
                    {

                    			newCompositeNode(grammarAccess.getNumberPropertiesAccess().getMultiplesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiples_0=ruleMultiples();

                    state._fsp--;


                    			current = this_Multiples_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDraft7.g:214:3: ( (lv_minimum_1_0= ruleMinimum ) )
                    {
                    // InternalDraft7.g:214:3: ( (lv_minimum_1_0= ruleMinimum ) )
                    // InternalDraft7.g:215:4: (lv_minimum_1_0= ruleMinimum )
                    {
                    // InternalDraft7.g:215:4: (lv_minimum_1_0= ruleMinimum )
                    // InternalDraft7.g:216:5: lv_minimum_1_0= ruleMinimum
                    {

                    					newCompositeNode(grammarAccess.getNumberPropertiesAccess().getMinimumMinimumParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minimum_1_0=ruleMinimum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"minimum",
                    						lv_minimum_1_0,
                    						"org.xtext.json.schema.Draft7.Minimum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:234:3: ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) )
                    {
                    // InternalDraft7.g:234:3: ( (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum ) )
                    // InternalDraft7.g:235:4: (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum )
                    {
                    // InternalDraft7.g:235:4: (lv_exclusiveMinimum_2_0= ruleExclusiveMinimum )
                    // InternalDraft7.g:236:5: lv_exclusiveMinimum_2_0= ruleExclusiveMinimum
                    {

                    					newCompositeNode(grammarAccess.getNumberPropertiesAccess().getExclusiveMinimumExclusiveMinimumParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exclusiveMinimum_2_0=ruleExclusiveMinimum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"exclusiveMinimum",
                    						lv_exclusiveMinimum_2_0,
                    						"org.xtext.json.schema.Draft7.ExclusiveMinimum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:254:3: ( (lv_maximum_3_0= ruleMaximum ) )
                    {
                    // InternalDraft7.g:254:3: ( (lv_maximum_3_0= ruleMaximum ) )
                    // InternalDraft7.g:255:4: (lv_maximum_3_0= ruleMaximum )
                    {
                    // InternalDraft7.g:255:4: (lv_maximum_3_0= ruleMaximum )
                    // InternalDraft7.g:256:5: lv_maximum_3_0= ruleMaximum
                    {

                    					newCompositeNode(grammarAccess.getNumberPropertiesAccess().getMaximumMaximumParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maximum_3_0=ruleMaximum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"maximum",
                    						lv_maximum_3_0,
                    						"org.xtext.json.schema.Draft7.Maximum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:274:3: ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) )
                    {
                    // InternalDraft7.g:274:3: ( (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum ) )
                    // InternalDraft7.g:275:4: (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum )
                    {
                    // InternalDraft7.g:275:4: (lv_exclusiveMaximum_4_0= ruleExclusiveMaximum )
                    // InternalDraft7.g:276:5: lv_exclusiveMaximum_4_0= ruleExclusiveMaximum
                    {

                    					newCompositeNode(grammarAccess.getNumberPropertiesAccess().getExclusiveMaximumExclusiveMaximumParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exclusiveMaximum_4_0=ruleExclusiveMaximum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"exclusiveMaximum",
                    						lv_exclusiveMaximum_4_0,
                    						"org.xtext.json.schema.Draft7.ExclusiveMaximum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleNumberProperties"


    // $ANTLR start "entryRuleType"
    // InternalDraft7.g:297:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDraft7.g:297:45: (iv_ruleType= ruleType EOF )
            // InternalDraft7.g:298:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // InternalDraft7.g:304:1: ruleType returns [EObject current=null] : (otherlv_0= '\"type\"' otherlv_1= ':' ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_types_3_0 = null;

        AntlrDatatypeRuleToken lv_types_5_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:310:2: ( (otherlv_0= '\"type\"' otherlv_1= ':' ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) ) ) )
            // InternalDraft7.g:311:2: (otherlv_0= '\"type\"' otherlv_1= ':' ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) ) )
            {
            // InternalDraft7.g:311:2: (otherlv_0= '\"type\"' otherlv_1= ':' ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) ) )
            // InternalDraft7.g:312:3: otherlv_0= '\"type\"' otherlv_1= ':' ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:320:3: ( (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' ) | ( (lv_type_7_0= ruleJsonTypes ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=20 && LA6_0<=26)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDraft7.g:321:4: (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' )
                    {
                    // InternalDraft7.g:321:4: (otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']' )
                    // InternalDraft7.g:322:5: otherlv_2= '[' ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_2_0_0());
                    				
                    // InternalDraft7.g:326:5: ( ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )* )
                    // InternalDraft7.g:327:6: ( (lv_types_3_0= ruleJsonTypes ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )*
                    {
                    // InternalDraft7.g:327:6: ( (lv_types_3_0= ruleJsonTypes ) )
                    // InternalDraft7.g:328:7: (lv_types_3_0= ruleJsonTypes )
                    {
                    // InternalDraft7.g:328:7: (lv_types_3_0= ruleJsonTypes )
                    // InternalDraft7.g:329:8: lv_types_3_0= ruleJsonTypes
                    {

                    								newCompositeNode(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_0_0());
                    							
                    pushFollow(FOLLOW_7);
                    lv_types_3_0=ruleJsonTypes();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getTypeRule());
                    								}
                    								add(
                    									current,
                    									"types",
                    									lv_types_3_0,
                    									"org.xtext.json.schema.Draft7.JsonTypes");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalDraft7.g:346:6: (otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDraft7.g:347:7: otherlv_4= ',' ( (lv_types_5_0= ruleJsonTypes ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getCommaKeyword_2_0_1_1_0());
                    	    						
                    	    // InternalDraft7.g:351:7: ( (lv_types_5_0= ruleJsonTypes ) )
                    	    // InternalDraft7.g:352:8: (lv_types_5_0= ruleJsonTypes )
                    	    {
                    	    // InternalDraft7.g:352:8: (lv_types_5_0= ruleJsonTypes )
                    	    // InternalDraft7.g:353:9: lv_types_5_0= ruleJsonTypes
                    	    {

                    	    									newCompositeNode(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_7);
                    	    lv_types_5_0=ruleJsonTypes();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"types",
                    	    										lv_types_5_0,
                    	    										"org.xtext.json.schema.Draft7.JsonTypes");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:378:4: ( (lv_type_7_0= ruleJsonTypes ) )
                    {
                    // InternalDraft7.g:378:4: ( (lv_type_7_0= ruleJsonTypes ) )
                    // InternalDraft7.g:379:5: (lv_type_7_0= ruleJsonTypes )
                    {
                    // InternalDraft7.g:379:5: (lv_type_7_0= ruleJsonTypes )
                    // InternalDraft7.g:380:6: lv_type_7_0= ruleJsonTypes
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getTypeJsonTypesParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_7_0=ruleJsonTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"org.xtext.json.schema.Draft7.JsonTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // InternalDraft7.g:402:1: entryRuleJsonTypes returns [String current=null] : iv_ruleJsonTypes= ruleJsonTypes EOF ;
    public final String entryRuleJsonTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonTypes = null;


        try {
            // InternalDraft7.g:402:49: (iv_ruleJsonTypes= ruleJsonTypes EOF )
            // InternalDraft7.g:403:2: iv_ruleJsonTypes= ruleJsonTypes EOF
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
    // InternalDraft7.g:409:1: ruleJsonTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' ) ;
    public final AntlrDatatypeRuleToken ruleJsonTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDraft7.g:415:2: ( (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' ) )
            // InternalDraft7.g:416:2: (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' )
            {
            // InternalDraft7.g:416:2: (kw= '\"string\"' | kw= '\"integer\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"array\"' | kw= '\"boolean\"' | kw= '\"null\"' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 25:
                {
                alt7=6;
                }
                break;
            case 26:
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
                    // InternalDraft7.g:417:3: kw= '\"string\"'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDraft7.g:423:3: kw= '\"integer\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDraft7.g:429:3: kw= '\"number\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getNumberKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDraft7.g:435:3: kw= '\"object\"'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getObjectKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDraft7.g:441:3: kw= '\"array\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getArrayKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDraft7.g:447:3: kw= '\"boolean\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJsonTypesAccess().getBooleanKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDraft7.g:453:3: kw= '\"null\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleObjectProperties"
    // InternalDraft7.g:462:1: entryRuleObjectProperties returns [EObject current=null] : iv_ruleObjectProperties= ruleObjectProperties EOF ;
    public final EObject entryRuleObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperties = null;


        try {
            // InternalDraft7.g:462:57: (iv_ruleObjectProperties= ruleObjectProperties EOF )
            // InternalDraft7.g:463:2: iv_ruleObjectProperties= ruleObjectProperties EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectProperties=ruleObjectProperties();

            state._fsp--;

             current =iv_ruleObjectProperties; 
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
    // $ANTLR end "entryRuleObjectProperties"


    // $ANTLR start "ruleObjectProperties"
    // InternalDraft7.g:469:1: ruleObjectProperties returns [EObject current=null] : ( ( (lv_properties_0_0= ruleProperties ) ) | ( (lv_requiredProperties_1_0= ruleRequiredProperties ) ) ) ;
    public final EObject ruleObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;

        EObject lv_requiredProperties_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:475:2: ( ( ( (lv_properties_0_0= ruleProperties ) ) | ( (lv_requiredProperties_1_0= ruleRequiredProperties ) ) ) )
            // InternalDraft7.g:476:2: ( ( (lv_properties_0_0= ruleProperties ) ) | ( (lv_requiredProperties_1_0= ruleRequiredProperties ) ) )
            {
            // InternalDraft7.g:476:2: ( ( (lv_properties_0_0= ruleProperties ) ) | ( (lv_requiredProperties_1_0= ruleRequiredProperties ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDraft7.g:477:3: ( (lv_properties_0_0= ruleProperties ) )
                    {
                    // InternalDraft7.g:477:3: ( (lv_properties_0_0= ruleProperties ) )
                    // InternalDraft7.g:478:4: (lv_properties_0_0= ruleProperties )
                    {
                    // InternalDraft7.g:478:4: (lv_properties_0_0= ruleProperties )
                    // InternalDraft7.g:479:5: lv_properties_0_0= ruleProperties
                    {

                    					newCompositeNode(grammarAccess.getObjectPropertiesAccess().getPropertiesPropertiesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_properties_0_0=ruleProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"properties",
                    						lv_properties_0_0,
                    						"org.xtext.json.schema.Draft7.Properties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:497:3: ( (lv_requiredProperties_1_0= ruleRequiredProperties ) )
                    {
                    // InternalDraft7.g:497:3: ( (lv_requiredProperties_1_0= ruleRequiredProperties ) )
                    // InternalDraft7.g:498:4: (lv_requiredProperties_1_0= ruleRequiredProperties )
                    {
                    // InternalDraft7.g:498:4: (lv_requiredProperties_1_0= ruleRequiredProperties )
                    // InternalDraft7.g:499:5: lv_requiredProperties_1_0= ruleRequiredProperties
                    {

                    					newCompositeNode(grammarAccess.getObjectPropertiesAccess().getRequiredPropertiesRequiredPropertiesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_requiredProperties_1_0=ruleRequiredProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"requiredProperties",
                    						lv_requiredProperties_1_0,
                    						"org.xtext.json.schema.Draft7.RequiredProperties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleObjectProperties"


    // $ANTLR start "entryRuleRequiredProperties"
    // InternalDraft7.g:520:1: entryRuleRequiredProperties returns [EObject current=null] : iv_ruleRequiredProperties= ruleRequiredProperties EOF ;
    public final EObject entryRuleRequiredProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredProperties = null;


        try {
            // InternalDraft7.g:520:59: (iv_ruleRequiredProperties= ruleRequiredProperties EOF )
            // InternalDraft7.g:521:2: iv_ruleRequiredProperties= ruleRequiredProperties EOF
            {
             newCompositeNode(grammarAccess.getRequiredPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredProperties=ruleRequiredProperties();

            state._fsp--;

             current =iv_ruleRequiredProperties; 
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
    // $ANTLR end "entryRuleRequiredProperties"


    // $ANTLR start "ruleRequiredProperties"
    // InternalDraft7.g:527:1: ruleRequiredProperties returns [EObject current=null] : (otherlv_0= '\"required\"' otherlv_1= ':' otherlv_2= '[' ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) ) otherlv_4= ']' ) ;
    public final EObject ruleRequiredProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_requiredProperties_3_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:533:2: ( (otherlv_0= '\"required\"' otherlv_1= ':' otherlv_2= '[' ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) ) otherlv_4= ']' ) )
            // InternalDraft7.g:534:2: (otherlv_0= '\"required\"' otherlv_1= ':' otherlv_2= '[' ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) ) otherlv_4= ']' )
            {
            // InternalDraft7.g:534:2: (otherlv_0= '\"required\"' otherlv_1= ':' otherlv_2= '[' ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) ) otherlv_4= ']' )
            // InternalDraft7.g:535:3: otherlv_0= '\"required\"' otherlv_1= ':' otherlv_2= '[' ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredPropertiesAccess().getRequiredKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredPropertiesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredPropertiesAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDraft7.g:547:3: ( (lv_requiredProperties_3_0= ruleRequiredPropertiesName ) )
            // InternalDraft7.g:548:4: (lv_requiredProperties_3_0= ruleRequiredPropertiesName )
            {
            // InternalDraft7.g:548:4: (lv_requiredProperties_3_0= ruleRequiredPropertiesName )
            // InternalDraft7.g:549:5: lv_requiredProperties_3_0= ruleRequiredPropertiesName
            {

            					newCompositeNode(grammarAccess.getRequiredPropertiesAccess().getRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_requiredProperties_3_0=ruleRequiredPropertiesName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredPropertiesRule());
            					}
            					add(
            						current,
            						"requiredProperties",
            						lv_requiredProperties_3_0,
            						"org.xtext.json.schema.Draft7.RequiredPropertiesName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRequiredPropertiesAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRequiredProperties"


    // $ANTLR start "entryRuleRequiredPropertiesName"
    // InternalDraft7.g:574:1: entryRuleRequiredPropertiesName returns [EObject current=null] : iv_ruleRequiredPropertiesName= ruleRequiredPropertiesName EOF ;
    public final EObject entryRuleRequiredPropertiesName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPropertiesName = null;


        try {
            // InternalDraft7.g:574:63: (iv_ruleRequiredPropertiesName= ruleRequiredPropertiesName EOF )
            // InternalDraft7.g:575:2: iv_ruleRequiredPropertiesName= ruleRequiredPropertiesName EOF
            {
             newCompositeNode(grammarAccess.getRequiredPropertiesNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredPropertiesName=ruleRequiredPropertiesName();

            state._fsp--;

             current =iv_ruleRequiredPropertiesName; 
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
    // $ANTLR end "entryRuleRequiredPropertiesName"


    // $ANTLR start "ruleRequiredPropertiesName"
    // InternalDraft7.g:581:1: ruleRequiredPropertiesName returns [EObject current=null] : ( (lv_name_0_0= RULE_JSON_ID ) ) ;
    public final EObject ruleRequiredPropertiesName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:587:2: ( ( (lv_name_0_0= RULE_JSON_ID ) ) )
            // InternalDraft7.g:588:2: ( (lv_name_0_0= RULE_JSON_ID ) )
            {
            // InternalDraft7.g:588:2: ( (lv_name_0_0= RULE_JSON_ID ) )
            // InternalDraft7.g:589:3: (lv_name_0_0= RULE_JSON_ID )
            {
            // InternalDraft7.g:589:3: (lv_name_0_0= RULE_JSON_ID )
            // InternalDraft7.g:590:4: lv_name_0_0= RULE_JSON_ID
            {
            lv_name_0_0=(Token)match(input,RULE_JSON_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRequiredPropertiesNameAccess().getNameJSON_IDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRequiredPropertiesNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.json.schema.Draft7.JSON_ID");
            			

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
    // $ANTLR end "ruleRequiredPropertiesName"


    // $ANTLR start "entryRuleProperties"
    // InternalDraft7.g:609:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalDraft7.g:609:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalDraft7.g:610:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalDraft7.g:616:1: ruleProperties returns [EObject current=null] : ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:622:2: ( ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' ) )
            // InternalDraft7.g:623:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            {
            // InternalDraft7.g:623:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}' )
            // InternalDraft7.g:624:3: () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= '}'
            {
            // InternalDraft7.g:624:3: ()
            // InternalDraft7.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertiesAccess().getPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertiesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDraft7.g:643:3: ( (lv_properties_4_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_JSON_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDraft7.g:644:4: (lv_properties_4_0= ruleProperty )
            	    {
            	    // InternalDraft7.g:644:4: (lv_properties_4_0= ruleProperty )
            	    // InternalDraft7.g:645:5: lv_properties_4_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"org.xtext.json.schema.Draft7.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalDraft7.g:670:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDraft7.g:670:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDraft7.g:671:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDraft7.g:677:1: ruleProperty returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_JSON_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJsonSchemaRoot ) )* otherlv_5= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:683:2: ( ( () ( (lv_name_1_0= RULE_JSON_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJsonSchemaRoot ) )* otherlv_5= '}' ) )
            // InternalDraft7.g:684:2: ( () ( (lv_name_1_0= RULE_JSON_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJsonSchemaRoot ) )* otherlv_5= '}' )
            {
            // InternalDraft7.g:684:2: ( () ( (lv_name_1_0= RULE_JSON_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJsonSchemaRoot ) )* otherlv_5= '}' )
            // InternalDraft7.g:685:3: () ( (lv_name_1_0= RULE_JSON_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_properties_4_0= ruleJsonSchemaRoot ) )* otherlv_5= '}'
            {
            // InternalDraft7.g:685:3: ()
            // InternalDraft7.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            // InternalDraft7.g:692:3: ( (lv_name_1_0= RULE_JSON_ID ) )
            // InternalDraft7.g:693:4: (lv_name_1_0= RULE_JSON_ID )
            {
            // InternalDraft7.g:693:4: (lv_name_1_0= RULE_JSON_ID )
            // InternalDraft7.g:694:5: lv_name_1_0= RULE_JSON_ID
            {
            lv_name_1_0=(Token)match(input,RULE_JSON_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameJSON_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.json.schema.Draft7.JSON_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDraft7.g:718:3: ( (lv_properties_4_0= ruleJsonSchemaRoot ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||(LA10_0>=27 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDraft7.g:719:4: (lv_properties_4_0= ruleJsonSchemaRoot )
            	    {
            	    // InternalDraft7.g:719:4: (lv_properties_4_0= ruleJsonSchemaRoot )
            	    // InternalDraft7.g:720:5: lv_properties_4_0= ruleJsonSchemaRoot
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertiesJsonSchemaRootParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_properties_4_0=ruleJsonSchemaRoot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"org.xtext.json.schema.Draft7.JsonSchemaRoot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleStringProperties"
    // InternalDraft7.g:745:1: entryRuleStringProperties returns [EObject current=null] : iv_ruleStringProperties= ruleStringProperties EOF ;
    public final EObject entryRuleStringProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperties = null;


        try {
            // InternalDraft7.g:745:57: (iv_ruleStringProperties= ruleStringProperties EOF )
            // InternalDraft7.g:746:2: iv_ruleStringProperties= ruleStringProperties EOF
            {
             newCompositeNode(grammarAccess.getStringPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringProperties=ruleStringProperties();

            state._fsp--;

             current =iv_ruleStringProperties; 
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
    // $ANTLR end "entryRuleStringProperties"


    // $ANTLR start "ruleStringProperties"
    // InternalDraft7.g:752:1: ruleStringProperties returns [EObject current=null] : ( ( (lv_length_0_0= ruleLength ) ) | ( (lv_pattern_1_0= rulePattern ) ) ) ;
    public final EObject ruleStringProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_length_0_0 = null;

        EObject lv_pattern_1_0 = null;



        	enterRule();

        try {
            // InternalDraft7.g:758:2: ( ( ( (lv_length_0_0= ruleLength ) ) | ( (lv_pattern_1_0= rulePattern ) ) ) )
            // InternalDraft7.g:759:2: ( ( (lv_length_0_0= ruleLength ) ) | ( (lv_pattern_1_0= rulePattern ) ) )
            {
            // InternalDraft7.g:759:2: ( ( (lv_length_0_0= ruleLength ) ) | ( (lv_pattern_1_0= rulePattern ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDraft7.g:760:3: ( (lv_length_0_0= ruleLength ) )
                    {
                    // InternalDraft7.g:760:3: ( (lv_length_0_0= ruleLength ) )
                    // InternalDraft7.g:761:4: (lv_length_0_0= ruleLength )
                    {
                    // InternalDraft7.g:761:4: (lv_length_0_0= ruleLength )
                    // InternalDraft7.g:762:5: lv_length_0_0= ruleLength
                    {

                    					newCompositeNode(grammarAccess.getStringPropertiesAccess().getLengthLengthParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_length_0_0=ruleLength();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"length",
                    						lv_length_0_0,
                    						"org.xtext.json.schema.Draft7.Length");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:780:3: ( (lv_pattern_1_0= rulePattern ) )
                    {
                    // InternalDraft7.g:780:3: ( (lv_pattern_1_0= rulePattern ) )
                    // InternalDraft7.g:781:4: (lv_pattern_1_0= rulePattern )
                    {
                    // InternalDraft7.g:781:4: (lv_pattern_1_0= rulePattern )
                    // InternalDraft7.g:782:5: lv_pattern_1_0= rulePattern
                    {

                    					newCompositeNode(grammarAccess.getStringPropertiesAccess().getPatternPatternParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pattern_1_0=rulePattern();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringPropertiesRule());
                    					}
                    					set(
                    						current,
                    						"pattern",
                    						lv_pattern_1_0,
                    						"org.xtext.json.schema.Draft7.Pattern");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleStringProperties"


    // $ANTLR start "entryRuleLength"
    // InternalDraft7.g:803:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalDraft7.g:803:47: (iv_ruleLength= ruleLength EOF )
            // InternalDraft7.g:804:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength; 
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
    // InternalDraft7.g:810:1: ruleLength returns [EObject current=null] : (otherlv_0= '\"length\"' otherlv_1= ':' ( (lv_length_2_0= RULE_INT ) ) ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:816:2: ( (otherlv_0= '\"length\"' otherlv_1= ':' ( (lv_length_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:817:2: (otherlv_0= '\"length\"' otherlv_1= ':' ( (lv_length_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:817:2: (otherlv_0= '\"length\"' otherlv_1= ':' ( (lv_length_2_0= RULE_INT ) ) )
            // InternalDraft7.g:818:3: otherlv_0= '\"length\"' otherlv_1= ':' ( (lv_length_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLengthAccess().getLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:826:3: ( (lv_length_2_0= RULE_INT ) )
            // InternalDraft7.g:827:4: (lv_length_2_0= RULE_INT )
            {
            // InternalDraft7.g:827:4: (lv_length_2_0= RULE_INT )
            // InternalDraft7.g:828:5: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_length_2_0, grammarAccess.getLengthAccess().getLengthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRulePattern"
    // InternalDraft7.g:848:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalDraft7.g:848:48: (iv_rulePattern= rulePattern EOF )
            // InternalDraft7.g:849:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDraft7.g:855:1: rulePattern returns [EObject current=null] : (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= RULE_JSON_STRING ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pattern_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:861:2: ( (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= RULE_JSON_STRING ) ) ) )
            // InternalDraft7.g:862:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= RULE_JSON_STRING ) ) )
            {
            // InternalDraft7.g:862:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= RULE_JSON_STRING ) ) )
            // InternalDraft7.g:863:3: otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= RULE_JSON_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:871:3: ( (lv_pattern_2_0= RULE_JSON_STRING ) )
            // InternalDraft7.g:872:4: (lv_pattern_2_0= RULE_JSON_STRING )
            {
            // InternalDraft7.g:872:4: (lv_pattern_2_0= RULE_JSON_STRING )
            // InternalDraft7.g:873:5: lv_pattern_2_0= RULE_JSON_STRING
            {
            lv_pattern_2_0=(Token)match(input,RULE_JSON_STRING,FOLLOW_2); 

            					newLeafNode(lv_pattern_2_0, grammarAccess.getPatternAccess().getPatternJSON_STRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"org.xtext.json.schema.Draft7.JSON_STRING");
            				

            }


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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleMultiples"
    // InternalDraft7.g:893:1: entryRuleMultiples returns [EObject current=null] : iv_ruleMultiples= ruleMultiples EOF ;
    public final EObject entryRuleMultiples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiples = null;


        try {
            // InternalDraft7.g:893:50: (iv_ruleMultiples= ruleMultiples EOF )
            // InternalDraft7.g:894:2: iv_ruleMultiples= ruleMultiples EOF
            {
             newCompositeNode(grammarAccess.getMultiplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiples=ruleMultiples();

            state._fsp--;

             current =iv_ruleMultiples; 
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
    // InternalDraft7.g:900:1: ruleMultiples returns [EObject current=null] : (otherlv_0= '\"multiples\"' otherlv_1= ':' ( (lv_multipleOf_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMultiples() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_multipleOf_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:906:2: ( (otherlv_0= '\"multiples\"' otherlv_1= ':' ( (lv_multipleOf_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:907:2: (otherlv_0= '\"multiples\"' otherlv_1= ':' ( (lv_multipleOf_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:907:2: (otherlv_0= '\"multiples\"' otherlv_1= ':' ( (lv_multipleOf_2_0= RULE_INT ) ) )
            // InternalDraft7.g:908:3: otherlv_0= '\"multiples\"' otherlv_1= ':' ( (lv_multipleOf_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplesAccess().getMultiplesKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiplesAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:916:3: ( (lv_multipleOf_2_0= RULE_INT ) )
            // InternalDraft7.g:917:4: (lv_multipleOf_2_0= RULE_INT )
            {
            // InternalDraft7.g:917:4: (lv_multipleOf_2_0= RULE_INT )
            // InternalDraft7.g:918:5: lv_multipleOf_2_0= RULE_INT
            {
            lv_multipleOf_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_multipleOf_2_0, grammarAccess.getMultiplesAccess().getMultipleOfINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiplesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"multipleOf",
            						lv_multipleOf_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleMultiples"


    // $ANTLR start "entryRuleMinimum"
    // InternalDraft7.g:938:1: entryRuleMinimum returns [EObject current=null] : iv_ruleMinimum= ruleMinimum EOF ;
    public final EObject entryRuleMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimum = null;


        try {
            // InternalDraft7.g:938:48: (iv_ruleMinimum= ruleMinimum EOF )
            // InternalDraft7.g:939:2: iv_ruleMinimum= ruleMinimum EOF
            {
             newCompositeNode(grammarAccess.getMinimumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimum=ruleMinimum();

            state._fsp--;

             current =iv_ruleMinimum; 
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
    // InternalDraft7.g:945:1: ruleMinimum returns [EObject current=null] : (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_minimum_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:951:2: ( (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:952:2: (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:952:2: (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= RULE_INT ) ) )
            // InternalDraft7.g:953:3: otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimumAccess().getMinimumKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMinimumAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:961:3: ( (lv_minimum_2_0= RULE_INT ) )
            // InternalDraft7.g:962:4: (lv_minimum_2_0= RULE_INT )
            {
            // InternalDraft7.g:962:4: (lv_minimum_2_0= RULE_INT )
            // InternalDraft7.g:963:5: lv_minimum_2_0= RULE_INT
            {
            lv_minimum_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minimum_2_0, grammarAccess.getMinimumAccess().getMinimumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinimumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minimum",
            						lv_minimum_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleMinimum"


    // $ANTLR start "entryRuleExclusiveMinimum"
    // InternalDraft7.g:983:1: entryRuleExclusiveMinimum returns [EObject current=null] : iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF ;
    public final EObject entryRuleExclusiveMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMinimum = null;


        try {
            // InternalDraft7.g:983:57: (iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF )
            // InternalDraft7.g:984:2: iv_ruleExclusiveMinimum= ruleExclusiveMinimum EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMinimumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMinimum=ruleExclusiveMinimum();

            state._fsp--;

             current =iv_ruleExclusiveMinimum; 
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
    // InternalDraft7.g:990:1: ruleExclusiveMinimum returns [EObject current=null] : (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= RULE_INT ) ) ) ;
    public final EObject ruleExclusiveMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_exclusiveMinimum_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:996:2: ( (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:997:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:997:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= RULE_INT ) ) )
            // InternalDraft7.g:998:3: otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMinimumAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:1006:3: ( (lv_exclusiveMinimum_2_0= RULE_INT ) )
            // InternalDraft7.g:1007:4: (lv_exclusiveMinimum_2_0= RULE_INT )
            {
            // InternalDraft7.g:1007:4: (lv_exclusiveMinimum_2_0= RULE_INT )
            // InternalDraft7.g:1008:5: lv_exclusiveMinimum_2_0= RULE_INT
            {
            lv_exclusiveMinimum_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_exclusiveMinimum_2_0, grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExclusiveMinimumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exclusiveMinimum",
            						lv_exclusiveMinimum_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleExclusiveMinimum"


    // $ANTLR start "entryRuleMaximum"
    // InternalDraft7.g:1028:1: entryRuleMaximum returns [EObject current=null] : iv_ruleMaximum= ruleMaximum EOF ;
    public final EObject entryRuleMaximum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximum = null;


        try {
            // InternalDraft7.g:1028:48: (iv_ruleMaximum= ruleMaximum EOF )
            // InternalDraft7.g:1029:2: iv_ruleMaximum= ruleMaximum EOF
            {
             newCompositeNode(grammarAccess.getMaximumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximum=ruleMaximum();

            state._fsp--;

             current =iv_ruleMaximum; 
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
    // InternalDraft7.g:1035:1: ruleMaximum returns [EObject current=null] : (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaximum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_maximum_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:1041:2: ( (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:1042:2: (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:1042:2: (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= RULE_INT ) ) )
            // InternalDraft7.g:1043:3: otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximumAccess().getMaximumKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMaximumAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:1051:3: ( (lv_maximum_2_0= RULE_INT ) )
            // InternalDraft7.g:1052:4: (lv_maximum_2_0= RULE_INT )
            {
            // InternalDraft7.g:1052:4: (lv_maximum_2_0= RULE_INT )
            // InternalDraft7.g:1053:5: lv_maximum_2_0= RULE_INT
            {
            lv_maximum_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_maximum_2_0, grammarAccess.getMaximumAccess().getMaximumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaximumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maximum",
            						lv_maximum_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleMaximum"


    // $ANTLR start "entryRuleExclusiveMaximum"
    // InternalDraft7.g:1073:1: entryRuleExclusiveMaximum returns [EObject current=null] : iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF ;
    public final EObject entryRuleExclusiveMaximum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMaximum = null;


        try {
            // InternalDraft7.g:1073:57: (iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF )
            // InternalDraft7.g:1074:2: iv_ruleExclusiveMaximum= ruleExclusiveMaximum EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMaximumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMaximum=ruleExclusiveMaximum();

            state._fsp--;

             current =iv_ruleExclusiveMaximum; 
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
    // InternalDraft7.g:1080:1: ruleExclusiveMaximum returns [EObject current=null] : (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= RULE_INT ) ) ) ;
    public final EObject ruleExclusiveMaximum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_exclusiveMaximum_2_0=null;


        	enterRule();

        try {
            // InternalDraft7.g:1086:2: ( (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= RULE_INT ) ) ) )
            // InternalDraft7.g:1087:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= RULE_INT ) ) )
            {
            // InternalDraft7.g:1087:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= RULE_INT ) ) )
            // InternalDraft7.g:1088:3: otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMaximumAccess().getColonKeyword_1());
            		
            // InternalDraft7.g:1096:3: ( (lv_exclusiveMaximum_2_0= RULE_INT ) )
            // InternalDraft7.g:1097:4: (lv_exclusiveMaximum_2_0= RULE_INT )
            {
            // InternalDraft7.g:1097:4: (lv_exclusiveMaximum_2_0= RULE_INT )
            // InternalDraft7.g:1098:5: lv_exclusiveMaximum_2_0= RULE_INT
            {
            lv_exclusiveMaximum_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_exclusiveMaximum_2_0, grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExclusiveMaximumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exclusiveMaximum",
            						lv_exclusiveMaximum_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleExclusiveMaximum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FF8018000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FF801C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F40000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}