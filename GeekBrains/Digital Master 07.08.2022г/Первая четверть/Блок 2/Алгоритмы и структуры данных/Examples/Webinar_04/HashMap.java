package Examples.Webinar_04;
/*
Домашнее задание:
    Реализовать класс работающий по принципу HashMap.
    Включая внутренний массив узлов с индексацией по хешу и описание узла.
    Добавить в класс методы:
    Object put(Integer key , Integer value) добавить элемент.
    Object get(Integer key) получить значение соответствующее ключу.
    Object remove(Integer key) удалить элемент с соответствующем ключом.
    Object replace(Integer key, Integer value) заменить значение.
    int size() количество элементов.
    boolean containsKey(Integer key) проверка наличия ключа и значения.
    boolean containsValue(Integer value).
 */

public class HashMap<K, V> {
    private int size = 16;
    private int count = 0;
    private Node<K, V>[] buckets = new Node[size];

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % this.size);
    }

    public V put(K key, V value) {
        V prevalue = null;
        Node<K, V> newNode = new Node<>(key, value);
        int index = getIndex(key);
        if (buckets[index] != null) {
            Node<K, V> curNode = buckets[index];
            while (curNode != null) {
                if (curNode.getKey() == key) {
                    prevalue = curNode.getValue();
                    curNode.setValue(value);
                    return prevalue;
                }
                curNode = curNode.getNext();
            }
            newNode.setNext(buckets[index]);
        }
        count++;
        buckets[index] = newNode;
        return prevalue;
    }

    public V get(K key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            Node<K, V> curNode = buckets[index];
            while (curNode != null) {
                if (curNode.getKey().equals(key)) return curNode.getValue();
                curNode = curNode.getNext();
            }
        }
        return null;
    }

    public V remove(K key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            Node<K, V> prevNode = null;
            Node<K, V> curNode = buckets[index];
            while (curNode != null) {
                if (curNode.getKey().equals(key)) {
                    V value = curNode.getValue();
                    if (prevNode == null) buckets[index] = curNode.getNext();
                    else prevNode.setNext(curNode.getNext());
                    count--;
                    return value;
                }
                prevNode = curNode;
                curNode = curNode.getNext();
            }
        }
        return null;
    }

    public V replace(K key, V value) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            Node<K, V> curNode = buckets[index];
            while (curNode != null) {
                if (curNode.getKey().equals(key)) {
                    V temp = curNode.getValue();
                    curNode.setValue(value);
                    return temp;
                }
                curNode = curNode.getNext();
            }
        }
        return null;
    }

    public int size() {
        return this.count;
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            Node<K, V> curNode = buckets[index];
            while (curNode != null) {
                if (curNode.getKey().equals(key)) return true;
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    boolean containsValue(V value) {
        for (int i = 0; i < this.size; i++) {
            if (buckets[i] != null) {
                Node<K, V> curNode = buckets[i];
                while (curNode != null) {
                    if (curNode.getValue().equals(value)) return true;
                    curNode = curNode.getNext();
                }
            }
        }
        return false;
    }
}