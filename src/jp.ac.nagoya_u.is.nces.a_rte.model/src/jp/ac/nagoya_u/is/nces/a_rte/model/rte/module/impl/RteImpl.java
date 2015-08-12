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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalImmediateTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalPeriodicEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSendSignalTrustedFunction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GenerationInfo;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStartApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteStopApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmDeinitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getCore <em>Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComCallback <em>Com Callback</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentType <em>Dependent Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteType <em>Rte Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentOsApi <em>Dependent Os Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentIocCommunication <em>Dependent Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentComApi <em>Dependent Com Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteStartApi <em>Rte Start Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getIocInitValueConstant <em>Ioc Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getDependentConstant <em>Dependent Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteStopApi <em>Rte Stop Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteTypeConstant <em>Rte Type Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getRteMemoryMapping <em>Rte Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getGenerationInfo <em>Generation Info</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getBswm <em>Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSchmInitApi <em>Schm Init Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteImpl#getSchmDeinitApi <em>Schm Deinit Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteImpl extends LogicalCompartmentImpl implements Rte {
	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> core;

	/**
	 * The cached value of the '{@link #getComCallback() <em>Com Callback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallback()
	 * @generated
	 * @ordered
	 */
	protected EList<ComCallback> comCallback;

	/**
	 * The cached value of the '{@link #getComSendSignalPeriodicEntity() <em>Com Send Signal Periodic Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalPeriodicEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalPeriodicEntity comSendSignalPeriodicEntity;

	/**
	 * The cached value of the '{@link #getComSendSignalImmediateEntity() <em>Com Send Signal Immediate Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalImmediateEntity()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateEntity comSendSignalImmediateEntity;

	/**
	 * The cached value of the '{@link #getComSendSignalTrustedFunction() <em>Com Send Signal Trusted Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalTrustedFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<ComSendSignalTrustedFunction> comSendSignalTrustedFunction;

	/**
	 * The cached value of the '{@link #getDependentType() <em>Dependent Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> dependentType;

	/**
	 * The cached value of the '{@link #getRteType() <em>Rte Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> rteType;

	/**
	 * The cached value of the '{@link #getDependentOsApi() <em>Dependent Os Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentOsApi()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApi> dependentOsApi;

	/**
	 * The cached value of the '{@link #getDependentIocCommunication() <em>Dependent Ioc Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<IocCommunication> dependentIocCommunication;

	/**
	 * The cached value of the '{@link #getDependentComApi() <em>Dependent Com Api</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentComApi()
	 * @generated
	 * @ordered
	 */
	protected EList<ComApi> dependentComApi;

	/**
	 * The cached value of the '{@link #getRteStartApi() <em>Rte Start Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteStartApi()
	 * @generated
	 * @ordered
	 */
	protected RteStartApi rteStartApi;

	/**
	 * The cached value of the '{@link #getIocInitValueConstant() <em>Ioc Init Value Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocInitValueConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> iocInitValueConstant;

	/**
	 * The cached value of the '{@link #getDependentConstant() <em>Dependent Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> dependentConstant;

	/**
	 * The cached value of the '{@link #getComSendSignalImmediateTaskBody() <em>Com Send Signal Immediate Task Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 * @ordered
	 */
	protected ComSendSignalImmediateTaskBody comSendSignalImmediateTaskBody;

	/**
	 * The cached value of the '{@link #getRteStopApi() <em>Rte Stop Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteStopApi()
	 * @generated
	 * @ordered
	 */
	protected RteStopApi rteStopApi;

	/**
	 * The cached value of the '{@link #getRteTypeConstant() <em>Rte Type Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteTypeConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> rteTypeConstant;

	/**
	 * The cached value of the '{@link #getRteMemoryMapping() <em>Rte Memory Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<BswMemoryMapping> rteMemoryMapping;

	/**
	 * The cached value of the '{@link #getGenerationInfo() <em>Generation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationInfo()
	 * @generated
	 * @ordered
	 */
	protected GenerationInfo generationInfo;

	/**
	 * The cached value of the '{@link #getBswm() <em>Bswm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswm()
	 * @generated
	 * @ordered
	 */
	protected EList<Bswm> bswm;

	/**
	 * The cached value of the '{@link #getSchmInitApi() <em>Schm Init Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmInitApi()
	 * @generated
	 * @ordered
	 */
	protected SchmInitApi schmInitApi;

	/**
	 * The cached value of the '{@link #getSchmDeinitApi() <em>Schm Deinit Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmDeinitApi()
	 * @generated
	 * @ordered
	 */
	protected SchmDeinitApi schmDeinitApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCore() {
		if (core == null) {
			core = new EObjectContainmentEList<Core>(Core.class, this, ModulePackage.RTE__CORE);
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComCallback> getComCallback() {
		if (comCallback == null) {
			comCallback = new EObjectContainmentEList<ComCallback>(ComCallback.class, this, ModulePackage.RTE__COM_CALLBACK);
		}
		return comCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalPeriodicEntity getComSendSignalPeriodicEntity() {
		return comSendSignalPeriodicEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity newComSendSignalPeriodicEntity, NotificationChain msgs) {
		ComSendSignalPeriodicEntity oldComSendSignalPeriodicEntity = comSendSignalPeriodicEntity;
		comSendSignalPeriodicEntity = newComSendSignalPeriodicEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, oldComSendSignalPeriodicEntity, newComSendSignalPeriodicEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity newComSendSignalPeriodicEntity) {
		if (newComSendSignalPeriodicEntity != comSendSignalPeriodicEntity) {
			NotificationChain msgs = null;
			if (comSendSignalPeriodicEntity != null)
				msgs = ((InternalEObject)comSendSignalPeriodicEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, null, msgs);
			if (newComSendSignalPeriodicEntity != null)
				msgs = ((InternalEObject)newComSendSignalPeriodicEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, null, msgs);
			msgs = basicSetComSendSignalPeriodicEntity(newComSendSignalPeriodicEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY, newComSendSignalPeriodicEntity, newComSendSignalPeriodicEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateEntity getComSendSignalImmediateEntity() {
		return comSendSignalImmediateEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalImmediateEntity(ComSendSignalImmediateEntity newComSendSignalImmediateEntity, NotificationChain msgs) {
		ComSendSignalImmediateEntity oldComSendSignalImmediateEntity = comSendSignalImmediateEntity;
		comSendSignalImmediateEntity = newComSendSignalImmediateEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, oldComSendSignalImmediateEntity, newComSendSignalImmediateEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalImmediateEntity(ComSendSignalImmediateEntity newComSendSignalImmediateEntity) {
		if (newComSendSignalImmediateEntity != comSendSignalImmediateEntity) {
			NotificationChain msgs = null;
			if (comSendSignalImmediateEntity != null)
				msgs = ((InternalEObject)comSendSignalImmediateEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, null, msgs);
			if (newComSendSignalImmediateEntity != null)
				msgs = ((InternalEObject)newComSendSignalImmediateEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, null, msgs);
			msgs = basicSetComSendSignalImmediateEntity(newComSendSignalImmediateEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY, newComSendSignalImmediateEntity, newComSendSignalImmediateEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComSendSignalTrustedFunction> getComSendSignalTrustedFunction() {
		if (comSendSignalTrustedFunction == null) {
			comSendSignalTrustedFunction = new EObjectContainmentEList<ComSendSignalTrustedFunction>(ComSendSignalTrustedFunction.class, this, ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION);
		}
		return comSendSignalTrustedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getDependentType() {
		if (dependentType == null) {
			dependentType = new EObjectContainmentEList<Type>(Type.class, this, ModulePackage.RTE__DEPENDENT_TYPE);
		}
		return dependentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRteType() {
		if (rteType == null) {
			rteType = new EObjectContainmentEList<Type>(Type.class, this, ModulePackage.RTE__RTE_TYPE);
		}
		return rteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApi> getDependentOsApi() {
		if (dependentOsApi == null) {
			dependentOsApi = new EObjectContainmentEList<OsApi>(OsApi.class, this, ModulePackage.RTE__DEPENDENT_OS_API);
		}
		return dependentOsApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IocCommunication> getDependentIocCommunication() {
		if (dependentIocCommunication == null) {
			dependentIocCommunication = new EObjectContainmentEList<IocCommunication>(IocCommunication.class, this, ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION);
		}
		return dependentIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComApi> getDependentComApi() {
		if (dependentComApi == null) {
			dependentComApi = new EObjectContainmentEList<ComApi>(ComApi.class, this, ModulePackage.RTE__DEPENDENT_COM_API);
		}
		return dependentComApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteStartApi getRteStartApi() {
		return rteStartApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteStartApi(RteStartApi newRteStartApi, NotificationChain msgs) {
		RteStartApi oldRteStartApi = rteStartApi;
		rteStartApi = newRteStartApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_START_API, oldRteStartApi, newRteStartApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteStartApi(RteStartApi newRteStartApi) {
		if (newRteStartApi != rteStartApi) {
			NotificationChain msgs = null;
			if (rteStartApi != null)
				msgs = ((InternalEObject)rteStartApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_START_API, null, msgs);
			if (newRteStartApi != null)
				msgs = ((InternalEObject)newRteStartApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_START_API, null, msgs);
			msgs = basicSetRteStartApi(newRteStartApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_START_API, newRteStartApi, newRteStartApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getIocInitValueConstant() {
		if (iocInitValueConstant == null) {
			iocInitValueConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT);
		}
		return iocInitValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getDependentConstant() {
		if (dependentConstant == null) {
			dependentConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__DEPENDENT_CONSTANT);
		}
		return dependentConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendSignalImmediateTaskBody getComSendSignalImmediateTaskBody() {
		return comSendSignalImmediateTaskBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody newComSendSignalImmediateTaskBody, NotificationChain msgs) {
		ComSendSignalImmediateTaskBody oldComSendSignalImmediateTaskBody = comSendSignalImmediateTaskBody;
		comSendSignalImmediateTaskBody = newComSendSignalImmediateTaskBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, oldComSendSignalImmediateTaskBody, newComSendSignalImmediateTaskBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody newComSendSignalImmediateTaskBody) {
		if (newComSendSignalImmediateTaskBody != comSendSignalImmediateTaskBody) {
			NotificationChain msgs = null;
			if (comSendSignalImmediateTaskBody != null)
				msgs = ((InternalEObject)comSendSignalImmediateTaskBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, null, msgs);
			if (newComSendSignalImmediateTaskBody != null)
				msgs = ((InternalEObject)newComSendSignalImmediateTaskBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, null, msgs);
			msgs = basicSetComSendSignalImmediateTaskBody(newComSendSignalImmediateTaskBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY, newComSendSignalImmediateTaskBody, newComSendSignalImmediateTaskBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteStopApi getRteStopApi() {
		return rteStopApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteStopApi(RteStopApi newRteStopApi, NotificationChain msgs) {
		RteStopApi oldRteStopApi = rteStopApi;
		rteStopApi = newRteStopApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_STOP_API, oldRteStopApi, newRteStopApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteStopApi(RteStopApi newRteStopApi) {
		if (newRteStopApi != rteStopApi) {
			NotificationChain msgs = null;
			if (rteStopApi != null)
				msgs = ((InternalEObject)rteStopApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_STOP_API, null, msgs);
			if (newRteStopApi != null)
				msgs = ((InternalEObject)newRteStopApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__RTE_STOP_API, null, msgs);
			msgs = basicSetRteStopApi(newRteStopApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__RTE_STOP_API, newRteStopApi, newRteStopApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getRteTypeConstant() {
		if (rteTypeConstant == null) {
			rteTypeConstant = new EObjectContainmentEList<Constant>(Constant.class, this, ModulePackage.RTE__RTE_TYPE_CONSTANT);
		}
		return rteTypeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswMemoryMapping> getRteMemoryMapping() {
		if (rteMemoryMapping == null) {
			rteMemoryMapping = new EObjectContainmentEList<BswMemoryMapping>(BswMemoryMapping.class, this, ModulePackage.RTE__RTE_MEMORY_MAPPING);
		}
		return rteMemoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationInfo getGenerationInfo() {
		return generationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationInfo(GenerationInfo newGenerationInfo, NotificationChain msgs) {
		GenerationInfo oldGenerationInfo = generationInfo;
		generationInfo = newGenerationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__GENERATION_INFO, oldGenerationInfo, newGenerationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationInfo(GenerationInfo newGenerationInfo) {
		if (newGenerationInfo != generationInfo) {
			NotificationChain msgs = null;
			if (generationInfo != null)
				msgs = ((InternalEObject)generationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__GENERATION_INFO, null, msgs);
			if (newGenerationInfo != null)
				msgs = ((InternalEObject)newGenerationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__GENERATION_INFO, null, msgs);
			msgs = basicSetGenerationInfo(newGenerationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__GENERATION_INFO, newGenerationInfo, newGenerationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bswm> getBswm() {
		if (bswm == null) {
			bswm = new EObjectContainmentEList<Bswm>(Bswm.class, this, ModulePackage.RTE__BSWM);
		}
		return bswm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmInitApi getSchmInitApi() {
		return schmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmInitApi(SchmInitApi newSchmInitApi, NotificationChain msgs) {
		SchmInitApi oldSchmInitApi = schmInitApi;
		schmInitApi = newSchmInitApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_INIT_API, oldSchmInitApi, newSchmInitApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmInitApi(SchmInitApi newSchmInitApi) {
		if (newSchmInitApi != schmInitApi) {
			NotificationChain msgs = null;
			if (schmInitApi != null)
				msgs = ((InternalEObject)schmInitApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_INIT_API, null, msgs);
			if (newSchmInitApi != null)
				msgs = ((InternalEObject)newSchmInitApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_INIT_API, null, msgs);
			msgs = basicSetSchmInitApi(newSchmInitApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_INIT_API, newSchmInitApi, newSchmInitApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmDeinitApi getSchmDeinitApi() {
		return schmDeinitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmDeinitApi(SchmDeinitApi newSchmDeinitApi, NotificationChain msgs) {
		SchmDeinitApi oldSchmDeinitApi = schmDeinitApi;
		schmDeinitApi = newSchmDeinitApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_DEINIT_API, oldSchmDeinitApi, newSchmDeinitApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmDeinitApi(SchmDeinitApi newSchmDeinitApi) {
		if (newSchmDeinitApi != schmDeinitApi) {
			NotificationChain msgs = null;
			if (schmDeinitApi != null)
				msgs = ((InternalEObject)schmDeinitApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_DEINIT_API, null, msgs);
			if (newSchmDeinitApi != null)
				msgs = ((InternalEObject)newSchmDeinitApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.RTE__SCHM_DEINIT_API, null, msgs);
			msgs = basicSetSchmDeinitApi(newSchmDeinitApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE__SCHM_DEINIT_API, newSchmDeinitApi, newSchmDeinitApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE__CORE:
				return ((InternalEList<?>)getCore()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_CALLBACK:
				return ((InternalEList<?>)getComCallback()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return basicSetComSendSignalPeriodicEntity(null, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return basicSetComSendSignalImmediateEntity(null, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return ((InternalEList<?>)getComSendSignalTrustedFunction()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return ((InternalEList<?>)getDependentType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__RTE_TYPE:
				return ((InternalEList<?>)getRteType()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return ((InternalEList<?>)getDependentOsApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return ((InternalEList<?>)getDependentIocCommunication()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return ((InternalEList<?>)getDependentComApi()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__RTE_START_API:
				return basicSetRteStartApi(null, msgs);
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return ((InternalEList<?>)getIocInitValueConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return ((InternalEList<?>)getDependentConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return basicSetComSendSignalImmediateTaskBody(null, msgs);
			case ModulePackage.RTE__RTE_STOP_API:
				return basicSetRteStopApi(null, msgs);
			case ModulePackage.RTE__RTE_TYPE_CONSTANT:
				return ((InternalEList<?>)getRteTypeConstant()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return ((InternalEList<?>)getRteMemoryMapping()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__GENERATION_INFO:
				return basicSetGenerationInfo(null, msgs);
			case ModulePackage.RTE__BSWM:
				return ((InternalEList<?>)getBswm()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE__SCHM_INIT_API:
				return basicSetSchmInitApi(null, msgs);
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return basicSetSchmDeinitApi(null, msgs);
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
			case ModulePackage.RTE__CORE:
				return getCore();
			case ModulePackage.RTE__COM_CALLBACK:
				return getComCallback();
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return getComSendSignalPeriodicEntity();
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return getComSendSignalImmediateEntity();
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return getComSendSignalTrustedFunction();
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return getDependentType();
			case ModulePackage.RTE__RTE_TYPE:
				return getRteType();
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return getDependentOsApi();
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return getDependentIocCommunication();
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return getDependentComApi();
			case ModulePackage.RTE__RTE_START_API:
				return getRteStartApi();
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return getIocInitValueConstant();
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return getDependentConstant();
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return getComSendSignalImmediateTaskBody();
			case ModulePackage.RTE__RTE_STOP_API:
				return getRteStopApi();
			case ModulePackage.RTE__RTE_TYPE_CONSTANT:
				return getRteTypeConstant();
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return getRteMemoryMapping();
			case ModulePackage.RTE__GENERATION_INFO:
				return getGenerationInfo();
			case ModulePackage.RTE__BSWM:
				return getBswm();
			case ModulePackage.RTE__SCHM_INIT_API:
				return getSchmInitApi();
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return getSchmDeinitApi();
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
			case ModulePackage.RTE__CORE:
				getCore().clear();
				getCore().addAll((Collection<? extends Core>)newValue);
				return;
			case ModulePackage.RTE__COM_CALLBACK:
				getComCallback().clear();
				getComCallback().addAll((Collection<? extends ComCallback>)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				setComSendSignalPeriodicEntity((ComSendSignalPeriodicEntity)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				setComSendSignalImmediateEntity((ComSendSignalImmediateEntity)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				getComSendSignalTrustedFunction().clear();
				getComSendSignalTrustedFunction().addAll((Collection<? extends ComSendSignalTrustedFunction>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_TYPE:
				getDependentType().clear();
				getDependentType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.RTE__RTE_TYPE:
				getRteType().clear();
				getRteType().addAll((Collection<? extends Type>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_OS_API:
				getDependentOsApi().clear();
				getDependentOsApi().addAll((Collection<? extends OsApi>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				getDependentIocCommunication().clear();
				getDependentIocCommunication().addAll((Collection<? extends IocCommunication>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_COM_API:
				getDependentComApi().clear();
				getDependentComApi().addAll((Collection<? extends ComApi>)newValue);
				return;
			case ModulePackage.RTE__RTE_START_API:
				setRteStartApi((RteStartApi)newValue);
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				getIocInitValueConstant().clear();
				getIocInitValueConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				getDependentConstant().clear();
				getDependentConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				setComSendSignalImmediateTaskBody((ComSendSignalImmediateTaskBody)newValue);
				return;
			case ModulePackage.RTE__RTE_STOP_API:
				setRteStopApi((RteStopApi)newValue);
				return;
			case ModulePackage.RTE__RTE_TYPE_CONSTANT:
				getRteTypeConstant().clear();
				getRteTypeConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				getRteMemoryMapping().clear();
				getRteMemoryMapping().addAll((Collection<? extends BswMemoryMapping>)newValue);
				return;
			case ModulePackage.RTE__GENERATION_INFO:
				setGenerationInfo((GenerationInfo)newValue);
				return;
			case ModulePackage.RTE__BSWM:
				getBswm().clear();
				getBswm().addAll((Collection<? extends Bswm>)newValue);
				return;
			case ModulePackage.RTE__SCHM_INIT_API:
				setSchmInitApi((SchmInitApi)newValue);
				return;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				setSchmDeinitApi((SchmDeinitApi)newValue);
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
			case ModulePackage.RTE__CORE:
				getCore().clear();
				return;
			case ModulePackage.RTE__COM_CALLBACK:
				getComCallback().clear();
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				setComSendSignalPeriodicEntity((ComSendSignalPeriodicEntity)null);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				setComSendSignalImmediateEntity((ComSendSignalImmediateEntity)null);
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				getComSendSignalTrustedFunction().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_TYPE:
				getDependentType().clear();
				return;
			case ModulePackage.RTE__RTE_TYPE:
				getRteType().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_OS_API:
				getDependentOsApi().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				getDependentIocCommunication().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_COM_API:
				getDependentComApi().clear();
				return;
			case ModulePackage.RTE__RTE_START_API:
				setRteStartApi((RteStartApi)null);
				return;
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				getIocInitValueConstant().clear();
				return;
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				getDependentConstant().clear();
				return;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				setComSendSignalImmediateTaskBody((ComSendSignalImmediateTaskBody)null);
				return;
			case ModulePackage.RTE__RTE_STOP_API:
				setRteStopApi((RteStopApi)null);
				return;
			case ModulePackage.RTE__RTE_TYPE_CONSTANT:
				getRteTypeConstant().clear();
				return;
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				getRteMemoryMapping().clear();
				return;
			case ModulePackage.RTE__GENERATION_INFO:
				setGenerationInfo((GenerationInfo)null);
				return;
			case ModulePackage.RTE__BSWM:
				getBswm().clear();
				return;
			case ModulePackage.RTE__SCHM_INIT_API:
				setSchmInitApi((SchmInitApi)null);
				return;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				setSchmDeinitApi((SchmDeinitApi)null);
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
			case ModulePackage.RTE__CORE:
				return core != null && !core.isEmpty();
			case ModulePackage.RTE__COM_CALLBACK:
				return comCallback != null && !comCallback.isEmpty();
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
				return comSendSignalPeriodicEntity != null;
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
				return comSendSignalImmediateEntity != null;
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
				return comSendSignalTrustedFunction != null && !comSendSignalTrustedFunction.isEmpty();
			case ModulePackage.RTE__DEPENDENT_TYPE:
				return dependentType != null && !dependentType.isEmpty();
			case ModulePackage.RTE__RTE_TYPE:
				return rteType != null && !rteType.isEmpty();
			case ModulePackage.RTE__DEPENDENT_OS_API:
				return dependentOsApi != null && !dependentOsApi.isEmpty();
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
				return dependentIocCommunication != null && !dependentIocCommunication.isEmpty();
			case ModulePackage.RTE__DEPENDENT_COM_API:
				return dependentComApi != null && !dependentComApi.isEmpty();
			case ModulePackage.RTE__RTE_START_API:
				return rteStartApi != null;
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
				return iocInitValueConstant != null && !iocInitValueConstant.isEmpty();
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
				return dependentConstant != null && !dependentConstant.isEmpty();
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
				return comSendSignalImmediateTaskBody != null;
			case ModulePackage.RTE__RTE_STOP_API:
				return rteStopApi != null;
			case ModulePackage.RTE__RTE_TYPE_CONSTANT:
				return rteTypeConstant != null && !rteTypeConstant.isEmpty();
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
				return rteMemoryMapping != null && !rteMemoryMapping.isEmpty();
			case ModulePackage.RTE__GENERATION_INFO:
				return generationInfo != null;
			case ModulePackage.RTE__BSWM:
				return bswm != null && !bswm.isEmpty();
			case ModulePackage.RTE__SCHM_INIT_API:
				return schmInitApi != null;
			case ModulePackage.RTE__SCHM_DEINIT_API:
				return schmDeinitApi != null;
		}
		return super.eIsSet(featureID);
	}

} //RteImpl