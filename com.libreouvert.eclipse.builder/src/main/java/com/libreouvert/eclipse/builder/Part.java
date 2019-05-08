package com.libreouvert.eclipse.builder;

import java.util.Optional;

import static com.libreouvert.eclipse.builder.StatType.*;

public class Part {
    public final String name;
    public final PartType type;
    public final Stat<Atk> atk;
    public final Stat<Def> def;
    public final Stat<Hp> hp;
    public final Stat<Ini> ini;
    public final Stat<Pwr> pwr;
    public final Stat<Spd> spd;
    
    public Part(String name,
                 PartType type,
                 Stat<Atk> atk,
                 Stat<Def> def,
                 Stat<Hp> hp,
                 Stat<Ini> ini,
                 Stat<Pwr> pwr,
                 Stat<Spd> spd) {
        this.name = name;
        this.type = type;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.ini = ini;
        this.pwr = pwr;
        this.spd = spd;
    }
}
