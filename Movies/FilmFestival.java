import java.util.*;
public class FilmFestival
{
    public static void main(String args[])
    {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Action("Inception",80,"PG-13", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Tom Berenger", "Ellen Page", "Tom Hardy"},4));
        movies.add(new Action("Inception",80,"PG-13", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Tom Berenger", "Ellen Page", "Tom Hardy"},4));
        movies.add(new Action("Inception",80,"PG-13", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Tom Berenger", "Ellen Page", "Tom Hardy"},4));
        movies.add(new RomCom("The Break-Up",68,"PG", new String[]{"Jennifer Aniston", "Vince Vaughn", "Jon Favreau"},false));
        movies.add(new Comedy("Ghostbusters",99,"PG-13", new String[]{"Bill Murray", "Dan Aykroyd", "Sigourney Weaver", "Harold Ramis"}));
        movies.add(new Movie("Good Will Hunting",89,"R", new String[]{"Robin Williams", "Matt Damon", "Ben Affleck", "Minnie Driver"}));
        movies.add(new Movie("The Lion King",95,"G", new String[]{"Matthew Broderick", "Jeremy Irons", "James Earl Jones", "Jonathan Taylor Tomas"}));
        movies.add(new RomCom("The Break-Up",68,"PG", new String[]{"Jennifer Aniston", "Vince Vaughn", "Jon Favreau"},false));
        movies.add(new Movie("The Lion King",82,"PG", new String[]{"Donald Glover", "Beyonce", "Seth Rogen"}));
        movies.add(new Action("The Matrix",89,"PG-13", new String[]{"Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"},25));
        movies.add(new Comedy("Toy Story",97,"G", new String[]{"Tom Hanks", "Tim Allen", }));
        movies.add(new RomCom("Sleepless in Seattle",75,"PG", new String[]{"Meg Ryan", "Tom Hanks"},true));
        movies.add(new Action("The Matrix",89,"PG-13", new String[]{"Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"},25));
        removeDups(movies);
        sortMovies(movies);
        violentMovies(movies);
        familyMovies(movies);
        tomMovies(movies);
        showMovies(movies);
        printMovies(movies);
    }
    /**
     * Remove duplicate Movies in arr--must use the equals method from Movie to determine if Movies are equal
     * Be careful--removing from an ArrayList shifts the indices
     * Decrease total movies using accessor and modifier of static variable totalMovies in Movie
     */    
  public static void removeDups(ArrayList<Movie> arr) 
    {
        
        int n = 0;
        for (int i = arr.size() - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr.get(i).equals(arr.get(j))) 
                {
                    arr.remove(i);
                    n++;
                    break;
                }
            }
        }
        Movie.setTotalMovies(Movie.getTotalMovies() - n);
    }
    /**
     * Print total movies using accessor of static variable totalMovies in Movie
     * Print Movies in arr by calling the toString() method (for-each loop suggested)
     */   
    public static void printMovies(ArrayList<Movie> arr)
    {
          System.out.println("Total Movies: " + Movie.getTotalMovies());
        for(Movie m : arr) {
            System.out.println(m);
        }
    }
    /**
     * Sort arr using either Selection Sort or Insertion Sort
     * You must use the getBetter() method from Movie
     */  
     public static void sortMovies(ArrayList<Movie> arr)
    {
        
        for (int i = 1; i < arr.size(); i++)
        {
            Movie t = arr.get(i);
            int in = i - 1;
            while(in >= 0 && arr.get(in).getBetter(t) != t)
            {
                arr.set(in + 1, arr.get(in));
                in--;
            }
            arr.set(in + 1, t);
        }
    }

    /**
     * Call changeRating() for every Action movie in arr. (for-each loop suggested)
     * Print the TITLE of any movie that was changed.
     */
    public static void violentMovies(ArrayList<Movie> arr)
    {
        System.out.println("\nThe following action movies contain too many deaths and must be rated R:");
        for(Movie m: arr)
        {
            if (m instanceof Action)
            {
           if (((Action)m).changeRating() == true)
           System.out.println(m.getTitle());
        }
        }
    }
    /**
     * print out TITLE of every Movie in arr with a G rating (for-each loop suggested)
     */
    public static void familyMovies(ArrayList<Movie> arr)
    {
        System.out.println("\nThe following movies are suitable for children:");
        for(Movie m: arr)
        {
           if (m.getRating().equals("G"))
           System.out.println(m.getTitle());
        }
    }
    /**
     * print out the TITLE of every Movie in arr that stars an actor with a first name of Tom
     * Just check the first three letters of every actor to see if they are equal to Tom
     * Make sure every movie is printed ONCE (Inception has 2 Toms)
     * (Notice I spelled Jonathan Taylor Thomas' name incorrectly (Tomas) to make sure you check
     * the FIRST three letters.)
     * You must use SUBSTRING OR INDEXOF.
     */
    public static void tomMovies(ArrayList<Movie> arr)
    {
        
        System.out.println("\nThe following movies star an actor named Tom:");
        for(Movie m: arr)
        {
           for( String s: m.getActors())
           {
               if(s.substring(0, 3).equals("Tom")) {
                    System.out.println(m.getTitle());
                    break;
                }
            }
        }
    }
     /**
     * Increase the views for every Movie in arr by a random integer from 50-500
     * This means that you need a loop for every movie that goes "views" times.
     * If the movie is a Comedy, increase the laughs by a random number from 0-50 by calling the overloaded showMovie.
     * Call the showMovie method from Movie for every other type of movie.
     * (for-each loop suggested)
     */
    public static void showMovies(ArrayList<Movie> arr)
    {
        
       for(Movie m : arr) {
            if(m instanceof Comedy) {
                int num = (int)(Math.random() * (451) + 50);
                for(int i=0; i<num; i++) {
                   int k = (int)(Math.random() * 51);
                ((Comedy)m).showMovie(k);
                }
                
            } else {
                int num = (int)(Math.random() * (451) + 50);
                for(int i=0; i<num; i++) {
                    m.showMovie();
                }
            }
        }
    
    }

}

