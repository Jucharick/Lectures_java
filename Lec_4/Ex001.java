// LinkedList
// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой
// размер. Элементы доступны для вставки или удаления в любой позиции.

// LinkedList нужен для небольшого количества
// элементов, в которых операции добавления\удаления
// встречаются чаще операций чтения.

package Lec_4;

import java.util.LinkedList;

public class Ex001 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        
        System.out.println(ll);
    }
    
}
