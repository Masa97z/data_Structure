package DFS;

import java.util.Stack;

class Node {
    int dest;
    Node next;
    public  Node(int dest, Node next){
        this.dest = dest;
        this.next = next;
    }
}
 class arraylist {
    Node head;
}

public class graph {
     int size;
     arraylist[] array;
     public graph(int size){
        this.size = size;
        array = new arraylist[this.size];
        for (int i =0; i<size; i++){
            array[i]= new arraylist();
            array[i].head = null;

        }
     }
     public void add(int src , int dest){
         Node n = new Node(dest,null);
         n.next = array[src].head = n;
     }
     public void explore(int startNode){
         boolean[] visited = new boolean[size];
         for (int i = 0; i<size; i++) {
             visited[i] = false;
         }
         Stack<Integer> stack = new Stack<Integer>();
         stack.push(startNode);
         while (! stack.isEmpty()){
             int n = stack.pop();
             stack.push(n);
             visited[n] = true;
             Node head = array[n].head;
             boolean isDone = true;
             while (head!=null){
                 if (visited[head.dest]== false){
                     stack.push(head.dest);
                     visited[head.dest] = true;
                     isDone = false;
                     break;
                 }else{
                     head = head.next;
                 }
             }if (isDone == true){
                 int out  = stack.pop();
                 System.out.println("vistit ->"+ out);
             }


         }
     }

    public static void main(String[] args) {
        graph g = new graph(9+1);
        g.add(0,1);
        g.add(0,2);
        g.add(1,2);
        g.add(1,5);
        g.add(2,4);
        g.add(2,6);
        g.add(2,7);
        g.add(3,4);
        g.add(4,1);
        g.add(4,5);
        g.add(5,0);
        g.add(6,5);
        g.add(6,7);
        g.add(7,0);

        g.explore(0);

    }
}
