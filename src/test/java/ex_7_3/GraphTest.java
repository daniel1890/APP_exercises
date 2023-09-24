package ex_7_3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Graph sut;

    @BeforeEach
    void setUp() {
        sut = new Graph();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() {
        // Arrange
        int edgeAtoB = 5;
        sut.addEdge("A", "B", edgeAtoB);

        // Act
        System.out.println(sut.toString());

        // Assert
    }
}