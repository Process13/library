package test;
import org.junit.jupiter.api.*;
import main.tst.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Disabled
    @AfterEach
    void tearDown() {
        //t.ex rensa filer efter varje test case
    }

    @Test
    @DisplayName("3+2 should return 5")
    void addShouldReturnTheSumValueOfTwoNumbers() {
        ///AAA
        //Arrange = Förberedelse
        //Calculator calc = new Calculator();

        //Act = Själva anropet
        int result = calc.add(3, 2);

        //Assert = Kontrollen
        assertEquals(5, result);
        /*
        assertNotEquals();
        assertTrue();
        assertFalse();
        assertNull();
        assertNotNull();
        assertAll();

        //We don't have a user class, hence why it is red.
        assertAll(
                () -> assertEquals("name", user.getName()),
                () -> assertEquals(25, user.getAge())
        );

         */
    }

    @Test
    @DisplayName("(-3)+(-2) should return -5")
    void negativeNumbersShouldBeAdded() {
        //Arrange
        //Calculator calc = new Calculator();

        //Act
        int result = calc.add(-3, -2);

        //Assert
        assertEquals(-5, result);
    }




}
