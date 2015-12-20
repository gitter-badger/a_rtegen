/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeDeclarationGroupItemProvider extends ModuleReferrableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDeclarationGroupItemProvider(AdapterFactory adapterFactory) {
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

			addImplementationDataTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implementation Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModeDeclarationGroup_implementationDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModeDeclarationGroup_implementationDataType_feature", "_UI_ModeDeclarationGroup_type"),
				 ModulePackage.Literals.MODE_DECLARATION_GROUP__IMPLEMENTATION_DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TYPE);
			childrenFeatures.add(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT);
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
	 * This returns ModeDeclarationGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModeDeclarationGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModeDeclarationGroup)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModeDeclarationGroup_type") :
			getString("_UI_ModeDeclarationGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ModeDeclarationGroup.class)) {
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TYPE:
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_CONSTANT:
			case ModulePackage.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT:
			case ModulePackage.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT:
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
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TYPE,
				 ModuleFactory.eINSTANCE.createModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_CONSTANT ||
			childFeature == ModulePackage.Literals.MODE_DECLARATION_GROUP__MODE_TRANSITION_STATUS_CONSTANT ||
			childFeature == ModulePackage.Literals.MODE_DECLARATION_GROUP__INIT_MODE_CONSTANT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
