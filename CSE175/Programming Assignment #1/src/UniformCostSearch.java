public class UniformCostSearch {
    Map graph;
    String initialLoc;
    String destinationLoc;
    int limit;

    UniformCostSearch(Map graph, String initialLoc, String destinationLoc, int limit) {
        this.graph = graph;
        this.initialLoc = initialLoc;
        this.destinationLoc = destinationLoc;
        this.limit = limit;
    }
}
