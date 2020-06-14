package lesson1;

public class Cat implements Runnable, Jumpable {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " run...");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump!!!");
    }
}
