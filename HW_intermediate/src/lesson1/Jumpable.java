package lesson1;

@FunctionalInterface
public interface Jumpable {
    void jump();
    default void middleJump(){
        System.out.println("middle jump...");
    }
}
