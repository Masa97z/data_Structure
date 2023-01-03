package DFS;

import java.util.*;

public class dffss {
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "label'"+label+ '\''+
                    '}';
        }
    }

    private Map<String, Node> nodes = new HashMap<>();


    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    //اضافة نود
    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // اضافة جسر او مسار
    public void addEdage(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null) {
            throw new IllegalArgumentException();
        }
        var toNode = nodes.get(to);
        if (toNode == null) {
            throw new IllegalArgumentException();

        }
        // بداية الجسر نهاية الجسراو المسار
        adjacencyList.get(fromNode).add(toNode);
        adjacencyList.get(toNode).add(fromNode);
    }
// اضهار المودات
    public void print() {
        for (var source : adjacencyList.keySet()) {
            var target = adjacencyList.get(source);
            if (!target.isEmpty()) {
                System.out.println(source + " -> " + target);
            }
        }
    }

    // البحث العميق
    public void tdf(String root){
        tdf(nodes.get(root),new HashSet<>());
    }
    private void tdf(Node root, Set<Node> viseted){
        System.out.println(root);
        viseted.add(root);
        for (var node:adjacencyList.get(root)){
            if (!viseted.contains(node)){
                tdf(node,viseted);
            }
        }

    }


    // ال
    public void trsvarseB(String root){
        var node = nodes.get(root);
        if (node == null)
            return;
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()){
            var curre = queue.remove();

            if (visited.contains(curre))
                continue;
            System.out.println(curre);
            visited.add(curre);

            for (var neighbour: adjacencyList.get(curre)){
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }


        }

    }
}
