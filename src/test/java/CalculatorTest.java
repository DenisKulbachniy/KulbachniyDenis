import org.junit.Assert;
import org.junit.Test;
import taskAT7.Calculator;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 4);
        Assert.assertEquals(6, result, 0);
    }

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(5, 3);
        Assert.assertEquals(2, result, 0);
    }

    @Test
    public void mul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(5, 3);
        Assert.assertEquals(15, result,0);

    }

    @Test
    public void div() {
        Calculator calculator = new Calculator();
        try {
            double result = calculator.div(10, 5);
            Assert.assertEquals(2.0, result, 0);
        } catch (Exception e) {
            System.out.println("It`s forbidden to divide by 0");
        }
    }
}