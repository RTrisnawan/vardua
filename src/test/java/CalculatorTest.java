import org.example.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testSumPositiveNumbers() {
        int result = calculator.sum(5, 7);
        assertEquals(12, result, "Penjumlahan dua bilangan positif tidak benar");
    }

    @Test
    void testSumWithZero() {
        int result = calculator.sum(0, 9);
        assertEquals(9, result, "Penjumlahan dengan nol tidak benar");
    }

    @Test
    void testSumNegativeNumbers() {
        int result = calculator.sum(-4, -6);
        assertEquals(-10, result, "Penjumlahan dua bilangan negatif tidak benar");
    }

    @Test
    void testSumMixedSigns() {
        int result = calculator.sum(-3, 8);
        assertEquals(5, result, "Penjumlahan bilangan bertanda berbeda tidak benar");
    }

    @Test
    void testSumWithLargeNumbers() {
        int result = calculator.sum(Integer.MAX_VALUE, 0);
        assertEquals(Integer.MAX_VALUE, result, "Penjumlahan angka besar tidak benar");
    }
}