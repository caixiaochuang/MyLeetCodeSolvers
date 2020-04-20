import java.util.Stack;

public class maximum69Number {

    public static int maximum69Number (int num) {

        Stack<Integer> stack = new Stack<>();
        while (num !=0)
        {
            stack.push(num%10);
            num = num/10;
        }
        boolean flag = true;
        num = 0;
        while (true)
        {
            if(stack.empty()) break;
            int res = stack.pop();
            if(res == 6&&flag){
                flag =false;
                num=num*10+9;
            }
            else{
                num=num*10+res;
            }
        }
        return num;
    }

    public static int maximum69Numbera (int num){
        String res = Integer.toString(num);
        return Integer.parseInt(res.replaceFirst("6","9"));

    }

    public static void main(String[] args) {
        System.out.println(maximum69Numbera(99666));
    }
}
