package minheapusingpriorityqueue;
import java.util.PriorityQueue;
public class MinHeapUsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> heap = new PriorityQueue<Integer>();
        heap.add(11);
        heap.add(2);
        heap.add(10);
        heap.add(7);
        heap.add(3);
        heap.add(8);
        System.out.println(heap);
        System.out.println("Size of Heap: "+heap.size());
        System.out.println("Min in Heap: "+heap.peek());
        System.out.println("Deleted Element: "+heap.poll());
        System.out.println("After Deletion");
        System.out.println(heap);
        System.out.println("Size of Heap: "+heap.size());
        System.out.println("Deleted Element: "+heap.poll());
        System.out.println(heap);
        System.out.println("Min in Heap: "+heap.peek());
    }
}
