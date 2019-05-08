package com.libreouvert.eclipse.builder;

import org.junit.Test;
import static org.junit.Assert.*;

import static com.libreouvert.eclipse.builder.StatType.*;
import static com.libreouvert.eclipse.builder.PartType.*;

public class BuilderTest {
    
    public BuilderTest() {
    }

    //@Test
    //public void testCreateAShip() {
    //    testShip = Unit.with(Terran, Frigate, parts);
    //}
    
    @Test
    public void testCreatePart() {
        Part testPart = new Part("Positron Computer",
                                  COMPUTER,
                                  new Stat<Atk>(2),
                                  new Stat<Def>(0),
                                  new Stat<Hp>(0),
                                  new Stat<Ini>(0),
                                  new Stat<Pwr>(-1),
                                  new Stat<Spd>(0));
        assertEquals(testPart.name, "Positron Computer");
    }
    
    //@Test
    //public void testCreatePartsList() {}
    
    @Test
    public void testAddStat() {
        var speed1 = new Stat<Spd>(1);
        var speed2 = new Stat<Spd>(2);
        assertEquals(speed1.add(speed2).value, (Integer)3);
        
    }
}
