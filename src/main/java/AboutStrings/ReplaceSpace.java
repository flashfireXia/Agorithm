package AboutStrings;

/*剑指offer第5题，替换空格*/
public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "We are happy.";
        Solution1 sl = new Solution1();
        System.out.println(sl.replacespace(s));
    }
}

class Solution1 {
    public String replacespace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
