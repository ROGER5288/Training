package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Activities_Main {
	public static void main(String[] args) {
		List<Activities> list = new ArrayList<>();
		
		list.add(new Activities(1, 1, 4));
		list.add(new Activities(2, 3, 5));
		list.add(new Activities(3, 0, 6));
		list.add(new Activities(4, 5, 7));
		list.add(new Activities(5, 8, 9));
		list.add(new Activities(6, 5, 9));
		list.add(new Activities(7, 6, 10));
		list.add(new Activities(8, 8, 11));
		list.add(new Activities(9, 2, 13));
		list.add(new Activities(10, 12, 14));

		
		list.sort((a1, a2) -> a1.end -a2.end);
		
		int count = 1;
        int lastEnd = list.get(0).end;

        for (int i = 1; i < list.size(); i++) {
            Activities current = list.get(i);

            if (current.start >= lastEnd) {
                count++;
                lastEnd = current.end;
            }
        }

        System.out.println("Maximum activities: " + count);
    }

}
