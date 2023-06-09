package Examples.Webinar_03;

public class Simply_List<E> {
    private Node<E> head;

    public void add(E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public void add(E value, int index) {
        if (index >= size() || index < 0) throw new ArrayIndexOutOfBoundsException();
        if (index > 0) {
            Node<E> curNode = head;
            while (index > 0) {
                curNode = curNode.nextNode;
                index--;
            }
            Node<E> newNode = new Node<>();
            newNode.value = value;
            Node<E> tmp = curNode.nextNode;
            curNode.nextNode = newNode;
            newNode.nextNode = tmp;
        } else add(value);
    }
    public void addLast(E value){
        add(value, size() -1);
    }

    public int size() {
        Node<E> currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.nextNode;
        }
        return count;
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
}

