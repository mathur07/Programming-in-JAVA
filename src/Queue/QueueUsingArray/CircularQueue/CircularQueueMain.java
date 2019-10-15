package Queue.QueueUsingArray.CircularQueue;

public class CircularQueueMain {
    static int queue_size = 5;
    public static void main(String[] args) {

        CircularQueueImplementation q =new CircularQueueImplementation();

        q.create_queue(queue_size);
        q.print_queue();
        q.de_queue();
        q.en_queue(1);
        q.print_queue();
        q.en_queue(2);
        q.print_queue();
        q.peek();
        q.en_queue(3);
        q.peek();
        q.print_queue();
        q.en_queue(4);
        q.print_queue();
        q.en_queue(5);
        q.print_queue();
        q.en_queue(6);
        q.peek();
        q.print_queue();
        q.de_queue();
        q.de_queue();
        q.de_queue();
        q.peek();
        q.print_queue();
        System.out.println("=========================================");
        q.de_queue();
        q.print_queue();
        q.peek();
        q.de_queue();//<================|
        q.print_queue();
        q.peek();
        q.de_queue();
        q.peek();
        q.print_queue();
        q.en_queue(1);
        q.en_queue(2);
        q.en_queue(3);
        q.print_queue();
        q.de_queue();
        q.de_queue();
        q.peek();
        q.print_queue();
        q.en_queue(4);
        q.peek();
        q.print_queue();
        q.de_queue();
        q.peek();
        q.print_queue();
        q.de_queue();
        q.print_queue();
        q.de_queue();
        q.print_queue();
        q.peek();

    }
}
