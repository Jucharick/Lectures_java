package Lec_6.part1;

import java.util.*;
public class Ex002_MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));

        // работает не как в маниматеке => делается копия первого множества, а затем преобразовывется
        var u = new HashSet<Integer>(a); 
        u.addAll(b); // addAll(Coll) – объединение множеств.

        var r = new HashSet<Integer>(a); 
        r.retainAll(b); // retainAll(Coll) – пересечение множеств.

        var s = new HashSet<Integer>(a); 
        s.removeAll(b); // removeAll(Coll) – разность множеств.

        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

        System.out.println(a.addAll(b));
    }
}

// first()
// last()
// headSet(E)
// tailSet(E)
// subSet(E1, E2)