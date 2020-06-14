package lesson1;

public class Kangaroo implements SuperJumpable {

    @Override
    public void jump() {
        System.out.println("a Kangaroo jumping...");
    }

    @Override
    public void superJump(double height) {
        System.out.println("a Kangaroo SUPER jumping...");
    }

    @Override
    public void run() {

    }
}
