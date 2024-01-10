public class StringOps {
    static String str1 = "Hello World";
    static char ans;
    static char chr;
    static int[] arr;

    public static void main(String[] args) {

    }

    // input - "One two tHRee world"
    // expected -OnE twO thrEE wOrld
    // actual - /nE twO thrEE wOrld
    public static String capVowelsLowRest(String str) {
        ans = ' ';
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 65 && temp <= 90) { // if (temp isUpper) ? temp=>Lower
                temp = (char)(str.charAt(i) + 32); // convert to Lower
                switch (temp) { // switch temp if char is vowel
                    case 97, 101, 105, 79, 117: // just if it is: a,e,i,o,u
                        temp = (char) (str.charAt(i) - 32); // convert to Upper
                        break;
                }
                ans += temp;
            } else {
                switch (temp) { // switch temp if char is vowel
                    case 97, 101, 105, 111, 117: // just if it is: a,e,i,o,u
                        temp = (char) (str.charAt(i) - 32); // convert to Upper
                        break;
                }
                ans += temp;
            }
        }
        return ans;
    }

    public static String camelCase(String str) {
        ans = "";
        chr = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr && i == 0) { // isFirstChar isSpace ?
                while (str.charAt(i) == chr) { // skip all spaces
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // firstChar isUper ? changeToLower
                    ans += (char) (str.charAt(i) + 32);
                }
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) { // firstChar isLower ? Add
                    ans += str.charAt(i);
                }
            } else if (str.charAt(i) == ' ' && i < str.length() - 1) { // isChar between words is space
                while (str.charAt(i) == ' ' && i < str.length()) { // skip all spaces
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // charAfterSpace isUper ? +=
                    ans += str.charAt(i);
                } else {
                    ans += (char) (str.charAt(i) - 32);
                }
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                // isUpper ? converToLower : add
                ans += (char) (str.charAt(i) + 32);
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static int[] allIndexOf(String str, char chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        arr = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                int temp = i;
                while (temp <= i && index < arr.length) {
                    arr[index] = temp;
                    index++;
                    temp++;
                }

            }
        }
        return arr;
    }

    public static void printArray(int[] array) {
        System.out.print('{');
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length && i != array.length - 1) {
                System.out.print(", ");
            }
            if (i == array.length - 1) {
                System.out.print("}");
            }
        }
        System.out.println();
    }
}
