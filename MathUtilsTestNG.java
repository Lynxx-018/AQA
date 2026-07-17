import org.example.MathUtils;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MathUtilsTestNG {

    @Test
    public void testFactorial() {
        Assert.assertEquals(MathUtils.factorial(4), 24);
        Assert.assertEquals(MathUtils.factorial(0), 1);
        Assert.assertEquals(MathUtils.factorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-5);
    }

    @Test
    public void testTriangleArea() {
        Assert.assertEquals(MathUtils.triangleArea(5, 4), 10.0);
        Assert.assertEquals(MathUtils.triangleArea(1, 1), 0.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaInvalid() {
        MathUtils.triangleArea(0, 5);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(MathUtils.add(2, 3), 5);
        Assert.assertEquals(MathUtils.add(2, -3), -1);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(MathUtils.subtract(5, 3), 2);
        Assert.assertEquals(MathUtils.subtract(2, 7), -5);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(MathUtils.multiply(3, 5), 15);
        Assert.assertEquals(MathUtils.multiply(0, 10), 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(MathUtils.divide(5, 2), 2.5);
        Assert.assertEquals(MathUtils.divide(0, 5), 0.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        MathUtils.divide(5, 0);
    }

    @Test
    public void testCompare() {
        Assert.assertEquals(MathUtils.compare(5, 3), "5 больше 3");
        Assert.assertEquals(MathUtils.compare(2, 7), "2 меньше 7");
        Assert.assertEquals(MathUtils.compare(4, 4), "4 равно 4");
    }
}
