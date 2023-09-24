package ex_7_3;

public class Path implements Comparable<Path> {
    public Vertex dest;
    public double cost;
    public Path(Vertex dest, double cost) {
        this.dest = dest;
        this.cost = cost;
    }
    @Override
    public int compareTo(Path rhs) {
        double otherCost = rhs.cost;

        return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
    }
}
