package ex_4_29;

//Modify the MemoryCell to implement Comparable<MemoryCell>.
public class MemoryCell<AnyType extends Comparable<AnyType>> implements Comparable<MemoryCell<AnyType>>{
    private AnyType storedValue;
    public AnyType read( ) {
        return storedValue;
    }
    public void write( AnyType x ) {
        storedValue = x;
    }

    @Override
    public int compareTo(MemoryCell<AnyType> o) {
        return this.read().compareTo(o.read());
    }
}
