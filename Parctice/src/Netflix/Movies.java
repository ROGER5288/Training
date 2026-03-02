package Netflix;

public class Movies {
	String name;
	String language;
	double duration;
	String Genre;
	
	Movies(){
		
	}
	Movies(String name, String language, double duration, String Genre){
		this.duration = duration;
		this.Genre = Genre;
		this.language = language;
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	public String getLan() {
		return language;
	}
	public String getGenre() {
		return Genre;
	}
	public double getDuration() {
		return duration;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLan(String language) {
		this.language= language;
	}
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	public void setduration(double duration) {
		this.duration= duration;
	}
	
	public String getMovieDetails() {
		return "Movie name : "  + name + " language : " + language + " duration : " + duration + "genre : " + Genre;
	}
	
	
}
