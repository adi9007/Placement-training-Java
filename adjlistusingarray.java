public class adjlistusingarray {
    int[][] adjacencyList;
    int numVertices;

    public adjlistusingarray(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source][destination] = 1;
        adjacencyList[destination][source] = 1;
    }

    public void printGraph() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyList[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjlistusingarray graph = new adjlistusingarray(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2 , 4);
        graph.printGraph();
    }
}
