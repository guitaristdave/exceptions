package homework.two;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) throws NullStringException{
        String line = getString();
        System.out.println(line);
    }

    public static String getString() throws NullStringException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String result = scan.nextLine();
        if (result == "") {
            throw new NullStringException("Строка не должна быть пустой!");
        }
        scan.close();
        return result;
    }
}
