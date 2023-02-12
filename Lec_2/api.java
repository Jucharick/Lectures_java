// API (Application programming interface) —
// это контракт, который предоставляет программа.
// «Ко мне можно обращаться так и так, я обязуюсь
// делать то и это».

// Что такое API для нас
// Это возможности, который предоставляют
// разработчики языка для удобного
// взаимодействия с его функционалом


package Lec_2;

import java.io.File;

public class api {
    public static void main(String[] args) {
        

    // СТРОКИ


    // String str = "";
    // for (int i = 0; i < 1_000_000; i++) {
    //     str += "+";
    // }
    // // ≈41000 ms


    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 1_000_000; i++) {
    //  sb.append("+");
    // }
    // System.out.println(sb);
    // // ≈9 ms
    

    // concat(): объединение строк
    // valueOf(): преобразует Object в строковое представление (завязан на toString())
    // join(): объединяет набор строк в одну с учетом разделителя
    // charAt(): получение символа по индексу
    // indexOf(): первый индекс вхождения подстроки
    // lastIndexOf(): последний индекс вхождения подстроки
    // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    // replace(): замена одной подстроки на другую
    // trim(): удаляет начальные и конечные пробелы
    // substring(): возвращает подстроку, см.аргументы
    // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    // сompareTo(): сравнивает две строки
    // equals(): сравнивает строки с учетом регистра
    // equalsIgnoreCase(): сравнивает строки без учета регистра
    // regionMatches(): сравнивает подстроки в строках


    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Cергей
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
    // C,е,р,г,е,й
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));


    // если мы собираем материал -> выгоднее использовать StringBuilder
    // если мы используем готовый -> выгоднее использовать обычные строки
    // Много изменений – String
    // Много преобразований – StringBuilder


    // Работа с файловой системой
    // import java.io.File;
    // String pathProject = System.getProperty("user.dir");
    // String pathFile = pathProject.concat("/file.txt");
    // File f3 = new File(pathFile);
    // System.out.println(f3.getAbsolutePath ());
    // /Users/sk/vscode/java_projects/file.txt
    // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt


    // Работа с файловой системой. Файлы. Ошибки
    // try {
    //     Код, в котором может появиться ошибка
    // } catch (Exception e) {
    //     Обработка, если ошибка случилась
    // }
    // finally {
    //     Код, который выполнится в любом случае
    // }
       

    try {
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/file.txt");
    File f3 = new File(pathFile);
    System.out.println("try");
    } catch (Exception e) {
    System.out.println("catch");
    }
    finally { 
        System.out.println("finally"); 
    }


    // Работа с файловой системой
    // isHidden(): возвращает истину, если каталог или файл является скрытым
    // length(): возвращает размер файла в байтах
    // lastModified(): возвращает время последнего изменения файла или каталога
    // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    // listFiles(): возвращает массив файлов и подкаталогов, которые находятся
    // в определенном каталоге
    // mkdir(): создает новый каталог
    // renameTo(File dest): переименовывает файл или каталог
    // length(): возвращает размер файла в байтах
    // lastModified(): возвращает время последнего изменения
    // файла или каталога
    // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    // listFiles(): возвращает массив файлов и подкаталогов, которые
    // находятся в определенном каталоге
    // mkdir(): создает новый каталог
    // renameTo(File dest): переименовывает файл или каталог

    String pathProject = System.getProperty("user.dir");
    String pathDir = pathProject.concat("/files");
    File dir = new File(pathDir);
    System.out.println(dir.getAbsolutePath ());
    if (dir.mkdir()) {
    System.out.println("+");
    } else {
    System.out.println("-");
    }
    for (String fname : dir.list()) {
    System.out.println(fname);
    } 

    }
}
