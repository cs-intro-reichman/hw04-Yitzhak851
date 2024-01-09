public class ArrayOps {
    static int[] array1 = { 0, 1, 2, 3, 4, 6 };
    static int isMissingSum;
    static int isCorrectSum;
    static int missingInt;

    public static void main(String[] args) {
        System.out.println(findMissingInt(array1));
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
        // Write your code here:
        return 0;
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
