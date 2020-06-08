public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    private int len = 0;        //length of array that user has access to
    private int capacity = 0;   //actual length of array

    public DynamicArray(){
        this(16);               //length of array for first iteration
    }

    public DynamicArray (int capacity){
        if (capacity < 0) throw new IllegalArgumentException("Wrong capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;     //Returns true if the array is empty
    }

    public T get(int index){
        return arr[index];
    }

    public void clear(){        //used to empty the array
        for (int i = 0; i < len; i++)
            arr[i] = null;
        len=0;
    }

    public void add(T elem){

        if (len + 1 >= capacity){
            if(capacity == 0){
                capacity = 1;
            }
            else 
            {
                capacity*=2;
            }
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++)
                new_arr[i] = arr[i];
            arr = new_arr[];        //capacity of array updated
        }
        arr[len++] = elem;
    }

    public T removeAt(int rm_index){
        if (rm_index >= len || rm_index <0 ) throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len-1];
        for (int i = 0, j=0; i < len; i++,j++){
            if (i == rm_index)
                j--;
            else 
                new_arr[j] = arr[i];
        }
        arr =  new_arr;
        capacity = --len;
        return data;
    }

    public static void main (String args[]){
        System.out.println("Hello World");
    }
}
