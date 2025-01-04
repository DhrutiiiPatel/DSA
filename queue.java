import java.util.LinkedList;
import java.util.Queue;

public class queue{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("dhruti");
        queue.add("dhvanit");
        queue.add("harshil");
        queue.add("dhrumil");

        System.out.println("Queue: " + queue);

        String front = queue.remove();
        System.out.println("Removed element: " + front);

        System.out.println("Queue after removal: " + queue);

        queue.add("date");

        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue after peek: " + queue);
    }
}