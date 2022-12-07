public class testDriver {
    public static void main(String[] args) {
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
