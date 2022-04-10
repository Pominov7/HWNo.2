import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);
        // Объявление переменых percent, deposit
        double deposit, percent;
        System.out.print("Введите сумму вклада: ");
        deposit = in.nextDouble(); // считали сумму вклада
        System.out.print("Введите годовую процентную ставку: ");
        percent = in.nextDouble(); // считали годовую процентную ставку
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение
        // вычисляем сумму вклада за 1 год
        double depositFirst = deposit * (1 + (percent / 100));
        // вычисляем сумму вклада за 2 год
        double depositSum = depositFirst * (1 + (percent / 100));

        // 3. вывод ответа
        System.out.println("Сумма вклада за 2 года составит: " + depositSum + " рублей");

    }
}
