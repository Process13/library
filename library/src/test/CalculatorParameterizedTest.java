package test;

import main.tst.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {

    private Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2,3,5", "-2,-3,-5", "-2,2,0"})
    void addShouldReturnTheSumValuesOfTwoNumbers(int a, int b, int expected) {
        int result = calculator.add(a,b);
        assertEquals(expected,result);
    }
}
