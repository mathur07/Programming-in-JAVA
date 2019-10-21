package Queue.QueueUsingArray.LinearQueue;

public class LinearQueueMain {

    static int queue_size = 5;

    public static void main(String[] args) {

        LinerQueueImplementation q = new LinerQueueImplementation();

        q.create_queue(queue_size);
        q.print_queue();
        q.de_queue();
        q.en_queue(1);
        q.print_queue();
        q.en_queue(2);
        q.print_queue();
        q.en_queue(3);
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.en_queue(4);
        q.print_queue();
        q.en_queue(5);
        q.print_queue();
        q.en_queue(6);
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.de_queue();
        q.de_queue();
        q.de_queue();
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.de_queue();
        q.de_queue();
        q.de_queue();
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.en_queue(1);
        q.en_queue(2);
        q.en_queue(3);
        q.print_queue();
        q.de_queue();
        q.de_queue();
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.en_queue(4);
        q.peek_start();
        q.peek_end();
        System.out.println();
        q.print_queue();
        q.de_queue();
        q.peek_start();
        q.peek_end();
        q.print_queue();
        q.de_queue();
        q.print_queue();
        q.de_queue();
        q.print_queue();
        q.peek_start();
        q.peek_end();
    }

}
