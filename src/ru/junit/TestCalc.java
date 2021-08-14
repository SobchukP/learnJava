package ru.junit;

import ru.learn.Calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    Calc calc = new Calc();

    @Test
    private void testPlus() {
        assertEquals(calc.plus(1, 2), 3.0);
    }

    @Test
    void testMinus(){
        assertEquals(calc.minus(5,4), 1.0);
    }

    @Test
    void testMultiply(){
        assertEquals(calc.multiply(5,4), 20.0);

    }

    @Test
    void testDivizion(){
        assertEquals(calc.division(5,5), String.valueOf(1.0));
        assertTrue(calc.division(5,0) instanceof String && calc.division(5,0).equals(calc.ERROR_DIVISION));
    }

    @Test
    void testPower(){
        assertEquals(calc.power(5,2), 25.0);
    }

}
