package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму доходу: ");
        double income = scanner.nextDouble();
        double tax;

        // Логіка прогресивної шкали
        if (income <= 10000) {
            // ставка 2,5% для суми до 10000 включно
            tax = income * 0.025;
        } else if (income <= 25000) {
            // ставка 4,3% для суми від 10000 (виключно) до 25000 (включно)
            tax = income * 0.043;
        } else {
            // ставка 6,7% для суми більше 25000
            tax = income * 0.067;
        }

        System.out.printf("Сума доходу: %.2f%n", income);
        System.out.printf("Сума податку: %.2f%n", tax);

        scanner.close();
    }
}