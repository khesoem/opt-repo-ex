package ch.ethz.ast;

import java.util.Collections;
import java.util.List;

public class Sort 
{

    public void bubbleSort(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return;
        }
        int n = arr.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void sort(List<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder());
    }
    public static void main( String[] args ) {
    }
}
