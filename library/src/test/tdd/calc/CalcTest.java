package test.tdd.calc;

import main.tdd.calc.Calc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    /*
    add()
    subtract()
    Divide()
    Multiply()
     */
    private Calc calc;
    int result;

    @BeforeEach
    void setup(){
        calc = new Calc();
    }
    @Test
    void addShouldReturnTheSumOfTwoValues(){
        result = calc.add(2, 2);
        assertEquals(4, result);
    }
    @Test
    void subtractShoudReturnTheSumOfTwoSubtractedValues(){
        result = calc.subtract(3, 1);
        assertEquals(2, result);
    }
    @Test
    void divideShouldReturnTheSumOfDivision(){
        result = calc.divide(6, 3);
        assertEquals(2, result);
    }
    @Test
    void multiplyShouldReturnTheSumOfMultiplication(){
        result = calc.multiply(3, 3);
        assertEquals(9, result);
    }
}
