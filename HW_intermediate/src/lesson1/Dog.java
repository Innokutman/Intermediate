package lesson1;

public class Dog implements Runnable {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " run...");
    }
}
