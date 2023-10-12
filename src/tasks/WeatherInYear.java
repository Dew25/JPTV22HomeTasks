/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;

/**
 *
 * @author Melnikov
 */
public class WeatherInYear {
    private enum MONTH {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    public void play() {
        int[][] weatheInYear = new int[12][];
        weatheInYear[0] = new int[31];
        weatheInYear[1] = new int[28];
        weatheInYear[2] = new int[31];
        weatheInYear[3] = new int[30];
        weatheInYear[4] = new int[31];
        weatheInYear[5] = new int[30];
        weatheInYear[6] = new int[31];
        weatheInYear[7] = new int[31];
        weatheInYear[8] = new int[30];
        weatheInYear[9] = new int[31];
        weatheInYear[10] = new int[30];
        weatheInYear[11] = new int[31];
        int min = -35;
        int max = 35;
        Random random = new Random();
        for (int i = 0; i < weatheInYear.length; i++) {
            for (int j = 0; j < weatheInYear[i].length; j++) {
                weatheInYear[i][j] = random.nextInt(max-min+1)+min;
            }
        }
        System.out.println("-------------------------------------------------------------- Погода в году ------------------------------------------------------------");
        for (int i = 0; i < weatheInYear.length; i++) {
            System.out.printf("%10s: ",MONTH.values()[i]);
            for (int j = 0; j < weatheInYear[i].length; j++) {
                System.out.printf("%4d",weatheInYear[i][j]);
            }
            System.out.println();
        }
    }
    
}
