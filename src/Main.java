import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Хмм, попробуй ввести число больше 7");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное значение. Введите целое число.");
        }
    }
}