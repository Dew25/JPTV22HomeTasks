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
public class TemperatureConverter {

    private final Scanner scanner;

    public TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doConvert() {
        boolean repeat = true;
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+    Конвертер температуры    +");
        System.out.println("+++++++++++++++++++++++++++++++");
        do{
            System.out.println("Выберите направление конвертирования: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Цельсий -> Фаренгейт");
            System.out.println("2. Фаренгейт -> Цельсий");
            System.out.println("№ направления: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из конвертера");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    
                    break;
                default:
                    System.out.println("Выбирайте номер из списка направлений!");
                    break;
            }
        }while(repeat);
        System.out.println();
    }
    
}
