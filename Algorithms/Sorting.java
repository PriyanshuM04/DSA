package Algorithms;

public class Sorting {

    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //----Bubble Sort----
    static void bubbleSort(int[] a) {       // O(n^2)
        int size = a.length;
        for (int j=0; j<size-1; j++) {
            for (int i = 0; i<size-j-1; i++) {
                if (a[i]>a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.print("Bubble Sort: ");
        print(a);
    }

    // ----Selection Sort----
    static void selectionSort(int[] a){
        int size = a.length;
        for (int i=0; i<size-1; i++) {
            int smallIndex = i;
            int smallest = a[i];
            for (int j = smallIndex+1; j<size; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    smallIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallIndex];
            a[smallIndex] = temp;
        }
        System.out.print("Selection Sort: ");
        print(a);
    }

    // ----Insertion Sort----
    static void insertionSort(int[] a) {
        for (int i=1; i < a.length ; i++) {
            int current = a[i];
            int j = i - 1;
            for (; j>=0 && current < a[j]; j--) {
                a[j+1] = a[j];
            }
            a[j+1] = current;
        }

        System.out.print("Insertion Sort: ");
        print(a);
    }

    // ----Merge Sort----
    static int[] merge(int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int[] result = new int[l + r];
        int idx = 0;
        int i=0, j=0;
        while (i<l && j<r) {
            if (left[i] <= right[j]) {
                // add left[i] to result
                result[idx++] = left[i++];
            }
            else if (left[i] > right[j]) {
                // add right[j] to result
                result[idx++] = right[j++];
            }
        }
        while (i<l) result[idx++] = left[i++];
        while (j<r) result[idx++] = right[j++];

        return result;
    }
    static int[] mergeSort(int[] a, int low, int high) {
        if (low==high) return new int[]{a[low]};

        int mid = low + (high-low)/2;

        int[] left = mergeSort(a, low, mid);
        int[] right = mergeSort(a, mid+1, high);
        int[] merged = merge(left, right);
        return merged;
    }

    // ----Quick Sort----
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low-1;

        for (int i=low; i<high; i++) {
            if (arr[i] <= pivot) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp;
        return j+1;
    }
    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int idx = partition(a, low, high);
            quickSort(a, low, idx - 1);
            quickSort(a, idx + 1, high);
        }
    }


    public static void main(String[] args) {
        int[] a = {7,8,3,1,2};
//        int[] a = {};
        System.out.print("Original Array: ");
        print(a);

//        bubbleSort(a);

//        selectionSort(a);
//
//        insertionSort(a);
//
//        int[] res = mergeSort(a, 0, a.length-1);
//        System.out.print("Merge Sort: ");
//        print(res);

        quickSort(a, 0, a.length-1);
        System.out.print("Quick Sort: ");
        print(a);
    }
}
