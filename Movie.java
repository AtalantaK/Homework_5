public class Movie {
    private String nameMovie;
    private double rateMovie;
    private String genreMovie;
    private String countryMovie;
    private boolean isOscar;
    private String yearMovie;

    public Movie(String nameMovie, double rateMovie, String genreMovie, String countryMovie, boolean isOscar, String yearMovie) {
        this.nameMovie = nameMovie;
        this.rateMovie = rateMovie;
        this.genreMovie = genreMovie;
        this.countryMovie = countryMovie;
        this.isOscar = isOscar;
        this.yearMovie = yearMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public double getRateMovie() {
        return rateMovie;
    }

    public String getGenreMovie() {
        return genreMovie;
    }

    public String getCountryMovie() {
        return countryMovie;
    }

    public boolean isOscar() {
        return isOscar;
    }

    public String getYearMovie() {
        return yearMovie;
    }
}
