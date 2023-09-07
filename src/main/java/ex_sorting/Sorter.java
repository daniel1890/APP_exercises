package ex_sorting;

public abstract class Sorter {
    private SortBehaviour sortBehaviour;

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
