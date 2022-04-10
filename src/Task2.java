import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);
        // Объявление переменой n
        int n;
        System.out.print("Введите целое трехзначное  число: ");
        n = in.nextInt(); // считали целое трехзначное  число
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение
        // получаем единицы
        int units = n % 10;
        // получаем десятки
        int dozens = (n / 10) % 10;
        // получаем сотни
        int hundreds = (n / 100) % 10;
        // получаем сумму трехзначного числа
        int sum = units + dozens + hundreds;

        // 3. вывод ответа
        System.out.println("Сумма цифр трехзначного числа: " + sum);

    }
}


