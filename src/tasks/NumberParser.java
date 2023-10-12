/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParser() {
        boolean repeat = true;
        System.out.println();
        System.out.println("++++++++++++++++++++++");
        System.out.println("+    Парсер числа    +");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();scanner.nextLine();
        //код решения задачи здесь
        int edCount=0;
        int decCount=0;
        int sumNumbers=0;
        System.out.printf("В веденном числе:%n");
        System.out.printf("  - единиц: %d%n", edCount);
        System.out.printf("  - десятков: %d%n", decCount);
        System.out.printf("  - сумма цифр: %d%n",sumNumbers);
        System.out.println();
    }
    
}
