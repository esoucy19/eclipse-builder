package com.libreouvert.eclipse.builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuilderTest {
    
    public BuilderTest() {
    }

    //@Test
    //public void testCreateAShip() {
    //    testShip = Unit.with(Terran, Frigate, parts);
    //}
    
    @Test
    public void testCreatePart() {
        Part testPart = Part.with("Positron Computer",
                                  PartType.COMPUTER,
                                  ComputerValue.of(2),
                                  EnergyValue.of(-1));
        assertEquals(testPart.name, "Positron Computer");
    }
    
    @Test
    public void testCreatePartsList() {
        PartsList testParts = ;
    }
    
}
