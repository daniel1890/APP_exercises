package ex_4_24;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCalculatorTest {

    @Test
    void findAndReturnGenericMinimum() {
        // Arrange
        String minString = "bar";
        List<String> stringList = Arrays.asList("foo", minString, "baz", "zip");

        // Act
        String actual = MinimumCalculator.findAndReturnGenericMinimum(stringList);

        // Assert
        assertEquals(minString, actual);
    }
}