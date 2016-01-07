/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ��������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ��������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExcludeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ReadOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl#getInvalidValueConstant <em>Invalid Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl#getReadValueVariable <em>Read Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl#getReadStatusVariable <em>Read Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ReadOperationImpl#getExcludeOperation <em>Exclude Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReadOperationImpl extends OperationImpl implements ReadOperation {
	/**
	 * The cached value of the '{@link #getInvalidValueConstant() <em>Invalid Value Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValueConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant invalidValueConstant;
	/**
	 * The cached value of the '{@link #getReadValueVariable() <em>Read Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadValueVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable readValueVariable;
	/**
	 * The cached value of the '{@link #getReadStatusVariable() <em>Read Status Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadStatusVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable readStatusVariable;

	/**
	 * The cached value of the '{@link #getExcludeOperation() <em>Exclude Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOperation()
	 * @generated
	 * @ordered
	 */
	protected ExcludeOperation excludeOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.READ_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getInvalidValueConstant() {
		if (invalidValueConstant != null && ((EObject)invalidValueConstant).eIsProxy()) {
			InternalEObject oldInvalidValueConstant = (InternalEObject)invalidValueConstant;
			invalidValueConstant = (Constant)eResolveProxy(oldInvalidValueConstant);
			if (invalidValueConstant != oldInvalidValueConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT, oldInvalidValueConstant, invalidValueConstant));
			}
		}
		return invalidValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetInvalidValueConstant() {
		return invalidValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidValueConstant(Constant newInvalidValueConstant) {
		Constant oldInvalidValueConstant = invalidValueConstant;
		invalidValueConstant = newInvalidValueConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT, oldInvalidValueConstant, invalidValueConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReadValueVariable() {
		if (readValueVariable != null && ((EObject)readValueVariable).eIsProxy()) {
			InternalEObject oldReadValueVariable = (InternalEObject)readValueVariable;
			readValueVariable = (Variable)eResolveProxy(oldReadValueVariable);
			if (readValueVariable != oldReadValueVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
			}
		}
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReadValueVariable() {
		return readValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadValueVariable(Variable newReadValueVariable) {
		Variable oldReadValueVariable = readValueVariable;
		readValueVariable = newReadValueVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE, oldReadValueVariable, readValueVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReadStatusVariable() {
		if (readStatusVariable != null && ((EObject)readStatusVariable).eIsProxy()) {
			InternalEObject oldReadStatusVariable = (InternalEObject)readStatusVariable;
			readStatusVariable = (Variable)eResolveProxy(oldReadStatusVariable);
			if (readStatusVariable != oldReadStatusVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE, oldReadStatusVariable, readStatusVariable));
			}
		}
		return readStatusVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReadStatusVariable() {
		return readStatusVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadStatusVariable(Variable newReadStatusVariable) {
		Variable oldReadStatusVariable = readStatusVariable;
		readStatusVariable = newReadStatusVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE, oldReadStatusVariable, readStatusVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeOperation getExcludeOperation() {
		return excludeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeOperation(ExcludeOperation newExcludeOperation, NotificationChain msgs) {
		ExcludeOperation oldExcludeOperation = excludeOperation;
		excludeOperation = newExcludeOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.READ_OPERATION__EXCLUDE_OPERATION, oldExcludeOperation, newExcludeOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeOperation(ExcludeOperation newExcludeOperation) {
		if (newExcludeOperation != excludeOperation) {
			NotificationChain msgs = null;
			if (excludeOperation != null)
				msgs = ((InternalEObject)excludeOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.READ_OPERATION__EXCLUDE_OPERATION, null, msgs);
			if (newExcludeOperation != null)
				msgs = ((InternalEObject)newExcludeOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.READ_OPERATION__EXCLUDE_OPERATION, null, msgs);
			msgs = basicSetExcludeOperation(newExcludeOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.READ_OPERATION__EXCLUDE_OPERATION, newExcludeOperation, newExcludeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.READ_OPERATION__EXCLUDE_OPERATION:
				return basicSetExcludeOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT:
				if (resolve) return getInvalidValueConstant();
				return basicGetInvalidValueConstant();
			case ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE:
				if (resolve) return getReadValueVariable();
				return basicGetReadValueVariable();
			case ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE:
				if (resolve) return getReadStatusVariable();
				return basicGetReadStatusVariable();
			case ModulePackage.READ_OPERATION__EXCLUDE_OPERATION:
				return getExcludeOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT:
				setInvalidValueConstant((Constant)newValue);
				return;
			case ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)newValue);
				return;
			case ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE:
				setReadStatusVariable((Variable)newValue);
				return;
			case ModulePackage.READ_OPERATION__EXCLUDE_OPERATION:
				setExcludeOperation((ExcludeOperation)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT:
				setInvalidValueConstant((Constant)null);
				return;
			case ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE:
				setReadValueVariable((Variable)null);
				return;
			case ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE:
				setReadStatusVariable((Variable)null);
				return;
			case ModulePackage.READ_OPERATION__EXCLUDE_OPERATION:
				setExcludeOperation((ExcludeOperation)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModulePackage.READ_OPERATION__INVALID_VALUE_CONSTANT:
				return invalidValueConstant != null;
			case ModulePackage.READ_OPERATION__READ_VALUE_VARIABLE:
				return readValueVariable != null;
			case ModulePackage.READ_OPERATION__READ_STATUS_VARIABLE:
				return readStatusVariable != null;
			case ModulePackage.READ_OPERATION__EXCLUDE_OPERATION:
				return excludeOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //ReadOperationImpl