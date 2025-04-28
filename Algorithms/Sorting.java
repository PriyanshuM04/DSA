package Algorithms;

public class Sorting {

    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //----BUBBLE SORT----
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
    static void mergeSort(int[] a) {


        System.out.print("Merge Sort: ");
        print(a);
    }

    // ----Quick Sort----
    static void quickSort(int[] a) {
        System.out.print("Quick Sort: ");
        print(a);
    }


    public static void main(String[] args) {
        int[] a = {7,8,3,1,2};
//        int[] a = {};
        System.out.print("Original Array: ");
        print(a);

        bubbleSort(a);
//        selectionSort(a);
//        insertionSort(a);
//        mergeSort(a);
//        quickSort(a);
    }
}
