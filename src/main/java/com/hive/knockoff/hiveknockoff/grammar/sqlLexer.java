// Generated from sql.g4 by ANTLR 4.7.1
package com.hive.knockoff.hiveknockoff.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, K_CREATE=12, K_TABLE=13, K_DROP=14, K_INSERT=15, K_INTO=16, 
		K_VALUES=17, K_DELETE=18, K_FROM=19, K_WHERE=20, K_SELECT=21, K_LIMIT=22, 
		IDENTIFIER=23, NUMERIC_LITERAL=24, STRING_LITERAL=25, SPACES=26, UNEXPECTED_CHAR=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "K_CREATE", "K_TABLE", "K_DROP", "K_INSERT", "K_INTO", 
		"K_VALUES", "K_DELETE", "K_FROM", "K_WHERE", "K_SELECT", "K_LIMIT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "STRING_LITERAL", "SPACES", "UNEXPECTED_CHAR", "DIGIT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "','", "')'", "'*'", "'+'", "'-'", "'='", "'=='", 
		"'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"K_CREATE", "K_TABLE", "K_DROP", "K_INSERT", "K_INTO", "K_VALUES", "K_DELETE", 
		"K_FROM", "K_WHERE", "K_SELECT", "K_LIMIT", "IDENTIFIER", "NUMERIC_LITERAL", 
		"STRING_LITERAL", "SPACES", "UNEXPECTED_CHAR"
	};
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


	public sqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00ce"+
		"\n\30\f\30\16\30\u00d1\13\30\3\31\6\31\u00d4\n\31\r\31\16\31\u00d5\3\31"+
		"\3\31\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\5\31\u00df\n\31\3\31\3\31"+
		"\5\31\u00e3\n\31\3\31\6\31\u00e6\n\31\r\31\16\31\u00e7\5\31\u00ea\n\31"+
		"\3\31\3\31\6\31\u00ee\n\31\r\31\16\31\u00ef\3\31\3\31\5\31\u00f4\n\31"+
		"\3\31\6\31\u00f7\n\31\r\31\16\31\u00f8\5\31\u00fb\n\31\5\31\u00fd\n\31"+
		"\3\32\3\32\3\32\3\32\7\32\u0103\n\32\f\32\16\32\u0106\13\32\3\32\3\32"+
		"\3\33\6\33\u010b\n\33\r\33\16\33\u010c\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\2\28\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\2?\2"+
		"A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2"+
		"\3\2\"\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\3\2))\5\2\13\r\17\17\"\"\3\2"+
		"\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4"+
		"\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSs"+
		"s\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2"+
		"\\\\||\2\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3"+
		"o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{"+
		"\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0084\3\2\2\2"+
		"\31\u0087\3\2\2\2\33\u008e\3\2\2\2\35\u0094\3\2\2\2\37\u0099\3\2\2\2!"+
		"\u00a0\3\2\2\2#\u00a5\3\2\2\2%\u00ac\3\2\2\2\'\u00b3\3\2\2\2)\u00b8\3"+
		"\2\2\2+\u00be\3\2\2\2-\u00c5\3\2\2\2/\u00cb\3\2\2\2\61\u00fc\3\2\2\2\63"+
		"\u00fe\3\2\2\2\65\u010a\3\2\2\2\67\u0110\3\2\2\29\u0112\3\2\2\2;\u0114"+
		"\3\2\2\2=\u0116\3\2\2\2?\u0118\3\2\2\2A\u011a\3\2\2\2C\u011c\3\2\2\2E"+
		"\u011e\3\2\2\2G\u0120\3\2\2\2I\u0122\3\2\2\2K\u0124\3\2\2\2M\u0126\3\2"+
		"\2\2O\u0128\3\2\2\2Q\u012a\3\2\2\2S\u012c\3\2\2\2U\u012e\3\2\2\2W\u0130"+
		"\3\2\2\2Y\u0132\3\2\2\2[\u0134\3\2\2\2]\u0136\3\2\2\2_\u0138\3\2\2\2a"+
		"\u013a\3\2\2\2c\u013c\3\2\2\2e\u013e\3\2\2\2g\u0140\3\2\2\2i\u0142\3\2"+
		"\2\2k\u0144\3\2\2\2m\u0146\3\2\2\2op\7=\2\2p\4\3\2\2\2qr\7\60\2\2r\6\3"+
		"\2\2\2st\7*\2\2t\b\3\2\2\2uv\7.\2\2v\n\3\2\2\2wx\7+\2\2x\f\3\2\2\2yz\7"+
		",\2\2z\16\3\2\2\2{|\7-\2\2|\20\3\2\2\2}~\7/\2\2~\22\3\2\2\2\177\u0080"+
		"\7?\2\2\u0080\24\3\2\2\2\u0081\u0082\7?\2\2\u0082\u0083\7?\2\2\u0083\26"+
		"\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086\7?\2\2\u0086\30\3\2\2\2\u0087"+
		"\u0088\5? \2\u0088\u0089\5]/\2\u0089\u008a\5C\"\2\u008a\u008b\5;\36\2"+
		"\u008b\u008c\5a\61\2\u008c\u008d\5C\"\2\u008d\32\3\2\2\2\u008e\u008f\5"+
		"a\61\2\u008f\u0090\5;\36\2\u0090\u0091\5=\37\2\u0091\u0092\5Q)\2\u0092"+
		"\u0093\5C\"\2\u0093\34\3\2\2\2\u0094\u0095\5A!\2\u0095\u0096\5]/\2\u0096"+
		"\u0097\5W,\2\u0097\u0098\5Y-\2\u0098\36\3\2\2\2\u0099\u009a\5K&\2\u009a"+
		"\u009b\5U+\2\u009b\u009c\5_\60\2\u009c\u009d\5C\"\2\u009d\u009e\5]/\2"+
		"\u009e\u009f\5a\61\2\u009f \3\2\2\2\u00a0\u00a1\5K&\2\u00a1\u00a2\5U+"+
		"\2\u00a2\u00a3\5a\61\2\u00a3\u00a4\5W,\2\u00a4\"\3\2\2\2\u00a5\u00a6\5"+
		"e\63\2\u00a6\u00a7\5;\36\2\u00a7\u00a8\5Q)\2\u00a8\u00a9\5c\62\2\u00a9"+
		"\u00aa\5C\"\2\u00aa\u00ab\5_\60\2\u00ab$\3\2\2\2\u00ac\u00ad\5A!\2\u00ad"+
		"\u00ae\5C\"\2\u00ae\u00af\5Q)\2\u00af\u00b0\5C\"\2\u00b0\u00b1\5a\61\2"+
		"\u00b1\u00b2\5C\"\2\u00b2&\3\2\2\2\u00b3\u00b4\5E#\2\u00b4\u00b5\5]/\2"+
		"\u00b5\u00b6\5W,\2\u00b6\u00b7\5S*\2\u00b7(\3\2\2\2\u00b8\u00b9\5g\64"+
		"\2\u00b9\u00ba\5I%\2\u00ba\u00bb\5C\"\2\u00bb\u00bc\5]/\2\u00bc\u00bd"+
		"\5C\"\2\u00bd*\3\2\2\2\u00be\u00bf\5_\60\2\u00bf\u00c0\5C\"\2\u00c0\u00c1"+
		"\5Q)\2\u00c1\u00c2\5C\"\2\u00c2\u00c3\5? \2\u00c3\u00c4\5a\61\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\5Q)\2\u00c6\u00c7\5K&\2\u00c7\u00c8\5S*\2\u00c8"+
		"\u00c9\5K&\2\u00c9\u00ca\5a\61\2\u00ca.\3\2\2\2\u00cb\u00cf\t\2\2\2\u00cc"+
		"\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\60\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4"+
		"\59\35\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00de\3\2\2\2\u00d7\u00db\7\60\2\2\u00d8\u00da\5"+
		"9\35\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00d7\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e9\3\2\2\2\u00e0\u00e2\5C\"\2\u00e1"+
		"\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e6\59\35\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00fd\3\2\2\2\u00eb\u00ed\7\60\2\2\u00ec"+
		"\u00ee\59\35\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fa\3\2\2\2\u00f1\u00f3\5C\"\2\u00f2"+
		"\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f7\59\35\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f1\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00d3\3\2\2\2\u00fc"+
		"\u00eb\3\2\2\2\u00fd\62\3\2\2\2\u00fe\u0104\7)\2\2\u00ff\u0103\n\5\2\2"+
		"\u0100\u0101\7)\2\2\u0101\u0103\7)\2\2\u0102\u00ff\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7)\2\2\u0108\64\3\2\2\2"+
		"\u0109\u010b\t\6\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\33\2\2"+
		"\u010f\66\3\2\2\2\u0110\u0111\13\2\2\2\u01118\3\2\2\2\u0112\u0113\t\7"+
		"\2\2\u0113:\3\2\2\2\u0114\u0115\t\b\2\2\u0115<\3\2\2\2\u0116\u0117\t\t"+
		"\2\2\u0117>\3\2\2\2\u0118\u0119\t\n\2\2\u0119@\3\2\2\2\u011a\u011b\t\13"+
		"\2\2\u011bB\3\2\2\2\u011c\u011d\t\f\2\2\u011dD\3\2\2\2\u011e\u011f\t\r"+
		"\2\2\u011fF\3\2\2\2\u0120\u0121\t\16\2\2\u0121H\3\2\2\2\u0122\u0123\t"+
		"\17\2\2\u0123J\3\2\2\2\u0124\u0125\t\20\2\2\u0125L\3\2\2\2\u0126\u0127"+
		"\t\21\2\2\u0127N\3\2\2\2\u0128\u0129\t\22\2\2\u0129P\3\2\2\2\u012a\u012b"+
		"\t\23\2\2\u012bR\3\2\2\2\u012c\u012d\t\24\2\2\u012dT\3\2\2\2\u012e\u012f"+
		"\t\25\2\2\u012fV\3\2\2\2\u0130\u0131\t\26\2\2\u0131X\3\2\2\2\u0132\u0133"+
		"\t\27\2\2\u0133Z\3\2\2\2\u0134\u0135\t\30\2\2\u0135\\\3\2\2\2\u0136\u0137"+
		"\t\31\2\2\u0137^\3\2\2\2\u0138\u0139\t\32\2\2\u0139`\3\2\2\2\u013a\u013b"+
		"\t\33\2\2\u013bb\3\2\2\2\u013c\u013d\t\34\2\2\u013dd\3\2\2\2\u013e\u013f"+
		"\t\35\2\2\u013ff\3\2\2\2\u0140\u0141\t\36\2\2\u0141h\3\2\2\2\u0142\u0143"+
		"\t\37\2\2\u0143j\3\2\2\2\u0144\u0145\t \2\2\u0145l\3\2\2\2\u0146\u0147"+
		"\t!\2\2\u0147n\3\2\2\2\22\2\u00cf\u00d5\u00db\u00de\u00e2\u00e7\u00e9"+
		"\u00ef\u00f3\u00f8\u00fa\u00fc\u0102\u0104\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}