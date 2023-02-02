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
			builder.put(grammarAccess.getTypeReferenceAccess().getAlternatives(), "rule__TypeReference__Alternatives");
			builder.put(grammarAccess.getTypeJSONAccess().getAlternatives(), "rule__TypeJSON__Alternatives");
			builder.put(grammarAccess.getCountJsonAccess().getGroup(), "rule__CountJson__Group__0");
			builder.put(grammarAccess.getReadJsonAccess().getGroup(), "rule__ReadJson__Group__0");
			builder.put(grammarAccess.getPrintJsonAccess().getGroup(), "rule__PrintJson__Group__0");
			builder.put(grammarAccess.getWriteJsonAccess().getGroup(), "rule__WriteJson__Group__0");
			builder.put(grammarAccess.getWriteJsonAccess().getGroup_3(), "rule__WriteJson__Group_3__0");
			builder.put(grammarAccess.getWriteCSVAccess().getGroup(), "rule__WriteCSV__Group__0");
			builder.put(grammarAccess.getWriteCSVAccess().getGroup_3(), "rule__WriteCSV__Group_3__0");
			builder.put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getGetAccess().getGroup(), "rule__Get__Group__0");
			builder.put(grammarAccess.getSortAccess().getGroup(), "rule__Sort__Group__0");
			builder.put(grammarAccess.getShowAccess().getGroup(), "rule__Show__Group__0");
			builder.put(grammarAccess.getShowAccess().getGroup_1(), "rule__Show__Group_1__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_0(), "rule__TypeJSON__Group_0__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_0_1(), "rule__TypeJSON__Group_0_1__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_1(), "rule__TypeJSON__Group_1__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_1_1(), "rule__TypeJSON__Group_1_1__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_2(), "rule__TypeJSON__Group_2__0");
			builder.put(grammarAccess.getTypeJSONAccess().getGroup_2_1(), "rule__TypeJSON__Group_2_1__0");
			builder.put(grammarAccess.getModelAccess().getSentencesAssignment(), "rule__Model__SentencesAssignment");
			builder.put(grammarAccess.getCountJsonAccess().getCountJSONAssignment_0(), "rule__CountJson__CountJSONAssignment_0");
			builder.put(grammarAccess.getCountJsonAccess().getValueAssignment_2(), "rule__CountJson__ValueAssignment_2");
			builder.put(grammarAccess.getReadJsonAccess().getReadJSONAssignment_0(), "rule__ReadJson__ReadJSONAssignment_0");
			builder.put(grammarAccess.getReadJsonAccess().getPathAssignment_2(), "rule__ReadJson__PathAssignment_2");
			builder.put(grammarAccess.getPrintJsonAccess().getPrintJsonAssignment_0(), "rule__PrintJson__PrintJsonAssignment_0");
			builder.put(grammarAccess.getPrintJsonAccess().getValueAssignment_2(), "rule__PrintJson__ValueAssignment_2");
			builder.put(grammarAccess.getWriteJsonAccess().getWriteJSONAssignment_0(), "rule__WriteJson__WriteJSONAssignment_0");
			builder.put(grammarAccess.getWriteJsonAccess().getPathAssignment_2(), "rule__WriteJson__PathAssignment_2");
			builder.put(grammarAccess.getWriteJsonAccess().getValueAssignment_3_1(), "rule__WriteJson__ValueAssignment_3_1");
			builder.put(grammarAccess.getWriteCSVAccess().getWriteCVSAssignment_0(), "rule__WriteCSV__WriteCVSAssignment_0");
			builder.put(grammarAccess.getWriteCSVAccess().getPathAssignment_2(), "rule__WriteCSV__PathAssignment_2");
			builder.put(grammarAccess.getWriteCSVAccess().getValueAssignment_3_1(), "rule__WriteCSV__ValueAssignment_3_1");
			builder.put(grammarAccess.getRemoveAccess().getRemoveElementAssignment_0(), "rule__Remove__RemoveElementAssignment_0");
			builder.put(grammarAccess.getRemoveAccess().getIdAssignment_2(), "rule__Remove__IdAssignment_2");
			builder.put(grammarAccess.getAddAccess().getAddElementAssignment_0(), "rule__Add__AddElementAssignment_0");
			builder.put(grammarAccess.getAddAccess().getValueAssignment_2(), "rule__Add__ValueAssignment_2");
			builder.put(grammarAccess.getGetAccess().getGetElementAssignment_0(), "rule__Get__GetElementAssignment_0");
			builder.put(grammarAccess.getGetAccess().getIdAssignment_2(), "rule__Get__IdAssignment_2");
			builder.put(grammarAccess.getSortAccess().getSortAssignment_0(), "rule__Sort__SortAssignment_0");
			builder.put(grammarAccess.getSortAccess().getValueAssignment_1(), "rule__Sort__ValueAssignment_1");
			builder.put(grammarAccess.getSortAccess().getAttributeAssignment_3(), "rule__Sort__AttributeAssignment_3");
			builder.put(grammarAccess.getShowAccess().getShowAssignment_0(), "rule__Show__ShowAssignment_0");
			builder.put(grammarAccess.getShowAccess().getNameAssignment_1_1(), "rule__Show__NameAssignment_1_1");
			builder.put(grammarAccess.getTypeIntAccess().getValAssignment(), "rule__TypeInt__ValAssignment");
			builder.put(grammarAccess.getTypeStringAccess().getValAssignment(), "rule__TypeString__ValAssignment");
			builder.put(grammarAccess.getTypeJSONAccess().getAttributeAssignment_0_1_0(), "rule__TypeJSON__AttributeAssignment_0_1_0");
			builder.put(grammarAccess.getTypeJSONAccess().getValueAssignment_0_1_2(), "rule__TypeJSON__ValueAssignment_0_1_2");
			builder.put(grammarAccess.getTypeJSONAccess().getAttributeAssignment_1_1_0(), "rule__TypeJSON__AttributeAssignment_1_1_0");
			builder.put(grammarAccess.getTypeJSONAccess().getValueAssignment_1_1_3(), "rule__TypeJSON__ValueAssignment_1_1_3");
			builder.put(grammarAccess.getTypeJSONAccess().getAttributeAssignment_2_1_0(), "rule__TypeJSON__AttributeAssignment_2_1_0");
			builder.put(grammarAccess.getTypeJSONAccess().getValueAssignment_2_1_4(), "rule__TypeJSON__ValueAssignment_2_1_4");
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
