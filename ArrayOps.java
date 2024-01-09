public class ArrayOps {
    static int[] array1;
    static int[] array2;
    static int missingInt;
    static int isMissingSum;
    static int isCorrectSum;
    static int firstMaxValue;
    static int secondMaxValue;
    static boolean isEqualsArrays = false;
    static boolean isSorted = true;

    public static void main(String[] args) {
        // System.out.println(findMissingInt(array1));
        // System.out.println(secondMaxValue(array1));
        // containsTheSameElements(array1, array2);
        // System.out.println(isSorted(array1));
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
            isEqualsArrays = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isEqualsArrays = true;
                }
            }
            if (isEqualsArrays == false) {
                return isEqualsArrays;
            }
        }
        return isEqualsArrays;
    }

    public static boolean isSorted(int[] array1) {
        int minNumTest = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minNumTest) {
                isSorted = false;
            }
            minNumTest = array1[i];
        }
        if (isSorted == false) {
            isSorted = true;
            int maxNumTest = array1[0];
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] > maxNumTest) {
                    isSorted = false;
                }
                maxNumTest = array1[i];
            }
        }
        return isSorted;
    }

}
