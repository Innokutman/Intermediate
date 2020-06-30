package lesson5;

import java.util.Arrays;

public class ArrayMultithread extends Array {

    public static float[] partOne;
    public static float[] partTwo;

    float[] fillArray() {

        for (int i = 0; i < getSize(); i++) {
            countArray[i] = 1;
        }

        return countArray;
    }

    public void multiThread() {

        fillArray();

        long startMultiThread = System.currentTimeMillis();

        partOne = new float[half];
        Thread thread1 = new Thread(() -> partOneCalc(countArray, 0, partOne, 0, half));

        partTwo = new float[half];
        Thread thread2 = new Thread(() -> partTwoCalc(countArray, half, partTwo, 0, half));

        thread1.start();
        thread2.start();

        long endMultithread = System.currentTimeMillis();


        System.out.println("Время на анализ в режиме многопоточности " + (endMultithread - startMultiThread));

    }


    public float[] partOneCalc(float[] source, int scrPos, float[] newMultiArray, int destPos, int lenght) {

        System.arraycopy(source, scrPos,newMultiArray, destPos, lenght);

        for (int i = 0; i < newMultiArray.length; i++) {
            newMultiArray[i] = (float) (newMultiArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(newMultiArray, 0, source, scrPos, lenght);

        for (int i = 0; i < newMultiArray.length; i++) {
            newMultiArray[i] = (float) (newMultiArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(newMultiArray, 0, countArray, scrPos, lenght);

        return countArray;

    }

    public float[]  partTwoCalc(float[] source, int scrPos, float[] newMultiArray, int destPos, int lenght) {

        System.arraycopy(source, scrPos, newMultiArray, destPos, lenght);

        for (int i = 0; i < newMultiArray.length; i++) {
            newMultiArray[i] = (float) (newMultiArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(newMultiArray, 0, source, scrPos, lenght);

        for (int i = 0; i < newMultiArray.length; i++) {
            newMultiArray[i] = (float) (newMultiArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(newMultiArray, 0, countArray, lenght, lenght);

        return countArray;
    }
}
