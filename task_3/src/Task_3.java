import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        final String ERROR_MESSAGE = "Некорректный ввод.";

        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите размер массива (целое положительное число): ");

            String input = scanner.nextLine();

            if (input.isEmpty() || !input.matches("\\d+")) {
                System.out.println(ERROR_MESSAGE);
                continue;
            }

            int size = Integer.parseInt(input);

            if (size > 0) {
                int[] array = new int[size];

                System.out.println("Введите элементы массива через пробел:");

                String[] elements = scanner.nextLine().split(" ");

                if (elements.length != size) {
                    System.out.println(ERROR_MESSAGE);
                    continue;
                }

                try {
                    for (int i = 0; i < size; i++) {
                        array[i] = Integer.parseInt(elements[i]);
                    }

                    System.out.println("Элементы массива, кратные 3:");

                    for (int num : array) {
                        if (num % 3 == 0) {
                            System.out.println(num);
                        }
                    }

                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println(ERROR_MESSAGE);
                }
            } else {
                System.out.println(ERROR_MESSAGE);
            }
        }
    }
}
