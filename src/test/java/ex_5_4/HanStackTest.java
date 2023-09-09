package ex_5_4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanStackTest {
    private HanStack<Integer> sut;

    @BeforeEach
    void setUp() {
        sut = new HanStack<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pushElementOnTopOfStack() {
        // Arrange
        int element = 1;

        // Act
        sut.push(element);

        // Assert
        assertEquals(element, sut.top());
    }

    @Test
    void popRemovesElementOnTopOfStack() {
        // Arrange
        int bottomElement = 1;
        int topElement = 2;
        sut.push(bottomElement);
        sut.push(topElement);

        // Act
        sut.pop();

        // Assert
        assertEquals(bottomElement, sut.top());
    }

    @Test
    void topAndPopRemovesAndReturnsTopElement() {
        // Arrange
        int bottomElement = 1;
        int topElement = 2;
        sut.push(bottomElement);
        sut.push(topElement);

        // Act
        int result = sut.topAndPop();

        // Assert
        assertEquals(topElement, result);
    }

    @Test
    void isEmptyReturnsTrueIfStackIsEmpty() {
        // Act
        boolean result = sut.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    void isEmptyReturnsFalseIfStackIsNotEmpty() {
        // Arrange
        int element = 1;
        sut.push(element);

        // Act
        boolean result = sut.isEmpty();

        // Assert
        assertFalse(result);
    }

    @Test
    void makeEmptyEmptiesEntireStack() {
        // Arrange
        int elementOne = 1;
        int elementTwo = 2;
        sut.push(elementOne);
        sut.push(elementTwo);

        // Act
        sut.makeEmpty();

        // Assert
        assertTrue(sut.isEmpty());
    }
}