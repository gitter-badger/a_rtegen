/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.provider;

import java.util.ArrayList;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.util.ExAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExItemProviderAdapterFactory extends ExAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueExItemProvider timeValueExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.TimeValueEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeValueExAdapter() {
		if (timeValueExItemProvider == null) {
			timeValueExItemProvider = new TimeValueExItemProvider(this);
		}

		return timeValueExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignmentTypeExItemProvider alignmentTypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AlignmentTypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlignmentTypeExAdapter() {
		if (alignmentTypeExItemProvider == null) {
			alignmentTypeExItemProvider = new AlignmentTypeExItemProvider(this);
		}

		return alignmentTypeExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicSwComponentTypeExItemProvider atomicSwComponentTypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AtomicSwComponentTypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicSwComponentTypeExAdapter() {
		if (atomicSwComponentTypeExItemProvider == null) {
			atomicSwComponentTypeExItemProvider = new AtomicSwComponentTypeExItemProvider(this);
		}

		return atomicSwComponentTypeExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationExItemProvider valueSpecificationExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSpecificationExAdapter() {
		if (valueSpecificationExItemProvider == null) {
			valueSpecificationExItemProvider = new ValueSpecificationExItemProvider(this);
		}

		return valueSpecificationExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonqueuedSenderComSpecExItemProvider nonqueuedSenderComSpecExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.NonqueuedSenderComSpecEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNonqueuedSenderComSpecExAdapter() {
		if (nonqueuedSenderComSpecExItemProvider == null) {
			nonqueuedSenderComSpecExItemProvider = new NonqueuedSenderComSpecExItemProvider(this);
		}

		return nonqueuedSenderComSpecExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompuMethodExItemProvider compuMethodExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompuMethodExAdapter() {
		if (compuMethodExItemProvider == null) {
			compuMethodExItemProvider = new CompuMethodExItemProvider(this);
		}

		return compuMethodExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompuScaleExItemProvider compuScaleExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuScaleEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompuScaleExAdapter() {
		if (compuScaleExItemProvider == null) {
			compuScaleExItemProvider = new CompuScaleExItemProvider(this);
		}

		return compuScaleExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDataTypeExItemProvider applicationDataTypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ApplicationDataTypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationDataTypeExAdapter() {
		if (applicationDataTypeExItemProvider == null) {
			applicationDataTypeExItemProvider = new ApplicationDataTypeExItemProvider(this);
		}

		return applicationDataTypeExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationDataTypeExItemProvider implementationDataTypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationDataTypeExAdapter() {
		if (implementationDataTypeExItemProvider == null) {
			implementationDataTypeExItemProvider = new ImplementationDataTypeExItemProvider(this);
		}

		return implementationDataTypeExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveAreaExItemProvider exclusiveAreaExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExclusiveAreaEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusiveAreaExAdapter() {
		if (exclusiveAreaExItemProvider == null) {
			exclusiveAreaExItemProvider = new ExclusiveAreaExItemProvider(this);
		}

		return exclusiveAreaExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverToSignalMappingExItemProvider senderReceiverToSignalMappingExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalMappingEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSenderReceiverToSignalMappingExAdapter() {
		if (senderReceiverToSignalMappingExItemProvider == null) {
			senderReceiverToSignalMappingExItemProvider = new SenderReceiverToSignalMappingExItemProvider(this);
		}

		return senderReceiverToSignalMappingExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverToSignalGroupMappingExItemProvider senderReceiverToSignalGroupMappingExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.SenderReceiverToSignalGroupMappingEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSenderReceiverToSignalGroupMappingExAdapter() {
		if (senderReceiverToSignalGroupMappingExItemProvider == null) {
			senderReceiverToSignalGroupMappingExItemProvider = new SenderReceiverToSignalGroupMappingExItemProvider(this);
		}

		return senderReceiverToSignalGroupMappingExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsTaskExItemProvider osTaskExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.OsTaskEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOsTaskExAdapter() {
		if (osTaskExItemProvider == null) {
			osTaskExItemProvider = new OsTaskExItemProvider(this);
		}

		return osTaskExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalExItemProvider comSignalExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComSignalExAdapter() {
		if (comSignalExItemProvider == null) {
			comSignalExItemProvider = new ComSignalExItemProvider(this);
		}

		return comSignalExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSignalGroupExItemProvider comSignalGroupExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ComSignalGroupEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComSignalGroupExAdapter() {
		if (comSignalGroupExItemProvider == null) {
			comSignalGroupExItemProvider = new ComSignalGroupExItemProvider(this);
		}

		return comSignalGroupExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucPartitionExItemProvider ecucPartitionExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EcucPartitionEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEcucPartitionExAdapter() {
		if (ecucPartitionExItemProvider == null) {
			ecucPartitionExItemProvider = new EcucPartitionExItemProvider(this);
		}

		return ecucPartitionExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataPrototypeExItemProvider variableDataPrototypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataPrototypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDataPrototypeExAdapter() {
		if (variableDataPrototypeExItemProvider == null) {
			variableDataPrototypeExItemProvider = new VariableDataPrototypeExItemProvider(this);
		}

		return variableDataPrototypeExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInCompositionExItemProvider variableDataInstanceInCompositionExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInCompositionEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDataInstanceInCompositionExAdapter() {
		if (variableDataInstanceInCompositionExItemProvider == null) {
			variableDataInstanceInCompositionExItemProvider = new VariableDataInstanceInCompositionExItemProvider(this);
		}

		return variableDataInstanceInCompositionExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataInstanceInSwcExItemProvider variableDataInstanceInSwcExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.VariableDataInstanceInSwcEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDataInstanceInSwcExAdapter() {
		if (variableDataInstanceInSwcExItemProvider == null) {
			variableDataInstanceInSwcExItemProvider = new VariableDataInstanceInSwcExItemProvider(this);
		}

		return variableDataInstanceInSwcExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVariableDataInstanceInSwcExItemProvider pVariableDataInstanceInSwcExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.PVariableDataInstanceInSwcEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPVariableDataInstanceInSwcExAdapter() {
		if (pVariableDataInstanceInSwcExItemProvider == null) {
			pVariableDataInstanceInSwcExItemProvider = new PVariableDataInstanceInSwcExItemProvider(this);
		}

		return pVariableDataInstanceInSwcExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RVariableDataInstanceInSwcExItemProvider rVariableDataInstanceInSwcExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.RVariableDataInstanceInSwcEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRVariableDataInstanceInSwcExAdapter() {
		if (rVariableDataInstanceInSwcExItemProvider == null) {
			rVariableDataInstanceInSwcExItemProvider = new RVariableDataInstanceInSwcExItemProvider(this);
		}

		return rVariableDataInstanceInSwcExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROperationInstanceInSwcExItemProvider rOperationInstanceInSwcExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ROperationInstanceInSwcEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROperationInstanceInSwcExAdapter() {
		if (rOperationInstanceInSwcExItemProvider == null) {
			rOperationInstanceInSwcExItemProvider = new ROperationInstanceInSwcExItemProvider(this);
		}

		return rOperationInstanceInSwcExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyDataInstanceConnectorExItemProvider assemblyDataInstanceConnectorExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.AssemblyDataInstanceConnectorEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyDataInstanceConnectorExAdapter() {
		if (assemblyDataInstanceConnectorExItemProvider == null) {
			assemblyDataInstanceConnectorExItemProvider = new AssemblyDataInstanceConnectorExItemProvider(this);
		}

		return assemblyDataInstanceConnectorExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverExItemProvider receiverExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ReceiverEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReceiverExAdapter() {
		if (receiverExItemProvider == null) {
			receiverExItemProvider = new ReceiverExItemProvider(this);
		}

		return receiverExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEcuSenderExItemProvider externalEcuSenderExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExternalEcuSenderEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalEcuSenderExAdapter() {
		if (externalEcuSenderExItemProvider == null) {
			externalEcuSenderExItemProvider = new ExternalEcuSenderExItemProvider(this);
		}

		return externalEcuSenderExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityStarterExItemProvider entityStarterExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.EntityStarterEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityStarterExAdapter() {
		if (entityStarterExItemProvider == null) {
			entityStarterExItemProvider = new EntityStarterExItemProvider(this);
		}

		return entityStarterExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswSchedulableEntityExItemProvider bswSchedulableEntityExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.BswSchedulableEntityEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBswSchedulableEntityExAdapter() {
		if (bswSchedulableEntityExItemProvider == null) {
			bswSchedulableEntityExItemProvider = new BswSchedulableEntityExItemProvider(this);
		}

		return bswSchedulableEntityExItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeDeclarationGroupPrototypeExItemProvider modeDeclarationGroupPrototypeExItemProvider;

	/**
	 * This creates an adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ModeDeclarationGroupPrototypeEx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeDeclarationGroupPrototypeExAdapter() {
		if (modeDeclarationGroupPrototypeExItemProvider == null) {
			modeDeclarationGroupPrototypeExItemProvider = new ModeDeclarationGroupPrototypeExItemProvider(this);
		}

		return modeDeclarationGroupPrototypeExItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (timeValueExItemProvider != null) timeValueExItemProvider.dispose();
		if (alignmentTypeExItemProvider != null) alignmentTypeExItemProvider.dispose();
		if (atomicSwComponentTypeExItemProvider != null) atomicSwComponentTypeExItemProvider.dispose();
		if (valueSpecificationExItemProvider != null) valueSpecificationExItemProvider.dispose();
		if (nonqueuedSenderComSpecExItemProvider != null) nonqueuedSenderComSpecExItemProvider.dispose();
		if (compuMethodExItemProvider != null) compuMethodExItemProvider.dispose();
		if (compuScaleExItemProvider != null) compuScaleExItemProvider.dispose();
		if (applicationDataTypeExItemProvider != null) applicationDataTypeExItemProvider.dispose();
		if (implementationDataTypeExItemProvider != null) implementationDataTypeExItemProvider.dispose();
		if (exclusiveAreaExItemProvider != null) exclusiveAreaExItemProvider.dispose();
		if (senderReceiverToSignalMappingExItemProvider != null) senderReceiverToSignalMappingExItemProvider.dispose();
		if (senderReceiverToSignalGroupMappingExItemProvider != null) senderReceiverToSignalGroupMappingExItemProvider.dispose();
		if (osTaskExItemProvider != null) osTaskExItemProvider.dispose();
		if (comSignalExItemProvider != null) comSignalExItemProvider.dispose();
		if (comSignalGroupExItemProvider != null) comSignalGroupExItemProvider.dispose();
		if (ecucPartitionExItemProvider != null) ecucPartitionExItemProvider.dispose();
		if (variableDataPrototypeExItemProvider != null) variableDataPrototypeExItemProvider.dispose();
		if (variableDataInstanceInCompositionExItemProvider != null) variableDataInstanceInCompositionExItemProvider.dispose();
		if (variableDataInstanceInSwcExItemProvider != null) variableDataInstanceInSwcExItemProvider.dispose();
		if (pVariableDataInstanceInSwcExItemProvider != null) pVariableDataInstanceInSwcExItemProvider.dispose();
		if (rVariableDataInstanceInSwcExItemProvider != null) rVariableDataInstanceInSwcExItemProvider.dispose();
		if (rOperationInstanceInSwcExItemProvider != null) rOperationInstanceInSwcExItemProvider.dispose();
		if (assemblyDataInstanceConnectorExItemProvider != null) assemblyDataInstanceConnectorExItemProvider.dispose();
		if (receiverExItemProvider != null) receiverExItemProvider.dispose();
		if (externalEcuSenderExItemProvider != null) externalEcuSenderExItemProvider.dispose();
		if (entityStarterExItemProvider != null) entityStarterExItemProvider.dispose();
		if (bswSchedulableEntityExItemProvider != null) bswSchedulableEntityExItemProvider.dispose();
		if (modeDeclarationGroupPrototypeExItemProvider != null) modeDeclarationGroupPrototypeExItemProvider.dispose();
	}

}
