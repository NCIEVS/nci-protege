
package edu.stanford.smi.protegex.owl.swrl.bridge.impl;

import edu.stanford.smi.protegex.owl.swrl.bridge.VariableAtomArgument;

/**
 * Interface representing a variable argument to a SWRL atom
 */
public class VariableAtomArgumentImpl extends ArgumentImpl implements VariableAtomArgument
{
  public VariableAtomArgumentImpl(String variableName) { super(variableName); }
  
  public String toString() { return getVariableName(); }
} // VariableAtomArgumentImpl
