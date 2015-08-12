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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Application Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getHasInlineApi <em>Has Inline Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getDeclarationsRteApiGroup <em>Declarations Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteApplicationHeaderImpl#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteApplicationHeaderImpl extends HeaderFileImpl implements RteApplicationHeader {
	/**
	 * The default value of the '{@link #getHasInlineApi() <em>Has Inline Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInlineApi()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_INLINE_API_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasInlineApi() <em>Has Inline Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInlineApi()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasInlineApi = HAS_INLINE_API_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceMacro() <em>Source Macro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMacro()
	 * @generated
	 * @ordered
	 */
	protected EList<Macro> sourceMacro;

	/**
	 * The cached value of the '{@link #getGlobalVariableGroup() <em>Global Variable Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariableGroup> globalVariableGroup;

	/**
	 * The cached value of the '{@link #getRteApiGroup() <em>Rte Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApiGroup> rteApiGroup;

	/**
	 * The cached value of the '{@link #getDeclarationsRteApiGroup() <em>Declarations Rte Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationsRteApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApiGroup> declarationsRteApiGroup;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constant;

	/**
	 * The cached value of the '{@link #getDependentExecutableEntityGroup() <em>Dependent Executable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExecutableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntityGroup> dependentExecutableEntityGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteApplicationHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_APPLICATION_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasInlineApi() {
		return hasInlineApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInlineApi(Boolean newHasInlineApi) {
		Boolean oldHasInlineApi = hasInlineApi;
		hasInlineApi = newHasInlineApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API, oldHasInlineApi, hasInlineApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getSourceMacro() {
		if (sourceMacro == null) {
			sourceMacro = new EObjectResolvingEList<Macro>(Macro.class, this, ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO);
		}
		return sourceMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableGroup>(GlobalVariableGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiGroup> getRteApiGroup() {
		if (rteApiGroup == null) {
			rteApiGroup = new EObjectContainmentEList<RteApiGroup>(RteApiGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP);
		}
		return rteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiGroup> getDeclarationsRteApiGroup() {
		if (declarationsRteApiGroup == null) {
			declarationsRteApiGroup = new EObjectContainmentEList<RteApiGroup>(RteApiGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP);
		}
		return declarationsRteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_APPLICATION_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntityGroup> getDependentExecutableEntityGroup() {
		if (dependentExecutableEntityGroup == null) {
			dependentExecutableEntityGroup = new EObjectContainmentEList<ExecutableEntityGroup>(ExecutableEntityGroup.class, this, ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		}
		return dependentExecutableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return ((InternalEList<?>)getRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return ((InternalEList<?>)getDeclarationsRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getDependentExecutableEntityGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				return getHasInlineApi();
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				return getSourceMacro();
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return getRteApiGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return getDeclarationsRteApiGroup();
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				return getConstant();
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return getDependentExecutableEntityGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				setHasInlineApi((Boolean)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				getSourceMacro().clear();
				getSourceMacro().addAll((Collection<? extends Macro>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				getRteApiGroup().addAll((Collection<? extends RteApiGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				getDeclarationsRteApiGroup().clear();
				getDeclarationsRteApiGroup().addAll((Collection<? extends RteApiGroup>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				getDependentExecutableEntityGroup().addAll((Collection<? extends ExecutableEntityGroup>)newValue);
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				setHasInlineApi(HAS_INLINE_API_EDEFAULT);
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				getSourceMacro().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				getRteApiGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				getDeclarationsRteApiGroup().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				getConstant().clear();
				return;
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
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
			case ModulePackage.RTE_APPLICATION_HEADER__HAS_INLINE_API:
				return HAS_INLINE_API_EDEFAULT == null ? hasInlineApi != null : !HAS_INLINE_API_EDEFAULT.equals(hasInlineApi);
			case ModulePackage.RTE_APPLICATION_HEADER__SOURCE_MACRO:
				return sourceMacro != null && !sourceMacro.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__RTE_API_GROUP:
				return rteApiGroup != null && !rteApiGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__DECLARATIONS_RTE_API_GROUP:
				return declarationsRteApiGroup != null && !declarationsRteApiGroup.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
			case ModulePackage.RTE_APPLICATION_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return dependentExecutableEntityGroup != null && !dependentExecutableEntityGroup.isEmpty();
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
		result.append(" (hasInlineApi: ");
		result.append(hasInlineApi);
		result.append(')');
		return result.toString();
	}

} //RteApplicationHeaderImpl