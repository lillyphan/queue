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
    }
}
