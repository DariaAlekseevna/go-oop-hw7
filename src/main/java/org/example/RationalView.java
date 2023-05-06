package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RationalView implements RationalOperations, Logs {
    private final NumberFactory numberFactory = new NumberFactory();

    @Override
    public void summa(Scanner scanner) {
        info("Запущен метод сложения чисел");
        System.out.println("Введите рациональное число: ");
        double num1 = numberFactory.inputNumber(scanner);
        System.out.println("Введите рациональное число: ");
        double num2 = numberFactory.inputNumber(scanner);
        Double sum = num1 + num2;
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

    @Override
    public void multiply(Scanner scanner) {
        info("Запущен метод произведения чисел");
        System.out.println("Введите рациональное число: ");
        double num1 = numberFactory.inputNumber(scanner);
        System.out.println("Введите рациональное число: ");
        double num2 = numberFactory.inputNumber(scanner);
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

}
