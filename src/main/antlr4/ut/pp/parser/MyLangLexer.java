// Generated from /Users/szlukawski/Dropbox (LUKAW)/Nauka/Erasmus/M8/Compiler_Construction/Project/SprockellCompiler/src/main/antlr4/ut/pp/parser/MyLang.g4 by ANTLR 4.12.0
package main.antlr4.ut.pp.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, BOOL=33, FORK=34, JOIN=35, LOCK=36, UNLOCK=37, SHARED=38, IDENTIFIER=39, 
		INT=40, STRING=41, ESCAPE_SEQUENCE=42, COMMENT=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "BOOL", 
			"FORK", "JOIN", "LOCK", "UNLOCK", "SHARED", "IDENTIFIER", "INT", "STRING", 
			"ESCAPE_SEQUENCE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'||'", "'&&'", "'['", "']'", "'('", "')'", 
			"'='", "'+='", "'-='", "'*='", "'=='", "'!='", "'>='", "'<='", "'>'", 
			"'<'", "'+'", "'-'", "'*'", "'while'", "'for ('", "'if'", "'elif'", "'else'", 
			"'fn'", "'var'", "'return'", "'print'", "','", null, "'fork'", "'join'", 
			"'lock'", "'unlock'", "'shared'", null, null, null, "'\\\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOL", "FORK", 
			"JOIN", "LOCK", "UNLOCK", "SHARED", "IDENTIFIER", "INT", "STRING", "ESCAPE_SEQUENCE", 
			"COMMENT", "WS"
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


	public MyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

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
		"\u0004\u0000,\u0115\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u00c7"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0005&\u00e8\b&\n&\f&\u00eb\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u00f0\b\'\n\'\f\'\u00f3\t\'\u0003\'\u00f5\b\'\u0001(\u0001(\u0001"+
		"(\u0005(\u00fa\b(\n(\f(\u00fd\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u0108\b*\n*\f*\u010b\t*\u0001*\u0001*\u0001"+
		"+\u0004+\u0110\b+\u000b+\f+\u0111\u0001+\u0001+\u0000\u0000,\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O("+
		"Q)S*U+W,\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000019\u0001\u000009\u0001\u0000\"\"\u0001\u0000\n\n\u0003\u0000\t\n"+
		"\r\r  \u011c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0001Y\u0001\u0000\u0000\u0000\u0003[\u0001\u0000\u0000\u0000\u0005"+
		"]\u0001\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\tb\u0001\u0000"+
		"\u0000\u0000\u000be\u0001\u0000\u0000\u0000\rg\u0001\u0000\u0000\u0000"+
		"\u000fi\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013m"+
		"\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000\u0000\u0017r\u0001\u0000"+
		"\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000"+
		"\u001d{\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000!\u0081"+
		"\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000%\u0086\u0001\u0000"+
		"\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008a\u0001\u0000\u0000"+
		"\u0000+\u008c\u0001\u0000\u0000\u0000-\u008e\u0001\u0000\u0000\u0000/"+
		"\u0094\u0001\u0000\u0000\u00001\u009a\u0001\u0000\u0000\u00003\u009d\u0001"+
		"\u0000\u0000\u00005\u00a2\u0001\u0000\u0000\u00007\u00a7\u0001\u0000\u0000"+
		"\u00009\u00aa\u0001\u0000\u0000\u0000;\u00ae\u0001\u0000\u0000\u0000="+
		"\u00b5\u0001\u0000\u0000\u0000?\u00bb\u0001\u0000\u0000\u0000A\u00c6\u0001"+
		"\u0000\u0000\u0000C\u00c8\u0001\u0000\u0000\u0000E\u00cd\u0001\u0000\u0000"+
		"\u0000G\u00d2\u0001\u0000\u0000\u0000I\u00d7\u0001\u0000\u0000\u0000K"+
		"\u00de\u0001\u0000\u0000\u0000M\u00e5\u0001\u0000\u0000\u0000O\u00f4\u0001"+
		"\u0000\u0000\u0000Q\u00f6\u0001\u0000\u0000\u0000S\u0100\u0001\u0000\u0000"+
		"\u0000U\u0103\u0001\u0000\u0000\u0000W\u010f\u0001\u0000\u0000\u0000Y"+
		"Z\u0005{\u0000\u0000Z\u0002\u0001\u0000\u0000\u0000[\\\u0005}\u0000\u0000"+
		"\\\u0004\u0001\u0000\u0000\u0000]^\u0005;\u0000\u0000^\u0006\u0001\u0000"+
		"\u0000\u0000_`\u0005|\u0000\u0000`a\u0005|\u0000\u0000a\b\u0001\u0000"+
		"\u0000\u0000bc\u0005&\u0000\u0000cd\u0005&\u0000\u0000d\n\u0001\u0000"+
		"\u0000\u0000ef\u0005[\u0000\u0000f\f\u0001\u0000\u0000\u0000gh\u0005]"+
		"\u0000\u0000h\u000e\u0001\u0000\u0000\u0000ij\u0005(\u0000\u0000j\u0010"+
		"\u0001\u0000\u0000\u0000kl\u0005)\u0000\u0000l\u0012\u0001\u0000\u0000"+
		"\u0000mn\u0005=\u0000\u0000n\u0014\u0001\u0000\u0000\u0000op\u0005+\u0000"+
		"\u0000pq\u0005=\u0000\u0000q\u0016\u0001\u0000\u0000\u0000rs\u0005-\u0000"+
		"\u0000st\u0005=\u0000\u0000t\u0018\u0001\u0000\u0000\u0000uv\u0005*\u0000"+
		"\u0000vw\u0005=\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005=\u0000"+
		"\u0000yz\u0005=\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005!\u0000"+
		"\u0000|}\u0005=\u0000\u0000}\u001e\u0001\u0000\u0000\u0000~\u007f\u0005"+
		">\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080 \u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005<\u0000\u0000\u0082\u0083\u0005=\u0000\u0000\u0083"+
		"\"\u0001\u0000\u0000\u0000\u0084\u0085\u0005>\u0000\u0000\u0085$\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005<\u0000\u0000\u0087&\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005+\u0000\u0000\u0089(\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005-\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"*\u0000\u0000\u008d,\u0001\u0000\u0000\u0000\u008e\u008f\u0005w\u0000"+
		"\u0000\u008f\u0090\u0005h\u0000\u0000\u0090\u0091\u0005i\u0000\u0000\u0091"+
		"\u0092\u0005l\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093.\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005f\u0000\u0000\u0095\u0096\u0005o\u0000"+
		"\u0000\u0096\u0097\u0005r\u0000\u0000\u0097\u0098\u0005 \u0000\u0000\u0098"+
		"\u0099\u0005(\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"i\u0000\u0000\u009b\u009c\u0005f\u0000\u0000\u009c2\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005e\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f"+
		"\u00a0\u0005i\u0000\u0000\u00a0\u00a1\u0005f\u0000\u0000\u00a14\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005l\u0000"+
		"\u0000\u00a4\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6"+
		"6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005f\u0000\u0000\u00a8\u00a9\u0005"+
		"n\u0000\u0000\u00a98\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005v\u0000"+
		"\u0000\u00ab\u00ac\u0005a\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad"+
		":\u0001\u0000\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af\u00b0\u0005"+
		"e\u0000\u0000\u00b0\u00b1\u0005t\u0000\u0000\u00b1\u00b2\u0005u\u0000"+
		"\u0000\u00b2\u00b3\u0005r\u0000\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4"+
		"<\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005p\u0000\u0000\u00b6\u00b7\u0005"+
		"r\u0000\u0000\u00b7\u00b8\u0005i\u0000\u0000\u00b8\u00b9\u0005n\u0000"+
		"\u0000\u00b9\u00ba\u0005t\u0000\u0000\u00ba>\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005,\u0000\u0000\u00bc@\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"T\u0000\u0000\u00be\u00bf\u0005r\u0000\u0000\u00bf\u00c0\u0005u\u0000"+
		"\u0000\u00c0\u00c7\u0005e\u0000\u0000\u00c1\u00c2\u0005F\u0000\u0000\u00c2"+
		"\u00c3\u0005a\u0000\u0000\u00c3\u00c4\u0005l\u0000\u0000\u00c4\u00c5\u0005"+
		"s\u0000\u0000\u00c5\u00c7\u0005e\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7B\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005f\u0000\u0000\u00c9\u00ca\u0005o\u0000\u0000\u00ca\u00cb"+
		"\u0005r\u0000\u0000\u00cb\u00cc\u0005k\u0000\u0000\u00ccD\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005j\u0000\u0000\u00ce\u00cf\u0005o\u0000\u0000"+
		"\u00cf\u00d0\u0005i\u0000\u0000\u00d0\u00d1\u0005n\u0000\u0000\u00d1F"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005l\u0000\u0000\u00d3\u00d4\u0005"+
		"o\u0000\u0000\u00d4\u00d5\u0005c\u0000\u0000\u00d5\u00d6\u0005k\u0000"+
		"\u0000\u00d6H\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005u\u0000\u0000\u00d8"+
		"\u00d9\u0005n\u0000\u0000\u00d9\u00da\u0005l\u0000\u0000\u00da\u00db\u0005"+
		"o\u0000\u0000\u00db\u00dc\u0005c\u0000\u0000\u00dc\u00dd\u0005k\u0000"+
		"\u0000\u00ddJ\u0001\u0000\u0000\u0000\u00de\u00df\u0005s\u0000\u0000\u00df"+
		"\u00e0\u0005h\u0000\u0000\u00e0\u00e1\u0005a\u0000\u0000\u00e1\u00e2\u0005"+
		"r\u0000\u0000\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e4\u0005d\u0000"+
		"\u0000\u00e4L\u0001\u0000\u0000\u0000\u00e5\u00e9\u0007\u0000\u0000\u0000"+
		"\u00e6\u00e8\u0007\u0001\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00eaN\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00f5\u00050\u0000\u0000\u00ed\u00f1"+
		"\u0007\u0002\u0000\u0000\u00ee\u00f0\u0007\u0003\u0000\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000\u00f5P\u0001"+
		"\u0000\u0000\u0000\u00f6\u00fb\u0005\"\u0000\u0000\u00f7\u00fa\u0003S"+
		")\u0000\u00f8\u00fa\b\u0004\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\"\u0000\u0000\u00ffR\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\\\u0000\u0000\u0101\u0102\u0005\"\u0000\u0000\u0102"+
		"T\u0001\u0000\u0000\u0000\u0103\u0104\u0005/\u0000\u0000\u0104\u0105\u0005"+
		"/\u0000\u0000\u0105\u0109\u0001\u0000\u0000\u0000\u0106\u0108\b\u0005"+
		"\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0006*\u0000\u0000\u010dV\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0007\u0006\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0006+\u0000\u0000\u0114X\u0001\u0000\u0000\u0000\t\u0000"+
		"\u00c6\u00e9\u00f1\u00f4\u00f9\u00fb\u0109\u0111\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}