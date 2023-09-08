package ex_generic_sorting;

import java.util.List;

public class GenericQuickSort implements GenericSortBehaviour {

    public <AnyType extends Comparable<AnyType>> void sort(List<AnyType> list) {
        quickSort(list, 0, list.size() - 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static <AnyType extends Comparable<AnyType>> void quickSort(List<AnyType> list, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(list, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    // A utility function to swap two elements
    static <AnyType extends Comparable<AnyType>> void swap(List<AnyType> list, int i, int j) {
        AnyType temp = list.get(i);
        AnyType swapper = list.get(j);

        list.set(i, swapper);
        list.set(j, temp);
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static <AnyType extends Comparable<AnyType>> int partition(List<AnyType> list, int low, int high) {
        // Choosing the pivot
        AnyType pivot = list.get(high);

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (list.get(j).compareTo(pivot) < 0) {

                // Increment index of smaller element
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return (i + 1);
    }

    // To print sorted array
    public static <AnyType extends Comparable<AnyType>> void printList(List<AnyType> list) {
        for (AnyType anyType : list) {
            System.out.print(anyType + " ");
        }
    }

}
