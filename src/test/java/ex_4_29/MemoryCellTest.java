package ex_4_29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryCellTest {
    MemoryCell<Integer> mInt1;
    MemoryCell<Integer> mInt2;
    MemoryCell<String> mString1;
    MemoryCell<String> mString2;

    @BeforeEach
    void setUp() {
        mInt1 = new MemoryCell<>();
        mInt2 = new MemoryCell<>();
        mString1 = new MemoryCell<>();
        mString2 = new MemoryCell<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareBigIntMemoryCellToSmallerIntReturns1() {
        // Arrange
        int expected = 1;

        // Act
        mInt1.write(8);
        mInt2.write(2);

        // Assert
        int result = mInt1.compareTo(mInt2);
        assertEquals(expected, result);
    }

    @Test
    void compareSmallIntMemoryCellToBiggerIntReturnsMinus1() {
        // Arrange
        int expected = -1;

        // Act
        mInt1.write(2);
        mInt2.write(8);

        // Assert
        int result = mInt1.compareTo(mInt2);
        assertEquals(expected, result);
    }

    @Test
    void compareBiggerStringMemoryCellToSmallerStringReturns1() {
        // Arrange
        int expected = 1;

        // Act
        mString1.write("foo");
        mString2.write("eoo");

        // Assert
        int result = mString1.compareTo(mString2);
        assertEquals(expected, result);
    }

    @Test
    void compareSmallerStringMemoryCellToSmallerStringReturnsMinus1() {
        // Arrange
        int expected = -1;

        // Act
        mString1.write("foo");
        mString2.write("goo");

        // Assert
        int result = mString1.compareTo(mString2);
        assertEquals(expected, result);
    }
}