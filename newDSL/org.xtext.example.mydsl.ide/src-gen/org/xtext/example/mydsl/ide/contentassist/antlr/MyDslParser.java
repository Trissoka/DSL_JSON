/*
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFunAccess().getAlternatives(), "rule__Fun__Alternatives");
			builder.put(grammarAccess.getJSONAccess().getAlternatives(), "rule__JSON__Alternatives");
			builder.put(grammarAccess.getJSONAccess().getAlternatives_1_1_2(), "rule__JSON__Alternatives_1_1_2");
			builder.put(grammarAccess.getCountJsonAccess().getGroup(), "rule__CountJson__Group__0");
			builder.put(grammarAccess.getReadJsonAccess().getGroup(), "rule__ReadJson__Group__0");
			builder.put(grammarAccess.getWriteJsonAccess().getGroup(), "rule__WriteJson__Group__0");
			builder.put(grammarAccess.getWriteCSVAccess().getGroup(), "rule__WriteCSV__Group__0");
			builder.put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getGetAccess().getGroup(), "rule__Get__Group__0");
			builder.put(grammarAccess.getSortAccess().getGroup(), "rule__Sort__Group__0");
			builder.put(grammarAccess.getJSONAccess().getGroup_0(), "rule__JSON__Group_0__0");
			builder.put(grammarAccess.getJSONAccess().getGroup_0_1(), "rule__JSON__Group_0_1__0");
			builder.put(grammarAccess.getJSONAccess().getGroup_1(), "rule__JSON__Group_1__0");
			builder.put(grammarAccess.getJSONAccess().getGroup_1_1(), "rule__JSON__Group_1_1__0");
			builder.put(grammarAccess.getModelAccess().getSentencesAssignment(), "rule__Model__SentencesAssignment");
			builder.put(grammarAccess.getCountJsonAccess().getCountJSONAssignment_0(), "rule__CountJson__CountJSONAssignment_0");
			builder.put(grammarAccess.getCountJsonAccess().getFileAssignment_2(), "rule__CountJson__FileAssignment_2");
			builder.put(grammarAccess.getReadJsonAccess().getReadJSONAssignment_0(), "rule__ReadJson__ReadJSONAssignment_0");
			builder.put(grammarAccess.getReadJsonAccess().getPathAssignment_2(), "rule__ReadJson__PathAssignment_2");
			builder.put(grammarAccess.getWriteJsonAccess().getWriteJSONAssignment_0(), "rule__WriteJson__WriteJSONAssignment_0");
			builder.put(grammarAccess.getWriteJsonAccess().getPathAssignment_2(), "rule__WriteJson__PathAssignment_2");
			builder.put(grammarAccess.getWriteJsonAccess().getFileAssignment_4(), "rule__WriteJson__FileAssignment_4");
			builder.put(grammarAccess.getWriteCSVAccess().getWriteCVSAssignment_0(), "rule__WriteCSV__WriteCVSAssignment_0");
			builder.put(grammarAccess.getWriteCSVAccess().getPathAssignment_2(), "rule__WriteCSV__PathAssignment_2");
			builder.put(grammarAccess.getWriteCSVAccess().getFileAssignment_4(), "rule__WriteCSV__FileAssignment_4");
			builder.put(grammarAccess.getRemoveAccess().getRemoveElementAssignment_0(), "rule__Remove__RemoveElementAssignment_0");
			builder.put(grammarAccess.getRemoveAccess().getIdAssignment_2(), "rule__Remove__IdAssignment_2");
			builder.put(grammarAccess.getRemoveAccess().getFileAssignment_4(), "rule__Remove__FileAssignment_4");
			builder.put(grammarAccess.getAddAccess().getAddElementAssignment_0(), "rule__Add__AddElementAssignment_0");
			builder.put(grammarAccess.getAddAccess().getFileAssignment_2(), "rule__Add__FileAssignment_2");
			builder.put(grammarAccess.getAddAccess().getIdAssignment_4(), "rule__Add__IdAssignment_4");
			builder.put(grammarAccess.getGetAccess().getGetElementAssignment_0(), "rule__Get__GetElementAssignment_0");
			builder.put(grammarAccess.getGetAccess().getFileAssignment_2(), "rule__Get__FileAssignment_2");
			builder.put(grammarAccess.getSortAccess().getSortAssignment_0(), "rule__Sort__SortAssignment_0");
			builder.put(grammarAccess.getSortAccess().getFileAssignment_1(), "rule__Sort__FileAssignment_1");
			builder.put(grammarAccess.getSortAccess().getAttributeAssignment_3(), "rule__Sort__AttributeAssignment_3");
			builder.put(grammarAccess.getJSONAccess().getAttributeAssignment_0_1_0(), "rule__JSON__AttributeAssignment_0_1_0");
			builder.put(grammarAccess.getJSONAccess().getAttributeAssignment_1_1_0(), "rule__JSON__AttributeAssignment_1_1_0");
			builder.put(grammarAccess.getJSONAccess().getValueSTRAssignment_1_1_2_0(), "rule__JSON__ValueSTRAssignment_1_1_2_0");
			builder.put(grammarAccess.getJSONAccess().getValueINTAssignment_1_1_2_1(), "rule__JSON__ValueINTAssignment_1_1_2_1");
			builder.put(grammarAccess.getJSONAccess().getValueIDAssignment_1_1_2_2(), "rule__JSON__ValueIDAssignment_1_1_2_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}