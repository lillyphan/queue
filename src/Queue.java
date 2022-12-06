public class Queue<E> {
    private QueueNode<E> first = null; //reference to the "first" Node of the Queue
    private QueueNode<E> last = null; //reference to the "last" Node of the Queue
    private int size = 0; //number of elements in Queue

    //empty constructor
    public Queue(){}

    //returns instance data size
    public int size(){
        return size;
    }
}
