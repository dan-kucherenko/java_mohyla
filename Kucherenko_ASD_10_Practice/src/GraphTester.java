

public class GraphTester {
    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 0}};
        MyGraph myGraph = new MyGraph(adjacencyMatrix);
        System.out.println("Your graph implementation is: \n" + myGraph);
    }
}



