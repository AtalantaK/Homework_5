package Task_3_4;

import java.util.ArrayList;
import java.util.List;

public class Main_3_4 {

    public static void main(String[] args) {

        //Task 3
        List<Movie> films = new ArrayList<>();
        films.add(new Movie("Фильм 1", 1.5, "Ужасы", "Россия", false, "2015"));
        films.add(new Movie("Фильм 2", 10, "Фантастика", "США", true, "2021"));
        films.add(new Movie("Фильм 3", 5.7, "Комедия", "Китай", false, "2003"));

        System.out.println("\nИнформация о фильме с индексом = 1 : \n" +
                "\tНазвание фильма: " + films.get(1).getNameMovie() + "\n" +
                "\tРейтинг фильма: " + films.get(1).getRateMovie() + "\n" +
                "\tЖанр фильма: " + films.get(1).getGenreMovie() + "\n" +
                "\tСтрана фильма: " + films.get(1).getCountryMovie() + "\n" +
                "\tНаличие оскара: " + films.get(1).isOscar() + "\n" +
                "\tГод выпуска фильма: " + films.get(1).getYearMovie() + "\n");

        //Task 4
        List<Company> companies = new ArrayList<>();

        //Создаем Task3_4.Company 1
        List<Movie> films1 = new ArrayList<>();
        films1.add(new Movie("Золушка", 9.5, "Комедия", "США", false, "2018"));
        films1.add(new Movie("Бемби", 8.7, "Комедия", "США", true, "2011"));
        films1.add(new Movie("Рапунцель", 7.9, "Комедия", "США", false, "2013"));

        companies.add(new Company("Walt Disney", 1990, films1));

        //Создаем Task3_4.Company 2
        List<Movie> films2 = new ArrayList<>();
        films2.add(new Movie("Титаник", 10.0, "Драма", "США", false, "2018"));
        films2.add(new Movie("Хатико", 6.4, "Ужасы", "Китай", false, "2021"));
        films2.add(new Movie("Агент 007", 8.2, "Комедия", "Франция", false, "2023"));

        companies.add(new Company("Netflix", 2005, films2));

        //Создаем Task3_4.Company 3
        List<Movie> films3 = new ArrayList<>();
        films3.add(new Movie("Форсаж", 4.8, "Боевик", "США", false, "2008"));
        films3.add(new Movie("Служанка", 9.1, "Ужасы", "Испания", true, "2001"));
        films3.add(new Movie("Хороший доктор", 6.7, "Драма", "Германия", false, "2003"));
        films3.add(new Movie("Между нами звёзды", 9.4, "Драма", "США", false, "2012"));
        companies.add(new Company("Paramount Pictures", 1980, films3));

        System.out.println("Информация о компаниях: ");

        for (Company company : companies) {
            System.out.print("\t" + company.getNameCompany() + " : ");
            for (int i = 0; i < company.getMovies().size(); i++) {
                System.out.print("\"" + company.getMovies().get(i).getNameMovie() + "\" ");
            }
            System.out.println();
        }

    }
}
