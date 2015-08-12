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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage
 * @generated
 */
public interface ModuleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleFactory eINSTANCE = jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.ModuleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Api</em>'.
	 * @generated
	 */
	WriteApi createWriteApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Nonqueued Send Operation</em>'.
	 * @generated
	 */
	RteBufferNonqueuedSendOperation createRteBufferNonqueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Nonqueued Read Operation</em>'.
	 * @generated
	 */
	RteBufferNonqueuedReadOperation createRteBufferNonqueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Api</em>'.
	 * @generated
	 */
	ReadApi createReadApi();

	/**
	 * Returns a new object of class '<em>Irv Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Read Operation</em>'.
	 * @generated
	 */
	IrvReadOperation createIrvReadOperation();

	/**
	 * Returns a new object of class '<em>Irv Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Read Api</em>'.
	 * @generated
	 */
	IrvReadApi createIrvReadApi();

	/**
	 * Returns a new object of class '<em>Irv Write Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Write Operation</em>'.
	 * @generated
	 */
	IrvWriteOperation createIrvWriteOperation();

	/**
	 * Returns a new object of class '<em>Irv Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irv Write Api</em>'.
	 * @generated
	 */
	IrvWriteApi createIrvWriteApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Variable Set</em>'.
	 * @generated
	 */
	RteBufferVariableSet createRteBufferVariableSet();

	/**
	 * Returns a new object of class '<em>Global Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable Set</em>'.
	 * @generated
	 */
	GlobalVariableSet createGlobalVariableSet();

	/**
	 * Returns a new object of class '<em>Rte Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Source</em>'.
	 * @generated
	 */
	RteSource createRteSource();

	/**
	 * Returns a new object of class '<em>Rte Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Module</em>'.
	 * @generated
	 */
	RteModule createRteModule();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Type</em>'.
	 * @generated
	 */
	ModeType createModeType();

	/**
	 * Returns a new object of class '<em>Redefinition Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Primitive Type</em>'.
	 * @generated
	 */
	RedefinitionPrimitiveType createRedefinitionPrimitiveType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Redefinition Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Array Type</em>'.
	 * @generated
	 */
	RedefinitionArrayType createRedefinitionArrayType();

	/**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
	UnionType createUnionType();

	/**
	 * Returns a new object of class '<em>Redefinition Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Union Type</em>'.
	 * @generated
	 */
	RedefinitionUnionType createRedefinitionUnionType();

	/**
	 * Returns a new object of class '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Type</em>'.
	 * @generated
	 */
	StructType createStructType();

	/**
	 * Returns a new object of class '<em>Redefinition Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Struct Type</em>'.
	 * @generated
	 */
	RedefinitionStructType createRedefinitionStructType();

	/**
	 * Returns a new object of class '<em>Blackbox Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackbox Type</em>'.
	 * @generated
	 */
	BlackboxType createBlackboxType();

	/**
	 * Returns a new object of class '<em>Union Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Member</em>'.
	 * @generated
	 */
	UnionMember createUnionMember();

	/**
	 * Returns a new object of class '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Member</em>'.
	 * @generated
	 */
	StructMember createStructMember();

	/**
	 * Returns a new object of class '<em>Variable Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Member</em>'.
	 * @generated
	 */
	VariableMember createVariableMember();

	/**
	 * Returns a new object of class '<em>Rte Utility Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Utility Header</em>'.
	 * @generated
	 */
	RteUtilityHeader createRteUtilityHeader();

	/**
	 * Returns a new object of class '<em>Blackbox Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackbox Header</em>'.
	 * @generated
	 */
	BlackboxHeader createBlackboxHeader();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queue Type</em>'.
	 * @generated
	 */
	RteBufferQueueType createRteBufferQueueType();

	/**
	 * Returns a new object of class '<em>Mode Queue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Queue Type</em>'.
	 * @generated
	 */
	ModeQueueType createModeQueueType();

	/**
	 * Returns a new object of class '<em>Rte Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Send Trusted Function Param Type</em>'.
	 * @generated
	 */
	RteSendTrustedFunctionParamType createRteSendTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Com Send Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Trusted Function Param Type</em>'.
	 * @generated
	 */
	ComSendTrustedFunctionParamType createComSendTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Com Cs Trusted Function Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Cs Trusted Function Param Type</em>'.
	 * @generated
	 */
	ComCsTrustedFunctionParamType createComCsTrustedFunctionParamType();

	/**
	 * Returns a new object of class '<em>Never Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Never Read Operation</em>'.
	 * @generated
	 */
	NeverReadOperation createNeverReadOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Invalidate Trusted Function</em>'.
	 * @generated
	 */
	RteBufferInvalidateTrustedFunction createRteBufferInvalidateTrustedFunction();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Buffer Invalidate Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteBufferInvalidateSendOperation createTrustedFunctionRteBufferInvalidateSendOperation();

	/**
	 * Returns a new object of class '<em>Swc Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Memory Mapping</em>'.
	 * @generated
	 */
	SwcMemoryMapping createSwcMemoryMapping();

	/**
	 * Returns a new object of class '<em>Bsw Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Memory Mapping</em>'.
	 * @generated
	 */
	BswMemoryMapping createBswMemoryMapping();

	/**
	 * Returns a new object of class '<em>Global Variable Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable Group</em>'.
	 * @generated
	 */
	GlobalVariableGroup createGlobalVariableGroup();

	/**
	 * Returns a new object of class '<em>Rte Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Api Group</em>'.
	 * @generated
	 */
	RteApiGroup createRteApiGroup();

	/**
	 * Returns a new object of class '<em>Rte Lifecycle Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Lifecycle Api Group</em>'.
	 * @generated
	 */
	RteLifecycleApiGroup createRteLifecycleApiGroup();

	/**
	 * Returns a new object of class '<em>Task Body Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Body Group</em>'.
	 * @generated
	 */
	TaskBodyGroup createTaskBodyGroup();

	/**
	 * Returns a new object of class '<em>Bsw Schedulable Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Schedulable Entity Group</em>'.
	 * @generated
	 */
	BswSchedulableEntityGroup createBswSchedulableEntityGroup();

	/**
	 * Returns a new object of class '<em>Com Callback Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Callback Group</em>'.
	 * @generated
	 */
	ComCallbackGroup createComCallbackGroup();

	/**
	 * Returns a new object of class '<em>Trusted Function Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Group</em>'.
	 * @generated
	 */
	TrustedFunctionGroup createTrustedFunctionGroup();

	/**
	 * Returns a new object of class '<em>Executable Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Entity Group</em>'.
	 * @generated
	 */
	ExecutableEntityGroup createExecutableEntityGroup();

	/**
	 * Returns a new object of class '<em>Bsw Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bsw Memory Mapping Header</em>'.
	 * @generated
	 */
	BswMemoryMappingHeader createBswMemoryMappingHeader();

	/**
	 * Returns a new object of class '<em>Swc Memory Mapping Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc Memory Mapping Header</em>'.
	 * @generated
	 */
	SwcMemoryMappingHeader createSwcMemoryMappingHeader();

	/**
	 * Returns a new object of class '<em>Generation Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Info</em>'.
	 * @generated
	 */
	GenerationInfo createGenerationInfo();

	/**
	 * Returns a new object of class '<em>Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro</em>'.
	 * @generated
	 */
	Macro createMacro();

	/**
	 * Returns a new object of class '<em>Proxy Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Api</em>'.
	 * @generated
	 */
	ProxyApi createProxyApi();

	/**
	 * Returns a new object of class '<em>Send Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Signal Api</em>'.
	 * @generated
	 */
	SendSignalApi createSendSignalApi();

	/**
	 * Returns a new object of class '<em>Receive Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Signal Api</em>'.
	 * @generated
	 */
	ReceiveSignalApi createReceiveSignalApi();

	/**
	 * Returns a new object of class '<em>Schm Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Enter Api</em>'.
	 * @generated
	 */
	SchmEnterApi createSchmEnterApi();

	/**
	 * Returns a new object of class '<em>Schm Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Exit Api</em>'.
	 * @generated
	 */
	SchmExitApi createSchmExitApi();

	/**
	 * Returns a new object of class '<em>Schm Switch Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Switch Api</em>'.
	 * @generated
	 */
	SchmSwitchApi createSchmSwitchApi();

	/**
	 * Returns a new object of class '<em>Os Task Events Triggered By Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Events Triggered By Mode</em>'.
	 * @generated
	 */
	OsTaskEventsTriggeredByMode createOsTaskEventsTriggeredByMode();

	/**
	 * Returns a new object of class '<em>Os Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Event</em>'.
	 * @generated
	 */
	OsTaskEvent createOsTaskEvent();

	/**
	 * Returns a new object of class '<em>Mode Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Queued Variable</em>'.
	 * @generated
	 */
	ModeQueuedVariable createModeQueuedVariable();

	/**
	 * Returns a new object of class '<em>Schm Mode Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Mode Api</em>'.
	 * @generated
	 */
	SchmModeApi createSchmModeApi();

	/**
	 * Returns a new object of class '<em>Interlink Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interlink Header</em>'.
	 * @generated
	 */
	ModuleInterlinkHeader createModuleInterlinkHeader();

	/**
	 * Returns a new object of class '<em>Schm Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Api Group</em>'.
	 * @generated
	 */
	SchmApiGroup createSchmApiGroup();

	/**
	 * Returns a new object of class '<em>Signal Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Api Group</em>'.
	 * @generated
	 */
	SignalApiGroup createSignalApiGroup();

	/**
	 * Returns a new object of class '<em>Proxy Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Api Group</em>'.
	 * @generated
	 */
	ProxyApiGroup createProxyApiGroup();

	/**
	 * Returns a new object of class '<em>Interlink Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interlink Type Header</em>'.
	 * @generated
	 */
	ModuleInterlinkTypeHeader createModuleInterlinkTypeHeader();

	/**
	 * Returns a new object of class '<em>Schm Lifecycle Api Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Lifecycle Api Group</em>'.
	 * @generated
	 */
	SchmLifecycleApiGroup createSchmLifecycleApiGroup();

	/**
	 * Returns a new object of class '<em>Parted Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parted Bswm</em>'.
	 * @generated
	 */
	PartedBswm createPartedBswm();

	/**
	 * Returns a new object of class '<em>Bswm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bswm</em>'.
	 * @generated
	 */
	Bswm createBswm();

	/**
	 * Returns a new object of class '<em>Schm Deinit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Deinit Api</em>'.
	 * @generated
	 */
	SchmDeinitApi createSchmDeinitApi();

	/**
	 * Returns a new object of class '<em>Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Init Api</em>'.
	 * @generated
	 */
	SchmInitApi createSchmInitApi();

	/**
	 * Returns a new object of class '<em>Singlecore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singlecore Schm Init Api</em>'.
	 * @generated
	 */
	SinglecoreSchmInitApi createSinglecoreSchmInitApi();

	/**
	 * Returns a new object of class '<em>Multicore Schm Init Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicore Schm Init Api</em>'.
	 * @generated
	 */
	MulticoreSchmInitApi createMulticoreSchmInitApi();

	/**
	 * Returns a new object of class '<em>Schm Core Init Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schm Core Init Api Impl</em>'.
	 * @generated
	 */
	SchmCoreInitApiImpl createSchmCoreInitApiImpl();

	/**
	 * Returns a new object of class '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type</em>'.
	 * @generated
	 */
	PointerType createPointerType();

	/**
	 * Returns a new object of class '<em>Redefinition Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition Pointer Type</em>'.
	 * @generated
	 */
	RedefinitionPointerType createRedefinitionPointerType();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Rte Application Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Application Header</em>'.
	 * @generated
	 */
	RteApplicationHeader createRteApplicationHeader();

	/**
	 * Returns a new object of class '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core</em>'.
	 * @generated
	 */
	Core createCore();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	Partition createPartition();

	/**
	 * Returns a new object of class '<em>Swc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swc</em>'.
	 * @generated
	 */
	Swc createSwc();

	/**
	 * Returns a new object of class '<em>Rte Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Header</em>'.
	 * @generated
	 */
	RteHeader createRteHeader();

	/**
	 * Returns a new object of class '<em>Rte Bsw Api Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Bsw Api Header</em>'.
	 * @generated
	 */
	RteBswApiHeader createRteBswApiHeader();

	/**
	 * Returns a new object of class '<em>Rte Lifecycle Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Lifecycle Header</em>'.
	 * @generated
	 */
	RteLifecycleHeader createRteLifecycleHeader();

	/**
	 * Returns a new object of class '<em>Rte Application Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Application Type Header</em>'.
	 * @generated
	 */
	RteApplicationTypeHeader createRteApplicationTypeHeader();

	/**
	 * Returns a new object of class '<em>Rte Vfb Trace Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Vfb Trace Header</em>'.
	 * @generated
	 */
	RteVfbTraceHeader createRteVfbTraceHeader();

	/**
	 * Returns a new object of class '<em>Rte Configuration Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Configuration Header</em>'.
	 * @generated
	 */
	RteConfigurationHeader createRteConfigurationHeader();

	/**
	 * Returns a new object of class '<em>Rte Callback Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Callback Header</em>'.
	 * @generated
	 */
	RteCallbackHeader createRteCallbackHeader();

	/**
	 * Returns a new object of class '<em>Rte Type Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Type Header</em>'.
	 * @generated
	 */
	RteTypeHeader createRteTypeHeader();

	/**
	 * Returns a new object of class '<em>Invalidate Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalidate Api</em>'.
	 * @generated
	 */
	InvalidateApi createInvalidateApi();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Send Operation</em>'.
	 * @generated
	 */
	IocNonqueuedSendOperation createIocNonqueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Direct Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Com Send Operation</em>'.
	 * @generated
	 */
	DirectComSendOperation createDirectComSendOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteOperation createTrustedFunctionRteOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteSendOperation createTrustedFunctionRteSendOperation();

	/**
	 * Returns a new object of class '<em>Trusted Function Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Com Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionComSendOperation createTrustedFunctionComSendOperation();

	/**
	 * Returns a new object of class '<em>Immediate Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Proxy Com Send Operation</em>'.
	 * @generated
	 */
	ImmediateProxyComSendOperation createImmediateProxyComSendOperation();

	/**
	 * Returns a new object of class '<em>Periodic Proxy Com Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Proxy Com Send Operation</em>'.
	 * @generated
	 */
	PeriodicProxyComSendOperation createPeriodicProxyComSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Read Operation</em>'.
	 * @generated
	 */
	IocNonqueuedReadOperation createIocNonqueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Com Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Read Operation</em>'.
	 * @generated
	 */
	ComReadOperation createComReadOperation();

	/**
	 * Returns a new object of class '<em>Ioc Nonqueued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Nonqueued Communication</em>'.
	 * @generated
	 */
	IocNonqueuedCommunication createIocNonqueuedCommunication();

	/**
	 * Returns a new object of class '<em>Ioc Write Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Write Api</em>'.
	 * @generated
	 */
	IocWriteApi createIocWriteApi();

	/**
	 * Returns a new object of class '<em>Ioc Read Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Read Api</em>'.
	 * @generated
	 */
	IocReadApi createIocReadApi();

	/**
	 * Returns a new object of class '<em>Com Send Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Api</em>'.
	 * @generated
	 */
	ComSendSignalApi createComSendSignalApi();

	/**
	 * Returns a new object of class '<em>Com Receive Signal Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Receive Signal Api</em>'.
	 * @generated
	 */
	ComReceiveSignalApi createComReceiveSignalApi();

	/**
	 * Returns a new object of class '<em>Com Receive Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Receive Callback</em>'.
	 * @generated
	 */
	ComReceiveCallback createComReceiveCallback();

	/**
	 * Returns a new object of class '<em>Com Receive Timeout Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Receive Timeout Callback</em>'.
	 * @generated
	 */
	ComReceiveTimeoutCallback createComReceiveTimeoutCallback();

	/**
	 * Returns a new object of class '<em>Com Invalidate Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Invalidate Callback</em>'.
	 * @generated
	 */
	ComInvalidateCallback createComInvalidateCallback();

	/**
	 * Returns a new object of class '<em>Com Send Signal Proxy Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Proxy Entity</em>'.
	 * @generated
	 */
	ComSendSignalProxyEntity createComSendSignalProxyEntity();

	/**
	 * Returns a new object of class '<em>Com Send Signal Immediate Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Immediate Entity</em>'.
	 * @generated
	 */
	ComSendSignalImmediateEntity createComSendSignalImmediateEntity();

	/**
	 * Returns a new object of class '<em>Com Send Signal Periodic Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Periodic Entity</em>'.
	 * @generated
	 */
	ComSendSignalPeriodicEntity createComSendSignalPeriodicEntity();

	/**
	 * Returns a new object of class '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Differs Masked Old Filter Operation</em>'.
	 * @generated
	 */
	MaskedNewDiffersMaskedOldFilterOperation createMaskedNewDiffersMaskedOldFilterOperation();

	/**
	 * Returns a new object of class '<em>Masked New Differs XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Differs XFilter Operation</em>'.
	 * @generated
	 */
	MaskedNewDiffersXFilterOperation createMaskedNewDiffersXFilterOperation();

	/**
	 * Returns a new object of class '<em>New Is Within Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Is Within Filter Operation</em>'.
	 * @generated
	 */
	NewIsWithinFilterOperation createNewIsWithinFilterOperation();

	/**
	 * Returns a new object of class '<em>New Is Outside Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Is Outside Filter Operation</em>'.
	 * @generated
	 */
	NewIsOutsideFilterOperation createNewIsOutsideFilterOperation();

	/**
	 * Returns a new object of class '<em>Masked New Equals XFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Masked New Equals XFilter Operation</em>'.
	 * @generated
	 */
	MaskedNewEqualsXFilterOperation createMaskedNewEqualsXFilterOperation();

	/**
	 * Returns a new object of class '<em>One Every NFilter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Every NFilter Operation</em>'.
	 * @generated
	 */
	OneEveryNFilterOperation createOneEveryNFilterOperation();

	/**
	 * Returns a new object of class '<em>Rte Core Start Api Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Core Start Api Impl</em>'.
	 * @generated
	 */
	RteCoreStartApiImpl createRteCoreStartApiImpl();

	/**
	 * Returns a new object of class '<em>Rte Stop Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Stop Api</em>'.
	 * @generated
	 */
	RteStopApi createRteStopApi();

	/**
	 * Returns a new object of class '<em>Restart Partition Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restart Partition Api</em>'.
	 * @generated
	 */
	RestartPartitionApi createRestartPartitionApi();

	/**
	 * Returns a new object of class '<em>Partition Restarting Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Restarting Api</em>'.
	 * @generated
	 */
	PartitionRestartingApi createPartitionRestartingApi();

	/**
	 * Returns a new object of class '<em>Partition Terminated Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Terminated Api</em>'.
	 * @generated
	 */
	PartitionTerminatedApi createPartitionTerminatedApi();

	/**
	 * Returns a new object of class '<em>Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Api</em>'.
	 * @generated
	 */
	SendApi createSendApi();

	/**
	 * Returns a new object of class '<em>Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Api</em>'.
	 * @generated
	 */
	ReceiveApi createReceiveApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Send Operation</em>'.
	 * @generated
	 */
	RteBufferQueuedSendOperation createRteBufferQueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Variable</em>'.
	 * @generated
	 */
	RteBufferQueuedVariable createRteBufferQueuedVariable();

	/**
	 * Returns a new object of class '<em>Rte Buffer Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Queued Read Operation</em>'.
	 * @generated
	 */
	RteBufferQueuedReadOperation createRteBufferQueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Communication</em>'.
	 * @generated
	 */
	IocQueuedCommunication createIocQueuedCommunication();

	/**
	 * Returns a new object of class '<em>Ioc Receive Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Receive Api</em>'.
	 * @generated
	 */
	IocReceiveApi createIocReceiveApi();

	/**
	 * Returns a new object of class '<em>Ioc Send Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Api</em>'.
	 * @generated
	 */
	IocSendApi createIocSendApi();

	/**
	 * Returns a new object of class '<em>Ioc Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Operation</em>'.
	 * @generated
	 */
	IocSendOperation createIocSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Send Operation</em>'.
	 * @generated
	 */
	IocQueuedSendOperation createIocQueuedSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Queued Read Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Read Operation</em>'.
	 * @generated
	 */
	IocQueuedReadOperation createIocQueuedReadOperation();

	/**
	 * Returns a new object of class '<em>Call Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Api</em>'.
	 * @generated
	 */
	CallApi createCallApi();

	/**
	 * Returns a new object of class '<em>Call Trusted Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Trusted Api</em>'.
	 * @generated
	 */
	CallTrustedApi createCallTrustedApi();

	/**
	 * Returns a new object of class '<em>Disabled In Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabled In Mode</em>'.
	 * @generated
	 */
	DisabledInMode createDisabledInMode();

	/**
	 * Returns a new object of class '<em>Executable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Entity</em>'.
	 * @generated
	 */
	ExecutableEntity createExecutableEntity();

	/**
	 * Returns a new object of class '<em>All Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Interrupt Block Exclude Operation</em>'.
	 * @generated
	 */
	AllInterruptBlockExcludeOperation createAllInterruptBlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Interrupt Block Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Interrupt Block Exclude Operation</em>'.
	 * @generated
	 */
	OsInterruptBlockExcludeOperation createOsInterruptBlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Spinlock Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Spinlock Exclude Operation</em>'.
	 * @generated
	 */
	OsSpinlockExcludeOperation createOsSpinlockExcludeOperation();

	/**
	 * Returns a new object of class '<em>Os Resource Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Resource Exclude Operation</em>'.
	 * @generated
	 */
	OsResourceExcludeOperation createOsResourceExcludeOperation();

	/**
	 * Returns a new object of class '<em>None Exclude Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Exclude Operation</em>'.
	 * @generated
	 */
	NoneExcludeOperation createNoneExcludeOperation();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Constant Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Member</em>'.
	 * @generated
	 */
	ConstantMember createConstantMember();

	/**
	 * Returns a new object of class '<em>Rte Enter Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Enter Api</em>'.
	 * @generated
	 */
	RteEnterApi createRteEnterApi();

	/**
	 * Returns a new object of class '<em>Rte Exit Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Exit Api</em>'.
	 * @generated
	 */
	RteExitApi createRteExitApi();

	/**
	 * Returns a new object of class '<em>Os Task Activation Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activation Executable Task Body</em>'.
	 * @generated
	 */
	OsTaskActivationExecutableTaskBody createOsTaskActivationExecutableTaskBody();

	/**
	 * Returns a new object of class '<em>Os Event Set Executable Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Executable Task Body</em>'.
	 * @generated
	 */
	OsEventSetExecutableTaskBody createOsEventSetExecutableTaskBody();

	/**
	 * Returns a new object of class '<em>Os Task Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Task Activation Operation</em>'.
	 * @generated
	 */
	OsTaskActivationOperation createOsTaskActivationOperation();

	/**
	 * Returns a new object of class '<em>Os Event Set Activation Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Event Set Activation Operation</em>'.
	 * @generated
	 */
	OsEventSetActivationOperation createOsEventSetActivationOperation();

	/**
	 * Returns a new object of class '<em>Timing Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Triggering Executable Start Operation</em>'.
	 * @generated
	 */
	TimingTriggeringExecutableStartOperation createTimingTriggeringExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Switch Triggering Executable Start Operation</em>'.
	 * @generated
	 */
	ModeSwitchTriggeringExecutableStartOperation createModeSwitchTriggeringExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Cycle Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle Countup Operation</em>'.
	 * @generated
	 */
	CycleCountupOperation createCycleCountupOperation();

	/**
	 * Returns a new object of class '<em>Start Offset Countup Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Offset Countup Operation</em>'.
	 * @generated
	 */
	StartOffsetCountupOperation createStartOffsetCountupOperation();

	/**
	 * Returns a new object of class '<em>Ioc Empty Queue Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Empty Queue Api</em>'.
	 * @generated
	 */
	IocEmptyQueueApi createIocEmptyQueueApi();

	/**
	 * Returns a new object of class '<em>Rte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte</em>'.
	 * @generated
	 */
	Rte createRte();

	/**
	 * Returns a new object of class '<em>Com Send Signal Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Trusted Function</em>'.
	 * @generated
	 */
	ComSendSignalTrustedFunction createComSendSignalTrustedFunction();

	/**
	 * Returns a new object of class '<em>Os Set Event Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Set Event Api</em>'.
	 * @generated
	 */
	OsSetEventApi createOsSetEventApi();

	/**
	 * Returns a new object of class '<em>Com Send Signal Immediate Task Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Signal Immediate Task Body</em>'.
	 * @generated
	 */
	ComSendSignalImmediateTaskBody createComSendSignalImmediateTaskBody();

	/**
	 * Returns a new object of class '<em>Com Send Proxy Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Proxy Operation</em>'.
	 * @generated
	 */
	ComSendProxyOperation createComSendProxyOperation();

	/**
	 * Returns a new object of class '<em>Com Send Proxy Complex Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Send Proxy Complex Operation</em>'.
	 * @generated
	 */
	ComSendProxyComplexOperation createComSendProxyComplexOperation();

	/**
	 * Returns a new object of class '<em>Ioc Receive Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Receive Group Api</em>'.
	 * @generated
	 */
	IocReceiveGroupApi createIocReceiveGroupApi();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	ModuleRoot createModuleRoot();

	/**
	 * Returns a new object of class '<em>Inter Partition Timeout Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Partition Timeout Operation</em>'.
	 * @generated
	 */
	InterPartitionTimeoutOperation createInterPartitionTimeoutOperation();

	/**
	 * Returns a new object of class '<em>Variable Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Initialize Operation</em>'.
	 * @generated
	 */
	VariableInitializeOperation createVariableInitializeOperation();

	/**
	 * Returns a new object of class '<em>Ioc Initialize Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Initialize Operation</em>'.
	 * @generated
	 */
	IocInitializeOperation createIocInitializeOperation();

	/**
	 * Returns a new object of class '<em>Os Suspend All Interrupts Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Suspend All Interrupts Api</em>'.
	 * @generated
	 */
	OsSuspendAllInterruptsApi createOsSuspendAllInterruptsApi();

	/**
	 * Returns a new object of class '<em>Os Get Spinlock Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os Get Spinlock Api</em>'.
	 * @generated
	 */
	OsGetSpinlockApi createOsGetSpinlockApi();

	/**
	 * Returns a new object of class '<em>Multicore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicore Rte Start Api</em>'.
	 * @generated
	 */
	MulticoreRteStartApi createMulticoreRteStartApi();

	/**
	 * Returns a new object of class '<em>Rte Buffer Write Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Buffer Write Trusted Function</em>'.
	 * @generated
	 */
	RteBufferWriteTrustedFunction createRteBufferWriteTrustedFunction();

	/**
	 * Returns a new object of class '<em>Rte Cs Trusted Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Cs Trusted Function</em>'.
	 * @generated
	 */
	RteCsTrustedFunction createRteCsTrustedFunction();

	/**
	 * Returns a new object of class '<em>Rte Cs Trusted Runnables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Cs Trusted Runnables</em>'.
	 * @generated
	 */
	RteCsTrustedRunnables createRteCsTrustedRunnables();

	/**
	 * Returns a new object of class '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trusted Function Rte Buffer Write Send Operation</em>'.
	 * @generated
	 */
	TrustedFunctionRteBufferWriteSendOperation createTrustedFunctionRteBufferWriteSendOperation();

	/**
	 * Returns a new object of class '<em>Ioc Send Group Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Send Group Api</em>'.
	 * @generated
	 */
	IocSendGroupApi createIocSendGroupApi();

	/**
	 * Returns a new object of class '<em>Ioc Queued Group Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ioc Queued Group Communication</em>'.
	 * @generated
	 */
	IocQueuedGroupCommunication createIocQueuedGroupCommunication();

	/**
	 * Returns a new object of class '<em>Direct Executable Start Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Executable Start Operation</em>'.
	 * @generated
	 */
	DirectExecutableStartOperation createDirectExecutableStartOperation();

	/**
	 * Returns a new object of class '<em>Singlecore Rte Start Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singlecore Rte Start Api</em>'.
	 * @generated
	 */
	SinglecoreRteStartApi createSinglecoreRteStartApi();

	/**
	 * Returns a new object of class '<em>Rte Internal Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Internal Header</em>'.
	 * @generated
	 */
	RteInternalHeader createRteInternalHeader();

	/**
	 * Returns a new object of class '<em>Mode Request Variable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Request Variable Set</em>'.
	 * @generated
	 */
	ModeRequestVariableSet createModeRequestVariableSet();

	/**
	 * Returns a new object of class '<em>Mode Machine Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Machine Instance</em>'.
	 * @generated
	 */
	ModeMachineInstance createModeMachineInstance();

	/**
	 * Returns a new object of class '<em>Function Macro Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Macro Group</em>'.
	 * @generated
	 */
	FunctionMacroGroup createFunctionMacroGroup();

	/**
	 * Returns a new object of class '<em>Function Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Macro</em>'.
	 * @generated
	 */
	FunctionMacro createFunctionMacro();

	/**
	 * Returns a new object of class '<em>Proxy Function Table Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy Function Table Group</em>'.
	 * @generated
	 */
	ProxyFunctionTableGroup createProxyFunctionTableGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModulePackage getModulePackage();

} //ModuleFactory