package Examples.Webinar_03.Homework.Entry;

import java.io.FileWriter;
import java.io.IOException;

public class EntryWriter {
    public void writeToFile(Entry entry) throws IOException {
        FileWriter writer = new FileWriter(entry.getSurname() + ".txt", true);
        writer.write(entry.toString() + "\n");
        System.out.println("Запись успешно создана.");
        writer.close();
    }
}
