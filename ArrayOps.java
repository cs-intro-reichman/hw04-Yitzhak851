public class ArrayOps {
    static int[] array1 = { 1, 2, 3 };
    static int isMissingSum;
    static int isCorrectSum;
    static int missingInt;
    static int firstMaxValue;
    static int secondMaxValue;

    public static void main(String[] args) {
        System.out.println(findMissingInt(array1));
        System.out.println(secondMaxValue(array1));
    }

    public static int findMissingInt(int[] array) {
        isMissingSum = 0;
        for (int i = 0; i < array.length; i++) {
            isMissingSum += array[i];
        }
        isCorrectSum = 0;
        for (int i = 0; i <= array.length; i++) {
            isCorrectSum += i;
        }
        missingInt = isCorrectSum - isMissingSum;
        return missingInt;
    }

    public static int secondMaxValue(int[] array) {
        firstMaxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMaxValue) {
                firstMaxValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == firstMaxValue) {
                array[i] = 0;
            }
        }
        secondMaxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMaxValue) {
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
