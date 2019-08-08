import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Rating {

    private int minimum;
    private int maximum;
    private String mark;

    private static List<Rating> ratingList = new ArrayList<>();
    // do inicjalizowania zmiennych statycznych
    // służy blok statyczny
    // blok statyczny jest przed konstrutkorem na początku tworzenia klasy:)
    // blok statyczny stosujemy wtedy kiedy chcemy zainicjalizować zmienną, zmienne statyczną
    static {
        ratingList.add(new Rating(0, 9, "very slow laptop."));
        ratingList.add(new Rating(10, 24, "quite decent laptop."));
        ratingList.add(new Rating(25, 50, "gaming machine!"));
    }

    public static Rating getRating(int mark) {
        for (Rating rating : ratingList) {
            if (rating.minimum <= mark && mark <= rating.maximum)
                return rating;
       }
        return null;
    }
}
