package recursion;

public class StringToIntegerAtoi {
    static void main(String[] args) {
        String s = "002142354233243443423321abc";
        s = s.trim();
        int index = 0, sign = 1;
        if (s.charAt(index) == '-') {
            index++; sign = -1;
        } else if (s.charAt(index) == '+') {
            index++;
        }


        System.out.println(atoi(s, index, sign, 0));
    }

    static int atoi(String s, int index, int sign, long res) {
        if (index == s.length() || !Character.isDigit(s.charAt(index))) return (int) res * sign;
        int digit = s.charAt(index) - '0';
        res = res * 10 + digit;
        if (sign == -1 && res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        index++;
        return atoi(s, index, sign, res);
    }
}
