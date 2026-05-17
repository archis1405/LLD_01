package lld11.collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Alok");
        queue.offer("Pradeep");

        System.out.println(queue.poll());

        Deque<String> stack = new ArrayDeque<>();
        stack.push("Alok");
        stack.push("Pradeep");
        // Alok, Pradeep
        System.out.println(stack.pop());


        // Also used
        Queue<String> waitingList = new LinkedList<>();

        // Enqueue
        waitingList.add("Customer 1");
        waitingList.add("Customer 2");
        waitingList.add("Customer 3");

        // Peek — view front without removing
        System.out.println(waitingList.peek());  // "Customer 1"

        // Dequeue — remove from front
        String next = waitingList.poll();
        System.out.println("Serving: " + next);  // "Customer 1"

        System.out.println(waitingList.size());  // 2


    }
}
