/*
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.CountJson;
import org.xtext.example.mydsl.myDsl.Get;
import org.xtext.example.mydsl.myDsl.JSON;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ReadJson;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.Sort;
import org.xtext.example.mydsl.myDsl.WriteCSV;
import org.xtext.example.mydsl.myDsl.WriteJson;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case MyDslPackage.COUNT_JSON:
				sequence_CountJson(context, (CountJson) semanticObject); 
				return; 
			case MyDslPackage.GET:
				sequence_Get(context, (Get) semanticObject); 
				return; 
			case MyDslPackage.JSON:
				sequence_JSON(context, (JSON) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.READ_JSON:
				sequence_ReadJson(context, (ReadJson) semanticObject); 
				return; 
			case MyDslPackage.REMOVE:
				sequence_Remove(context, (Remove) semanticObject); 
				return; 
			case MyDslPackage.SORT:
				sequence_Sort(context, (Sort) semanticObject); 
				return; 
			case MyDslPackage.WRITE_CSV:
				sequence_WriteCSV(context, (WriteCSV) semanticObject); 
				return; 
			case MyDslPackage.WRITE_JSON:
				sequence_WriteJson(context, (WriteJson) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     (addElement='add' file=JSON id=INT)
	 * </pre>
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ADD__ADD_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ADD__ADD_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ADD__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ADD__FILE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ADD__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ADD__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddAccess().getAddElementAddKeyword_0_0(), semanticObject.getAddElement());
		feeder.accept(grammarAccess.getAddAccess().getFileJSONParserRuleCall_2_0(), semanticObject.getFile());
		feeder.accept(grammarAccess.getAddAccess().getIdINTTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns CountJson
	 *     CountJson returns CountJson
	 *
	 * Constraint:
	 *     (countJSON='count' file=JSON)
	 * </pre>
	 */
	protected void sequence_CountJson(ISerializationContext context, CountJson semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.COUNT_JSON__COUNT_JSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.COUNT_JSON__COUNT_JSON));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.COUNT_JSON__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.COUNT_JSON__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0(), semanticObject.getCountJSON());
		feeder.accept(grammarAccess.getCountJsonAccess().getFileJSONParserRuleCall_2_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns Get
	 *     Get returns Get
	 *
	 * Constraint:
	 *     (getElement='get' file=JSON)
	 * </pre>
	 */
	protected void sequence_Get(ISerializationContext context, Get semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GET__GET_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GET__GET_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GET__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GET__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGetAccess().getGetElementGetKeyword_0_0(), semanticObject.getGetElement());
		feeder.accept(grammarAccess.getGetAccess().getFileJSONParserRuleCall_2_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     JSON returns JSON
	 *
	 * Constraint:
	 *     (attribute+=ID+ | (attribute+=STRING (valueSTR+=STRING | valueINT+=INT | valueID+=ID))+)
	 * </pre>
	 */
	protected void sequence_JSON(ISerializationContext context, JSON semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     sentences+=Fun+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns ReadJson
	 *     ReadJson returns ReadJson
	 *
	 * Constraint:
	 *     (readJSON='read' path=STRING)
	 * </pre>
	 */
	protected void sequence_ReadJson(ISerializationContext context, ReadJson semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.READ_JSON__READ_JSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.READ_JSON__READ_JSON));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.READ_JSON__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.READ_JSON__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0(), semanticObject.getReadJSON());
		feeder.accept(grammarAccess.getReadJsonAccess().getPathSTRINGTerminalRuleCall_2_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns Remove
	 *     Remove returns Remove
	 *
	 * Constraint:
	 *     (removeElement='remove' id=INT file=JSON)
	 * </pre>
	 */
	protected void sequence_Remove(ISerializationContext context, Remove semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.REMOVE__REMOVE_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.REMOVE__REMOVE_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.REMOVE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.REMOVE__ID));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.REMOVE__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.REMOVE__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0(), semanticObject.getRemoveElement());
		feeder.accept(grammarAccess.getRemoveAccess().getIdINTTerminalRuleCall_2_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getRemoveAccess().getFileJSONParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns Sort
	 *     Sort returns Sort
	 *
	 * Constraint:
	 *     (sort='sort' file=JSON attribute=STRING)
	 * </pre>
	 */
	protected void sequence_Sort(ISerializationContext context, Sort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SORT__SORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SORT__SORT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SORT__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SORT__FILE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SORT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SORT__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSortAccess().getSortSortKeyword_0_0(), semanticObject.getSort());
		feeder.accept(grammarAccess.getSortAccess().getFileJSONParserRuleCall_1_0(), semanticObject.getFile());
		feeder.accept(grammarAccess.getSortAccess().getAttributeSTRINGTerminalRuleCall_3_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns WriteCSV
	 *     WriteCSV returns WriteCSV
	 *
	 * Constraint:
	 *     (writeCVS='writeCSV' path=STRING file=JSON)
	 * </pre>
	 */
	protected void sequence_WriteCSV(ISerializationContext context, WriteCSV semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_CSV__WRITE_CVS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_CSV__WRITE_CVS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_CSV__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_CSV__PATH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_CSV__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_CSV__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0(), semanticObject.getWriteCVS());
		feeder.accept(grammarAccess.getWriteCSVAccess().getPathSTRINGTerminalRuleCall_2_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getWriteCSVAccess().getFileJSONParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fun returns WriteJson
	 *     WriteJson returns WriteJson
	 *
	 * Constraint:
	 *     (writeJSON='writeJSON' path=STRING file=JSON)
	 * </pre>
	 */
	protected void sequence_WriteJson(ISerializationContext context, WriteJson semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_JSON__WRITE_JSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_JSON__WRITE_JSON));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_JSON__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_JSON__PATH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WRITE_JSON__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WRITE_JSON__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0(), semanticObject.getWriteJSON());
		feeder.accept(grammarAccess.getWriteJsonAccess().getPathSTRINGTerminalRuleCall_2_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getWriteJsonAccess().getFileJSONParserRuleCall_4_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
}
