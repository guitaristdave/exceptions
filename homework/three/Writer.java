package homework.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Writer {

    // записываем данные в файл
    public static void toWrite(String[] data) {
        String lastname = data[0];
        String name = data[1];
        String surname = data[2];
        String phone = data[3];
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("homework/three/Files/"+lastname + ".txt", true))) {
            String userData = lastname + " " + name + " " + surname + " " + phone;
            writer.write(userData);
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + lastname + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
