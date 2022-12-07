/**
 * testDriver
 * Author: Lilly Phan
 * Date: 12/07/2021
 * testDriver tests all methods from QueueNode and Queue
 **/

public class testDriver {
    public static void main(String[] args) {
        //testing constructors
        QueueNode<Integer> n = new QueueNode<>();
        QueueNode<Integer> n1 = new QueueNode<>(2);
        QueueNode<Integer> n2 = new QueueNode<>(1, n1);

        //testing getData
        System.out.println("null: " + n.getData());
        System.out.println("2: " + n1.getData());

        //testing getParent
        System.out.println("null: " + n.getParent());
        System.out.println("2: " + n2.getParent().getData());

        //testing setData
        n.setData(100);
        n1.setData(200);
        n2.setData(300);

        System.out.println("100: " + n.getData());
        System.out.println("200: " + n1.getData());
        System.out.println("300: " + n2.getData());

        //testing setParent
        n1.setParent(n);
        System.out.println("100: " + n1.getParent().getData());

        //testing toString
        System.out.println("QueueNode: 200: " + n1);

        //testing equals
        n2.setData(200);
        System.out.println("true: " + n1.equals(n2));

        //testing constructors
        Queue<Integer> q = new Queue<>();
        Queue<Integer> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>();

        //testing enqueue
        q.enqueue(1);
        q2.enqueue(0);
        q2.enqueue(1);
        q2.enqueue(2);

        //testing size
        System.out.println("1: " + q.size());
        System.out.println("0: " + q1.size());
        System.out.println("3: " + q2.size());

        //testing isEmpty
        System.out.println("true: " + q1.isEmpty());
        System.out.println("false: " + q.isEmpty());

        //testing toString
        System.out.println("Queue: 0 1 2: " + q2);
        System.out.println("empty: " + q1);

        //testing dequeue
        System.out.println("null: " + q1.dequeue());
        q2.dequeue();
        q.dequeue();

        System.out.println("Queue: 1 2: " + q2);
        System.out.println("empty: " + q);

        //testing peek
        q.enqueue(69);

        System.out.println("69: " + q.peek());
        System.out.println("null: " + q1.peek());
        System.out.println("1: " + q2.peek());
    }
}
