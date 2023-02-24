package Lec_5;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f); // при заполненности на 80% удваивается кол-во элементов
    }
}

// HashMap. Любознательным 
// ● Хэш-функции и хэш-таблицы
// ● Прямое связывание (хэширование с цепочками)
// ● Хэширование с открытой адресацией
// ● Теория графов:
// ● деревья построенные на списках
// ● бинарные деревья
// ● сбалансированные деревья
// ● *алгоритм балансировки дерева
// ● ** красно-черные деревья, деревья поиска