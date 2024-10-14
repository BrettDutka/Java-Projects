/**
 *  Creates an immutable queue
 * @param <T> the type of elements in the queue
 */
public class PQueue<T> {
    /**
     * A node in the queue.
     * @param <T> Type of elements
     */
    private static class Node<T> {
        final T value;
        Node<T> next;

        /**
         * Creates a new node with the specific value given and the next node after it
         * @param value the given value that will be stored in the node
         * @param next the next node in the queue
         */
        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
    private final Node<T> firstPointer;
    private final Node<T> lastPointer;
    private final int size;

    /**
     * Creates a new PQueue with specific first and last pointers and also the size.
     * @param firstPointer the first node of the queue
     * @param lastPointer the last node of the queue
     * @param size the number of elements in the queue
     */
    private PQueue(Node<T> firstPointer, Node<T> lastPointer, int size){
        this.firstPointer = firstPointer;
        this.lastPointer = lastPointer;
        this.size = size;
    }

    /**
     * Creates an empty PQueue
     */
    public PQueue(){
        this(null, null, 0);
    }

    /**
     * Returns the new PQueue with given element added to the end of it
     * @param t the given element that will be added to the end
     * @return a new PQueue that has the given added
     */
    public PQueue<T> enqueue(T t){
        Node<T> newNode = new Node<>(t, null);
        if(this.lastPointer == null)
            return new PQueue<>(newNode, newNode,1);
        else{
            Node<T> newLast = new Node<>(this.lastPointer.value, newNode);
            return new PQueue<>(this.firstPointer, newLast, this.size + 1);
        }
    }

    /**
     * Returns a new PQueue where the first element is removed
     * @return a new PQueue that has the removed element
     */
    public PQueue<T> dequeue(){
        if(firstPointer == null)
            return this;
        else
            return new PQueue<>(firstPointer.next, lastPointer, size - 1);

    }

    /**
     * Gets the head of the queue
     * @return the head of the queue or null if the queue is empty
     */
    public T peek() {
        return(firstPointer != null ? firstPointer.value : null);
    }

    /**
     * Makes a new PQueue that contains elements from the given vals
     * @param vals the elements that need to be added into the new queue
     * @return a new PQueue that has the given in it.
     * @param <T> the type of elements
     */
    public static <T> PQueue<T> of(T... vals){
        Node<T> tmp = new Node<>(null, null);
        Node<T> currentVal = tmp;
        for (T val : vals) {
            currentVal.next = new Node<>(val, null);
            currentVal = currentVal.next;
        }
        return new PQueue<>(tmp.next, currentVal, vals.length);
    }

    /**
     * Gets the number of elements in the queue
     * @return number of elements in the entire queue
     */
    public int size(){
        return size;
    }

    /**
     * Compares the object with the queue to test if they are the same or not.
     * @param o the object that is going to be tested against the queue
     * @return true if they are equal and false if they are not
     */
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;

        if(!(o instanceof PQueue))
            return false;

        PQueue<?> otherVal = (PQueue<?>) o;
        if(this.size != otherVal.size)
            return false;

        Node<T> currentVal1 = this.firstPointer;
        Node<?> currentVal2 = otherVal.firstPointer;
        while(currentVal1 != null && currentVal2 != null){
            if(!currentVal1.value.equals(currentVal2.value)){
                return false;
            }
            currentVal1 = currentVal1.next;
            currentVal2 = currentVal2.next;
        }
        return true;
    }
}
