public class ArrayOps {
    static int[] array1 = {1, 2, 1, 1, 2};
    static int[] array2 = {2, 1, 1};
    static int missingInt;
    static int isMissingSum;
    static int isCorrectSum;
    static int firstMaxValue;
    static int secondMaxValue;
    static boolean isEqualsArrays;
    static int index;
// containsSameElements({1, 2, 1, 1, 2}      , {2, 1}           ); // true
// containsSameElements({2, 2, 3, 7, 8, 3, 2}, {8, 2, 7, 7, 3}  ); // true
// containsSameElements({1, 2, 3}            , {1, 2, 3}        ); // true
// containsSameElements({3, -4, 1, 2, 5}     , {1, 3, -4, 5}    ); // false

    public static void main(String[] args) {
        System.out.println(findMissingInt(array1));
        System.out.println(secondMaxValue(array1));
        System.out.println(containsTheSameElements(array1, array2));
    }

    public static int findMissingInt(int[] array1) {
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
        
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
