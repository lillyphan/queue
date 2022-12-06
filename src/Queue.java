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

    //returns true if stack is empty
    public boolean isEmpty(){
        return (last == null);
    }

    public void enqueue(E element){
        QueueNode<E> f = first;
        first = new QueueNode<E>(element);
        f.setParent(first);
        size++;
    }

    public E dequeue(){
        if (!isEmpty()){
            QueueNode<E> l = last;
            last = l.getParent();
            l.setParent(null);
            size--;
            return l.getData();
        } else {
            return null;
        }
    }

    public E peek(){
        if (isEmpty()){
            return null;
        } else {
            return last.getData();
        }
    }
}
