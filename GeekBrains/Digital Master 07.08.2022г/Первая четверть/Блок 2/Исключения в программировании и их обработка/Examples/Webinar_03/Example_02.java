package Examples.Webinar_03;

public class Example_02 {
    /*
    Задача 2.
    Создайте метод doSomething(), который может быть источником одного из типов
    checked exceptions (тело самого метода прописывать не обязательно).
    Вызовите этот метод из main и обработайте в нем исключение,
    которое вызвал метод doSomething().
     */
    public static void doSomething() throws ReflectiveOperationException {
        throw new ReflectiveOperationException();
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
