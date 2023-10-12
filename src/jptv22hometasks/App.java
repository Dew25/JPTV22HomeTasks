/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import tasks.WeatherInYear;
import tasks.TemperatureConverter;
import tasks.NumberParser;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите номер задачи из списка: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер трехзначного числа");
            System.out.println("3. Погода за год");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из прогрммы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1: Конвертер температуры");
                    TemperatureConverter temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    NumberParser numberParser;
                    numberParser = new NumberParser(scanner);
                    numberParser.doParser();
                    break;
                case 3:
                    System.out.println("Выбрана задача 3");
                    WeatherInYear weatherInYear;
                    weatherInYear = new WeatherInYear();
                    weatherInYear.play();
                    break;
                default:
                    System.out.println("Выбирайте номер из списка задач!");
                    break;
            }
            System.out.println("------------------------");
            System.out.println();
        }while(repeat);
    }
    
}
