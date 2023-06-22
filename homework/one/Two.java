package homework.one;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен 
//разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Two {
    
    public static void main(String[] args) {
        int[] arr1 = new int[] {7, 7, 7, 7, 7};
        int[] arr2 = new int[] {6, 6, 6, 6, 6};
        int[] result = arrayMinusArray(arr1, arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] arrayMinusArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны. Операция невозможна.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            result[i] = arr1[i] - arr2[2];
        }
        return result;
    } 
}
