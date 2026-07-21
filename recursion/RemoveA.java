package recursion;

public class RemoveA {
    static void main(String[] args) {
        String str = "baacbadbc";
//        String s = remove(str, 0, new StringBuilder()).toString();
        String s = remove(str, 0).toString();
        System.out.println(s);
    }

//    static StringBuilder remove(String str, int idx, StringBuilder ans) {
//        if (idx >= str.length()) return ans;
//        if (str.charAt(idx) != 'a') ans.append(str.charAt(idx)); idx++;
//        remove(str, idx, ans);
//        return ans;
//    }

    static StringBuilder remove(String str, int idx) {
        if (idx >= str.length()) return new StringBuilder();
        StringBuilder ans = remove(str, idx + 1);
        if (str.charAt(idx) != 'a') ans.append(str.charAt(idx));
        return ans;
    }
}
