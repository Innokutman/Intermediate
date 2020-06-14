package lesson1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean move(Competitors members);

    public String getName() {
        return name;
    }
}