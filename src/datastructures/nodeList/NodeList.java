package datastructures.nodeList;

public class NodeList<T> {
    private Node<T> head;

    private Node<T> tail;

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + ", " + next + ", ";
        }
    }

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int get(T t) {
        if (head == null) {
            return -1;
        }
        if (head.value == t) {
            return 0;
        }

        Node<T> currentNode = head;
        int ind = 0;
        while (currentNode != null) {
            ind++;
            if (currentNode == t) {
                return ind;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void remove(T t) {
        if (head == null) {
            return;
        }

        if (head.value == t) {
            head = head.next;
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }


    @Override
    public String toString() {
        return "[" + head + ", ";
    }
}
