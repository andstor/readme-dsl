package tdt4250.pseudocode.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPcodeLexer extends Lexer {
    public static final int Add=38;
    public static final int HyphenMinusHyphenMinus=46;
    public static final int New=41;
    public static final int Or=54;
    public static final int RULE_BEGIN=77;
    public static final int Stop=33;
    public static final int Break=20;
    public static final int True=36;
    public static final int Index=22;
    public static final int Remove=17;
    public static final int False=21;
    public static final int LessThanSign=68;
    public static final int Divide=14;
    public static final int Print=24;
    public static final int PercentSign=58;
    public static final int LeftParenthesis=60;
    public static final int Decimal=11;
    public static final int Then=35;
    public static final int Ampersand=59;
    public static final int To=55;
    public static final int Executable=5;
    public static final int Plus=32;
    public static final int LessThen=10;
    public static final int RightSquareBracket=72;
    public static final int ExclamationMark=57;
    public static final int GreaterThanSign=70;
    public static final int RULE_ID=81;
    public static final int Modulo=16;
    public static final int For=40;
    public static final int RightParenthesis=61;
    public static final int GreaterThanSignEqualsSign=50;
    public static final int Exchange=8;
    public static final int Line=30;
    public static final int EqualsSignEqualsSign=49;
    public static final int BiggerThen=4;
    public static final int VerticalLine=75;
    public static final int And=39;
    public static final int PlusSign=63;
    public static final int RULE_INT=79;
    public static final int Contains=6;
    public static final int RULE_ML_COMMENT=83;
    public static final int LeftSquareBracket=71;
    public static final int Package=12;
    public static final int If=52;
    public static final int Minus=23;
    public static final int Interval=9;
    public static final int RULE_END=78;
    public static final int VerticalLineVerticalLine=56;
    public static final int Table_1=25;
    public static final int Is=53;
    public static final int RULE_STRING=82;
    public static final int Continue=7;
    public static final int With=37;
    public static final int RULE_SL_COMMENT=84;
    public static final int Comma=64;
    public static final int EqualsSign=69;
    public static final int HyphenMinus=65;
    public static final int At=51;
    public static final int Number=13;
    public static final int AmpersandAmpersand=43;
    public static final int RULE_DOUBLE=80;
    public static final int Array_1=19;
    public static final int HyphenMinusEqualsSign=47;
    public static final int LessThanSignEqualsSign=48;
    public static final int Solidus=67;
    public static final int RightCurlyBracket=76;
    public static final int EOF=-1;
    public static final int List_1=31;
    public static final int Asterisk=62;
    public static final int PlusSignEqualsSign=45;
    public static final int That=34;
    public static final int FullStop=66;
    public static final int Return=18;
    public static final int RULE_WS=85;
    public static final int LeftCurlyBracket=74;
    public static final int Text=28;
    public static final int While=27;
    public static final int RULE_ANY_OTHER=86;
    public static final int CircumflexAccent=73;
    public static final int Equals=15;
    public static final int PlusSignPlusSign=44;
    public static final int Times=26;
    public static final int Else=29;
    public static final int ExclamationMarkEqualsSign=42;

    // delegates
    // delegators

    public InternalPcodeLexer() {;} 
    public InternalPcodeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPcodeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPcodeLexer.g"; }

    // $ANTLR start "BiggerThen"
    public final void mBiggerThen() throws RecognitionException {
        try {
            int _type = BiggerThen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:14:12: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalPcodeLexer.g:14:14: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BiggerThen"

    // $ANTLR start "Executable"
    public final void mExecutable() throws RecognitionException {
        try {
            int _type = Executable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:16:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:16:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Executable"

    // $ANTLR start "Contains"
    public final void mContains() throws RecognitionException {
        try {
            int _type = Contains;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:18:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:18:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Contains"

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:20:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:20:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Continue"

    // $ANTLR start "Exchange"
    public final void mExchange() throws RecognitionException {
        try {
            int _type = Exchange;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:22:10: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:22:12: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exchange"

    // $ANTLR start "Interval"
    public final void mInterval() throws RecognitionException {
        try {
            int _type = Interval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:24:10: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalPcodeLexer.g:24:12: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interval"

    // $ANTLR start "LessThen"
    public final void mLessThen() throws RecognitionException {
        try {
            int _type = LessThen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:26:10: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalPcodeLexer.g:26:12: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThen"

    // $ANTLR start "Decimal"
    public final void mDecimal() throws RecognitionException {
        try {
            int _type = Decimal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:28:9: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalPcodeLexer.g:28:11: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Decimal"

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:30:9: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:30:11: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:32:8: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalPcodeLexer.g:32:10: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Divide"
    public final void mDivide() throws RecognitionException {
        try {
            int _type = Divide;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:34:8: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:34:10: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Divide"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:36:8: ( ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:36:10: ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "Modulo"
    public final void mModulo() throws RecognitionException {
        try {
            int _type = Modulo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:38:8: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'O' | 'o' ) )
            // InternalPcodeLexer.g:38:10: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modulo"

    // $ANTLR start "Remove"
    public final void mRemove() throws RecognitionException {
        try {
            int _type = Remove;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:40:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:40:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Remove"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:42:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalPcodeLexer.g:42:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Array_1"
    public final void mArray_1() throws RecognitionException {
        try {
            int _type = Array_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:44:9: ( ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // InternalPcodeLexer.g:44:11: ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array_1"

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:46:7: ( ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' ) )
            // InternalPcodeLexer.g:46:9: ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Break"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:48:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:48:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Index"
    public final void mIndex() throws RecognitionException {
        try {
            int _type = Index;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:50:7: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // InternalPcodeLexer.g:50:9: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Index"

    // $ANTLR start "Minus"
    public final void mMinus() throws RecognitionException {
        try {
            int _type = Minus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:52:7: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:52:9: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Minus"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:54:7: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalPcodeLexer.g:54:9: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Table_1"
    public final void mTable_1() throws RecognitionException {
        try {
            int _type = Table_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:56:9: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:56:11: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Table_1"

    // $ANTLR start "Times"
    public final void mTimes() throws RecognitionException {
        try {
            int _type = Times;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:58:7: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:58:9: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Times"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:60:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:60:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Text"
    public final void mText() throws RecognitionException {
        try {
            int _type = Text;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:62:6: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // InternalPcodeLexer.g:62:8: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Text"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:64:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:64:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Line"
    public final void mLine() throws RecognitionException {
        try {
            int _type = Line;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:66:6: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:66:8: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Line"

    // $ANTLR start "List_1"
    public final void mList_1() throws RecognitionException {
        try {
            int _type = List_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:68:8: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // InternalPcodeLexer.g:68:10: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List_1"

    // $ANTLR start "Plus"
    public final void mPlus() throws RecognitionException {
        try {
            int _type = Plus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:70:6: ( ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:70:8: ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Plus"

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:72:6: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // InternalPcodeLexer.g:72:8: ( 'S' | 's' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop"

    // $ANTLR start "That"
    public final void mThat() throws RecognitionException {
        try {
            int _type = That;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:74:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // InternalPcodeLexer.g:74:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "That"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:76:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalPcodeLexer.g:76:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:78:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalPcodeLexer.g:78:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:80:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // InternalPcodeLexer.g:80:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:82:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // InternalPcodeLexer.g:82:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:84:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalPcodeLexer.g:84:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:86:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalPcodeLexer.g:86:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:88:5: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // InternalPcodeLexer.g:88:7: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:90:27: ( '!' '=' )
            // InternalPcodeLexer.g:90:29: '!' '='
            {
            match('!'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:92:20: ( '&' '&' )
            // InternalPcodeLexer.g:92:22: '&' '&'
            {
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:94:18: ( '+' '+' )
            // InternalPcodeLexer.g:94:20: '+' '+'
            {
            match('+'); 
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "PlusSignEqualsSign"
    public final void mPlusSignEqualsSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:96:20: ( '+' '=' )
            // InternalPcodeLexer.g:96:22: '+' '='
            {
            match('+'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:98:24: ( '-' '-' )
            // InternalPcodeLexer.g:98:26: '-' '-'
            {
            match('-'); 
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "HyphenMinusEqualsSign"
    public final void mHyphenMinusEqualsSign() throws RecognitionException {
        try {
            int _type = HyphenMinusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:100:23: ( '-' '=' )
            // InternalPcodeLexer.g:100:25: '-' '='
            {
            match('-'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:102:24: ( '<' '=' )
            // InternalPcodeLexer.g:102:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:104:22: ( '=' '=' )
            // InternalPcodeLexer.g:104:24: '=' '='
            {
            match('='); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:106:27: ( '>' '=' )
            // InternalPcodeLexer.g:106:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "At"
    public final void mAt() throws RecognitionException {
        try {
            int _type = At;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:108:4: ( ( 'A' | 'a' ) ( 'T' | 't' ) )
            // InternalPcodeLexer.g:108:6: ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "At"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:110:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalPcodeLexer.g:110:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Is"
    public final void mIs() throws RecognitionException {
        try {
            int _type = Is;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:112:4: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // InternalPcodeLexer.g:112:6: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Is"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:114:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalPcodeLexer.g:114:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:116:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalPcodeLexer.g:116:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:118:26: ( '|' '|' )
            // InternalPcodeLexer.g:118:28: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:120:17: ( '!' )
            // InternalPcodeLexer.g:120:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:122:13: ( '%' )
            // InternalPcodeLexer.g:122:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:124:11: ( '&' )
            // InternalPcodeLexer.g:124:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:126:17: ( '(' )
            // InternalPcodeLexer.g:126:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:128:18: ( ')' )
            // InternalPcodeLexer.g:128:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:130:10: ( '*' )
            // InternalPcodeLexer.g:130:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:132:10: ( '+' )
            // InternalPcodeLexer.g:132:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:134:7: ( ',' )
            // InternalPcodeLexer.g:134:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:136:13: ( '-' )
            // InternalPcodeLexer.g:136:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:138:10: ( '.' )
            // InternalPcodeLexer.g:138:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:140:9: ( '/' )
            // InternalPcodeLexer.g:140:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:142:14: ( '<' )
            // InternalPcodeLexer.g:142:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:144:12: ( '=' )
            // InternalPcodeLexer.g:144:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:146:17: ( '>' )
            // InternalPcodeLexer.g:146:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:148:19: ( '[' )
            // InternalPcodeLexer.g:148:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:150:20: ( ']' )
            // InternalPcodeLexer.g:150:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:152:18: ( '^' )
            // InternalPcodeLexer.g:152:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:154:18: ( '{' )
            // InternalPcodeLexer.g:154:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:156:14: ( '|' )
            // InternalPcodeLexer.g:156:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:158:19: ( '}' )
            // InternalPcodeLexer.g:158:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalPcodeLexer.g:160:21: ()
            // InternalPcodeLexer.g:160:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalPcodeLexer.g:162:19: ()
            // InternalPcodeLexer.g:162:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:164:13: ( RULE_INT '.' RULE_INT )
            // InternalPcodeLexer.g:164:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:166:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPcodeLexer.g:166:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPcodeLexer.g:166:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcodeLexer.g:166:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPcodeLexer.g:166:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPcodeLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:168:10: ( ( '0' .. '9' )+ )
            // InternalPcodeLexer.g:168:12: ( '0' .. '9' )+
            {
            // InternalPcodeLexer.g:168:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPcodeLexer.g:168:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:170:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPcodeLexer.g:170:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPcodeLexer.g:170:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPcodeLexer.g:170:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPcodeLexer.g:170:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPcodeLexer.g:170:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:170:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPcodeLexer.g:170:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPcodeLexer.g:170:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPcodeLexer.g:170:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:170:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:172:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPcodeLexer.g:172:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPcodeLexer.g:172:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPcodeLexer.g:172:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:174:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPcodeLexer.g:174:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPcodeLexer.g:174:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPcodeLexer.g:174:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPcodeLexer.g:174:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPcodeLexer.g:174:41: ( '\\r' )? '\\n'
                    {
                    // InternalPcodeLexer.g:174:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPcodeLexer.g:174:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:176:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPcodeLexer.g:176:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPcodeLexer.g:176:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPcodeLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:178:16: ( . )
            // InternalPcodeLexer.g:178:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPcodeLexer.g:1:8: ( BiggerThen | Executable | Contains | Continue | Exchange | Interval | LessThen | Decimal | Package | Number | Divide | Equals | Modulo | Remove | Return | Array_1 | Break | False | Index | Minus | Print | Table_1 | Times | While | Text | Else | Line | List_1 | Plus | Stop | That | Then | True | With | Add | And | For | New | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | Is | Or | To | VerticalLineVerticalLine | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=81;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPcodeLexer.g:1:10: BiggerThen
                {
                mBiggerThen(); 

                }
                break;
            case 2 :
                // InternalPcodeLexer.g:1:21: Executable
                {
                mExecutable(); 

                }
                break;
            case 3 :
                // InternalPcodeLexer.g:1:32: Contains
                {
                mContains(); 

                }
                break;
            case 4 :
                // InternalPcodeLexer.g:1:41: Continue
                {
                mContinue(); 

                }
                break;
            case 5 :
                // InternalPcodeLexer.g:1:50: Exchange
                {
                mExchange(); 

                }
                break;
            case 6 :
                // InternalPcodeLexer.g:1:59: Interval
                {
                mInterval(); 

                }
                break;
            case 7 :
                // InternalPcodeLexer.g:1:68: LessThen
                {
                mLessThen(); 

                }
                break;
            case 8 :
                // InternalPcodeLexer.g:1:77: Decimal
                {
                mDecimal(); 

                }
                break;
            case 9 :
                // InternalPcodeLexer.g:1:85: Package
                {
                mPackage(); 

                }
                break;
            case 10 :
                // InternalPcodeLexer.g:1:93: Number
                {
                mNumber(); 

                }
                break;
            case 11 :
                // InternalPcodeLexer.g:1:100: Divide
                {
                mDivide(); 

                }
                break;
            case 12 :
                // InternalPcodeLexer.g:1:107: Equals
                {
                mEquals(); 

                }
                break;
            case 13 :
                // InternalPcodeLexer.g:1:114: Modulo
                {
                mModulo(); 

                }
                break;
            case 14 :
                // InternalPcodeLexer.g:1:121: Remove
                {
                mRemove(); 

                }
                break;
            case 15 :
                // InternalPcodeLexer.g:1:128: Return
                {
                mReturn(); 

                }
                break;
            case 16 :
                // InternalPcodeLexer.g:1:135: Array_1
                {
                mArray_1(); 

                }
                break;
            case 17 :
                // InternalPcodeLexer.g:1:143: Break
                {
                mBreak(); 

                }
                break;
            case 18 :
                // InternalPcodeLexer.g:1:149: False
                {
                mFalse(); 

                }
                break;
            case 19 :
                // InternalPcodeLexer.g:1:155: Index
                {
                mIndex(); 

                }
                break;
            case 20 :
                // InternalPcodeLexer.g:1:161: Minus
                {
                mMinus(); 

                }
                break;
            case 21 :
                // InternalPcodeLexer.g:1:167: Print
                {
                mPrint(); 

                }
                break;
            case 22 :
                // InternalPcodeLexer.g:1:173: Table_1
                {
                mTable_1(); 

                }
                break;
            case 23 :
                // InternalPcodeLexer.g:1:181: Times
                {
                mTimes(); 

                }
                break;
            case 24 :
                // InternalPcodeLexer.g:1:187: While
                {
                mWhile(); 

                }
                break;
            case 25 :
                // InternalPcodeLexer.g:1:193: Text
                {
                mText(); 

                }
                break;
            case 26 :
                // InternalPcodeLexer.g:1:198: Else
                {
                mElse(); 

                }
                break;
            case 27 :
                // InternalPcodeLexer.g:1:203: Line
                {
                mLine(); 

                }
                break;
            case 28 :
                // InternalPcodeLexer.g:1:208: List_1
                {
                mList_1(); 

                }
                break;
            case 29 :
                // InternalPcodeLexer.g:1:215: Plus
                {
                mPlus(); 

                }
                break;
            case 30 :
                // InternalPcodeLexer.g:1:220: Stop
                {
                mStop(); 

                }
                break;
            case 31 :
                // InternalPcodeLexer.g:1:225: That
                {
                mThat(); 

                }
                break;
            case 32 :
                // InternalPcodeLexer.g:1:230: Then
                {
                mThen(); 

                }
                break;
            case 33 :
                // InternalPcodeLexer.g:1:235: True
                {
                mTrue(); 

                }
                break;
            case 34 :
                // InternalPcodeLexer.g:1:240: With
                {
                mWith(); 

                }
                break;
            case 35 :
                // InternalPcodeLexer.g:1:245: Add
                {
                mAdd(); 

                }
                break;
            case 36 :
                // InternalPcodeLexer.g:1:249: And
                {
                mAnd(); 

                }
                break;
            case 37 :
                // InternalPcodeLexer.g:1:253: For
                {
                mFor(); 

                }
                break;
            case 38 :
                // InternalPcodeLexer.g:1:257: New
                {
                mNew(); 

                }
                break;
            case 39 :
                // InternalPcodeLexer.g:1:261: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 40 :
                // InternalPcodeLexer.g:1:287: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 41 :
                // InternalPcodeLexer.g:1:306: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 42 :
                // InternalPcodeLexer.g:1:323: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 43 :
                // InternalPcodeLexer.g:1:342: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 44 :
                // InternalPcodeLexer.g:1:365: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 45 :
                // InternalPcodeLexer.g:1:387: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 46 :
                // InternalPcodeLexer.g:1:410: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 47 :
                // InternalPcodeLexer.g:1:431: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 48 :
                // InternalPcodeLexer.g:1:457: At
                {
                mAt(); 

                }
                break;
            case 49 :
                // InternalPcodeLexer.g:1:460: If
                {
                mIf(); 

                }
                break;
            case 50 :
                // InternalPcodeLexer.g:1:463: Is
                {
                mIs(); 

                }
                break;
            case 51 :
                // InternalPcodeLexer.g:1:466: Or
                {
                mOr(); 

                }
                break;
            case 52 :
                // InternalPcodeLexer.g:1:469: To
                {
                mTo(); 

                }
                break;
            case 53 :
                // InternalPcodeLexer.g:1:472: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 54 :
                // InternalPcodeLexer.g:1:497: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 55 :
                // InternalPcodeLexer.g:1:513: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 56 :
                // InternalPcodeLexer.g:1:525: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 57 :
                // InternalPcodeLexer.g:1:535: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 58 :
                // InternalPcodeLexer.g:1:551: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 59 :
                // InternalPcodeLexer.g:1:568: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 60 :
                // InternalPcodeLexer.g:1:577: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 61 :
                // InternalPcodeLexer.g:1:586: Comma
                {
                mComma(); 

                }
                break;
            case 62 :
                // InternalPcodeLexer.g:1:592: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 63 :
                // InternalPcodeLexer.g:1:604: FullStop
                {
                mFullStop(); 

                }
                break;
            case 64 :
                // InternalPcodeLexer.g:1:613: Solidus
                {
                mSolidus(); 

                }
                break;
            case 65 :
                // InternalPcodeLexer.g:1:621: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 66 :
                // InternalPcodeLexer.g:1:634: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 67 :
                // InternalPcodeLexer.g:1:645: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 68 :
                // InternalPcodeLexer.g:1:661: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 69 :
                // InternalPcodeLexer.g:1:679: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 70 :
                // InternalPcodeLexer.g:1:698: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 71 :
                // InternalPcodeLexer.g:1:715: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 72 :
                // InternalPcodeLexer.g:1:732: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 73 :
                // InternalPcodeLexer.g:1:745: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 74 :
                // InternalPcodeLexer.g:1:763: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 75 :
                // InternalPcodeLexer.g:1:775: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 76 :
                // InternalPcodeLexer.g:1:783: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 77 :
                // InternalPcodeLexer.g:1:792: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 78 :
                // InternalPcodeLexer.g:1:804: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 79 :
                // InternalPcodeLexer.g:1:820: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 80 :
                // InternalPcodeLexer.g:1:836: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 81 :
                // InternalPcodeLexer.g:1:844: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\17\55\1\121\1\123\1\126\1\131\1\133\1\135\1\137\1\55\1\142\6\uffff\1\153\2\uffff\1\156\2\uffff\1\161\1\uffff\2\52\2\uffff\2\55\1\uffff\5\55\1\177\1\u0080\17\55\1\u0092\7\55\1\u009b\3\55\20\uffff\1\u009f\22\uffff\1\161\2\uffff\11\55\2\uffff\11\55\1\u00b2\5\55\1\u00b8\1\u00b9\1\uffff\1\55\1\u00bb\6\55\1\uffff\3\55\1\uffff\5\55\1\u00ca\4\55\1\u00d0\1\u00d1\4\55\1\u00d6\1\55\1\uffff\5\55\2\uffff\1\55\1\uffff\2\55\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\55\1\u00e5\1\u00e6\1\55\1\u00e8\3\55\1\uffff\3\55\1\u00ef\1\55\2\uffff\3\55\1\u00f4\1\uffff\2\55\1\u00f7\2\55\1\u00fa\1\u00fb\1\u00fc\1\u00fd\4\uffff\1\u00fe\2\uffff\1\55\1\uffff\2\55\1\u0102\3\55\1\uffff\2\55\1\u0108\1\55\1\uffff\1\u010a\1\u010b\1\uffff\1\u010c\1\u010d\5\uffff\3\55\1\uffff\4\55\1\u0115\1\uffff\1\u0116\4\uffff\2\55\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\2\uffff\2\55\5\uffff\1\u0120\1\u0121\2\uffff";
    static final String DFA12_eofS =
        "\u0122\uffff";
    static final String DFA12_minS =
        "\1\0\1\111\1\114\1\117\1\106\2\105\1\101\1\105\1\111\1\105\1\104\2\101\1\110\1\124\1\75\1\46\1\53\1\55\3\75\1\122\1\174\6\uffff\1\52\2\uffff\1\101\2\uffff\1\56\1\uffff\2\0\2\uffff\1\107\1\105\1\uffff\1\103\1\125\1\123\1\116\1\104\2\60\1\123\1\116\1\103\1\126\1\103\1\111\1\125\1\115\1\127\1\104\1\116\1\115\1\122\2\104\1\60\1\114\1\122\1\102\1\115\1\130\1\101\1\125\1\60\1\111\1\124\1\117\20\uffff\1\60\22\uffff\1\56\2\uffff\1\107\1\101\1\103\1\110\1\101\1\105\1\124\2\105\2\uffff\1\123\1\105\1\124\2\111\1\113\1\116\1\123\1\102\1\60\2\125\1\117\1\125\1\101\2\60\1\uffff\1\123\1\60\1\114\1\105\2\124\1\116\1\105\1\uffff\1\114\1\110\1\120\1\uffff\1\105\1\113\1\125\1\101\1\114\1\60\1\101\1\122\1\130\1\124\2\60\1\115\1\104\1\101\1\124\1\60\1\105\1\uffff\1\114\1\123\1\126\1\122\1\131\2\uffff\1\105\1\uffff\1\105\1\123\4\60\1\105\2\60\1\122\1\60\1\124\1\116\1\123\1\uffff\1\111\1\116\1\126\1\60\1\110\2\uffff\1\101\1\105\1\107\1\60\1\uffff\1\122\1\117\1\60\1\105\1\116\4\60\4\uffff\1\60\2\uffff\1\124\1\uffff\1\101\1\107\1\60\1\116\1\125\1\101\1\uffff\1\105\1\114\1\60\1\105\1\uffff\2\60\1\uffff\2\60\5\uffff\1\110\1\102\1\105\1\uffff\1\123\1\105\1\114\1\116\1\60\1\uffff\1\60\4\uffff\1\105\1\114\5\60\2\uffff\1\116\1\105\5\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\170\1\157\1\163\2\151\1\162\1\165\1\157\1\145\1\164\1\157\1\162\1\151\1\164\1\75\1\46\5\75\1\162\1\174\6\uffff\1\57\2\uffff\1\172\2\uffff\1\71\1\uffff\2\uffff\2\uffff\1\147\1\145\1\uffff\1\145\1\165\1\163\1\156\1\164\2\172\2\163\1\143\1\166\1\143\1\151\1\165\1\155\1\167\1\144\1\156\1\164\1\162\2\144\1\172\1\154\1\162\1\142\1\155\1\170\1\145\1\165\1\172\1\151\1\164\1\157\20\uffff\1\172\22\uffff\1\71\2\uffff\1\147\1\141\1\143\1\150\1\141\1\145\1\164\2\145\2\uffff\1\163\1\145\1\164\2\151\1\153\1\156\1\163\1\142\1\172\2\165\1\157\1\165\1\141\2\172\1\uffff\1\163\1\172\1\154\1\145\2\164\1\156\1\145\1\uffff\1\154\1\150\1\160\1\uffff\1\145\1\153\1\165\1\141\1\154\1\172\1\151\1\162\1\170\1\164\2\172\1\155\1\144\1\141\1\164\1\172\1\145\1\uffff\1\154\1\163\1\166\1\162\1\171\2\uffff\1\145\1\uffff\1\145\1\163\4\172\1\145\2\172\1\162\1\172\1\164\1\156\1\163\1\uffff\1\151\1\156\1\166\1\172\1\150\2\uffff\1\141\1\145\1\147\1\172\1\uffff\1\162\1\157\1\172\1\145\1\156\4\172\4\uffff\1\172\2\uffff\1\164\1\uffff\1\141\1\147\1\172\1\156\1\165\1\141\1\uffff\1\145\1\154\1\172\1\145\1\uffff\2\172\1\uffff\2\172\5\uffff\1\150\1\142\1\145\1\uffff\1\163\1\145\1\154\1\156\1\172\1\uffff\1\172\4\uffff\1\145\1\154\5\172\2\uffff\1\156\1\145\5\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\31\uffff\1\67\1\71\1\72\1\73\1\75\1\77\1\uffff\1\104\1\105\1\uffff\1\107\1\111\1\uffff\1\113\2\uffff\1\120\1\121\2\uffff\1\113\42\uffff\1\47\1\66\1\50\1\70\1\51\1\52\1\74\1\53\1\54\1\76\1\55\1\101\1\56\1\102\1\57\1\103\1\uffff\1\65\1\110\1\67\1\71\1\72\1\73\1\75\1\77\1\116\1\117\1\100\1\104\1\105\1\106\1\107\1\111\1\114\1\112\1\uffff\1\115\1\120\11\uffff\1\61\1\62\21\uffff\1\60\10\uffff\1\64\3\uffff\1\63\22\uffff\1\46\5\uffff\1\43\1\44\1\uffff\1\45\16\uffff\1\32\5\uffff\1\33\1\34\4\uffff\1\35\11\uffff\1\31\1\37\1\40\1\41\1\uffff\1\42\1\36\1\uffff\1\21\6\uffff\1\23\4\uffff\1\25\2\uffff\1\24\2\uffff\1\20\1\22\1\26\1\27\1\30\3\uffff\1\14\5\uffff\1\13\1\uffff\1\12\1\15\1\16\1\17\7\uffff\1\10\1\11\2\uffff\1\5\1\3\1\4\1\6\1\7\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\1\1\46\uffff\1\2\1\0\u00f9\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\20\1\47\2\52\1\31\1\21\1\50\1\32\1\33\1\34\1\22\1\35\1\23\1\36\1\37\12\45\2\52\1\24\1\25\1\26\2\52\1\13\1\1\1\3\1\6\1\2\1\14\2\46\1\4\2\46\1\5\1\11\1\10\1\27\1\7\1\46\1\12\1\17\1\15\2\46\1\16\3\46\1\40\1\52\1\41\1\42\1\46\1\52\1\13\1\1\1\3\1\6\1\2\1\14\2\46\1\4\2\46\1\5\1\11\1\10\1\27\1\7\1\46\1\12\1\17\1\15\2\46\1\16\3\46\1\43\1\30\1\44\uff82\52",
            "\1\53\10\uffff\1\54\26\uffff\1\53\10\uffff\1\54",
            "\1\60\4\uffff\1\57\6\uffff\1\56\23\uffff\1\60\4\uffff\1\57\6\uffff\1\56",
            "\1\61\37\uffff\1\61",
            "\1\63\7\uffff\1\62\4\uffff\1\64\22\uffff\1\63\7\uffff\1\62\4\uffff\1\64",
            "\1\65\3\uffff\1\66\33\uffff\1\65\3\uffff\1\66",
            "\1\67\3\uffff\1\70\33\uffff\1\67\3\uffff\1\70",
            "\1\71\12\uffff\1\73\5\uffff\1\72\16\uffff\1\71\12\uffff\1\73\5\uffff\1\72",
            "\1\75\17\uffff\1\74\17\uffff\1\75\17\uffff\1\74",
            "\1\77\5\uffff\1\76\31\uffff\1\77\5\uffff\1\76",
            "\1\100\37\uffff\1\100",
            "\1\102\11\uffff\1\103\3\uffff\1\101\1\uffff\1\104\17\uffff\1\102\11\uffff\1\103\3\uffff\1\101\1\uffff\1\104",
            "\1\105\15\uffff\1\106\21\uffff\1\105\15\uffff\1\106",
            "\1\107\3\uffff\1\111\2\uffff\1\112\1\110\5\uffff\1\114\2\uffff\1\113\16\uffff\1\107\3\uffff\1\111\2\uffff\1\112\1\110\5\uffff\1\114\2\uffff\1\113",
            "\1\115\1\116\36\uffff\1\115\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120",
            "\1\122",
            "\1\124\21\uffff\1\125",
            "\1\127\17\uffff\1\130",
            "\1\132",
            "\1\134",
            "\1\136",
            "\1\140\37\uffff\1\140",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151\4\uffff\1\152",
            "",
            "",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\162\1\uffff\12\163",
            "",
            "\0\164",
            "\0\164",
            "",
            "",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "",
            "\1\171\1\uffff\1\170\35\uffff\1\171\1\uffff\1\170",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\176\17\uffff\1\175\17\uffff\1\176\17\uffff\1\175",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\4\uffff\1\u0083\32\uffff\1\u0082\4\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\6\uffff\1\u008e\30\uffff\1\u008d\6\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\3\uffff\1\u0099\33\uffff\1\u0098\3\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162\1\uffff\12\163",
            "",
            "",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "",
            "",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ba\37\uffff\1\u00ba",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cb\7\uffff\1\u00cc\27\uffff\1\u00cb\7\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d7\37\uffff\1\u00d7",
            "",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "",
            "",
            "\1\u00dd\37\uffff\1\u00dd",
            "",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e4\37\uffff\1\u00e4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e7\37\uffff\1\u00e7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f0\37\uffff\1\u00f0",
            "",
            "",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u00ff\37\uffff\1\u00ff",
            "",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0109\37\uffff\1\u0109",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BiggerThen | Executable | Contains | Continue | Exchange | Interval | LessThen | Decimal | Package | Number | Divide | Equals | Modulo | Remove | Return | Array_1 | Break | False | Index | Minus | Print | Table_1 | Times | While | Text | Else | Line | List_1 | Plus | Stop | That | Then | True | With | Add | And | For | New | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | Is | Or | To | VerticalLineVerticalLine | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( ((LA12_40>='\u0000' && LA12_40<='\uFFFF')) ) {s = 116;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='B'||LA12_0=='b') ) {s = 1;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='C'||LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='L'||LA12_0=='l') ) {s = 5;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='P'||LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='M'||LA12_0=='m') ) {s = 9;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 10;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 11;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 13;}

                        else if ( (LA12_0=='W'||LA12_0=='w') ) {s = 14;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 15;}

                        else if ( (LA12_0=='!') ) {s = 16;}

                        else if ( (LA12_0=='&') ) {s = 17;}

                        else if ( (LA12_0=='+') ) {s = 18;}

                        else if ( (LA12_0=='-') ) {s = 19;}

                        else if ( (LA12_0=='<') ) {s = 20;}

                        else if ( (LA12_0=='=') ) {s = 21;}

                        else if ( (LA12_0=='>') ) {s = 22;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 23;}

                        else if ( (LA12_0=='|') ) {s = 24;}

                        else if ( (LA12_0=='%') ) {s = 25;}

                        else if ( (LA12_0=='(') ) {s = 26;}

                        else if ( (LA12_0==')') ) {s = 27;}

                        else if ( (LA12_0=='*') ) {s = 28;}

                        else if ( (LA12_0==',') ) {s = 29;}

                        else if ( (LA12_0=='.') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( (LA12_0=='[') ) {s = 32;}

                        else if ( (LA12_0==']') ) {s = 33;}

                        else if ( (LA12_0=='^') ) {s = 34;}

                        else if ( (LA12_0=='{') ) {s = 35;}

                        else if ( (LA12_0=='}') ) {s = 36;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 37;}

                        else if ( ((LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 38;}

                        else if ( (LA12_0=='\"') ) {s = 39;}

                        else if ( (LA12_0=='\'') ) {s = 40;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 41;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 116;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}