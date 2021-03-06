import java.io.*;
import java.util.*;

/**
 * Adjacency list implementation for the FriendshipGraph interface.
 *
 * Your task is to complete the implementation of this class.  You may add methods, but ensure your modified class compiles and runs.
 *
 * @author Jeffrey Chan, 2016.
 */
public class AdjList <T extends Object> implements FriendshipGraph<T>
{

    /**
     * Contructs empty graph.
     */
    public AdjList() {
        // Implement me!

    } // end of AdjList()


    public void addVertex(T vertLabel) {
        // Implement me!
    } // end of addVertex()


    public void addEdge(T srcLabel, T tarLabel) {
        // Implement me!
    } // end of addEdge()


    public ArrayList<T> neighbours(T vertLabel) {
        ArrayList<T> neighbours = new ArrayList<T>();

        // Implement me!

        return neighbours;
    } // end of neighbours()


    public void removeVertex(T vertLabel) {
        // Implement me!
    } // end of removeVertex()


    public void removeEdge(T srcLabel, T tarLabel) {
        // Implement me!
    } // end of removeEdges()


    public void printVertices() {
        // Implement me!
    } // end of printVertices()


    public void printEdges() {
        // Implement me!
    } // end of printEdges()


    public int shortestPathDistance(T vertLabel1, T vertLabel2) {
        // Implement me!

        // if we reach this point, source and target are disconnected
        return disconnectedDist;
    } // end of shortestPathDistance()

    protected class Node<T extends Object> {

        public Node() {

        }
    }
} // end of class AdjList
