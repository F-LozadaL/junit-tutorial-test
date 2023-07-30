package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var g = new Grader();
        assertEquals('F',g.determineLetterGrade(59));
    }
    @Test
    void sixtyShouldReturnD(){
        var g = new Grader();
        assertEquals('D',g.determineLetterGrade(60));
    }
    @Test
    void seventyThreeShouldReturnC(){
        var g = new Grader();
        assertEquals('C',g.determineLetterGrade(73));
    }
    @Test
    void eightyFourShouldReturnB(){
        var g = new Grader();
        assertEquals('B',g.determineLetterGrade(84));
    }
    @Test
    void oneHundredShouldReturnA(){
        var g = new Grader();
        assertEquals('A',g.determineLetterGrade(100));
    }
    @Test
    void eightyShouldReturnB(){
        var g = new Grader();
        assertEquals('B',g.determineLetterGrade(80));
    }
    @Test
    void minusOneShouldReturnIllegalException(){
        var g = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    g.determineLetterGrade(-1);
                });
    }
}