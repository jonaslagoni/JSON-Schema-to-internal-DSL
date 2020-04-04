/**
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.draft7.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.json.schema.draft7.Draft7Factory;
import org.xtext.json.schema.draft7.Draft7Package;
import org.xtext.json.schema.draft7.ExclusiveMaximum;
import org.xtext.json.schema.draft7.ExclusiveMinimum;
import org.xtext.json.schema.draft7.JsonSchemaRoot;
import org.xtext.json.schema.draft7.Length;
import org.xtext.json.schema.draft7.Maximum;
import org.xtext.json.schema.draft7.Minimum;
import org.xtext.json.schema.draft7.Model;
import org.xtext.json.schema.draft7.Multiples;
import org.xtext.json.schema.draft7.NumberProperties;
import org.xtext.json.schema.draft7.ObjectProperties;
import org.xtext.json.schema.draft7.Pattern;
import org.xtext.json.schema.draft7.Properties;
import org.xtext.json.schema.draft7.Property;
import org.xtext.json.schema.draft7.RequiredProperties;
import org.xtext.json.schema.draft7.RequiredPropertiesName;
import org.xtext.json.schema.draft7.StringProperties;
import org.xtext.json.schema.draft7.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Draft7PackageImpl extends EPackageImpl implements Draft7Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonSchemaRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredPropertiesNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minimumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusiveMinimumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maximumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusiveMaximumEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.json.schema.draft7.Draft7Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Draft7PackageImpl()
  {
    super(eNS_URI, Draft7Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link Draft7Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Draft7Package init()
  {
    if (isInited) return (Draft7Package)EPackage.Registry.INSTANCE.getEPackage(Draft7Package.eNS_URI);

    // Obtain or create and register package
    Object registeredDraft7Package = EPackage.Registry.INSTANCE.get(eNS_URI);
    Draft7PackageImpl theDraft7Package = registeredDraft7Package instanceof Draft7PackageImpl ? (Draft7PackageImpl)registeredDraft7Package : new Draft7PackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDraft7Package.createPackageContents();

    // Initialize created meta-data
    theDraft7Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDraft7Package.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Draft7Package.eNS_URI, theDraft7Package);
    return theDraft7Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Root()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonSchemaRoot()
  {
    return jsonSchemaRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonSchemaRoot_Type()
  {
    return (EReference)jsonSchemaRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumberProperties()
  {
    return numberPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumberProperties_Minimum()
  {
    return (EReference)numberPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumberProperties_ExclusiveMinimum()
  {
    return (EReference)numberPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumberProperties_Maximum()
  {
    return (EReference)numberPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumberProperties_ExclusiveMaximum()
  {
    return (EReference)numberPropertiesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getType_Types()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getType_Type()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObjectProperties()
  {
    return objectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectProperties_Properties()
  {
    return (EReference)objectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectProperties_RequiredProperties()
  {
    return (EReference)objectPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequiredProperties()
  {
    return requiredPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRequiredProperties_RequiredProperties()
  {
    return (EReference)requiredPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequiredPropertiesName()
  {
    return requiredPropertiesNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredPropertiesName_Name()
  {
    return (EAttribute)requiredPropertiesNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProperties()
  {
    return propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProperties_Properties()
  {
    return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProperty_Properties()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringProperties()
  {
    return stringPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStringProperties_Length()
  {
    return (EReference)stringPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStringProperties_Pattern()
  {
    return (EReference)stringPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLength()
  {
    return lengthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLength_Length()
  {
    return (EAttribute)lengthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPattern_Pattern()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiples()
  {
    return multiplesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiples_MultipleOf()
  {
    return (EAttribute)multiplesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinimum()
  {
    return minimumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMinimum_Minimum()
  {
    return (EAttribute)minimumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExclusiveMinimum()
  {
    return exclusiveMinimumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExclusiveMinimum_ExclusiveMinimum()
  {
    return (EAttribute)exclusiveMinimumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMaximum()
  {
    return maximumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMaximum_Maximum()
  {
    return (EAttribute)maximumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExclusiveMaximum()
  {
    return exclusiveMaximumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExclusiveMaximum_ExclusiveMaximum()
  {
    return (EAttribute)exclusiveMaximumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Draft7Factory getDraft7Factory()
  {
    return (Draft7Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ROOT);

    jsonSchemaRootEClass = createEClass(JSON_SCHEMA_ROOT);
    createEReference(jsonSchemaRootEClass, JSON_SCHEMA_ROOT__TYPE);

    numberPropertiesEClass = createEClass(NUMBER_PROPERTIES);
    createEReference(numberPropertiesEClass, NUMBER_PROPERTIES__MINIMUM);
    createEReference(numberPropertiesEClass, NUMBER_PROPERTIES__EXCLUSIVE_MINIMUM);
    createEReference(numberPropertiesEClass, NUMBER_PROPERTIES__MAXIMUM);
    createEReference(numberPropertiesEClass, NUMBER_PROPERTIES__EXCLUSIVE_MAXIMUM);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__TYPES);
    createEAttribute(typeEClass, TYPE__TYPE);

    objectPropertiesEClass = createEClass(OBJECT_PROPERTIES);
    createEReference(objectPropertiesEClass, OBJECT_PROPERTIES__PROPERTIES);
    createEReference(objectPropertiesEClass, OBJECT_PROPERTIES__REQUIRED_PROPERTIES);

    requiredPropertiesEClass = createEClass(REQUIRED_PROPERTIES);
    createEReference(requiredPropertiesEClass, REQUIRED_PROPERTIES__REQUIRED_PROPERTIES);

    requiredPropertiesNameEClass = createEClass(REQUIRED_PROPERTIES_NAME);
    createEAttribute(requiredPropertiesNameEClass, REQUIRED_PROPERTIES_NAME__NAME);

    propertiesEClass = createEClass(PROPERTIES);
    createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__PROPERTIES);

    stringPropertiesEClass = createEClass(STRING_PROPERTIES);
    createEReference(stringPropertiesEClass, STRING_PROPERTIES__LENGTH);
    createEReference(stringPropertiesEClass, STRING_PROPERTIES__PATTERN);

    lengthEClass = createEClass(LENGTH);
    createEAttribute(lengthEClass, LENGTH__LENGTH);

    patternEClass = createEClass(PATTERN);
    createEAttribute(patternEClass, PATTERN__PATTERN);

    multiplesEClass = createEClass(MULTIPLES);
    createEAttribute(multiplesEClass, MULTIPLES__MULTIPLE_OF);

    minimumEClass = createEClass(MINIMUM);
    createEAttribute(minimumEClass, MINIMUM__MINIMUM);

    exclusiveMinimumEClass = createEClass(EXCLUSIVE_MINIMUM);
    createEAttribute(exclusiveMinimumEClass, EXCLUSIVE_MINIMUM__EXCLUSIVE_MINIMUM);

    maximumEClass = createEClass(MAXIMUM);
    createEAttribute(maximumEClass, MAXIMUM__MAXIMUM);

    exclusiveMaximumEClass = createEClass(EXCLUSIVE_MAXIMUM);
    createEAttribute(exclusiveMaximumEClass, EXCLUSIVE_MAXIMUM__EXCLUSIVE_MAXIMUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    numberPropertiesEClass.getESuperTypes().add(this.getJsonSchemaRoot());
    objectPropertiesEClass.getESuperTypes().add(this.getJsonSchemaRoot());
    stringPropertiesEClass.getESuperTypes().add(this.getJsonSchemaRoot());
    multiplesEClass.getESuperTypes().add(this.getNumberProperties());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Root(), this.getJsonSchemaRoot(), null, "root", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonSchemaRootEClass, JsonSchemaRoot.class, "JsonSchemaRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonSchemaRoot_Type(), this.getType(), null, "type", null, 0, 1, JsonSchemaRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberPropertiesEClass, NumberProperties.class, "NumberProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberProperties_Minimum(), this.getMinimum(), null, "minimum", null, 0, 1, NumberProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberProperties_ExclusiveMinimum(), this.getExclusiveMinimum(), null, "exclusiveMinimum", null, 0, 1, NumberProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberProperties_Maximum(), this.getMaximum(), null, "maximum", null, 0, 1, NumberProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberProperties_ExclusiveMaximum(), this.getExclusiveMaximum(), null, "exclusiveMaximum", null, 0, 1, NumberProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Types(), ecorePackage.getEString(), "types", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Type(), ecorePackage.getEString(), "type", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertiesEClass, ObjectProperties.class, "ObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectProperties_Properties(), this.getProperties(), null, "properties", null, 0, 1, ObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectProperties_RequiredProperties(), this.getRequiredProperties(), null, "requiredProperties", null, 0, 1, ObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredPropertiesEClass, RequiredProperties.class, "RequiredProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequiredProperties_RequiredProperties(), this.getRequiredPropertiesName(), null, "requiredProperties", null, 0, -1, RequiredProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredPropertiesNameEClass, RequiredPropertiesName.class, "RequiredPropertiesName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequiredPropertiesName_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequiredPropertiesName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Properties(), this.getJsonSchemaRoot(), null, "properties", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringPropertiesEClass, StringProperties.class, "StringProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringProperties_Length(), this.getLength(), null, "length", null, 0, 1, StringProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringProperties_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, StringProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLength_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPattern_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplesEClass, Multiples.class, "Multiples", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiples_MultipleOf(), ecorePackage.getEInt(), "multipleOf", null, 0, 1, Multiples.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minimumEClass, Minimum.class, "Minimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMinimum_Minimum(), ecorePackage.getEInt(), "minimum", null, 0, 1, Minimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exclusiveMinimumEClass, ExclusiveMinimum.class, "ExclusiveMinimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExclusiveMinimum_ExclusiveMinimum(), ecorePackage.getEInt(), "exclusiveMinimum", null, 0, 1, ExclusiveMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maximumEClass, Maximum.class, "Maximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMaximum_Maximum(), ecorePackage.getEInt(), "maximum", null, 0, 1, Maximum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exclusiveMaximumEClass, ExclusiveMaximum.class, "ExclusiveMaximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExclusiveMaximum_ExclusiveMaximum(), ecorePackage.getEInt(), "exclusiveMaximum", null, 0, 1, ExclusiveMaximum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Draft7PackageImpl
