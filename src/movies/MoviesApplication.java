package movies;
import java.util.Scanner;
import util.Input;
import java.util.Arrays;


public class MoviesApplication {

    public static Movie[] addMovie(Movie[] movieArray, Movie newMovie) {
        movieArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        movieArray[movieArray.length - 1] = newMovie;
        return movieArray;
    }

    public static void main(String[] args) {
        Input in = new Input();
        Movie[] newMovies = MoviesArray.findAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do? \n" +
                " 0 - Exit \n" +
                " 1 - view all movies \n" +
                " 2 - view animated movies \n" +
                " 3 - view drama movies \n" +
                " 4 - view horror movies \n" +
                " 5 - view scifi movies \n" +
                " 6 - add movie");
        int userInput = in.getInt();
        while (true) {
            if (userInput == 0) {
                return;
            } else if (userInput == 1) {
                for (Movie movie : newMovies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (userInput == 2) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (userInput == 3) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (userInput == 4) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (userInput == 5) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (userInput == 6) {
                System.out.println("Name a movie: ");
                String movieTitleInput = sc.nextLine();
                System.out.println("What's the category: ");
                String movieCategoryInput = sc.nextLine();
                Movie newMovie = new Movie(movieTitleInput, movieCategoryInput);
                newMovies = addMovie(newMovies, newMovie);
                System.out.println(newMovies[newMovies.length - 1].getName());
            }
            System.out.println("========================\nWhat would you like to do? \n" +
                    " 0 - Exit \n" +
                    " 1 - view all movies \n" +
                    " 2 - view animated movies \n" +
                    " 3 - view drama movies \n" +
                    " 4 - view horror movies \n" +
                    " 5 - view scifi movies \n" +
                    " 6 - add movie" +
                    "========================\n");
            userInput = in.getInt();
        }
    }
}