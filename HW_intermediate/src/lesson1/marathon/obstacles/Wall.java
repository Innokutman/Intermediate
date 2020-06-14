package lesson1.marathon.obstacles;

import lesson1.marathon.competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor c) {
        c.jump(height);
    }
}