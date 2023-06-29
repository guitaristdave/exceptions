package homework.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество номертелефона");

        String input = scanner.nextLine();

        String[] data = input.split(" ");

        // Проверка количества введенных данных
        if (data.length != 4) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String phoneNumber = data[3];

        // Проверка формата данных
        try {
            long parsedPhoneNumber = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return;
        }

        // Создание файла с данными
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lastName + ".txt", true))) {
            String userData = lastName + " " + firstName + " " + middleName + " " + phoneNumber;
            writer.write(userData);
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + lastName + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
