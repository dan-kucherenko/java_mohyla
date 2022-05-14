public class MyGraph {
    private MyList[] adjacencyList;
    private int[][] incidenceMatrix;
    private int numOfColumns;
    private int numOfRows;

    public MyGraph(int[][] incidenceMatrix) {
        this.incidenceMatrix = incidenceMatrix;
        this.numOfColumns = incidenceMatrix.length;
        this.numOfRows = incidenceMatrix[numOfColumns - 1].length;
        makeEdges();
    }

    private void makeEdges() {
        adjacencyList = new MyList[numOfRows];
        for (int column = 0; column < numOfRows; column++) {
            adjacencyList[column] = new MyList<Integer>();
            for (int row = 0; row < numOfColumns; row++) {
                if (incidenceMatrix[row][column] == 1)
                    adjacencyList[column].add(row + 1);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numOfRows; i++)
            result += (i + 1) + " -> " + adjacencyList[i].toString() + '\n';
        return result;
    }

}
