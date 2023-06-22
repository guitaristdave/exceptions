package homework.one;

import java.util.Scanner;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class One {
    
    public static int divider(int x, int y) { // если дать на вход y = 0, то получим java.lang.ArithmeticException: / by zero
        return x / y;
    }

    public static int squared(){ // если из консоли ввести не Integer, то поймаем java.util.InputMismatchException
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scan.nextInt();
        scan.close();
        return x * x;
        
    }

    public static int getFirstElement(int[] array) { // если на вход подать пустой массив, то поймаем java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        return array[0];
    }
    

    public static void main(String[] args) {
        System.out.println(divider(2, 0));

        System.out.println(squared());

        int[] arr = new int[0];
        System.out.println(getFirstElement(arr));
    }
    
}
