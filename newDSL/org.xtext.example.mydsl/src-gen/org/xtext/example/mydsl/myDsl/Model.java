/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Fun}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<Fun> getSentences();

} // Model
