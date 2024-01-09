public class ArrayOps {
    static int[] array1 = { 1, 2 };
    static int[] array2 = { 1, 2 };
    static int missingInt;
    static int isMissingSum;
    static int isCorrectSum;
    static int firstMaxValue;
    static int secondMaxValue;
    static boolean isEqualsArrays = false;

    public static void main(String[] args) {
        System.out.println(findMissingInt(array1));
        // System.out.println(secondMaxValue(array1));
        containsTheSameElements(array1, array2);
    }

    public static int findMissingInt(int[] array1) {
        isMissingSum = 0;
        for (int i = 0; i < array1.length; i++) {
            isMissingSum += array1[i];
        }
        isCorrectSum = 0;
        for (int i = 0; i <= array1.length; i++) {
            isCorrectSum += i;
        }
        missingInt = isCorrectSum - isMissingSum;
        return missingInt;
    }

    public static int secondMaxValue(int[] array1) {
        firstMaxValue = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > firstMaxValue) {
                firstMaxValue = array1[i];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == firstMaxValue) {
                array1[i] = 0;
            }
        }
        secondMaxValue = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > secondMaxValue) {
                secondMaxValue = array1[i];
            }
        }
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("1- " + isEqualsArrays); // 1
            isEqualsArrays = false;

            for (int j = 0; j < array2.length; j++) {
                System.out.println("2- " + isEqualsArrays); // 2
                System.out.println(array1[i] + " " + array2[j]);
                if (array1[i] == array2[j]) {
                    isEqualsArrays = true;
                }
            }
            System.out.println("3- " + isEqualsArrays); // 3
            if (isEqualsArrays == false) {
                return isEqualsArrays;
            }
            System.out.println("4- " + isEqualsArrays); // 4
        }
        System.out.println("5- " + isEqualsArrays); // 5
        return isEqualsArrays;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
