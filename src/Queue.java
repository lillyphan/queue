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
        return (first == null);
    }

    public void enqueue(E element){
        if (!isEmpty()) {
            QueueNode<E> l = last;
            last = new QueueNode<E>(element);
            l.setParent(last);
        } else {
            first = new QueueNode<E>(element);
            last = first;
        }
        size++;
    }

    public E dequeue(){
        if (!isEmpty()){
            QueueNode<E> f = first;
            last = f.getParent();
            f.setParent(null);
            size--;
            return f.getData();
        } else {
            return null;
        }
    }

    public E peek(){
        if (isEmpty()){
            return null;
        } else {
            return first.getData();
        }
    }

@Override
    public String toString(){
        if (!isEmpty()) {
            QueueNode<E> node = first;
            String s = "Queue: ";
            while (node.getParent() != null) {
                s = s.concat(node.getData() + " ");
                node = node.getParent();
            }
            s = s + node.getData();
            return s;
        } else {
            return "empty";
        }
    }
}
