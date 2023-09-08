package ex_generic_sorting;

import java.util.List;

public interface GenericSortBehaviour {
    <AnyType extends Comparable<AnyType>> void sort(List<AnyType> list);
}
