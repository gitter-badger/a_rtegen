/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableFileContentsGroupImpl#getGlobalVariable <em>Global Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableFileContentsGroupImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVariableFileContentsGroupImpl extends ModuleObjectImpl implements GlobalVariableFileContentsGroup {
	/**
	 * The cached value of the '{@link #getGlobalVariable() <em>Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> globalVariable;

	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapping memoryMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getGlobalVariable() {
		if (globalVariable == null) {
			globalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE);
		}
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping getMemoryMapping() {
		if (memoryMapping != null && ((EObject)memoryMapping).eIsProxy()) {
			InternalEObject oldMemoryMapping = (InternalEObject)memoryMapping;
			memoryMapping = (MemoryMapping)eResolveProxy(oldMemoryMapping);
			if (memoryMapping != oldMemoryMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
			}
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping basicGetMemoryMapping() {
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapping(MemoryMapping newMemoryMapping) {
		MemoryMapping oldMemoryMapping = memoryMapping;
		memoryMapping = newMemoryMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				return getGlobalVariable();
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				if (resolve) return getMemoryMapping();
				return basicGetMemoryMapping();
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				getGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)newValue);
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				return;
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)null);
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				return globalVariable != null && !globalVariable.isEmpty();
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				return memoryMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalVariableFileContentsGroupImpl
