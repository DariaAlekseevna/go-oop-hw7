package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Calculator implements Menu, Logs{

    @Override
    public void choiceNumber(Scanner scanner) {
        info("Программа запущена");
        System.out.println("Выберите рациональные или комплексные числа: ");
        System.out.println("1 - рациональные ");
        System.out.println("2 - комплексные ");

        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info("Выбран кейс 1");
                System.out.println("Вы выбрали работу с рациональными числами");
                choiceOperation(choice, scanner);
                break;
            case 2:
                info("Выбран кейс 2");
                System.out.println("Вы выбрали работу с комплексными числами");
                choiceOperation(choice, scanner);
                break;
            default:
                warning("Выбран default, программа завершает работу");
                System.out.println("Such calculator doesn't exist!");
                break;
        }
    }

    @Override
    public void choiceOperation(Integer numChoice, Scanner scanner) {

        System.out.println("Выберите операцию: ");
        System.out.println("1 - '+' ");
        System.out.println("2 - '*' ");

        RationalView rationalView = new RationalView();
        ComplexView complexView = new ComplexView();
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info("Выбран кейс 1");
                if (numChoice == 1){
                    rationalView.summa(scanner);
                } else if (numChoice == 2) {
                    complexView.summa(scanner);
                }
                break;
            case 2:
                info("Выбран кейс 2");
                if (numChoice == 1){
                    rationalView.multiply(scanner);
                } else if (numChoice == 2) {
                    complexView.multiply(scanner);
                }
                break;
            default:
                warning("Выбран default, программа завершает работу");
                System.out.println("Такой операции еще не добавлено, наберитесь терпения :)");
                break;
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
