import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите целое число: ");

            String input = scanner.nextLine();

            if (input.isEmpty() || !input.matches("\\d+")) {
                System.out.println("Некорректный ввод данных");
                continue;
            }

            int number = Integer.parseInt(input);

            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Попробуйте ввести число больше 7:");
                continue;
            }

            isValidInput = true;
        }
    }
}
