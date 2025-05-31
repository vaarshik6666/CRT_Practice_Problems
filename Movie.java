public class Movie {

    String name;
    float rating;
    int year;
    String genre;
    String duration;

    public Movie(String name, float rating, int year, String genre, String duration) {
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }

    public void Is_Hit() {
        if (rating >= 7.0) {
            System.out.println(name + " is a hit movie.");
        } else {
            System.out.println(name + " is not a hit movie.");
        }
    }

    public void info() {
        System.out.println("Movie Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration);
    }
    
}
