package Lec_1;

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Goodbye world");
//         } 
// }

// снипеты

/*
комментарий на несколько строк
...
*/

class Program {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        float e = 2.7f; // с типом float есть суффикс f
        double pi = 3.1415; // с типом double есть суффикс D, но он не является обязательным
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false


        // *Строки не так просты

        String msg ="Hello world";
        System.out.println(msg); // Hello world


        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        // Integer - класс-обертка

        // у int можно разделять _ разрядность
        int salary_1 = 123_456;
        System.out.println(salary_1); //123456



        // бывают на собеседованиях подобные задачи
        int s = 123456;
        s = --s - s--;
        System.out.println(s); // 0

        int t = 123456;
        s = t-- - --t;
        System.out.println(t); // 123454

        int v = 123456;
        v = v-- - v--;
        System.out.println(v); // 1

        // Операции Java
        // Присваивание: =
        // Арифметические: *, /, +, -, %, ++, --
        // Операции сравнения: <, >, ==, !=, >=, <=
        // Логические операции: ||, &&, ^, !
        // Побитовые операции <<, >>, &, |, ^
        
        int g = 8;
        // в двоичной системе 8 = 1000
        g = g << 1;
        System.out.println(g); // сдвигаем все на один бит влево  = 16
        // в двоичной системе 8 = 1000 после сдвига на 1 бит влево получаем 10000  в двоичной системе, что = 16

        int ab = 5;
        int bb = 2;
        System.out.println(ab | bb); // 7
        // 5 => 101
        // 2 => 010
        // 5 или (+) 2 побитово => 111 => 7


        int cb = 5;
        int db = 2;
        System.out.println(cb & db); // 7
        // 5 => 101
        // 2 => 010
        // 5 и (*) 2 побитово => 000 => 0


        int eb = 5;
        int fb = 2;
        System.out.println(eb ^ fb); // 7    ^ - разделительное или (истина тогда, когда строго одно является true)
        // 5 => 101
        // 2 => 010
        // 5 разделительное или 2 побитово => 111 => 7


        // Массивы
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
       
}