import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите целое число, больше 7: ");

            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("Некорректный ввод данных");
                continue;
            }

            int number = Integer.parseInt(input);

            if (number > 7) {
                System.out.println("Привет");
            } else {
                String errorMessage = number == 7 ? " равно " : " меньше ";

                System.out.println(number + errorMessage + "7");
                continue;
            }

            isValidInput = true;
        }
    }
}
