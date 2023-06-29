package homework.three;

import java.util.Scanner;

public class View {

    // получаем строку с данными из консоли
    public static String getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО и номер телефона(10 знаков без +7 и 8) через пробел: ");
        String result = scan.nextLine();
        scan.close();
        return  result;
    }

}
