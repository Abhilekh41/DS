package Practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxAndMinFromAnArray
{
    public static void main(String args[])
    {
        int[] arr = {7,10,4,3,20,15};
        int place = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<arr.length;i++)
        {
            minHeap.add(arr[i]);
            maxHeap.add(arr[i]);
            if(minHeap.size()>place)
            {
                minHeap.remove();
                maxHeap.remove();
            }
        }
        System.out.println(minHeap.remove());
        System.out.println(maxHeap.remove());
    }
}
