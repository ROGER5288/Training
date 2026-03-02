import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Heap_Element_Frequency2 {
	public static void main(String[] args) {
		int arr[] = {1,2,1,1,3,2};
		int k = 2;
		
		System.out.println(topKFrequent(arr, k));
	}
	
	public static List<Integer> topKFrequent(int[]arr, int k){
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num,map.getOrDefault(num, 0) + 1);
		}
		
		PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			minHeap.offer(entry);
			
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		
		List<Integer> result = new ArrayList<>();
		
		while(!minHeap.isEmpty()) {
			result.add(minHeap.poll().getKey());
		}
		
		Collections.reverse(result);
		
		return result;
	}
}
