package homework.two;
// Если необходимо, исправьте данный код

// В изначальном коде не был задан целочисленный массив intArray.
// Также добавил отлов исключения IndexOutOfBoundsException
public class Two {
    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
