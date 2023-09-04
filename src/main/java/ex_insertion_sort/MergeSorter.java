package ex_insertion_sort;

import java.util.Arrays;

public interface MergeSorter {
    public static void mergeSort(int[] arr) {
        int[] tempArray = new int[arr.length];

        mergeSort(arr, tempArray, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] tempArr, int left, int right) {
        if(left < right) {
            int center = (left + right) / 2;
            mergeSort(arr, tempArr, left, center);
            mergeSort(arr, tempArr, center + 1, right);

            System.out.println("Current state before step: " + Arrays.toString(arr));
            System.out.println("Current state tempArray before step: " + Arrays.toString(tempArr));
            merge(arr, tempArr, left, center + 1, right);
            System.out.println("Current state after step: " + Arrays.toString(arr));
            System.out.println("Current state tempArray after step: " + Arrays.toString(tempArr));
        }
    }

    private static void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] <= a[rightPos]) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }

        while (leftPos <= leftEnd) {
            tmpArray[tmpPos++] = a[leftPos++];
        }

        while (rightPos <= rightEnd) {
            tmpArray[tmpPos++] = a[rightPos++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }
}
