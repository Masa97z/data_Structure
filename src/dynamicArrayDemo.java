public class dynamicArrayDemo {
    public static void main(String[] args) {
        dynamic_Array<Integer> dArray = new dynamic_Array<Integer>() ;
        dArray.insert(3);
        System.out.println(dArray.getSize());
        dArray.insert(3);
        System.out.println(dArray.getSize());
        dArray.insert(3);
        System.out.println(dArray.getSize());
        dArray.insert(3);
        System.out.println(dArray.getSize());
        dArray.insert(3);
        System.out.println(dArray.getSize());
    }
}
