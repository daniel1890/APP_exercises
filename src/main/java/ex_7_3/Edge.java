package ex_7_3;

class Edge {
    public Vertex dest; // Second vertex in Edge
    public double cost; // Edge cost

    public Edge(Vertex d, double c) {
        dest = d;
        cost = c;
    }
}