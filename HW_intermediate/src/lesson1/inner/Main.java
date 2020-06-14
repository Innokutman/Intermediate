package lesson1.inner;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Outer outer = new Outer(77);
//
//        Outer.Inner inner = outer.new Inner();
//        inner.printOutValue();
//
//        Outer.Inner inner1 = new Outer(56).new Inner();
//        inner1.printOutValue();

//        Outer.StaticInner.printOutValue();


        exLocalClass();
    }

    public static void exLocalClass() {

        class LocalClass {
            int x;
            int y;

            public LocalClass(int x, int y) {
                this.x = x;
                this.y = y;
            }

            int sum() {
                return x + y;
            }
        }

        LocalClass localClass = new LocalClass(4,9);
        System.out.println(localClass.sum());

    }
}
