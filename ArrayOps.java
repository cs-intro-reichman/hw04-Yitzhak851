public class ArrayOps {
    static int[] array1 = { 1, 2, 3 };
    static int[] array2 = { 1, 2 };
    static int missingInt;
    static int isMissingSum;
    static int isCorrectSum;
    static int firstMaxValue;
    static int secondMaxValue;
    static boolean isEqualsArrays;
    static int index;

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
        isEqualsArrays = true;
        index = 0;
        while (index < array2.length ) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[index]) {
                    isEqualsArrays = false;
                }
            }
            index++;
        }
        return isEqualsArrays;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
