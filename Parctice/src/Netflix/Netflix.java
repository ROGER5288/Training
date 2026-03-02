package Netflix;

public class Netflix {
	private User[] users;
	private Movies[] movies;
	
	
	public Netflix() {
		
	}
	public Netflix(User[] users, Movies[] movies) {
		this.users = users;
		this.movies = movies;
	}
	public User[] getUser() {
		return users;
	}
	public Movies[] getMovies() {
		return movies;
	}
	
	public void setUser(User[] users) {
		this.users = users;
	}
	public void setMovies(Movies[] movies) {
		this.movies = movies;
	}
	
	public void showUsers() {
		for(User u : users) {
			u.userDetails();
			
			System.out.println("==========================================");
		}
	}
}
