package linkList_backage;

public class linledListDemo {
    public static void main(String[] args) {
        LinkList ls = new LinkList(new Node(12,null));
        ls.add(new Node(21,null));
        ls.add(new Node(23,null));
        ls.add(new Node(222,null));
        ls.add(new Node(31,null));
        ls.display();
        System.out.println("after delete");
        ls.delete();
        ls.display();

    }
}
