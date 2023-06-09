package Examples.Webinar_03;

public class Test {
    public static void main(String[] args) {
        Doubly_List someList = new Doubly_List();
//        someList.add(23);
//        someList.add(31);
//
//        someList.add(78, 1);
//
//        someList.addLast(43);
        someList.addLast(57);
//        someList.addLast(23);

        someList.print();
        someList.revert();
        someList.print();
    }
}
