public class MyGraph {
    private MyList[] adjacencyList;
    private int[][] incidenceMatrix;
    private int numberOfVertices;

    public MyGraph(int[][] incidenceMatrix) {
        this.adjacencyList = adjacencyList;
        numberOfVertices = incidenceMatrix.length;
    }

    private void addIncidentVertices() {
        adjacencyList = new MyList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList[i] = new MyList<Integer>();
            for (int j = 0; j < numberOfVertices; j++) {
                if (incidenceMatrix[i][j] == 1)
                    adjacencyList[i].add(j + 1);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        return result;
    }

}
