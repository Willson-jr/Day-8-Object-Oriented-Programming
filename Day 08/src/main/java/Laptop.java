import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Laptop {

    private String name;

    private Rating rating;
    private int mark;

    public Laptop(String name, int mark) {
        this.name = name;
        this.rating = Rating.getRating(mark);
        this.mark = mark;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name
                + " and I'm a " + rating.getMark());
    }

    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("ASUS NOVAGO TP370QL",2));
        laptopList.add(new Laptop("ACER PREDATOR 21 X",38));
        laptopList.add(new Laptop("DELL LATITUDE 7390",15));
        laptopList.add(new Laptop("ALIENWARE 15 R3",39));
        for (Laptop laptop : laptopList) {
            laptop.introduce();
        }

        for (Laptop laptop : laptopList) {
            if (laptop.getMark() > 20) {
                System.out.println(laptop.getName() + " is rated " + laptop.getMark());
            }
        }

    }
}