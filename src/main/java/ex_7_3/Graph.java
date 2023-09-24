package ex_7_3;

// Graph class: evaluate shortest paths.
//
// CONSTRUCTION: with no parameters.
//
// ******************PUBLIC OPERATIONS**********************
// void addEdge( String v, String w, double cvw )
// --> Add additional edge
// void printPath( String w ) --> Print path after alg is run
// void unweighted( String s ) --> Single-source unweighted
// void dijkstra( String s ) --> Single-source weighted
// void negative( String s ) --> Single-source negative weighted
// void acyclic( String s ) --> Single-source acyclic
// ******************ERRORS*********************************
// Some error checking is performed to make sure that graph is ok
// and that graph satisfies properties needed by each
// algorithm. Exceptions are thrown if errors are detected.

import ex_5_3.HanLinkedList;
import ex_5_5.HanQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;

    public void addEdge(String sourceName, String destName, double cost) {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);

        v.adj.add(new Edge(w, cost));
    }

    public void printPath(String destName) {
        Vertex w = vertexMap.get(destName);

        if (w == null) {
            throw new NoSuchElementException();
        }
        else if (w.dist == INFINITY) {
            System.out.println(destName + " is unreachable");
        }
        else {
            System.out.println( "(Cost is: " + w.dist + ") ");
            printPath(w);
            System.out.println( );
        }
    }

    public void unweighted(String startName) {
        clearAll();

        Vertex start = vertexMap.get(startName);

        if (start == null) {
            throw new NoSuchElementException( "Start vertex not found" );
        }

        HanQueue<Vertex> queue = new HanQueue<>();
        queue.enqueue(start);
        start.dist = 0;

        while (queue.getFront() != null) {
            Vertex v = queue.dequeue();

            for(Edge e : v.adj) {
                Vertex w = e.dest;

                if (w.dist == INFINITY) {
                    w.dist = v.dist + 1;
                    w.prev = v;
                    queue.enqueue(w);
                }
            }
        }
    }

    public void dijkstra(String startName) { /* Figure 14.27 */ }

    public void negative(String startName) { /* Figure 14.29 */ }

    public void acyclic(String startName) { /* Figure 14.32 */ }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vertex v : vertexMap.values()) {
            sb.append("Current vertex: ").append(v.name).append("\n").append("Adjecents:");

            for (Edge e : v.adj) {
                sb.append(" ").append(e.dest.name).append(", weight: ").append(e.cost).append("\n");
            }
        }

        return sb.toString();
    }

    private Vertex getVertex(String vertexName) {
        Vertex v = vertexMap.get(vertexName);

        if (v == null) {
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }

        return v;
    }

    private void printPath(Vertex dest) {
        if(dest.prev != null) {
            printPath(dest.prev);
            System.out.println("to");
        }

        System.out.println(dest.name);
    }

    private void clearAll() {
        for(Vertex v : vertexMap.values()) {
            v.reset();
        }
    }

    private final Map<String, Vertex> vertexMap = new HashMap<>();
}

// Used to signal violations of preconditions for
// various shortest path algorithms.
class GraphException extends RuntimeException {
    public GraphException(String name) {
        super(name);
    }
}

