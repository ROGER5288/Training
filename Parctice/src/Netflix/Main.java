package Netflix;

public class Main {
	public static void main(String [] args) {
		Movies m1 = new Movies("Inception", "English", 148, "Sci-Fi");
		Movies m2 = new Movies("RRR", "Telugu", 180, "Action");

		Movies[] movieList = { m1, m2 };

		Subscription sub = new Subscription(499, "31-12-2026", 4);

		Accounts acc = new Accounts("tony_stark", "ironman", movieList);

		User user = new User(
				"Tony Stark",
				"tony@stark.com",
				"29-05-1970",
				sub,
				acc
		);

		User[] users = { user };

		Netflix netflix = new Netflix(users, movieList);
		netflix.showUsers();
	}
}
