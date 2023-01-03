package QUEUE;

public class QueueDemo {
    public static void main(String[] args) {
        queue<Integer> Q = new queue<Integer>(6);
        Q.insert(1);
        Q.insert(2);
        Q.insert(9);
        Q.insert(3);
        System.out.println(Q.delete());
        Q.insert(1);
        Q.insert(2);
        Q.insert(9);
        Q.insert(3);

        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());
        System.out.println(Q.delete());



    }
}
