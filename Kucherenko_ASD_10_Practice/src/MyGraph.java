public class MyGraph {
    private MyList[] adjacencyList;
    private int[][] adjacencyMatrix;
    private int numberOfVertices;

    public MyGraph(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        numberOfVertices = adjacencyMatrix.length;
        addAdjacentVertices();
    }

    private void addAdjacentVertices() {
        adjacencyList = new MyList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList[i] = new MyList<Integer>();
        }
        for (int i = 0; i < numberOfVertices; i++) {
            for (int j = 0; j < numberOfVertices; j++) {
                if (adjacencyMatrix[i][j] == 1)
                    adjacencyList[i].add(j + 1);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numberOfVertices; i++)
            result += (i + 1) + " -> " + adjacencyList[i].toString() + '\n';
        return result;
    }
}
