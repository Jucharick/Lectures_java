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
        System.out.println(age); //10
        System.out.println(salary); //123456

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
    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
       
}