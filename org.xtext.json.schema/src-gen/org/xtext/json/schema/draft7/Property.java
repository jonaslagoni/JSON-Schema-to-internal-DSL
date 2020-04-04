/**
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.draft7;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.json.schema.draft7.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.json.schema.draft7.Property#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.json.schema.draft7.Draft7Package#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.json.schema.draft7.Draft7Package#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.json.schema.draft7.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.json.schema.draft7.JsonSchemaRoot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.json.schema.draft7.Draft7Package#getProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<JsonSchemaRoot> getProperties();

} // Property
