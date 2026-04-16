package Strings;

// Implement Atoi
// Given a string s, convert it into a 32-bit signed integer (similar to the atoi() function) without using any built-in conversion functions.
// The conversion follows these rules:
//  -Skip all leading whitespace characters.
//  -'+' or '-', take it as the sign of the number. If no sign is present, assume the number is positive.
//  -ignore any leading zeros.
//  -Stop reading when a non-digit character is encountered or the end of the string is reached.
//  -If no digits are found, return 0.
//  -Handle Overflow: If the number exceeds the range of a 32-bit signed integer:
//  -Return 2³¹ − 1 (i.e., 2147483647) if it is greater than the maximum value.
//  -Return −2³¹ (i.e., -2147483648) if it is smaller than the minimum value.


// input : -123
// output: -123

// input : -0012243d
// output: -12243

// input : 3214235234234242352
// output: 2147483647

import java.util.Scanner;

public class ImplementAtoi {

    static int atoi(String s) {
        s = s.trim();
        int n = s.length();
        int i = 0; boolean neg = false;

        if (s.charAt(i) == '-') {
            neg = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < n && s.charAt(i) == '0') i++;

        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (num > (Integer.MAX_VALUE - digit) /  10) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return neg ? -num : num;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();

        int result = atoi(s);
        System.out.println(result);
    }
}
