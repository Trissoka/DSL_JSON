/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.WriteCSV;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.WriteCSVImpl#getWriteCSV <em>Write CSV</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.WriteCSVImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.WriteCSVImpl#getTabName <em>Tab Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.WriteCSVImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.WriteCSVImpl#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteCSVImpl extends FunImpl implements WriteCSV
{
  /**
   * The default value of the '{@link #getWriteCSV() <em>Write CSV</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteCSV()
   * @generated
   * @ordered
   */
  protected static final String WRITE_CSV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWriteCSV() <em>Write CSV</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteCSV()
   * @generated
   * @ordered
   */
  protected String writeCSV = WRITE_CSV_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabName()
   * @generated
   * @ordered
   */
  protected static final String TAB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabName()
   * @generated
   * @ordered
   */
  protected String tabName = TAB_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFile()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFile()
   * @generated
   * @ordered
   */
  protected String outputFile = OUTPUT_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WriteCSVImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.WRITE_CSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWriteCSV()
  {
    return writeCSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWriteCSV(String newWriteCSV)
  {
    String oldWriteCSV = writeCSV;
    writeCSV = newWriteCSV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WRITE_CSV__WRITE_CSV, oldWriteCSV, writeCSV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WRITE_CSV__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTabName()
  {
    return tabName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTabName(String newTabName)
  {
    String oldTabName = tabName;
    tabName = newTabName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WRITE_CSV__TAB_NAME, oldTabName, tabName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeader(String newHeader)
  {
    String oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WRITE_CSV__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOutputFile()
  {
    return outputFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOutputFile(String newOutputFile)
  {
    String oldOutputFile = outputFile;
    outputFile = newOutputFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.WRITE_CSV__OUTPUT_FILE, oldOutputFile, outputFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.WRITE_CSV__WRITE_CSV:
        return getWriteCSV();
      case MyDslPackage.WRITE_CSV__PATH:
        return getPath();
      case MyDslPackage.WRITE_CSV__TAB_NAME:
        return getTabName();
      case MyDslPackage.WRITE_CSV__HEADER:
        return getHeader();
      case MyDslPackage.WRITE_CSV__OUTPUT_FILE:
        return getOutputFile();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.WRITE_CSV__WRITE_CSV:
        setWriteCSV((String)newValue);
        return;
      case MyDslPackage.WRITE_CSV__PATH:
        setPath((String)newValue);
        return;
      case MyDslPackage.WRITE_CSV__TAB_NAME:
        setTabName((String)newValue);
        return;
      case MyDslPackage.WRITE_CSV__HEADER:
        setHeader((String)newValue);
        return;
      case MyDslPackage.WRITE_CSV__OUTPUT_FILE:
        setOutputFile((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.WRITE_CSV__WRITE_CSV:
        setWriteCSV(WRITE_CSV_EDEFAULT);
        return;
      case MyDslPackage.WRITE_CSV__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case MyDslPackage.WRITE_CSV__TAB_NAME:
        setTabName(TAB_NAME_EDEFAULT);
        return;
      case MyDslPackage.WRITE_CSV__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case MyDslPackage.WRITE_CSV__OUTPUT_FILE:
        setOutputFile(OUTPUT_FILE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.WRITE_CSV__WRITE_CSV:
        return WRITE_CSV_EDEFAULT == null ? writeCSV != null : !WRITE_CSV_EDEFAULT.equals(writeCSV);
      case MyDslPackage.WRITE_CSV__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case MyDslPackage.WRITE_CSV__TAB_NAME:
        return TAB_NAME_EDEFAULT == null ? tabName != null : !TAB_NAME_EDEFAULT.equals(tabName);
      case MyDslPackage.WRITE_CSV__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case MyDslPackage.WRITE_CSV__OUTPUT_FILE:
        return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (writeCSV: ");
    result.append(writeCSV);
    result.append(", path: ");
    result.append(path);
    result.append(", tabName: ");
    result.append(tabName);
    result.append(", header: ");
    result.append(header);
    result.append(", outputFile: ");
    result.append(outputFile);
    result.append(')');
    return result.toString();
  }

} //WriteCSVImpl
