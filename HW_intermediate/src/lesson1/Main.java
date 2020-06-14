package lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Competitors[] members = new Competitors[3];

        int distance = (rand.nextInt(10) + 1);
        int heigth = (rand.nextInt(10) + 1);
        members[0] = new Human("Хусейн Болт", distance, heigth);

        distance = (rand.nextInt(10) + 1);
        heigth = (rand.nextInt(10) + 1);
        members[1] = new Robot("Вертер", distance, heigth);

        distance = (rand.nextInt(10) + 1);
        heigth = (rand.nextInt(10) + 1);
        members[2] = new Cat("Басик", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Впереди препятствие беговая дорожка № " + (i + 1), distance);
            } else {
                barriers[i] = new Wall("Впереди препятствие стена № " + (i + 1), distance);
            }
        }

        for (int i = 0; i < members.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].move(members[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Продолжает маршрут!");
            } else {
                System.out.println("Завершает забег!");
            }
        }
    }
}
