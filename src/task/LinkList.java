package task;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
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
            return  value + ", " + next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            LinkList.Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T value = currentNode.value;
                currentNode = currentNode.next;
                return value;
            }
        };
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public int getByValue(T value) {
        if (isEmpty()) {
            return -1;
        }
        if (head.value == value) {
            return 0;
        }
        Node<T> currentNode = head;
        int ind = 0;
        while (currentNode.next != null) {
            ind++;
            if (currentNode.next.value == value) {
                return ind;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public T getByIndex(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index == 0) {
            return head.value;
        }
        int counter = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (counter == index) {
                return currentNode.value;
            }
            counter++;
            currentNode = currentNode.next;
        }
        return null;
    }

    public void removeAtValue(T value) {
        if (isEmpty()) {
            return;
        }

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }

        System.out.println("Значение не найдено");
    }

    public void removeAtIndex(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }

        Node<T> currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            if (counter == index && currentNode.next != null) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("idc");
    }

    public int length() {
        if (isEmpty()) {
            return 0;
        }
        int c = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            c++;
            currentNode = currentNode.next;
        }
        return c;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Лист пуст");
            return;
        }
        Node<T> currentNode = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(currentNode.value);
        currentNode = currentNode.next;
        while (currentNode != null) {
            sb.append(", ").append(currentNode.value);
            currentNode = currentNode.next;
        }
        sb.append("]");
        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "";
    }
}
