/**
 * QueueNode
 * Author: Lilly Phan
 * Date: 12/07/2021
 * QueueNode acts as the basic data unit of Queue
 **/

public class QueueNode<E> {
    private QueueNode<E> parent;
    private E data;

    public QueueNode(){
        //empty constructor
    }

    public QueueNode(E data){
        //constructor with one data parameter
        this.data = data;
    }

    public QueueNode(E data, QueueNode<E> parent){
        //constructor with two parameters for data and parent QueueNode
        this.data = data;
        this.parent = parent;
    }

    //accessors
    public E getData() {
        //returns data
        return data;
    }

    public QueueNode<E> getParent() {
        //returns parent QueueNode
        return parent;
    }

    //mutators
    public void setData(E data) {
        this.data = data;
    }

    public void setParent(QueueNode<E> parent) {
        //changes instance QueueNode parent to specified QueueNode
        this.parent = parent;
    }

    //other

    @Override
    public String toString() {
        //overrides Objects' toString and returns a string specifying data of the QueueNode
        return "QueueNode: " + data;
    }

    public boolean equals(QueueNode<E> QueueNode) {
        //overrides Objects' equals and returns a string specifying whether the data of each QueueNode is equal using .equals
        return data.equals(QueueNode.data);
    }

}