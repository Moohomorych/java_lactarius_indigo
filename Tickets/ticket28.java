/*
Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
*/

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits for " + number + " is: " + sum);
    }
    // Рекурсивный метод для вычисления суммы цифр числа
    private static int calculateSumOfDigits(int n) {
        // Базовый случай: если число состоит из одной цифры, возвращаем это число
        if (n < 10) {
            return n;
        } else {
            // Рекурсивно вызываем метод для оставшихся цифр числа и складываем с текущей цифрой
            return n % 10 + calculateSumOfDigits(n / 10);
        }
    }
}
