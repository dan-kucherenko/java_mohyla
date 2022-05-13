public class GraphTesterIncidenceMatrix {
    public static void main(String[] args) {
        int[][] incidenceMatrix = {
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 0}};
        MyGraph myGraph = new MyGraph(incidenceMatrix);
        System.out.println("Your graph implementation from incidence matrix is: \n" + myGraph);
    }
}
