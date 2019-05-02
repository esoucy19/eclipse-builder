package com.libreouvert.eclipse.builder;

public class ComputerValue extends Value {
    
    private ComputerValue (Integer value) {
       super(value);
    }
    
    public static ComputerValue of(Integer value) {
        return new ComputerValue(value);
    }
}
