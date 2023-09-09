package ex_5_5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanQueueTest {
    private HanQueue<Integer> sut;
    @BeforeEach
    void setUp() {
        this.sut = new HanQueue<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueueAddsElementToBackOfQueue() {
        // Arrange
        int frontElement = 1;
        int backElement = 2;

        // Act
        this.sut.enqueue(frontElement);
        this.sut.enqueue(backElement);

        // Assert
        assertEquals(frontElement, this.sut.getFront());
    }

    @Test
    void dequeueRemovesElementFirstInQueue() {
        // Arrange
        int frontElement = 1;
        int backElement = 2;

        // Act
        this.sut.enqueue(frontElement);
        this.sut.enqueue(backElement);

        // Assert
        assertEquals(frontElement, this.sut.dequeue());
        assertEquals(backElement, this.sut.getFront());
    }
}