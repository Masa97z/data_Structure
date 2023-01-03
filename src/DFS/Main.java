package DFS;

public class Main {
    public static void main(String[] args) {
        dffss graph = new dffss();
        graph.addNode("A");
         graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");
        graph.addNode("H");


        graph.addEdage("A","B");
        graph.addEdage("A","D");
        graph.addEdage("B","C");
        graph.addEdage("B","F");
        graph.addEdage("C","H");
        graph.addEdage("C","E");
        graph.addEdage("C","G");
        graph.addEdage("D","F");
        graph.addEdage("E","F");
        graph.addEdage("E","B");
        graph.addEdage("H","A");
        graph.addEdage("G","H");
        graph.addEdage("G","E");
        graph.tdf("A");

    }
}
