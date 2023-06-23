package Examples.Webinar_03.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class MyArrayDataException extends Exception{
    private List<String> indexes;

    public MyArrayDataException(String message) {
        super(message);
        indexes = new ArrayList<>();
    }

    public MyArrayDataException() {
        this("Ошибка в данных");
    }

    public void addIndexes(int x, int y){
        this.indexes.add("["+x+", "+y+"]");
    }

    public List<String> getIndexes() {
        return indexes;
    }

    public boolean work(){
        return indexes.size() > 0;
    }
}
