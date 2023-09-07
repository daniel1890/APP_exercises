package ex_4_33;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square bigSquare;
    Square smallSquare;

    @BeforeEach
    void setUp() {
        bigSquare = new Square(10, 8);
        smallSquare = new Square(5, 4);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareBigSquareToSmallSquareReturns1() {
        // Act
        int result = bigSquare.compareTo(smallSquare);
        int expected = 1;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void compareSmallSquareToBigSquareReturnsMinus1() {
        // Act
        int result = smallSquare.compareTo(bigSquare);
        int expected = -1;

        // Assert
        assertEquals(expected, result);
    }
}