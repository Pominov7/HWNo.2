import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);
        // Объявление переменных x и y
        int x, y;
        System.out.print("Введите первое натуральное число: ");
        x = in.nextInt(); // считали первое натуральное число
        System.out.print("Введите второе натуральное число: ");
        y = in.nextInt(); // считали второе натуральное число
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение
        // получаем целочисленное деление x на y
        int division = x / y;
        // получаем остаток от деления x на y
        int rest = x % y;
        // получаем квадратный корень  x
        int rootS = (int) Math.sqrt(x);

        // 3. вывод ответа
        System.out.println("Результат целочисленного деления: " + division);
        System.out.println("Остаток от деления: " + rest);
        System.out.println("Квадратный корень: " + rootS);

    }
}

