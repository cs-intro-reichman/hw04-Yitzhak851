public class StringOps {
    // 1.charAt(int index)
    // 2.length()
    // 3.substring(int start)
    // 4.substring(int start,int ends)
    // 5.indexOf(String str)
    static String str1 = "Hello World"; // => hEllO wOrld
    static String ans;

    public static void main(String[] args) {
        System.out.println(capVowelsLowRest(str1));
    }

    public static String capVowelsLowRest(String str) {
        ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                // if is upper case - convert to lower case
                ans += (char) (str.charAt(i) + 32);
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                // if is lower case - convert to upper case
                ans += (char) (str.charAt(i) - 32);
            } else if (str.charAt(i) == ' '){
                // if is space - convert to space
                ans += ' ';
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static String camelCase(String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
