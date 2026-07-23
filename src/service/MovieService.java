package service;
import model.Movie;
import java.util.ArrayList;
public class MovieService {
    private static ArrayList<Movie> movieList = new ArrayList<>();
    public static void addMovie(Movie movie){movieList.add(movie);}
    public static ArrayList<Movie> getMovies(){return movieList;}
    public static Movie getMovieById(int id) {
        for (Movie movie : movieList) {
            if (movie.getMovieId() == id) {
                return movie;
            }
        }
        return null;
    }
    public static void deleteMovie(int id){
        Movie movie= getMovieById(id);
        if(movie !=null){
            movieList.remove(movie);
        }
    }
}