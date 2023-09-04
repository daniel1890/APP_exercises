import ex2_2.CalculateFactorial;
import ex2_3.CalculateSum;
import ex_2_4.ReturnNBitsOfBinaryRepresentation;
import ex_insertion_sort.InsertionSorter;
import ex_insertion_sort.MergeSorter;

public class Main {
    public static void main(String[] args) {
        // excercise 2.2
        CalculateFactorial calcFact = new CalculateFactorial();

        System.out.println("Calculate factorial of 5 non recursively: " + calcFact.calculateNonRecursively(5));
        System.out.println("Calculate factorial of 5 recursively: " + calcFact.calculateRecursively(5));

        // excercise 2.3
        CalculateSum calcSum = new CalculateSum();

        System.out.println("The sum of 5 non recursively: " + calcSum.CalculateNonRecursively(5));
        System.out.println("The sum of 5 recursively: " + calcSum.calculateRecursively(5));

        // excercise 2.4
        ReturnNBitsOfBinaryRepresentation returnNBits = new ReturnNBitsOfBinaryRepresentation();

        System.out.println("N Bits in binary representation of 5 are: " + returnNBits.CalculateNBitsOfN(5));
        System.out.println("N Bits in binary representation of 8 are: " + returnNBits.CalculateNBitsOfN(8));
        System.out.println("N Bits in binary representation of 16 are: " + returnNBits.CalculateNBitsOfN(16));
        System.out.println("N Bits in binary representation of 255 are: " + returnNBits.CalculateNBitsOfN(255));
        System.out.println("N Bits in binary representation of 256 are: " + returnNBits.CalculateNBitsOfN(256));

        // excercise insertion sort
        int[] toSortArray = new int[]{8, 6, 0, 7, 5, 3, 1};

        InsertionSorter.InsertionSort(toSortArray);
        MergeSorter.mergeSort(toSortArray);
    }
}