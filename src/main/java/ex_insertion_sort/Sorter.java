package ex_insertion_sort;

public abstract class Sorter {
    SortBehaviour sortBehaviour;

    public void sort(int[] arr) {
        sortBehaviour.sort(arr);
    }

    public SortBehaviour getSortBehaviour() {
        return sortBehaviour;
    }

    public void setSortBehaviour(SortBehaviour sortBehaviour) {
        this.sortBehaviour = sortBehaviour;
    }
}
