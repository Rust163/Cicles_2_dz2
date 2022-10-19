import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

//задача 1, 2!!!
public class Main {
    public static void main(String[] args) {
        //double deposit = 15000; решение задачи через цикл while дает другой конечный результат
        // хотя с первых месяцев значения не изменяются что в for, что в while
        double percent = 0.07;
        int month = 0;
        //while (deposit <= 12_000_000) {
        for (double deposit = 15000; deposit <= 12_000_000; ) {

            deposit += deposit * percent;
            month++;
            //if (month % 6 == 0){ // вывод суммы накоплений каждый 6ой месяц
            System.out.println("Месяц " + month + ", сумма накоплений равняется: " + (int) deposit + " рублям.");
            //}

        }

        //Задача  3!!!
        double percent_1 = 0.07;
        int month_1 = 0;
        for (double deposit_1 = 15000; month_1 <= 108; ) {
            deposit_1 += deposit_1 * percent_1;
            month_1++;
            if (month_1 % 6 == 0) { // вывод суммы накоплений каждый 6ой месяц
                System.out.println("Месяц " + month_1 + ", сумма накоплений равняется: " + (int) deposit_1 + " рублям.");
            }


            //Задача 4!!!
            for (int i = 5; i <= 31; i += 7) {
                System.out.println("Сегодня пятница " + i + "-ое число. Пора сдавать отчет!");
            }


        }
    }
}






