package SortedSet.TreeSet;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		if (o1.rating > o2.rating)
			return 1;
		else if (o1.rating < o2.rating)
			return -1;
		else
			return 0;
	}

}
