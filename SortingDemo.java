// =============================================================
// Figures 44–50: Bubble Sort & Merge Sort — Comparison
// =============================================================

import java.util.Arrays;

public class SortingDemo {

    // ---- Figure 44: Bubble Sort code ----
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---- Figures 45–48: Merge Sort ----

    // Figure 45: Merge sort initialization
    static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;

        // Figure 46: Merge sort splitting
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        // Figure 47 & 48: Merge sorting
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // ---- Figure 49: Main function ----
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = arr1.clone();

        System.out.println("Original array: " + Arrays.toString(arr1));

        System.out.println();

        // Bubble Sort
        long startBubble = System.nanoTime();
        bubbleSort(arr1);
        long endBubble = System.nanoTime();
        System.out.println("Bubble Sort result: " + Arrays.toString(arr1));
        System.out.println("Bubble Sort time:   " + (endBubble - startBubble) + " ns");

        System.out.println();

        // Merge Sort
        long startMerge = System.nanoTime();
        mergeSort(arr2);
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort result:  " + Arrays.toString(arr2));
        System.out.println("Merge Sort time:    " + (endMerge - startMerge) + " ns");
    }
}

// ---- Figure 50: Expected Output ----
/*
Original array: [64, 34, 25, 12, 22, 11, 90]

Bubble Sort result: [11, 12, 22, 25, 34, 64, 90]
Bubble Sort time:   <varies> ns

Merge Sort result:  [11, 12, 22, 25, 34, 64, 90]
Merge Sort time:    <varies> ns
*/
