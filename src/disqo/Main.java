package disqo;

import disqo.task1.Point;
import disqo.task2.Cartoon;
import disqo.task2.Film;
import disqo.task2.Movie;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {

        //
        // TASK 1 -- Find distance between two points
        //

        Point point1 = new Point(-7, -4);
        Point point2 = new Point(17, 6.5);
        double distance = point1.distance(point2);
        System.out.println(distance);


        //
        // TASK 2 -- Get the title of Movies with the max rating
        //
        List<Film> listFilms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listFilms.add(new Movie("Movie Title" + i, random.nextInt(10) + 1));
        }
        for (int i = 5; i < 11; i++) {
            listFilms.add(new Cartoon("Cartoon Title" + i, random.nextInt(10) + 1));
        }


        List<Film> result = listFilms.stream()
                .filter(m -> m instanceof Movie)
                .collect(Collectors.groupingBy(Film::getRating, TreeMap::new, Collectors.toList()))
                .lastEntry().getValue();

        System.out.println(listFilms);

        for (Film item : result) {
            System.out.println(item.getTitle());
        }


    }
}
