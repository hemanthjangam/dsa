package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsequence {
    static void main(String[] args) {
        List<String> seq = new ArrayList<>();
        String s = "abc";
        generate(s, "", seq);
        Collections.sort(seq);
        System.out.println(seq);
    }

    static void generate(String up, String p, List<String> seq) {
        if (up.isEmpty()) {
            seq.add(p);
            return;
        }
        generate(up.substring(1), p + up.charAt(0), seq);
        generate(up.substring(1), p, seq);
    }
}
