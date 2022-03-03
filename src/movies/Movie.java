package movies;

public class Movie {
    public Movie(String movieName, String categoryName) {
        this.movieName = movieName;
        this.categoryName = categoryName;
    }

    private String movieName;
    private String categoryName;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
