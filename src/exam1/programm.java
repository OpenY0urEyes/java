package exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Programm {
    public void moneyProgramm(){
        Scanner sc = new Scanner(System.in);
        double[] days = new double[30];

        while (true){
            System.out.println("Меню:\n" +
                    "1 - Ввести траты за день\n" +
                    "2 - Вывод трат за месяц\n" +
                    "3 - Самая большая сумма за месяц\n" +
                    "0 - выход\n");
            int varMenu = sc.nextInt();
            if(varMenu == 1){
                System.out.println("Выберете день с 1 по 31");
                int day = sc.nextInt();
                System.out.println("Сколько потратили за день?");
                double value = sc.nextDouble();
                days[day-1] = value;
                System.out.println("День: " + day + ". Потратили: " + value);
            }else if (varMenu == 2){
                System.out.println(Arrays.toString(days));
            }
            else if (varMenu == 3){
                System.out.println((Arrays.stream(days).max()));
            }
            else if(varMenu == 0){
                System.exit(1);
            }

        }

    }
}
