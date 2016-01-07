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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Addr Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl#getMemoryAllocationKeywordPolicy <em>Memory Allocation Keyword Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl#getSectionInitializationPolicy <em>Section Initialization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwAddrMethodImpl extends ArElementImpl implements SwAddrMethod {
	/**
	 * The default value of the '{@link #getMemoryAllocationKeywordPolicy() <em>Memory Allocation Keyword Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAllocationKeywordPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryAllocationKeywordPolicyType MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT = MemoryAllocationKeywordPolicyType.ADDR_METHOD_SHORT_NAME;

	/**
	 * The cached value of the '{@link #getMemoryAllocationKeywordPolicy() <em>Memory Allocation Keyword Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAllocationKeywordPolicy()
	 * @generated
	 * @ordered
	 */
	protected MemoryAllocationKeywordPolicyType memoryAllocationKeywordPolicy = MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionInitializationPolicy() <em>Section Initialization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_INITIALIZATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionInitializationPolicy() <em>Section Initialization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String sectionInitializationPolicy = SECTION_INITIALIZATION_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwAddrMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_ADDR_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAllocationKeywordPolicyType getMemoryAllocationKeywordPolicy() {
		return memoryAllocationKeywordPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryAllocationKeywordPolicy(MemoryAllocationKeywordPolicyType newMemoryAllocationKeywordPolicy) {
		MemoryAllocationKeywordPolicyType oldMemoryAllocationKeywordPolicy = memoryAllocationKeywordPolicy;
		memoryAllocationKeywordPolicy = newMemoryAllocationKeywordPolicy == null ? MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT : newMemoryAllocationKeywordPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY, oldMemoryAllocationKeywordPolicy, memoryAllocationKeywordPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionInitializationPolicy() {
		return sectionInitializationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionInitializationPolicy(String newSectionInitializationPolicy) {
		String oldSectionInitializationPolicy = sectionInitializationPolicy;
		sectionInitializationPolicy = newSectionInitializationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY, oldSectionInitializationPolicy, sectionInitializationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				return getMemoryAllocationKeywordPolicy();
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				return getSectionInitializationPolicy();
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
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				setMemoryAllocationKeywordPolicy((MemoryAllocationKeywordPolicyType)newValue);
				return;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				setSectionInitializationPolicy((String)newValue);
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
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				setMemoryAllocationKeywordPolicy(MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT);
				return;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				setSectionInitializationPolicy(SECTION_INITIALIZATION_POLICY_EDEFAULT);
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
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				return memoryAllocationKeywordPolicy != MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				return SECTION_INITIALIZATION_POLICY_EDEFAULT == null ? sectionInitializationPolicy != null : !SECTION_INITIALIZATION_POLICY_EDEFAULT.equals(sectionInitializationPolicy);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (memoryAllocationKeywordPolicy: ");
		result.append(memoryAllocationKeywordPolicy);
		result.append(", sectionInitializationPolicy: ");
		result.append(sectionInitializationPolicy);
		result.append(')');
		return result.toString();
	}

} //SwAddrMethodImpl