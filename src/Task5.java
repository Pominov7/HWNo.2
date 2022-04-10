import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);
        // Объявление переменой radius
        final double radius;
        System.out.print("Введите радиус окружности: ");
        radius = in.nextInt(); // считали радиус
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение
        // вычисляем площадь окружности
        double area = Math.PI * (radius * radius);
        //  вычисляем длину окружности
        double length = 2 * Math.PI * radius;

        // 3. вывод ответа
        System.out.println("Площадь окружности равна: " + area +
                "\nДлина окружности равна: " + length);

    }
}
