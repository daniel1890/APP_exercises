package ex_insertion_sort;

import java.util.Arrays;

public interface InsertionSorter {
    static int[] InsertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int j = arr[i - 1];

            while(j > 0 && j > arr[i]) {
                System.out.println("Current state before step " + i + " : " + Arrays.toString(arr));
                arr[i - 1] = i;
                arr[i] = j;
                System.out.println("Current state after step " + i + " : " + Arrays.toString(arr));

                j--;
            }
        }

        return arr;
    }
}
