package data;

import java.util.Arrays;

public class dynamic_Array <T> {
    Object[] data; //create normal data.array
    int size; // size of data.array

    //constant of data.array
    public dynamic_Array() {
        size = 0;
        data = new Object[1];
    }

    public int getSize() {
        return data.length;
    }
//get lenght of data.array
    public T get(int index){
        // get index of data.array
        return (T) data[index];
    }
    public void insert(int elemnt){
        // put elemnt in data data.array
        incureSize(size+1);
        data[size++] = elemnt ;

    }
    public void incureSize(int minSize){
        //check size of data.array if size big from old size data.array
        // create new data.array at double size and copy elemnt old data.array
        // to the new data.array
        int oldSize = data.length;
        if (minSize>oldSize){
            int newSize = oldSize*2;
            data = Arrays.copyOf(data, newSize);

        }
    }

}

