package Algorithms;

public class Searching {

    static void linearSearch(int[] a, int size, int val){
        for (int i = 0; i<size; i++){
            if (a[i] == val){
                System.out.println("Found at index " + i);
                return;
            }
        }
        
    }

    static void binarySearch(int[] a, int size, int val){
        int lower = 0;
        int upper = size;

        while (lower<=upper){
            int mid = lower + (upper-lower)/2;
//            System.out.println(mid);
            if (a[mid] == val){

                System.out.println("Found at index " + mid);
                return;
            }
            else{
                if (a[mid] < val){
                    lower = mid + 1;
                }
                else if(a[mid] > val){
                    upper = mid - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {5,8,4,6,9,2};
        int size1 = 6;
        System.out.print("Linear Search: ");
        linearSearch(a1, size1, 9);

        int[] a2 = {4,7,8,12,45,99,102,702,10987,56666};
        int size2 = 10;
        System.out.print("Binary Search: ");
        binarySearch(a2, size2, 10987);
    }
}
