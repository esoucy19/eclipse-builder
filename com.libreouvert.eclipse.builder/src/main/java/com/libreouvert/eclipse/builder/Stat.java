package com.libreouvert.eclipse.builder;

public class Stat<T extends StatType> {
    public final Integer value;
    
    public Stat(Integer value) {
        this.value = value;
    }
    
    public Stat<T> add(Stat<T> addend) {
        return new Stat<>(value + addend.value);
    }
}
