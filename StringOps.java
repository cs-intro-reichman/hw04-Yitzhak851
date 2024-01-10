public class StringOps {
    static String str1 = "hello world";
    static String ans;
    static char chr = 'l';
    static int[] arr;
    // allIndexOf("Hello world",'l'); 
    // output: {2, 3, 9}
    public static void main(String[] args) {
        printArray(allIndexOf(str1, chr));
    }

    public static String capVowelsLowRest(String str) {
        ans = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 97, 101, 105, 111, 117: // a,e,i,o,u
                    ans += (char) (str.charAt(i) - 32);
                    break;
                default:
                    ans += (char) (str.charAt(i));
                    break;
            }
        }
        return ans;
    }

    public static String camelCase(String str) {
        ans = "";
        chr = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr && i == 0) { // if first char is space
                while (str.charAt(i) == chr) { // skip all spaces
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // firstChar isUper ? changeToLower
                    ans += (char) (str.charAt(i) + 32);
                }
            } else if (str.charAt(i) == ' ' && i < str.length() - 1) { // if char between words is space
                while (str.charAt(i) == ' ' && i < str.length()) { // skip all spaces
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // charAfterSpace isUper ? +=
                    ans += str.charAt(i);
                } else {
                    ans += (char) (str.charAt(i) - 32);
                }
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90 && i < str.length() - 1) {
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
                    System.out.println(i + " " + index);
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
