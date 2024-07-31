package datastructures.node_hash_table;

/*
не смотри сюда, тут нихуя нет))
 */

import java.util.LinkedList;

public class NodeHashTable {
    private LinkedList<Node>[] table;
    private int size;
    public NodeHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

}
