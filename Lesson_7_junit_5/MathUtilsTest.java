import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathUtilsTest {

    @Test
    void testFactorial() {
        Assertions.assertEquals(24, MathUtils.factorial(4));
        Assertions.assertEquals(1, MathUtils.factorial(0));
        Assertions.assertEquals(1, MathUtils.factorial(1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-5));
    }

    @Test
    void testTriangleArea() {
        Assertions.assertEquals(10.0, MathUtils.triangleArea(5, 4));
        Assertions.assertEquals(0.5, MathUtils.triangleArea(1, 1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.triangleArea(0, 5));
    }

    @Test
    void testAdd() {
        Assertions.assertEquals(5, MathUtils.add(2, 3));
        Assertions.assertEquals(-1, MathUtils.add(2, -3));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(2, MathUtils.subtract(5, 3));
        Assertions.assertEquals(-5, MathUtils.subtract(2, 7));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(15, MathUtils.multiply(3, 5));
        Assertions.assertEquals(0, MathUtils.multiply(0, 10));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2.5, MathUtils.divide(5, 2));
        Assertions.assertEquals(0.0, MathUtils.divide(0, 5));
        Assertions.assertThrows(ArithmeticException.class, () -> MathUtils.divide(5, 0));
    }

    @Test
    void testCompare() {
        Assertions.assertEquals("5 больше 3", MathUtils.compare(5, 3));
        Assertions.assertEquals("2 меньше 7", MathUtils.compare(2, 7));
        Assertions.assertEquals("4 равно 4", MathUtils.compare(4, 4));
    }
}