/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.FUN: return createFun();
      case MyDslPackage.COUNT_JSON: return createCountJson();
      case MyDslPackage.READ_JSON: return createReadJson();
      case MyDslPackage.PRINT_JSON: return createPrintJson();
      case MyDslPackage.WRITE_JSON: return createWriteJson();
      case MyDslPackage.WRITE_CSV: return createWriteCSV();
      case MyDslPackage.REMOVE: return createRemove();
      case MyDslPackage.ADD: return createAdd();
      case MyDslPackage.GET: return createGet();
      case MyDslPackage.SORT: return createSort();
      case MyDslPackage.SHOW: return createShow();
      case MyDslPackage.TYPE_REFERENCE: return createTypeReference();
      case MyDslPackage.TYPE_INT: return createTypeInt();
      case MyDslPackage.TYPE_STRING: return createTypeString();
      case MyDslPackage.TYPE_JSON: return createTypeJSON();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fun createFun()
  {
    FunImpl fun = new FunImpl();
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CountJson createCountJson()
  {
    CountJsonImpl countJson = new CountJsonImpl();
    return countJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadJson createReadJson()
  {
    ReadJsonImpl readJson = new ReadJsonImpl();
    return readJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintJson createPrintJson()
  {
    PrintJsonImpl printJson = new PrintJsonImpl();
    return printJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteJson createWriteJson()
  {
    WriteJsonImpl writeJson = new WriteJsonImpl();
    return writeJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WriteCSV createWriteCSV()
  {
    WriteCSVImpl writeCSV = new WriteCSVImpl();
    return writeCSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Remove createRemove()
  {
    RemoveImpl remove = new RemoveImpl();
    return remove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Get createGet()
  {
    GetImpl get = new GetImpl();
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sort createSort()
  {
    SortImpl sort = new SortImpl();
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Show createShow()
  {
    ShowImpl show = new ShowImpl();
    return show;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeInt createTypeInt()
  {
    TypeIntImpl typeInt = new TypeIntImpl();
    return typeInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeString createTypeString()
  {
    TypeStringImpl typeString = new TypeStringImpl();
    return typeString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeJSON createTypeJSON()
  {
    TypeJSONImpl typeJSON = new TypeJSONImpl();
    return typeJSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
