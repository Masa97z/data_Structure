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
        //delete elemnt
        head = head.next;
    }
    public void display(){
        //show elemnt
        Node data = head;
        while (data !=null){
            System.out.print(data.value + "\t->");
            data = data.next ;
        }
    }

}
