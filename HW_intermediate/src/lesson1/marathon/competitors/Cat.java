package lesson1.marathon.competitors;

public class Cat extends Animal {

    public Cat(String name) {
        super("Cat", name, 100, 0, 3);
    }

    public Cat(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        super("Cat", name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }
}
