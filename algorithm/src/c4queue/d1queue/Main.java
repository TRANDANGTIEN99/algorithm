package c4queue.d1queue;

public class Main {
    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();

        intQueue.enQueue(3);
        intQueue.enQueue(6);
        intQueue.enQueue(3);
        intQueue.enQueue(11);
        System.out.println(intQueue.isEmpty());

        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());

        System.out.println(intQueue.isEmpty());

        for (int i = 0; i < 15; i++) {

        }

    }
}
