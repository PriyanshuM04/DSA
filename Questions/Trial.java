package Questions;

import java.io.*;
import java.util.*;

public class Trial {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<k; i++) stack.push(q.poll());
        while (!stack.isEmpty()) q.add(stack.pop());
        for (int i=0; i<q.size()-k; i++) q.add(q.poll());
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(reverseFirstK(q,3));
    }
}
