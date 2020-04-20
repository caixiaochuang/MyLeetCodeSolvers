import java.util.Stack;

public class removeOuterParentheses {
    //(()())(())(()(()))
    public static String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int len = S.length();
        char[] arrs = S.toCharArray();
        int left = 0 ;
        for(int i = 0 ; i <len ; i++)
        {
            if(arrs[i] == '(')
            {
                left++;
                if(left > 1) s.append('(');
                continue;
            }

            if(arrs[i] == ')')
            {
                left--;
                if(left!=0) s.append(")");

            }

        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        //out ()()()()(())
        //    ()()()()(())
    }
}
