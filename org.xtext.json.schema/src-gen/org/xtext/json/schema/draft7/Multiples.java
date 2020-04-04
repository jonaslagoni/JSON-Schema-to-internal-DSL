/**
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.draft7;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.json.schema.draft7.Multiples#getMultipleOf <em>Multiple Of</em>}</li>
 * </ul>
 *
 * @see org.xtext.json.schema.draft7.Draft7Package#getMultiples()
 * @model
 * @generated
 */
public interface Multiples extends NumberProperties
{
  /**
   * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple Of</em>' attribute.
   * @see #setMultipleOf(int)
   * @see org.xtext.json.schema.draft7.Draft7Package#getMultiples_MultipleOf()
   * @model
   * @generated
   */
  int getMultipleOf();

  /**
   * Sets the value of the '{@link org.xtext.json.schema.draft7.Multiples#getMultipleOf <em>Multiple Of</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple Of</em>' attribute.
   * @see #getMultipleOf()
   * @generated
   */
  void setMultipleOf(int value);

} // Multiples
