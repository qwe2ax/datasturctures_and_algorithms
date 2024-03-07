package datastructures.nodeList.linkList;

import java.util.Iterator;

public class SingleLinkList<T> implements Iterable<T> {

    ListItem<T> head;
    ListItem<T> tail;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ListItem<T> currentNode = head;

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

    private static class ListItem<T> {
        T value;
        ListItem<T> next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(T value) {
        ListItem<T> newItem = new ListItem<>();
        newItem.value = value;

        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void reverse() {
        if (!isEmpty() && head.next != null) {
            tail = head;
            ListItem<T> currentNode = head.next;
            head.next = null;
            while (currentNode != null) {
                ListItem<T> next = currentNode.next;
                currentNode.next = head;
                head = currentNode;
                currentNode = next;
            }
        }
    }
}
