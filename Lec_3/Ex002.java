// List – пронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем,
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному
// индексу (позиции в списке) и искать элементы в списке.
// ArrayList, LinkedList (Vector, Stack – устаревшие)



package Lec_3;
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
        // Иерархия коллекций. ArrayList
        // «Удобный массив»
        // Разные способы создания
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10); // изначально в нашей коллекции будет хранилище по 10 элементов (изначально выделено паматя на 10 элементов, потом моно будет добавить)
        ArrayList<Integer> list4 = new ArrayList<>(list3);
    



       ArrayList<Integer> list = new ArrayList<Integer>(); // <> - обобщение - использовать с обобщением, а не с сырыми типами
       //ArrayList list = new ArrayList(); // неявное преобразование к object, сырой тип
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
