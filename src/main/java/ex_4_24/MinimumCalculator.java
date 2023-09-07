package ex_4_24;

import java.util.List;

public class MinimumCalculator {
    public static <T extends Comparable<T>> T findAndReturnGenericMinimum(List<T> list) {

        T min = list.stream().min(T::compareTo).orElse(null);

        return min;
    }
}
