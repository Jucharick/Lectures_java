// Тип данных Object – «всему голова»
// Упаковка (запаковка) – любой тип можно положить в переменную типа Object
// Распаковка – преобразование Object-переменной в нужный тип
// Иерархия типов – любой тип «ниже» Object’а

package Lec_3;

public class Ex01_object {
    public static void main(String[] args) {
        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b) { // в обжект моно передать разные типы, не нужно писать отдельные методы для Integer или Double
        if (a instanceof Double && b instanceof Double) { // instanceof - принадлежиты типу Double
            return (Object)((Double) a + (Double) b); // скастовать в тип Double
        } else if(a instanceof Integer && b instanceof Integer) { // instanceof - принадлежиты типу Integer
            return (Object)((Integer) a + (Integer) b); // скастовать в тип Integer
        } else return 0;
    }
}
   