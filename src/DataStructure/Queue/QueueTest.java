package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(5);
        queue.add(3);
        queue.add(8);
        queue.offer(5);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove(3));
        System.out.println(queue);
        System.out.println(queue.element());
    }
}
