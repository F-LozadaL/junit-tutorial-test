package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    //correct result but wrong code
    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator sp = new SimpleCalculator();
        assertEquals(4, sp.add(2,2));
    }

    //incorrect result and wrong code
    @Test
    void threePlusThreeShouldEqualSix(){
        SimpleCalculator sp = new SimpleCalculator();
        assertEquals(6, sp.add(3,3));
    }
}