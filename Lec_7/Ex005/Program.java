// Наследование – это свойство системы, позволяющее описать новый класс на основе уже существующего,
// с частично или полностью заимствующейся функциональностью.
// Класс, от которого производится наследование, называется базовым или родительским.
// Новый класс – потомком, наследником или производным классом.


package Lec_7.Ex005;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

    }
}