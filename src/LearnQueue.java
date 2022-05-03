import java.util.*;

public class LearnQueue {

    /*
    Queue can be implemented using these three classes
    LinkedList -----> Queue can be implemented using Linked list having normal functionality
    ArrayDeque -----> ArrayDeque is Queue can be operated from front and rear side ... Element can be added and deleted from both side
    PrioirityQueue--> PriorityQueue is minHeap and maxHeap
    Generally we use LinkedList to make general Queue
    */

    public static void main(String args[]){
/*
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 1, 2, 1, 10, 24, 15, 12, 46, 11, 54, 46));
        Queue<Integer> queue = new LinkedList<>(list);
        System.out.println(queue);
        queue.offer(5151);
        queue.offer(6);
        System.out.println(queue);
        System.out.println(queue.peek() + " " + queue.poll());
        System.out.println(queue);
*/

/*
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(10,11));
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(2);
        System.out.println(arrayDeque);

        System.out.println( arrayDeque.pollFirst());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pollLast());

        System.out.println(arrayDeque);
*/

/*
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Arrays.asList(12,23,1,10,14,25,30)); //MinHeap
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((o1,o2) -> o2-o1); //MaxHeap
        maxheap.addAll(Arrays.asList(12,23,1,10,14,25,30));
        System.out.println(minHeap);
        System.out.println(maxheap);

        minHeap.poll();
        maxheap.poll();

        System.out.println(minHeap);
        System.out.println(maxheap);

        minHeap.poll();
        maxheap.poll();

        System.out.println(minHeap);
        System.out.println(maxheap);

*/

    }

}
