package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ComplexView implements ComplexOperations, Logs {
    private final NumberFactory numberFactory = new NumberFactory();
    @Override
    public void summa(Scanner scanner) {
        info("Запущен метод сложения комплексных чисел");
        System.out.println("Алгебраическая форма комплексного числа z = a + b*i, " +
                "\nгде a и b действительные числа, \ni - мнимая еденица, \nb*i - мнимая часть комплексного числа z");
        System.out.println("\nВведите первое комплексное число");
        System.out.println("Введите действительную часть комплексного числа (a): ");
        double num1a = numberFactory.inputNumber(scanner);
        System.out.println("Введите действительную составляющую мнимой части комплексного числа (b): ");
        double num1b = numberFactory.inputNumber(scanner);
        System.out.println("\nВведите второе комплексное число");
        System.out.println("Введите действительную часть комплексного числа (a): ");
        double num2a = numberFactory.inputNumber(scanner);
        System.out.println("Введите действительную составляющую мнимой части комплексного числа (b): ");
        double num2b = numberFactory.inputNumber(scanner);
        Double sumA = num1a + num2a;
        Double sumB = num1b + num2b;
        System.out.println();
        System.out.println("(" + num1a + " + " + num1b + "*i)" + " + "
                + "(" + num2a + " + " + num2b + "*i)" + " = " + sumA + " + " + sumB + "*i");

    }

    @Override
    public void multiply(Scanner scanner) {
        info("Запущен метод произведения комплексных чисел");
        System.out.println("Алгебраическая форма комплексного числа z = a + b*i, " +
                "\nгде a и b действительные числа, \ni - мнимая еденица, \nb*i - мнимая часть комплексного числа z");
        System.out.println("\nВведите первое комплексное число");
        System.out.println("Введите действительную часть комплексного числа (a): ");
        double num1a = numberFactory.inputNumber(scanner);
        System.out.println("Введите действительную составляющую мнимой части комплексного числа (b): ");
        double num1b = numberFactory.inputNumber(scanner);
        System.out.println("\nВведите второе комплексное число");
        System.out.println("Введите действительную часть комплексного числа (a): ");
        double num2a = numberFactory.inputNumber(scanner);
        System.out.println("Введите действительную составляющую мнимой части комплексного числа (b): ");
        double num2b = numberFactory.inputNumber(scanner);
        Double multi1a2a = num1a * num2a;
        Double multi1a2b = num1a * num2b;
        Double multi1b2a = num1b * num2a;
        Double multi1b2b = num1b * num2b * -1;
        Double multiA = multi1a2a + multi1b2b;
        Double multiB = multi1a2b + multi1b2a;
        double scale = Math.pow(10, 3);
        System.out.println();
        System.out.println("(" + num1a + " + " + num1b + "*i)" + " * "
                + "(" + num2a + " + " + num2b + "*i)" + " = " + Math.ceil(multiA*scale)/scale + " + " + Math.ceil(multiB*scale)/scale + "*i");
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
