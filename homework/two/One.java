package homework.two;
import java.util.Scanner;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class One {
    public static void main(String[] args) {
        float num = getFloat();
        System.out.println(num);
    }

    public static float getFloat() {
        Scanner input = new Scanner (System.in);
        System.out.print("Введите число типа float: ");
        String number = input.next();
        while (true) {
            try {
                float result = Float.parseFloat(number);
                return result;
            } catch (Exception e) {
                System.out.println("Некорректное значение. Попробуйте снова.");
                getFloat();
            }
        }
    }
}
