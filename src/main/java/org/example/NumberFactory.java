package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NumberFactory implements INumberFactory, Logs{
    @Override
    public Double inputNumber(Scanner scanner) {
        info("Запущен метод введения чисел с консоли");
        String num = scanner.next();
        if (checkNumbers(num) != null) {
            return checkNumbers(num);
        } else {
            warning("Число нельзя представить в формате Double, вернеться 0.0");
            return 0.0;
        }
    }

    @Override
    public Double checkNumbers(String num) {
        info("Запущена проверка на принадлежность к рациональным числам");
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            warning("Проверка не пройдена");
            return null;
        }
    }

    @Override
    public void info(String message) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        System.out.println("log.info: " + message);
    }

    @Override
    public void warning(String message) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        System.out.println("log.WARNING: " + message);
    }
}
