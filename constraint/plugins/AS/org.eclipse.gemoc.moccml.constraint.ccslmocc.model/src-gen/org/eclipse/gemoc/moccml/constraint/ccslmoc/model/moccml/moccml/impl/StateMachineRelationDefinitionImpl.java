/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.impl.ExternalRelationDefinitionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.CcslmoccPackage;
import org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.StateMachineRelationDefinition;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.DeclarationBlock;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.FSMModelPackage;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.State;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.StateMachineDefinition;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Relation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl.StateMachineRelationDefinitionImpl#getDeclarationBlock <em>Declaration Block</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl.StateMachineRelationDefinitionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl.StateMachineRelationDefinitionImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl.StateMachineRelationDefinitionImpl#getInitialStates <em>Initial States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.impl.StateMachineRelationDefinitionImpl#getFinalStates <em>Final States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineRelationDefinitionImpl extends ExternalRelationDefinitionImpl implements StateMachineRelationDefinition {
	/**
	 * The cached value of the '{@link #getDeclarationBlock() <em>Declaration Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationBlock()
	 * @generated
	 * @ordered
	 */
	protected DeclarationBlock declarationBlock;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialStates() <em>Initial States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> initialStates;

	/**
	 * The cached value of the '{@link #getFinalStates() <em>Final States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> finalStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineRelationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcslmoccPackage.Literals.STATE_MACHINE_RELATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclarationBlock getDeclarationBlock() {
		return declarationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarationBlock(DeclarationBlock newDeclarationBlock, NotificationChain msgs) {
		DeclarationBlock oldDeclarationBlock = declarationBlock;
		declarationBlock = newDeclarationBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, oldDeclarationBlock, newDeclarationBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationBlock(DeclarationBlock newDeclarationBlock) {
		if (newDeclarationBlock != declarationBlock) {
			NotificationChain msgs = null;
			if (declarationBlock != null)
				msgs = ((InternalEObject)declarationBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, null, msgs);
			if (newDeclarationBlock != null)
				msgs = ((InternalEObject)newDeclarationBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, null, msgs);
			msgs = basicSetDeclarationBlock(newDeclarationBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, newDeclarationBlock, newDeclarationBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getInitialStates() {
		if (initialStates == null) {
			initialStates = new EObjectResolvingEList<State>(State.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES);
		}
		return initialStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getFinalStates() {
		if (finalStates == null) {
			finalStates = new EObjectResolvingEList<State>(State.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES);
		}
		return finalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return basicSetDeclarationBlock(null, msgs);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return getDeclarationBlock();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return getTransitions();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return getStates();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES:
				return getInitialStates();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				return getFinalStates();
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
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				setDeclarationBlock((DeclarationBlock)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES:
				getInitialStates().clear();
				getInitialStates().addAll((Collection<? extends State>)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				getFinalStates().clear();
				getFinalStates().addAll((Collection<? extends State>)newValue);
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
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				setDeclarationBlock((DeclarationBlock)null);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				getStates().clear();
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES:
				getInitialStates().clear();
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				getFinalStates().clear();
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
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return declarationBlock != null;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return states != null && !states.isEmpty();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES:
				return initialStates != null && !initialStates.isEmpty();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				return finalStates != null && !finalStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StateMachineDefinition.class) {
			switch (derivedFeatureID) {
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK: return FSMModelPackage.STATE_MACHINE_DEFINITION__DECLARATION_BLOCK;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS: return FSMModelPackage.STATE_MACHINE_DEFINITION__TRANSITIONS;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES: return FSMModelPackage.STATE_MACHINE_DEFINITION__STATES;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES: return FSMModelPackage.STATE_MACHINE_DEFINITION__INITIAL_STATES;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES: return FSMModelPackage.STATE_MACHINE_DEFINITION__FINAL_STATES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StateMachineDefinition.class) {
			switch (baseFeatureID) {
				case FSMModelPackage.STATE_MACHINE_DEFINITION__DECLARATION_BLOCK: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK;
				case FSMModelPackage.STATE_MACHINE_DEFINITION__TRANSITIONS: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS;
				case FSMModelPackage.STATE_MACHINE_DEFINITION__STATES: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES;
				case FSMModelPackage.STATE_MACHINE_DEFINITION__INITIAL_STATES: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATES;
				case FSMModelPackage.STATE_MACHINE_DEFINITION__FINAL_STATES: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateMachineRelationDefinitionImpl
