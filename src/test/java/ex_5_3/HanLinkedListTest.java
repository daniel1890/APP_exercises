package ex_5_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanLinkedListTest {
    private HanLinkedList<Integer> sut;

    @BeforeEach
    void setUp() {
        sut = new HanLinkedList<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addIntegerToLastOfListAndReturnLastValueSuccesfully() {
        // Arrange
        Integer expected = 1;
        int expectedLength = 2;

        // Act
        sut.addLast(2);
        sut.addLast(expected);

        // Assert
        assertEquals(expected, sut.getLast());
        assertEquals(expectedLength, sut.getLength());
    }

    @Test
    void addIntegerToFirstOfListReturnsFirstValueSuccesfully() {
        // Arrange
        Integer expected = 1;
        int expectedLength = 2;

        // Act
        sut.addFirst(2);
        sut.addFirst(expected);

        // Assert
        assertEquals(expected, sut.getFirst());
        assertEquals(expectedLength, sut.getLength());
    }
    @Test
    void removeFirstRemovesFirstIntegerOfList() {
        // Arrange
        Integer expected = 1;
        int expectedLength = 1;

        // Act
        sut.addFirst(2);
        sut.addFirst(expected);

        // Assert
        assertEquals(expected, sut.removeFirst());
        assertEquals(expectedLength, sut.getLength());
    }

    @Test
    void removeLastRemovesLastIntegerOfList() {
        // Arrange
        Integer expected = 1;
        int expectedLength = 1;

        // Act
        sut.addLast(2);
        sut.addLast(expected);

        // Assert
        assertEquals(expected, sut.removeLast());
        assertEquals(expectedLength, sut.getLength());
    }
}