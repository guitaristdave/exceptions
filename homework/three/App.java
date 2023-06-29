package homework.three;

import homework.three.Exceptions.IncorrectDataException;
import homework.three.Exceptions.IncorrectPhoneException;

import java.util.HashMap;

import static homework.three.Parser.dataToArray;
import static homework.three.View.getData;
import static homework.three.Writer.toWrite;

public class App {

    // метод для поочередного вызова методов для работы программы
    public  static void app() throws IncorrectDataException, IncorrectPhoneException {
            String data = getData();
            String[] dataArray = dataToArray(data);
            toWrite(dataArray);
        }
    }

