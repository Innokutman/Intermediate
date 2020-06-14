package lesson1.marathon.obstacles;

import lesson1.marathon.competitors.Competitor;

public class Water extends Obstacle {

    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.swim(dist);
    }
}
