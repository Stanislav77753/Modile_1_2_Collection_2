import java.util.Iterator;

public class MyCollectionFixSize<T> implements Iterable {

    private final int capacity;
    private T[] array;
    private int size;
    public MyCollectionFixSize(){
        capacity = 16;
        array = (T[])new Object[capacity];
        size = 0;
    }

    public MyCollectionFixSize(int initCapacity){
        capacity = initCapacity;
        array = (T[])new Object[capacity];
        size = 0;
    }

    public void add(T element){
        if(size == capacity){
            T[] tempArray = (T[])new Object[capacity];
            System.arraycopy(array, 1, array, 0, size - 1);
            array[size - 1] = element;
        }
        else{
            array[size] = element;
            size++;
        }
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = new Iterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Object next() {
                return array[currentIndex++];
            }

        };
        return iterator;
    }
}
