package homework.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: ФИО и номер телефона(10 знаков без +7 и 8) через пробел");

        String input = scanner.nextLine();

        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                processUserData(input);
                isValidInput = true;
            } catch (InvalidDataFormatException e) {
                System.out.println("Ошибка: неверный формат данных");
                System.out.println(e.getMessage());
                System.out.println("Пожалуйста, повторите ввод данных.");
                input = scanner.nextLine();
            } catch (IOException e) {
                System.out.println("Ошибка: возникла проблема с записью данных в файл.");
                e.printStackTrace();
                return;
            }
        }
    }

    private static void processUserData(String input) throws InvalidDataFormatException, IOException {
        String[] data = input.split(" ");

        // Проверка количества введенных данных
        if (data.length != 4) {
            throw new InvalidDataFormatException("Неверное количество данных.");
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String phoneNumber = data[3];

        // Проверка формата данных
        try {
            long parsedPhoneNumber = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("Неверный формат номера телефона.");
        }

        // Создание файла с данными
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("homework/three/Files/" + lastName + ".txt", true))) {
            String userData = lastName + " " + firstName + " " + middleName + " " + phoneNumber;
            writer.write(userData);
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + lastName + ".txt");
        }
    }

    private static class InvalidDataFormatException extends Exception {
        public InvalidDataFormatException(String message) {
            super(message);
        }
    }
}
