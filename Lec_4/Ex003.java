// Deque - линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах. 
// deque.addFirst(1); deque.addLast(2);
//  deque.removeLast(); deque.removeLast();
//  deque.offerFirst(1); deque.offerLast(2);
//  deque.pollFirst(); deque.pollLast();
//  deque.getFirst(); deque.getLast();
//  deque.peekFirst(); deque.peekLast();


package Lec_4;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}