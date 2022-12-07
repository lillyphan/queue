/**
 * Queue
 * Author: Lilly Phan
 * Date: 12/07/2021
 * Queue is a linear data structure that follows First In First Out
 **/

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

    //add element to queue in a queuenode to the end
    public void enqueue(E element){
        if (!isEmpty()) { //if the queue is not empty
            QueueNode<E> l = last; //create a new reference to old last
            last = new QueueNode<E>(element); //reassign last to new Node containing element
            l.setParent(last); //set parents of previous last to new last
        } else {
            first = new QueueNode<E>(element); //add element as first and last
            last = first;
        }
        size++; //increment size
    }

    //removes least recent element in queue and returns it's data value
    public E dequeue(){
        if (!isEmpty()){ //if queue is empty
            QueueNode<E> f = first; //add new reference to old first
            first = f.getParent(); //first reassigned to the parent of old first
            f.setParent(null); //old first is no longer linked to the queue
            size--; //decrement size
            return f.getData(); //return data in QueueNode
        } else {
            return null; //return null because queue is empty
        }
    }

    //returns the data value of the least recent element in queue without removing it
    public E peek(){
        if (isEmpty()){ //if the queue is empty return null
            return null;
        } else {
            return first.getData(); //otherwise return the data of the first in the queue
        }
    }

@Override
    //returns a string with ordered elements of queue
    public String toString(){
        if (!isEmpty()) { //if not empty
            QueueNode<E> node = first;
            String s = "Queue: ";
            while (node.getParent() != null) { //until the end of the queue
                s = s.concat(node.getData() + " "); //append data value onto the returned string
                node = node.getParent(); //reassign node the parent of current node
            }
            s = s + node.getData(); //append data value of last element
            return s; //return the string
        } else {
            return "empty"; //return empty if empty
        }
    }
}
