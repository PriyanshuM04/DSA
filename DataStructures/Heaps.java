package DataStructures;

import java.util.ArrayList;

public class Heaps {
    static class Heap<T extends Comparable<T>> {
        private ArrayList<T> list;

        public Heap() {
            list = new ArrayList<>();
        }

        private void swap(int first, int second) {
            T temp = list.get(first);
            list.set(first, list.get(second));
            list.set(second, temp);
        }

        private int parent(int index) {
            return (index-1)/2;
        }

        private int left(int index) {
            return 2 * index + 1;
        }

        private int right(int index) {
            return 2 * index + 2;
        }

        public void insert(T value) {
            list.add(value);
            upheap(list.size()-1);
        }

        private void upheap(int index) {
            if (index==0) return;
            int p = parent(index);
            if (list.get(index).compareTo(list.get(p)) < 0) {
                swap(index, p);
                upheap(p);
            }
        }

        public T remove() throws Exception {
            if (list.isEmpty()) {
                throw new Exception("Removing from an Empty Heap!");
            }
            T temp = list.get(0);
            T last = list.remove(list.size()-1);
            if (!list.isEmpty()) {
                list.set(0, last);
                downheap(0);
            }
            return temp;
        }

        private void downheap(int index) {
            int min = index;
            int left = left(index);
            int right = right(index);

            if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
                min = left;
            }
            if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
                min = right;
            }
            if (min!=index) {
                swap(min, index);
                downheap(min);
            }
        }

        public ArrayList<T> heapSort() throws Exception {
            ArrayList<T> data = new ArrayList<>();
            while (!list.isEmpty()) {
                data.add(this.remove());
            }
            return data;
        }
    }

    public static void main(String[] args) throws Exception {
        Heap<Integer> hp = new Heap<>();
        hp.insert(34);
        hp.insert(45);
        hp.insert(22);
        hp.insert(89);
        hp.insert(76);

//        System.out.println(hp.remove());
        System.out.println(hp.heapSort());
    }
}
