package Queue.QueueUsingArray.LinearQueue;

public class LinerQueueImplementation {

    int[] queue;
    int queue_start = -1;
    int queue_end = -1;

    public void create_queue(int queue_size) {
        queue = new int[queue_size];
    }

    public void en_queue(int data) {
        if (is_full()) {
            System.out.println("Queue Is Full!, Cannot EnQueue!");
        } else if (queue_start == -1 && queue_end == -1) {
            queue_start++;
            queue_end++;
            queue[queue_end] = data;
        } else {
            queue_end++;
            queue[queue_end] = data;
        }
    }

    public void de_queue() {
        if (is_empty()) {
            System.out.println("Queue Is Empty, Cannot DeQueue!");
        } else if (queue_start < queue_end) {
            queue[queue_start] = Integer.MIN_VALUE;
            queue_start++;
        } else if(queue_start==queue_end){
            queue[queue_start] = Integer.MIN_VALUE;
            queue_start =-1;
            queue_end=-1;
        }

    }

    public boolean is_empty() {
        if (queue_start == -1 && queue_end == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is_full() {
        if (queue_end == queue.length - 1) {
            return true;
        } else {
            return false;
        }
    }


    public void peek_start() {
        System.out.println("queue_start_index = " + queue_start);
    }

    public void peek_end() {
        System.out.println("queue_end_index = " + queue_end);
    }

    public void print_queue() {
        for (int i = 0; i < queue.length; i++) {
            System.out.printf(queue[i] + " | ");
        }
        System.out.println();
    }
}
