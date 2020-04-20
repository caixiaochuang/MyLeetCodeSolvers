import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    /**
     * 写一个程序，输出从 1 到 n 数字的字符串表示。
     * 1. 如果 n 是3的倍数，输出“Fizz”；
     * 2. 如果 n 是5的倍数，输出“Buzz”；
     * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fizz-buzz
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param n
     * @return
     */
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if(n==0) return null;
        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5!=0) {
                res.add("Fizz");
                continue;
            }
            if(i%3!=0&&i%5==0) {
                res.add("Buzz");
                continue;
            }
            if(i%3==0&&i%5==0) {
                res.add("FizzBuzz");
                continue;
            }
            else
                res.add(i+"");
        }
        return res;
    }
    static List<String> fizzBuzz1(int n) {
        // ans list
        List<String> ans = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            String numAnsStr = "";

            if (divisibleBy3) {
                // Divides by 3, add Fizz
                numAnsStr += "Fizz";
            }

            if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsStr += "Buzz";
            }

            if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr += Integer.toString(num);
            }

            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz1(15));
    }
}
