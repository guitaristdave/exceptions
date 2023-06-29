package homework.three;

import homework.three.Exceptions.IncorrectDataException;
import homework.three.Exceptions.IncorrectPhoneException;

import java.util.HashMap;

public class Parser {

    // из введенных данных получаем массив из 4 элементов (фио и телефон) и проверяем корректность ввода данных
    // если данные некорректны, то выкидываем исключения
    public static String[] dataToArray(String data) throws IncorrectDataException, IncorrectPhoneException {
        String[] dataArray = data.split(" ");
        lengthChecker(dataArray);
        phoneChecker(dataArray);
        return dataArray;
    }

    // проверяем количество введенных значений и выкидываем исключение, если нужно
    public static void lengthChecker(String[] arr) throws IncorrectDataException {
        if (arr.length != 4) {
            throw new IncorrectDataException("Некорректные данные. Нужно  ввести ФИО и телефон через пробел");
        }
    }

    // проверяем корректность ввода номера телефона и выкидываем исклюяение, если нужно
    public static void phoneChecker(String[] arr) throws IncorrectPhoneException {
        try {
            Long.parseLong(arr[3]);
        } catch (NumberFormatException e) {
            throw new IncorrectPhoneException("Некорректный номер телефона");
        }
    }
}


