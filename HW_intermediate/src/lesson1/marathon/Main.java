package lesson1.marathon;

import lesson1.marathon.competitors.Cat;
import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Dog;
import lesson1.marathon.competitors.Human;
import lesson1.marathon.obstacles.Cross;
import lesson1.marathon.obstacles.Obstacle;
import lesson1.marathon.obstacles.Wall;
import lesson1.marathon.obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
            new Human("Bob"),
            new Cat("Barsik"),
            new Cat("Tigr",500, 200, 3),
            new Dog("Vulkan"),
            new Human("John Connor", 5000,1000,5)
        };

        Obstacle[] obstacles ={
                new Cross(400),
                new Wall(3),
                new Water(50)
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
