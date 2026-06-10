import java.util.Scanner;

public class Graphinputmatrix {
    int[][] adjacencyMatrix;
    int numVertices;

    // Constructor
    public Graphinputmatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Add edge
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // Undirected graph
    }

    // Print adjacency matrix
    public void printGraph() {
        System.out.println("\nAdjacency Matrix:");

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        // Create graph
        Graphinputmatrix graph = new Graphinputmatrix(vertices);

        // Input number of edges
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        // Input edges
        for (int i = 0; i < edges; i++) {

            System.out.print("Enter source vertex: ");
            int source = sc.nextInt();

            System.out.print("Enter destination vertex: ");
            int destination = sc.nextInt();

            graph.addEdge(source, destination);
        }

        // Print graph
        graph.printGraph();

        sc.close();
    }
}