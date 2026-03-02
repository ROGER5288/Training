package Netflix;

public class Accounts {
	private String username;
	private String password;
	
	private Movies[] movies;
	private int index = 0;
	public Accounts() {
		
	}
	public Accounts(String username, String password, Movies[] movieList) {
		this.username = username;
		this.password = password;
		this.movies = movieList;
	}
	public  void addMoviesArray(int Num) {
		movies = new Movies[Num];
	}
	public void addMovies(String name, String language, double duration, String Genre) {
		if(index<movies.length) {
			movies[index++] = new Movies( name, language, duration, Genre);
		}else {
			System.out.println("Movie limit exceed!! Delete some of previous movies to continue");
		}
	}
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Movies[] getMovies() {
		return movies;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMovies(Movies[] movies) {
		this.movies = movies;
	}
	
	public String getAccountdetails() {
		return "Username" + username ;
	}
	public String showMovies() {
		if (movies == null) return null;

		for (Movies m : movies) {
			if (m != null) {
				System.out.println(m.getMovieDetails());
			}
		}
		return username;
	}	
}
