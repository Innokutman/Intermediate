package lesson2;

public class Main {

    final int ARRAY_SIZE = 4;



    boolean numbersOrNot(String s) {
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


    public void stringArrayToInt(String[][] toBeConverted) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (toBeConverted.length == ARRAY_SIZE) {

            for (int i = 0; i < toBeConverted.length; i++) {
                int j = toBeConverted[i].length;
                if (j == ARRAY_SIZE) {
                    continue;
                } else {
                    throw new MyArraySizeException("Измените размер массива!");
                }
            }
        } else {
            throw new MyArraySizeException("Измените размер массива!");
        }

        int[][] convertedStringToIntArray = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                if (numbersOrNot(toBeConverted[i][j])) {
                    convertedStringToIntArray[i][j] = Integer.parseInt(toBeConverted[i][j]);
                    sum += convertedStringToIntArray[i][j];
                } else {
                    throw new MyArrayDataException("Неверный формат данных в массиве по адресу[" + i + "]" + "[" + j + "]");
                }
            }
        }
        System.out.println("Сумма всех чисел = " + sum);
    }

    public static void main(String[] args) {
        Main prove = new Main();
        String[][] correctArray = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] incorrectArray1 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2"}};
        String[][] incorrectArray2 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "ffffffffff", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        prove.stringArrayToInt(correctArray);
        prove.stringArrayToInt(incorrectArray1);
    }
}

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String s) {
        super(s);
    }

}

class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String s) {
        super(s);
    }
}