import java.util.Arrays;

public class dynamic_Array {
    int[] data;
    int size;

    public dynamic_Array() {
        size = 0;
        data = new int[1];
    }

    public int getSize() {
        return data.length;
    }

    public int get(int index){
        // get index of array
        return data[index];
    }
    public void insert(int elemnt){
        // put elemnt in data array
        incureSize(size+1);
        data[size++] = elemnt ;

    }
    public void incureSize(int minSize){
        //check size of array if size big from old size array
        // create new array at double size and copy elemnt old array
        // to the new array
        int oldSize = data.length;
        if (minSize>oldSize){
            int newSize = oldSize*2;
            data = Arrays.copyOf(data, newSize);

        }
    }

}

