package ex_5_6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedSymbolCheckerTest {
    BalancedSymbolChecker<String> sut;
    @BeforeEach
    void setUp() {
        sut = new BalancedSymbolChecker<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void processStackSuccesfullyOpenClose() {
        // Act
        sut.processStack("()[]{}");

        // Assert
        assertTrue(sut.isBalanced());
    }

    @Test
    void processStackSuccesfullyOpenAllCloseAll() {
        // Act
        sut.processStack("({[]})");

        // Assert
        assertTrue(sut.isBalanced());
    }

    @Test
    void processStackSuccesfullyClassSymbols() {
        // Act
        sut.processStack("{(){}(){}}");

        // Assert
        assertTrue(sut.isBalanced());
    }

    @Test
    void processStackUnSuccesfully() {
        // Act & Assert
        assertThrows(RuntimeException.class, () -> sut.processStack("()[]{}{"));
        assertFalse(sut.isBalanced());
    }
}