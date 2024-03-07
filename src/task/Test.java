package task;

import task.LinkList;

public class Test {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(5);

        for(Integer val : list) {
            System.out.print(val + ", ");
        }
        System.out.println();
        System.out.println(list.getByValue(4));
        list.removeAtIndex(4);
        System.out.println(list.getByValue(4));
        list.print();
        System.out.println(list.length());

    }
}
