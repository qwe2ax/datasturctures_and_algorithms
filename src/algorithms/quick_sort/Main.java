package algorithms.quick_sort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, -4, 7, 1, 0, 64, -6, 15, 8, -23, 55, 12, -43, -44, -81};
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
