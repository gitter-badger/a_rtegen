/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider extends ModuleReferrableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReturnTypePropertyDescriptor(object);
			addMemoryMappingPropertyDescriptor(object);
			addSymbolNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_returnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_returnType_feature", "_UI_Function_type"),
				 ModulePackage.Literals.FUNCTION__RETURN_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_memoryMapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_memoryMapping_feature", "_UI_Function_type"),
				 ModulePackage.Literals.FUNCTION__MEMORY_MAPPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symbol Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_symbolName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_symbolName_feature", "_UI_Function_type"),
				 ModulePackage.Literals.FUNCTION__SYMBOL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModulePackage.Literals.FUNCTION__PARAM);
			childrenFeatures.add(ModulePackage.Literals.FUNCTION__LOCAL_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.FUNCTION__LOCAL_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Function)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_Function_type") :
			getString("_UI_Function_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Function.class)) {
			case ModulePackage.FUNCTION__SYMBOL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModulePackage.FUNCTION__PARAM:
			case ModulePackage.FUNCTION__LOCAL_VARIABLE:
			case ModulePackage.FUNCTION__LOCAL_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__PARAM,
				 ModuleFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_VARIABLE,
				 ModuleFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createModeQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createBlackboxType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRteBufferQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.FUNCTION__LOCAL_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPointerType()));
	}

}
