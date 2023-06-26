package homework.two;

// Если необходимо, исправьте данный код

// Перенес catch (Throwable ex) в конец, чтобы остальные catch тоже исполнялись
// У метода printSum убрал отлов исключений FileNotFoundException
// убрал заведение числовых переменных и целочисленного массива из блока try
// добавил ArithmeticException на случай нулевого делителя

public class Three {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 };
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex){
            System.out.println("Делить на ноль нельзя!");
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
