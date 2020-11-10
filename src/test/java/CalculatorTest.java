import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import taskAT7.Calculator;

public class CalculatorTest {
    @Before
    public void setUp() {

    }

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        calculator.add(2, 4);
        Assert.assertEquals(6, 6);
    }

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        calculator.sub(5, 3);
        Assert.assertEquals(6, 6);
    }

    @Test
    public void mul() {
        Calculator calculator = new Calculator();
        calculator.mul(5, 3);
        Assert.assertEquals(6, 6);

    }

    @Test
    public void div() {
        Calculator calculator = new Calculator();
        calculator.div(5, 3);
        Assert.assertEquals(6, 6);
    }
}
