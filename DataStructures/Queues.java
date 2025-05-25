package DataStructures;

public class Queues {
    // Queue using Array
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        Queue (int n) {
            arr = new int [n];
            this.size = n;
        }

        public static boolean isEmpty() {return rear == -1;}

        public static void add(int data) {      // O(1)
            if (rear == size-1) {
                System.out.println("Queue Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {        // O(n)
            if (isEmpty()) return -1;
            int front = arr[0];
            for (int i=0; i<rear; i++) arr[i] = arr[i+1];
            rear--;
            return front;
        }

        public static int peek() {      // O(n)
            if (isEmpty()) return -1;
            return arr[0];
        }
    }

    // Circular Queue using Array
    static class cQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        cQueue (int  n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return (rear==-1 && front==-1);
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add(int data) {      // O(1)
            if (isFull()) return;
            if (front==-1) front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove() {        // O(1)
            if (isEmpty()) return -1;
            int result = arr[front];
            if (rear==front) {
                rear = front = -1;
            }
            else {
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek() {      // O(1)
            if (isEmpty()) return -1;
            return arr[front];
        }
    }

    // Queue using LinkedList
    static class lQueue {
        static class Node {
            int data;
            Node next;
            Node (int a) {
                this.data = a;
                next = null;
            }
        }

        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty() {
            return front==null && rear==null;
        }
        public static void add(int val) {
            Node newNode = new Node(val);
            if (rear==null) {
                rear = front = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        public static int remove() {
            if (isEmpty()) return -1;
            int res = front.data;
            if (front==rear) {
                rear = null;
            }
            front = front.next;
            return res;
        }
        public static int peek() {
            if (isEmpty()) return -1;
            return front.data;
        }
    }

    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while (!q.isEmpty()) {
//            System.out.print(q.peek() + " ");
//            q.remove();
//        }

//        cQueue q2 = new cQueue(5);
//        q2.add(1);
//        q2.add(2);
//        q2.add(3);
//        q2.add(4);
//        q2.add(5);
//        System.out.println(cQueue.remove());
//        q2.add(6);
//        System.out.println(cQueue.remove());
//        q2.add(7);
//        while (!q2.isEmpty()) {
//            System.out.print(q2.peek() + " ");
//            q2.remove();
//        }
        lQueue q3 = new lQueue();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);

        while (!q3.isEmpty()) System.out.print(q3.remove() + " ");
    }
}
