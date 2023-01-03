package QUEUE;

public class  queue <T>{
    Object[] ArrayQueue;
    int Rear;
    int Front;
    int Size ;
    public queue(int Size){
        //constractor
        this.Size = Size;
        ArrayQueue = new Object[this.Size];
        Front = -1;
        Rear =-1;
    }
    public void insert(Object newitem){
        if (isFull()){
            System.out.println("is full");
            return;}
        Rear +=1;
        ArrayQueue[Rear]= newitem;
        if (Front == -1)
            Front = 1;
    }
    public T delete(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        T objectout = (T)ArrayQueue[Front];
        Front+=1;
        return objectout;

    }

        boolean isFull(){return (Rear == Size -1);}
    boolean isEmpty(){return (Front ==  -1 || Front>Rear);}
}
