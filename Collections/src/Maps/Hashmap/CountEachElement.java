package Maps.Hashmap;

import java.util.HashMap;

public class CountEachElement {
    public static void main(String[] args) {

        int[] nums = {1,2,3,2,1,2,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

