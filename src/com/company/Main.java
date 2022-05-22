package com.company;
import java.util.Scanner;

public class Main {
    static final double ROUBLES_PER_DOLLAR  = 72.12;

    public static void main(String[] args) {
        int  n;
        int[] dollorsArray;
        double[] rublsArray;

        Scanner input = new Scanner(System.in);
        instruct();

        do {
            System.out.print("Введите количество конвертаций = ");
            n = input.nextInt();
            if (n <= 0)
                System.out.print("Ведите правильное количество конвертаций = ");
        } while (n <= 0);

        dollorsArray = new int[n];
        rublsArray = new double[dollorsArray.length];

        System.out.println("Введите сумму денег в американских долларах");
        for (int i = 0; i < n; i++) {
            System.out.print("Количество долларов = ");
            dollorsArray[i] = input.nextInt();
            }

        rublsArray = find_rubls(dollorsArray, n);

        System.out.println("\n  Сумма Дол, Сумма Руб");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + dollorsArray[i] + "\t\t\t" + (int)(rublsArray[i] * 100) / 100D);
        }
    }

    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег " +
                "из американских доллоров в руские рубли.");
        System.out.println("Курс покупки = " + ROUBLES_PER_DOLLAR);
    }

    public static double[] find_rubls(int[] array, int n) {
        double[] result = new double[array.length];

        for (int i = 0; i < n; i++) {
            result[i] = ROUBLES_PER_DOLLAR * array[i];
        }
        return result;
    }
}
