package lesson1.enums;

public class MainEnumsTest {
    public static void main(String[] args) {
//        Planets planet1 = Planets.Earth;
//        Planets planet2 = Planets.Jupiter;
//        System.out.println(planet1.compareTo(planet2));
//
//        System.out.println(planet1.ordinal());
//
//        Planets planet3 = Planets.valueOf("Venus");
//        System.out.println(planet3);

        for (Planets p : Planets.values()) {
            System.out.println(p + " " + p.getWeight());
        }

    }
}
