package ex_generic_sorting;

import java.util.List;

public class GenericQuickSorter extends GenericSorter {
    public GenericQuickSorter(GenericSortBehaviour sortBehaviour) {
        setSortBehaviour(sortBehaviour);
    }


    @Override
    public <AnyType extends Comparable<AnyType>> void sort(List<AnyType> list) {
        getSortBehaviour().sort(list);
    }
}
