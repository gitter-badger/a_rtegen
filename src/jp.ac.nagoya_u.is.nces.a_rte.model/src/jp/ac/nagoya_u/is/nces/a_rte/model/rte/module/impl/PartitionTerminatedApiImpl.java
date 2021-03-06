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

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InterPartitionTimeoutOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Terminated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.PartitionTerminatedApiImpl#getSrInterPartitionTimeoutOperation <em>Sr Inter Partition Timeout Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionTerminatedApiImpl extends RteLifecycleApiImpl implements PartitionTerminatedApi {
	/**
	 * The cached value of the '{@link #getSrInterPartitionTimeoutOperation() <em>Sr Inter Partition Timeout Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrInterPartitionTimeoutOperation()
	 * @generated
	 * @ordered
	 */
	protected InterPartitionTimeoutOperation srInterPartitionTimeoutOperation;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionTerminatedApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.PARTITION_TERMINATED_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterPartitionTimeoutOperation getSrInterPartitionTimeoutOperation() {
		return srInterPartitionTimeoutOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation newSrInterPartitionTimeoutOperation, NotificationChain msgs) {
		InterPartitionTimeoutOperation oldSrInterPartitionTimeoutOperation = srInterPartitionTimeoutOperation;
		srInterPartitionTimeoutOperation = newSrInterPartitionTimeoutOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, oldSrInterPartitionTimeoutOperation, newSrInterPartitionTimeoutOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation newSrInterPartitionTimeoutOperation) {
		if (newSrInterPartitionTimeoutOperation != srInterPartitionTimeoutOperation) {
			NotificationChain msgs = null;
			if (srInterPartitionTimeoutOperation != null)
				msgs = ((InternalEObject)srInterPartitionTimeoutOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, null, msgs);
			if (newSrInterPartitionTimeoutOperation != null)
				msgs = ((InternalEObject)newSrInterPartitionTimeoutOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, null, msgs);
			msgs = basicSetSrInterPartitionTimeoutOperation(newSrInterPartitionTimeoutOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION, newSrInterPartitionTimeoutOperation, newSrInterPartitionTimeoutOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return basicSetSrInterPartitionTimeoutOperation(null, msgs);
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
			case ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return getSrInterPartitionTimeoutOperation();
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
			case ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				setSrInterPartitionTimeoutOperation((InterPartitionTimeoutOperation)newValue);
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
			case ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				setSrInterPartitionTimeoutOperation((InterPartitionTimeoutOperation)null);
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
			case ModulePackage.PARTITION_TERMINATED_API__SR_INTER_PARTITION_TIMEOUT_OPERATION:
				return srInterPartitionTimeoutOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //PartitionTerminatedImpl
