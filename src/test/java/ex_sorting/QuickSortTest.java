package ex_sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    private SortBehaviour sut;
    private Sorter quickSorter;

    @BeforeEach
    void setUp() {
        sut = new QuickSort();
        quickSorter = new QuickSorter(sut);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void UnsortedTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 29;
        int[] unsortedTestArray = new int[]{6, 2, 8, 10, 24, smallestNumber, biggestNumber, 19, 3};
        int[] sortedTestArray = new int[]{smallestNumber, 2, 3, 6, 8, 10, 19, 24, biggestNumber};

        // Act
        quickSorter.sort(unsortedTestArray);

        // Assert
        assertEquals(smallestNumber, unsortedTestArray[0]);
        assertEquals(biggestNumber, unsortedTestArray[unsortedTestArray.length - 1]);
        assertArrayEquals(unsortedTestArray, sortedTestArray);
    }

    @Test
    void EvenTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 1;
        int[] evenTestArray = new int[]{smallestNumber, 1, 1, 1, 1, 1, biggestNumber};
        int[] sortedTestArray = new int[]{smallestNumber, 1, 1, 1, 1, 1, biggestNumber};

        // Act
        quickSorter.sort(evenTestArray);

        // Assert
        assertEquals(smallestNumber, evenTestArray[0]);
        assertEquals(biggestNumber, evenTestArray[evenTestArray.length - 1]);
        assertArrayEquals(evenTestArray, sortedTestArray);
    }

    @Test
    void DecliningTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 5;
        int[] decliningTestArray = new int[]{biggestNumber, 4, 3, 2, smallestNumber};
        int[] sortedTestArray = new int[]{smallestNumber, 2, 3, 4, biggestNumber};

        // Act
        quickSorter.sort(decliningTestArray);

        // Assert
        assertEquals(smallestNumber, decliningTestArray[0]);
        assertEquals(biggestNumber, decliningTestArray[decliningTestArray.length - 1]);
        assertArrayEquals(decliningTestArray, sortedTestArray);
    }

    @Test
    void GrowingTestArrayGetsSorted() {
        // Arrange
        int smallestNumber = 1;
        int biggestNumber = 5;
        int[] growingTestArray = new int[]{smallestNumber, 2, 3, 4, biggestNumber};
        int[] sortedTestArray = new int[]{smallestNumber, 2, 3, 4, biggestNumber};

        // Act
        quickSorter.sort(growingTestArray);

        // Assert
        assertEquals(smallestNumber, growingTestArray[0]);
        assertEquals(biggestNumber, growingTestArray[growingTestArray.length - 1]);
        assertArrayEquals(growingTestArray, sortedTestArray);
    }
}