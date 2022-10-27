package linkList_backage;

public class LinkList {
    Node head; //first Node

    public LinkList(Node head) {
        this.head = head;
    }
    public void add(Node newNode){
        //add elemnt
        newNode.next = head;
        head = newNode;
    }
    public void delete(){
        head = head.next;
    }
    public void display(){
        Node n = head;
        while (n!=null){
            System.out.print(n.value + "\t->");
            n = n.next ;
        }
    }

}
