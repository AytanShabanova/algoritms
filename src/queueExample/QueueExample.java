package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.element());
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//.NoSuchElementException

    }
}
