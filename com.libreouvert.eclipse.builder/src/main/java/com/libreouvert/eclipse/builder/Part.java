package com.libreouvert.eclipse.builder;

import java.util.Optional;

public class Part {
    public final String name;
    public final PartType type;
    public final Optional<CannonList> cannons;
    public final Optional<MissileList> missiles;
    public final HullValue hull = HullValue.of(0);
    public final ComputerValue computer = ComputerValue.of(0);
    public final ShieldValue shield = ShieldValue.of(0);
    public final DriveValue drive = DriveValue.of(0);
    public final EnergyValue energy = EnergyValue.of(0);
    public final SlotValue slots = SlotValue.of(0)
    
    private Part(String name,
                 PartType type,
                 ComputerValue computer,
                 EnergyValue power) {
        this.name = name;
        this.type = type;
        this.computer = computer;
        this.energy = power;
    }
    
    public static Part with(String name,
                            PartType type,
                            ComputerValue computer,
                            EnergyValue power) {
        return new Part(name, type, computer, power);
    }
}
