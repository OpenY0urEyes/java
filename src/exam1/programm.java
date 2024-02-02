package exam1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Programm {
    public void moneyProgramm(){
        double dollar = 0.011083;
        double euro = 0.010267;
        double yuan = 0.079772;

        Scanner sc = new Scanner(System.in);
        BigDecimal[] days = new BigDecimal[30];
        for (int i = 0; i < days.length; i++){
            days[i] = BigDecimal.valueOf(0);
        }

        while (true){
            System.out.println("Меню:\n" +
                    "1 - Ввести траты за день\n" +
                    "2 - Вывод трат за месяц\n" +
                    "3 - Самая большая сумма за месяц\n" +
                    "4 - Конвертор валюты\n" +
                    "0 - выход\n");
            int varMenu = sc.nextInt();
            if(varMenu == 1){
                System.out.println("Выберете день с 1 по 31");
                int day = sc.nextInt();
                System.out.println("Сколько потратили за день?");
                BigDecimal value = sc.nextBigDecimal();
                days[day-1] = value;
                System.out.println("День: " + day + ". Потратили: " + value);
            }else if (varMenu == 2){
                System.out.println(Arrays.toString(days));
            }
            else if (varMenu == 3){
                BigDecimal maxValue = BigDecimal.valueOf(0);
                for (int i = 0; i < days.length; i++){
                    if (maxValue.doubleValue() < days[i].doubleValue()){
                        maxValue = days[i];
                    }
                }
                System.out.println("Максимальное значение: " + maxValue);
            }
            else if(varMenu == 4){
                System.out.println("Выберете валюту\n" +
                        "1 - dollar\n" +
                        "2 - euro\n" +
                        "3 - yuan\n");
                int varInConvertor = sc.nextInt();
                if(varInConvertor == 1){
                    convertor(dollar, days);
                }
                else if(varInConvertor == 2){
                    convertor(euro, days);
                }
                else if(varInConvertor == 3){
                    convertor(yuan, days);
                }
            }
            else if(varMenu == 0){
                System.exit(1);
            }

        }

    }

    public void convertor(double value, BigDecimal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].multiply(BigDecimal.valueOf(value));
            System.out.println(arr[i].toString());
        }
    }

}
