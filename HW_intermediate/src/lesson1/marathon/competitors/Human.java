package lesson1.marathon.competitors;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Human(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Human(String name) {
        this(name,1000,50,1);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s успешно пробежал %d  метров\n",  name, dist);
        } else {
            System.out.printf("%s не смог пробежать %d  метров\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(maxSwimDistance == 0){
            System.out.printf("%s не умеет плавать вообще\n", name);
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.printf("%s успешно проплыла %d  метров\n",name, dist);
        } else {
            System.out.printf("%s не может плыть %d  метров\n",name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s успешно прыгнул %d  метров\n", name, height);
        } else {
            System.out.printf("%s не смог прыгнуть %d  метров\n", name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }
}
