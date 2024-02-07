package list.interfaces;

import java.util.Iterator;

public class ArrayIterator <T> implements Iterator <T>{

    private int index;
    private T[] arr;

    public ArrayIterator(T[] arr){
        this.arr = arr;
        this.index = 0;

    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
