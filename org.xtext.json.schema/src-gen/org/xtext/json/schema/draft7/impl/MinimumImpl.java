/**
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.draft7.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.json.schema.draft7.Draft7Package;
import org.xtext.json.schema.draft7.Minimum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.json.schema.draft7.impl.MinimumImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimumImpl extends MinimalEObjectImpl.Container implements Minimum
{
  /**
   * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected static final int MINIMUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected int minimum = MINIMUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinimumImpl()
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
    return Draft7Package.Literals.MINIMUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinimum()
  {
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinimum(int newMinimum)
  {
    int oldMinimum = minimum;
    minimum = newMinimum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Draft7Package.MINIMUM__MINIMUM, oldMinimum, minimum));
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
      case Draft7Package.MINIMUM__MINIMUM:
        return getMinimum();
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
      case Draft7Package.MINIMUM__MINIMUM:
        setMinimum((Integer)newValue);
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
      case Draft7Package.MINIMUM__MINIMUM:
        setMinimum(MINIMUM_EDEFAULT);
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
      case Draft7Package.MINIMUM__MINIMUM:
        return minimum != MINIMUM_EDEFAULT;
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
    result.append(" (minimum: ");
    result.append(minimum);
    result.append(')');
    return result.toString();
  }

} //MinimumImpl
