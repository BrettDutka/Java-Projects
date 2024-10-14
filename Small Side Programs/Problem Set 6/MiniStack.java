public class MiniStack<T> {

    // Initialize instance Variables
    private static final int INITIAL_CAPACITY = 10;
    private T[] elements;
    private int size;




    // Constructor
    public MiniStack() {
        //Write code for the constructor here
        elements = (T[])new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // Method to resize the array if necessary
    private void resizeIfNeeded() {
        //Write code here for resizeIfNeeded method
        if(size == elements.length){
            T[] newElements = (T[])new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    // Method to add an element onto the top of the stack
    public void add(T t) {
        //Write code here for add method
        resizeIfNeeded();
        elements[size++] = t;
    }

    // Method to return (but not remove) the top-most element of the stack
    public T peek() {
        //Write code here for peek method
        if(size == 0){
            return null;
        }
        return elements[size - 1];
    }

    // Method to return and remove the top-most element of the stack
    public T pop() {
        //Write code here for pop method
        if(size == 0){
            return null;
        }
        T topElement = elements[--size];
        elements[size] = null;
        return topElement;
    }

    // Method to return the number of logical elements in the stack
    public int size() {
        //Write code here
        return size;
    }

    // Method to override toString
    @Override
    public String toString() {
        //write code logic here
        if(size == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = size - 1; i >= 0; i--){
            sb.append(elements[i]);
            if(i > 0){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // Test the MiniStack class
}
