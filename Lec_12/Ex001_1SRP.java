// Разговор о SOLID…
// 1. Single responsibility principle
// Принцип единственной ответственности

// Принцип гласит, что может быть только
// одна причина, приводящая к изменению класса.
// Другими словами, каждый класс должен иметь
// только одну ответственность,
// которая должна быть инкапсулирована
// в этом классе.
// - тестируемость;
// - читаемость;
// - короткое и понятное описание класса;
// - простота сопровождения.


// 2. Open-closed principle
// Принцип открытости/закрытости

// классы должны быть открыты для расширения
// и одновременно закрыты для модификации.
// Иными словами, должна быть возможность
// добавлять новые свойства и расширять класс
// без изменения внутренней реализации
// существующих свойств.
// «закрыт для модификации»
// «Открыт для расширений» 


// 3. Liskov substitution principle
// Принцип подстановки Лисков

// Требует возможности использования любых
// порожденных классов на месте родительских.
// При этом они должны обладать
// тем же поведением, что и родительские классы,
// без внесения изменений.
// Этот принцип гарантирует, что порожденный
// класс не изменяет определение типа
// родительского и его поведение. 

// 4. Interface segregation principle
// Принцип разделения интерфейса

// Клиенты не должны реализовывать интерфейсы,
// которые они не используют.
// Данный принцип требует разделения «толстых»
// интерфейсов на несколько специализированных,
// связанных общей функциональностью.

// 5. Dependency inversion principle
// Принцип инверсии зависимостей

// Принцип инверсии зависимостей
// - модули высокого уровня не должны зависеть
//  от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// - абстракции не должны зависеть от деталей.
// Детали должны зависеть от абстракций.



package Lec_12;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_1SRP {
    public static void main(String[] args) {
        Planner revengePlanner = new Planner();
        revengePlanner.addEntry("1");
        revengePlanner.removeEntry(0);
        revengePlanner.saveAllText("path");
        revengePlanner.loadFromDB("10.0.0.0","admin","1234");
    }
}

class Planner {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }

    public void saveAllText(String path) {
        /// ошибки связанные с...
    }
    
    public void loadFromFile(String path) {
        /// ошибки связанные с...
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
    }
}