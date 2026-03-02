package SortedSet.TreeSet;

import java.util.TreeSet;

public class MovieImplement {
	public static void main(String[] args) {
		TreeSet<Movies> ts = new TreeSet<Movies>(new MovieComparator());

		ts.add(new Movies(4, "Interstellar", 8.6));
		ts.add(new Movies(9, "Batman & Robin", 3.7));
		ts.add(new Movies(1, "The Shawshank Redemption", 9.3));
		ts.add(new Movies(7, "Transformers: Revenge of the Fallen", 6.0));
		ts.add(new Movies(5, "The Matrix", 8.7));
		ts.add(new Movies(10, "Cats", 3.3));
		ts.add(new Movies(2, "The Dark Knight", 9.0));
		ts.add(new Movies(8, "Aquaman", 6.9));
		ts.add(new Movies(6, "Jurassic World", 7.0));
		ts.add(new Movies(3, "Inception", 8.8));

		System.out.println(ts);
	}
}