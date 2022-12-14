/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Add#getAddElement <em>Add Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Add#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Add#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Fun
{
  /**
   * Returns the value of the '<em><b>Add Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Element</em>' attribute.
   * @see #setAddElement(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdd_AddElement()
   * @model
   * @generated
   */
  String getAddElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Add#getAddElement <em>Add Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Element</em>' attribute.
   * @see #getAddElement()
   * @generated
   */
  void setAddElement(String value);

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(JSON)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdd_File()
   * @model containment="true"
   * @generated
   */
  JSON getFile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Add#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(JSON value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdd_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Add#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

} // Add
