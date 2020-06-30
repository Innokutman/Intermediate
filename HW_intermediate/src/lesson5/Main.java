package lesson5;

public class Main {

    public static void main(String[] args) {

        start();
    }

    public static void start() {

        arrayOneThread();
        arrayMultithread();
    }

    public static void arrayMultithread() {

        ArrayMultithread multiThreadStart = new ArrayMultithread();
        multiThreadStart.multiThread();

    }

    public static void arrayOneThread() {

        ArrayOneThread basicArray = new ArrayOneThread();
        basicArray.checkTime();
    }

}