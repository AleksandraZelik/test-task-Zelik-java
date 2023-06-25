import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        final String NAME = "Вячеслав";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");

        while (true) {
            String name = scanner.nextLine();

            if (!name.matches("[a-zA-Zа-яА-Я]+")) {
                System.out.println("Неверный ввод данных. Введите имя.");
                continue;
            }

            if (name.equalsIgnoreCase(NAME)) {
                System.out.println("Привет," + NAME);
            } else {
                System.out.println("Нет такого имени");
            }

            break;
        }
    }
}
