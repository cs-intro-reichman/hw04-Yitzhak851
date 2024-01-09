public class StringOps {
    // 1.charAt(int index)
    // 2.length()
    // 3.substring(int start)
    // 4.substring(int start,int ends)
    // 5.indexOf(String str)
    static String str1 = " Intro to coMPUter sCIEncE "; // => hEllO wOrld
    static String ans;

    public static void main(String[] args) {
        // System.out.println(capVowelsLowRest(str1));
        System.out.println(camelCase(str1));
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
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(index) == ' ' && index == 0) { // if first char is space
                while (str.charAt(index) == ' ') { // skip all spaces
                    index++;
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
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // isUpper ? converToLower : add
                ans += (char) (str.charAt(i) + 32);
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
