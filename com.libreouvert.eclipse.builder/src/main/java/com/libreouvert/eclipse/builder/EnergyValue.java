package com.libreouvert.eclipse.builder;

public class EnergyValue extends Value {
    
    private EnergyValue (Integer value) {
       super(value);
    }
    
    public static EnergyValue of(Integer value) {
        return new EnergyValue(value);
    }
}
