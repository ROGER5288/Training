package Queue;

public class QueueArrayEg {

 int front, rear;
 int[] queue;
 int size;

 public QueueArrayEg(int size) {
     this.size = size;
     queue = new int[size];
     front = -1;
     rear = -1;
 }

 // ENQUEUE (insert)
 public void enqueue(int value) {
     if (rear == size - 1) {
         System.out.println("Queue Overflow - cannot enqueue");
         return;
     }

     if (front == -1) front = 0; // first element

     queue[++rear] = value;
 }

 // DEQUEUE (remove)
 public int dequeue() {
     if (front == -1 || front > rear) {
         System.out.println("Queue Underflow - empty queue");
         return -1;
     }

     return queue[front++];
 }

 // PEEK (front element)
 public int peek() {
     if (front == -1 || front > rear) {
         System.out.println("Queue is empty");
         return -1;
     }

     return queue[front];
 }

 // DISPLAY
 public void display() {
     if (front == -1 || front > rear) {
         System.out.println("Queue is empty");
         return;
     }

     for (int i = front; i <= rear; i++) {
         System.out.print(queue[i] + " ");
     }
     System.out.println();
 }
}


class Main {

    public static void main(String[] args) {

        QueueArrayEg q = new QueueArrayEg(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());

        q.display();
    }
}
