package ex_generic_sorting;

public abstract class GenericSorter implements GenericSortBehaviour{
    public GenericSortBehaviour getSortBehaviour() {
        return sortBehaviour;
    }

    public void setSortBehaviour(GenericSortBehaviour sortBehaviour) {
        this.sortBehaviour = sortBehaviour;
    }

    private GenericSortBehaviour sortBehaviour;

}
