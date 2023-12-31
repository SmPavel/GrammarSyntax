// Generated from C:/Users/user/Documents/java projects/GrammarSyntax/src/main/java/org/example\CSyntax.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CSyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ASTERISK=4, SLASH=5, PLUS=6, MINUS=7, ID=8, NAME=9, 
		NUMBER=10, WHITESPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LETTER", "DIGIT", "ASTERISK", "SLASH", "PLUS", 
			"MINUS", "ID", "NAME", "NUMBER", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'^'", "'*'", "'/'", "'+'", "'-'", null, null, null, 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ASTERISK", "SLASH", "PLUS", "MINUS", "ID", "NAME", 
			"NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CSyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000bF\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n2\b\n\u000b"+
		"\n\f\n3\u0001\u000b\u0004\u000b7\b\u000b\u000b\u000b\f\u000b8\u0001\u000b"+
		"\u0001\u000b\u0004\u000b=\b\u000b\u000b\u000b\f\u000b>\u0003\u000bA\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0000\t\u0000\u000b\u0004\r\u0005\u000f\u0006"+
		"\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u0001\u0000\u0002\u0002"+
		"\u0000AZaz\u0001\u000009G\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001"+
		"\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001"+
		"\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000"+
		"\u0000\u000b%\u0001\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f"+
		")\u0001\u0000\u0000\u0000\u0011+\u0001\u0000\u0000\u0000\u0013-\u0001"+
		"\u0000\u0000\u0000\u00151\u0001\u0000\u0000\u0000\u00176\u0001\u0000\u0000"+
		"\u0000\u0019B\u0001\u0000\u0000\u0000\u001b\u001c\u0005(\u0000\u0000\u001c"+
		"\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005)\u0000\u0000\u001e\u0004"+
		"\u0001\u0000\u0000\u0000\u001f \u0005^\u0000\u0000 \u0006\u0001\u0000"+
		"\u0000\u0000!\"\u0007\u0000\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$"+
		"\u0007\u0001\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000"+
		"&\f\u0001\u0000\u0000\u0000\'(\u0005/\u0000\u0000(\u000e\u0001\u0000\u0000"+
		"\u0000)*\u0005+\u0000\u0000*\u0010\u0001\u0000\u0000\u0000+,\u0005-\u0000"+
		"\u0000,\u0012\u0001\u0000\u0000\u0000-.\u0003\u0007\u0003\u0000./\u0003"+
		"\t\u0004\u0000/\u0014\u0001\u0000\u0000\u000002\u0003\u0007\u0003\u0000"+
		"10\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0016\u0001\u0000\u0000\u000057\u0003"+
		"\t\u0004\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009@\u0001\u0000\u0000\u0000"+
		":<\u0005.\u0000\u0000;=\u0003\t\u0004\u0000<;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BC\u0005 \u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0006\f\u0000\u0000E\u001a\u0001\u0000\u0000\u0000"+
		"\u0005\u000038>@\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}