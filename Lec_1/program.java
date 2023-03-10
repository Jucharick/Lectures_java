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

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

class Program {
    public static void main(String[] args)  throws Exception {   // throws Exception указание на то, что может быть ошибка, например при try catch
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

        // Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // Многомерные
        int[] matr[] = new int[3][5];
        for (int[] line : matr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
        System.out.println();
        }
        
        // Преобразования

        int i = 123; double ad = i;
        System.out.println(i); // 123
        System.out.println(ad); // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

        // int[] a_array = new int[10];
        // double[] d_array = a_array; // ИЗУЧАЕМ ковариантность и контравариантность - так не сработает, в double нельзя положить int



        // Получение данных из терминала - от пользователя
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();


        // // Некоторые примитивы
        // Scanner iScanner_1 = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner_1.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner_1.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner_1.close();

        // Scanner iScanner_2 = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner_2.hasNextInt(); // если пользователь банан и вместо цифр ввел буквы hasNextInt() пробует преобразовать в int и если нет - не вывалится ошибка
        // System.out.println(flag);
        // int i = iScanner_2.nextInt();
        // System.out.println(i);
        // iScanner.close();
        

        // Форматированный вывод
        int a_a = 1, b_b = 2;
        int c = a_a + b_b;
        String res = a_a + " + " + b_b + " = " + c;
        System.out.println(res);

        // Форматированный вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // Виды спецификаторов
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений


        // спецификаторы
        float pi2 = 3.1415f;
        System.out.printf("%f\n", pi2); // 3,141500
        System.out.printf("%.2f\n", pi2); // 3,14
        System.out.printf("%.3f\n", pi2); // 3,141
        System.out.printf("%e\n", pi2); // 3,141500e+00
        System.out.printf("%.2e\n", pi2); // 3,14e+00
        System.out.printf("%.3e\n", pi2); // 3,141e+00


        // Функции и методы
        // Функции и методы — это технически одно и то же. Функции могут
        // не принадлежать классам, а методы принадлежат.
        // В java все функции являются методами.

        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
        

        // условный оператор
        int ao = 1;
        int bo = 2;
        int co;
        if (ao > bo) {
            co = ao;
        } else {
            co = bo;
        }
        // if (a > b) c = a;
        // if (b > a) c = b;
        System.out.println(co);


        // тернарный оператор
        int at = 1;
        int bt = 2;
        int min = at < bt ? at : bt;
        System.out.println(min);


        // Оператор выбора
        int mounth = 1;
        String text = "";
        switch (mounth) {
            case 1:
            text = "Autumn";
            break;
        
            default:
            text = "mistake";
            break;
        }
        System.out.println(text);
        iScanner.close();
       

        // Циклы
        // Цикл — это многократное выполнение одинаковой
        // последовательности действий.
        // В java доступны следующие циклы:
        // ● цикл while;
        // ● цикл do while;
        // ● цикл for; и его модификация for in


        // ● цикл while;
        int value = 321;
        int count = 0;
        while (value != 0) {
        value /= 10;
        count++;
        }
        System.out.println(count);


        // ● цикл do while;
        int value1 = 321;
        int count1 = 0;
        do {
            value1 /= 10;
            count++;
        } while (value1 != 0);
        System.out.println(count1);


        // continue, break
        // Операторы для управления циклами — continue и break.
        // Выполнение следующей итерации цикла — continue.
        // Прерывание текущей итерации цикла — break.
        // * ближайшего к оператору


        // ● цикл for
        int sq = 0;
        for (int iq = 1; iq <= 10; iq++) {
            sq += iq;
        }
        System.out.println(sq);


        //Вложенные циклы

        for (int ij = 0; ij < 5; ij++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *


        // Работает только для коллекций
        int arr1[] = new int[10];
        for (int item : arr1) {
            System.out.printf("%d ", item);
        }
        System.out.println();


        // Работа с файлами

        try (FileWriter fw = new FileWriter("Lec_1/file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append("line 2");
            fw.append('\n');
            fw.write("line 3");
            fw.append('\n');
            fw.write("line 4");
            fw.append('\n');
            fw.write("line 5");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
           

        // Чтение, Вариант посимвольно
        FileReader f12 = new FileReader("Lec_1/file.txt");
        int c11;
        while ((c11 = f12.read()) != -1) {
        char ch11 = (char) c11;
        if (ch11 == '\n') {
            System.out.print(ch11);
        } else {
            System.out.print(ch11);
        }
        }

        System.out.println();

        // Вариант построчно
        BufferedReader br = new BufferedReader(new FileReader("Lec_1/file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();



    }

    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static double factor(int n) {
        if(n==1)return 1;
            return n * factor(n-1);
    }

        

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
       
}