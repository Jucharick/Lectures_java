package Lec_2;

import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName()); // имя класса Ex005_Logger.class.getName()
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("Lec_2/log.xml");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // fh.setFormatter(sFormat);
        fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}


// Логирование. Использование. Основы
// Использование
// Logger logger = Logger.getLogger()
// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter





