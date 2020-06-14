package lesson1;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Runnable cat = new Cat("Barsik");
        Runnable dog = new Dog("Tuzik");


//        cat.run();
//        dog.run();

//        runPlease(cat);
//        runPlease(dog);

//        Runnable[] runnables = {new Cat("Barsik"),
//                new Dog("Tuzik"),
//                new Cat("Murzik"),
//                new Dog("Vulkan")
//        };
//
//        for (int i = 0; i < runnables.length ; i++) {
//            runnables[i].run();
//            if(runnables[i] instanceof Jumpable){
//                ((Jumpable)runnables[i]).jump();
//            }
//        }


//        Cat cat1 = new Cat("Murka");
//        Kangaroo kangaroo = new Kangaroo();
//
//        Jumpable[] jumpables = {
//                cat1,
//                kangaroo
//        };

//        for (int i = 0; i < jumpables.length; i++) {
//            jumpables[i].jump();
//        }

//        for (Jumpable j : jumpables) {
//            if (j instanceof SuperJumpable) {
//                ((SuperJumpable) j).superJump(5);
//            } else {
//                j.jump();
//            }
//            j.middleJump();
//        }


//        runPlease(cat);
//        runPlease(dog);

//        runPlease(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run run run");
//            }
//        });

//        runPlease(() -> {
//            System.out.println("run run run");
//        });

    }

    static void runPlease(Runnable r) {
        r.run();
    }

}
