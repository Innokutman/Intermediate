package lesson1;

public class Wall  extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Competitors members) {
        System.out.println(super.getName() + " высота: " + this.heigth);

        members.jump();

        if (getHeigth() <= members.getJumpHeight()) {
            System.out.println("Перепрыгнул стену");

            return true;
        } else {
            System.out.println("Не смог преодолеть стену");

            return false;
        }
    }
}