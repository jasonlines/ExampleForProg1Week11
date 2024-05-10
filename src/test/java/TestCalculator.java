import org.junit.jupiter.api.*;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        System.out.println("This prints");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing the add method")
    public void testAdd(){
        Assertions.assertEquals(calculator.add(5,6),11);
        Assertions.assertEquals(calculator.add(2,6),8);
        Assertions.assertEquals(calculator.add(2,2),4);
    }

    @Test
    @DisplayName("Testing the multiply method")
    public void testMultiply(){
        Assertions.assertEquals(calculator.multiply(2,2),4);
        Assertions.assertEquals(calculator.multiply(2,4),8);
    }


}
