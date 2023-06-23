package Examples.Webinar_03;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private int counter;
    private boolean closed;

    public void add() throws IOException {
        closedOrNot();
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void close(){
        closed = true;
    }

    private void closedOrNot() throws IOException {
        if (closed) throw new IOException("Ресурс закрыт.");
    }

}
