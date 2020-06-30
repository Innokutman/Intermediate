package lesson5;

public class ArrayOneThread extends Array {

    public float[] fill() {

        for (int i = 0; i < getSize(); i++) {
            countArray[i] = 1;
        }
        return countArray;
    }

    public void checkTime() {

        fill();

        long start = System.currentTimeMillis();

        for (int j = 0; j < getSize(); j++) {
            countArray[j] = (float) (countArray[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }

        long end = System.currentTimeMillis();
        System.out.println("Время на анализ без многопоточности: " + (end - start));

    }
}
