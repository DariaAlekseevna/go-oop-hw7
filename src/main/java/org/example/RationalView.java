package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RationalView implements RationalOperations, Logs, InputNumber {

    @Override
    public Double checkNumbers(String num) {
        info("Запущена проверка на принадлежность к рациональным числам");
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            warning("Проверка не пройдена");
            System.out.println("С таким числом нельзя провести операции, " +
                    "конечно, если вы ввели число и ввели его верно..");
            return null;
        }
    }

    @Override
    public void summa(Scanner scanner) {
        info("Запущен метод сложения чисел");
        System.out.println("Введите рациональное число: ");
        double num1 = inputNumber(scanner);
        System.out.println("Введите рациональное число: ");
        double num2 = inputNumber(scanner);
        Double sum = num1 + num2;
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

    @Override
    public void multiply(Scanner scanner) {
        info("Запущен метод произведения чисел");
        System.out.println("Введите рациональное число: ");
        double num1 = inputNumber(scanner);
        System.out.println("Введите рациональное число: ");
        double num2 = inputNumber(scanner);
        Double multi = num1 * num2;
        System.out.println();
        System.out.println(num1 + " * " + num2 + " = " + multi);
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
}
