public class balancedStringSplit {

    /**
     * 输入：s = "RLRRLLRLRL"
     * 输出：4
     * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
     * */
    public static int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == 'L') left++;
            else right++;
            if(left == right)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = balancedStringSplit("LLLLRRRR");
        System.out.println(i);

    }
}
