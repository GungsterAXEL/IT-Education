package Examples.Lection_04;

import java.util.ArrayList;
import java.util.List;

public class Tree<E> {
    Node<E> root;

    /*
    Обход в глубину дерева.
     */
    private Node<E> find(Node<E> node, E value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child : node.child) {
                Node result = find(child, value);
                if (result != null) return result;
            }
        }
        return null;
    }

    public boolean exist(E value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) return true;
        }
        return false;
    }

    /*
    Обход в ширину.
     */
    private Node<E> findW(Node<E> root, E value) {
        List<Node> line = new ArrayList<>();
        line.add(this.root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) return node;
                nextLine.addAll(node.child);
            }
            line = nextLine;
        }
        return null;
    }
    public boolean existW(E value) {
        if (root != null) {
            Node node = findW(root, value);
            if (node != null) return true;
        }
        return false;
    }
}
