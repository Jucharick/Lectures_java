// queue - коллекциия, работающая по принципу ФИФО
// PriorityQueue - наивысший приоритет имеет «наименьший» элемент.

package Lec_4;

import java.util.PriorityQueue;

public class Ex000 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll()); // удаление poll()
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
       

    }
}

