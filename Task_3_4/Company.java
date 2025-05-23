package Task_3_4;

import java.util.List;

public class Company {
    private String nameCompany;
    private int yearCompany;
    private List<Movie> movies;

    public Company(String name, int year, List<Movie> movies) {
        this.nameCompany = name;
        this.yearCompany = year;
        this.movies = movies;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getYearCompany() {
        return yearCompany;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
