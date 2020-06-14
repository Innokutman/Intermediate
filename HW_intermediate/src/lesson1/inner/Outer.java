package lesson1.inner;

public class Outer {
    private int x;
    private static int y = 99;

    public Outer(int x) {
        this.x = x;
    }

    class Inner{
        private int inVal = 5;

        public void printOutValue(){
            System.out.println(x);
        }
    }

    static class StaticInner{
        private int inVal = 5;

        public static void printOutValue(){
            System.out.println(y);
        }
    }
}
