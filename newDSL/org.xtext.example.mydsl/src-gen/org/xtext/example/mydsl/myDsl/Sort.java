/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sort#getSort <em>Sort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sort#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sort#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends Fun
{
  /**
   * Returns the value of the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' attribute.
   * @see #setSort(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSort_Sort()
   * @model
   * @generated
   */
  String getSort();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sort#getSort <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' attribute.
   * @see #getSort()
   * @generated
   */
  void setSort(String value);

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(JSON)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSort_File()
   * @model containment="true"
   * @generated
   */
  JSON getFile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sort#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(JSON value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSort_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sort#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

} // Sort
