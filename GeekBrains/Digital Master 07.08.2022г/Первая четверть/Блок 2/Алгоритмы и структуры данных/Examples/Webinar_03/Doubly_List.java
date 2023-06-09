package Examples.Webinar_03;

public class Doubly_List<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void add(E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        if (head != null) {
            head.prevNode = newNode;
            newNode.nextNode = head;
        }
        if (size == 1) {
            tail = head;
        }
        head = newNode;
        size++;
    }

    public void add(E value, int index) {
        if (index == 0) add(value);
        else if (index > size || index < 0) throw new ArrayIndexOutOfBoundsException();
        else {
            Node<E> curNode = head;
            Node<E> newNode = new Node<>();
            newNode.value = value;
            while (index > 1) {
                curNode = curNode.nextNode;
                index--;
            }
            if (curNode == null) {
                curNode = tail;
                curNode.nextNode = newNode;
                newNode.prevNode = curNode;
                tail = newNode;
            } else {
                newNode.nextNode = curNode.nextNode;
                newNode.prevNode = curNode;
                curNode.nextNode.prevNode = newNode;
                curNode.nextNode = newNode;
            }
            size++;
        }
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<>();
        if (tail == null) {
            head = tail = newNode;
        }
        newNode.value = value;
        tail.nextNode = newNode;
        newNode.prevNode = tail;
        tail = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        Node<E> currentNode = head;
        int count = 0;
        while (count < index) {
            if (currentNode.nextNode == null) throw new ArrayIndexOutOfBoundsException();
            currentNode = currentNode.nextNode;
            count++;
        }
        return currentNode.value;
    }

    public boolean contains(E value) {
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) return true;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public int indexOf(E value) {
        Node<E> currentNode = head;
        int count = 0;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) return count;
            count++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }

    public void revert() {
        if (size > 1) {
            Node curNode = head, tmp = null;
            while (curNode != null) {
                tmp = curNode.prevNode;
                curNode.prevNode = curNode.nextNode;
                curNode.nextNode = tmp;
                curNode = curNode.prevNode;
            }
            if (tmp != null) {
                head = tmp.prevNode;
            }
        }
    }

    public void print() {
        Node currentNode = head;
        System.out.print("Значения: ");
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.nextNode;
        }
        System.out.println("\n" + "Размер: " + size);
    }
}
