import java.util.Map;

public class freqAlphabets {

    /**
     * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
     * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
     * 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
     * 输出："abcdefghijklmnopqrstuvwxyz"
     */
/*    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (i + 2 < chs.length) {
                if (chs[i + 2] == '#') {
                    String temp = "" + chs[i] + chs[i + 1];
                    sb.append((char)(Integer.parseInt(temp) + 96));
                    i=i+2;
                    continue;
                }
            }
            sb.append((char)(Integer.parseInt(chs[i]+"")+ 96));
        }
        return sb.toString();
    }*/
    public static String freqAlphabets(String s) {
        String ans = "";
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; ++i) {
            if (i + 2 < s.length() && ss[i + 2] == '#') {
                ans += (char)((ss[i] - '0') * 10 + (ss[i + 1] - '1') + 'a');
                i += 2;
            }
            else {
                ans += (char)(ss[i] - '1' + 'a');
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

}
