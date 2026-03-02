import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Heap_Element_Frequency {
	
	public static void main(String[] args) {
		int arr[] = {1,2,1,1,3,2};
		int k = 2;
		
		System.out.println(topKFrequent(arr, k));
	}
	
	public static List<Integer> topKFrequent(int[]arr, int k){
		
		// Frequency Map
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int element : arr) {
            freq.put(element, freq.getOrDefault(element, 0) + 1);
        }

        // Min Heap based on frequency
        PriorityQueue<Integer> queue =
                new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        Set<Integer> keySet = freq.keySet();

        for (Integer element : keySet) {

            queue.add(element);

            if (queue.size() > k) {
                queue.poll();   // remove least frequent
            }
        }

        return new ArrayList<>(queue);
		
		
		
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for(int num : arr) {
//			map.put(num,map.getOrDefault(num, 0) + 1);
//		}
//		
//		PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			minHeap.offer(entry);
//			
//			if(minHeap.size()>k) {
//				minHeap.poll();
//			}
//		}
//		
//		List<Integer> result = new ArrayList<>();
//		
//		while(!minHeap.isEmpty()) {
//			result.add(minHeap.poll().getKey());
//		}
//		
//		Collections.reverse(result);
//		
//		return result;
	}	
}
