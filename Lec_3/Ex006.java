package Lec_3;

import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        // List.of(item1, item2,...) – возвращает неизменяемый список
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException  При создании колекции через List.of просто так удалять элементы через .remove(1) не получится, программа не скомпилируется
        List<Character> list2 = List.copyOf(list1);
        
    }
}
