package Strings;

// Return longest palindromic string from a given string

public class LongestPalindromic {
    static String palindromic(String str) {
        for (int length = str.length(); length >= 0; length--) {
            for (int start = 0; start <= str.length() - length; start++) {
                if (check(start, start + length, str)) {
                    return str.substring(start, start + length);
                }
            }
        }
        return "";
    }

    static boolean check(int i, int j, String str) {
        int left = i, right = j - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; right--;
        }
        return  true;
    }

    static void main(String[] args) {
        String str = "abcdbabaabab";
        String res = palindromic(str);
        System.out.println(res);
    }
}
