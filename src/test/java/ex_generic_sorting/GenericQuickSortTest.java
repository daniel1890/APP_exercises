package ex_generic_sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericQuickSortTest {
    private GenericSortBehaviour sut;
    private GenericSorter quickSorter;

    @BeforeEach
    void setUp() {
        sut = new GenericQuickSort();
        quickSorter = new GenericQuickSorter(sut);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void UnsortedIntegerTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 29;
        List<Integer> unsortedTestArray = new ArrayList<>(Arrays.asList(6, 2, 8, 10, 24, smallestNumber, biggestNumber, 19, 3));
        List<Integer> sortedTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 2, 3, 6, 8, 10, 19, 24, biggestNumber));


        // Act
        quickSorter.sort(unsortedTestArray);

        // Assert
        assertEquals(smallestNumber, unsortedTestArray.get(0));
        assertEquals(biggestNumber, unsortedTestArray.get(unsortedTestArray.size() - 1));
        assertIterableEquals(unsortedTestArray, sortedTestArray);
    }

    @Test
    void EvenIntegerTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 1;
        List<Integer> evenTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 1, 1, 1, 1, 1, biggestNumber));
        List<Integer> sortedTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 1, 1, 1, 1, 1, biggestNumber));

        // Act
        quickSorter.sort(evenTestArray);

        // Assert
        assertEquals(smallestNumber, evenTestArray.get(0));
        assertEquals(biggestNumber, evenTestArray.get(evenTestArray.size() - 1));
        assertIterableEquals(evenTestArray, sortedTestArray);
    }

    @Test
    void DecliningIntegerTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 5;
        List<Integer> decliningTestArray = new ArrayList<>(Arrays.asList(biggestNumber, 4, 3, 2, smallestNumber));
        List<Integer> sortedTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 2, 3, 4, biggestNumber));

        // Act
        quickSorter.sort(decliningTestArray);

        // Assert
        assertEquals(smallestNumber, decliningTestArray.get(0));
        assertEquals(biggestNumber, decliningTestArray.get(decliningTestArray.size() - 1));
        assertIterableEquals(decliningTestArray, sortedTestArray);
    }

    @Test
    void GrowingIntegerTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 5;
        List<Integer> growingTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 2, 3, 4, biggestNumber));
        List<Integer> sortedTestArray = new ArrayList<>(Arrays.asList(smallestNumber, 2, 3, 4, biggestNumber));

        // Act
        quickSorter.sort(growingTestArray);

        // Assert
        assertEquals(smallestNumber, growingTestArray.get(0));
        assertEquals(biggestNumber, growingTestArray.get(growingTestArray.size() - 1));
        assertIterableEquals(growingTestArray, sortedTestArray);
    }

    @Test
    void DecliningStringTestArrayGetsSorted() {
        // Arrange
        String biggestString = "foo";
        String smallestString = "boo";
        List<String> decliningTestArray = new ArrayList<>(Arrays.asList(biggestString, "eoo", "doo", "coo", smallestString));
        List<String> sortedTestArray = new ArrayList<>(Arrays.asList(smallestString, "coo", "doo", "eoo", biggestString));

        // Act
        quickSorter.sort(decliningTestArray);

        // Assert
        assertEquals(smallestString, decliningTestArray.get(0));
        assertEquals(biggestString, decliningTestArray.get(decliningTestArray.size() - 1));
        assertIterableEquals(decliningTestArray, sortedTestArray);
    }
}