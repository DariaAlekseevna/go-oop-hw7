package org.example;

import java.util.Scanner;

public class Controller {
    public Controller() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.choiceNumber(scanner);
        scanner.close();
    }


}
