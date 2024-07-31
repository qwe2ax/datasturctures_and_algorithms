package algorithms.quick_sort;

import java.util.Arrays;
import java.util.Random;
/*
ну, я подсмотрел). Потом канеш переписывал заново, самостоятельно, вероятно еще разок так сделаю. Но все же изначально я подсмотрел.
 */
public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length == 0 || left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int leftMarker = left;
        int rightMarker = right;
        while (leftMarker <= rightMarker) {
            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }
            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                int tmp = arr[leftMarker];
                arr[leftMarker] = arr[rightMarker];
                arr[rightMarker] = tmp;
                leftMarker++;
                rightMarker--;
            }
        }
        if (left < rightMarker) {
            quickSort(arr, left, rightMarker);
        }
        if (leftMarker < right) {
            quickSort(arr, leftMarker, right);
        }
    }
}
