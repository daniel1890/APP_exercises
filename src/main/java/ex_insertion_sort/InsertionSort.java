package ex_insertion_sort;

import java.util.Arrays;

public class InsertionSort implements SortBehaviour {

    public void sort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            int toBeInserted = arr[i];

            int j = i;

            while(j > 0 && toBeInserted < arr[j - 1]) {
                System.out.println("Current state before step " + j + " : " + Arrays.toString(arr));
                arr[j] = arr[j - 1];
                System.out.println("Current state after step " + j + " : " + Arrays.toString(arr));

                j--;
            }

            arr[j] = toBeInserted;
        }

    }
}
