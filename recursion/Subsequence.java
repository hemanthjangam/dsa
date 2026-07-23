package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsequence {
    static void main(String[] args) {
        List<String> seq = new ArrayList<>();
        String s = "abc";
        generate(s, "", seq);
        Collections.sort(seq);
        System.out.println(seq);

        ArrayList<String> listver = generate(s, "");
        Collections.sort(listver);
        System.out.println(listver);
    }

    static void generate(String up, String p, List<String> seq) {
        if (up.isEmpty()) {
            seq.add(p);
            return;
        }
        generate(up.substring(1), p + up.charAt(0), seq);
        generate(up.substring(1), p, seq);
    }

    static ArrayList<String> generate(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p); return list;
        }

        ArrayList<String> include = generate(up.substring(1), p + up.charAt(0));
        ArrayList<String> exclude = generate(up.substring(1), p);

        include.addAll(exclude);

        return include;
    }
}
