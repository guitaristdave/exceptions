package homework.one;

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен 
// частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Three {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 7, 7, 7, 7, 7 };
        int[] arr2 = new int[] { 6, 0, 6, 6, 6 };
        int[] result = arrayDivArray(arr1, arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] arrayDivArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны. Операция невозможна.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException(
                        String.format("%d-й элемент второго массива равен 0. На 0 делить нельзя", i + 1));
            }
            result[i] = arr1[i] / arr2[2];
        }
        return result;
    }
}
