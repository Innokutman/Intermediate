package lesson1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean move(Competitors members) {
        System.out.println(super.getName() + " длина: " + this.length);

        members.run();

        if (getLength() <= members.getRunDistance()) {
            System.out.println("Уверенно пробежал дистанцию");

            return true;
        } else {
            System.out.println("Сошёл с дистанции");

            return false;
        }
    }
}