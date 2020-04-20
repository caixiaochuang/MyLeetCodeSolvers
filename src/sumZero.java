import java.util.Arrays;

public class sumZero {

    public static int[] sumZero(int n){

        if(n == 1) return new int[]{0};
        int res [] = new int[n];
        if(n%2==0){
            //表示是偶数
            for (int i = 0 ;i < n/2 ; i++)
            {
                res[i] = (n-i) ;
                res[n-1-i] =i-n;
            }
        }else
        {
            res[0] = 0;
            for (int i = 1 ;i < n/2+1 ; i++)
            {
                res[i] = (n-i) ;
                res[n-i] =i-n;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(11)));
    }
}
