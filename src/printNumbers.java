import java.util.Arrays;

public class printNumbers {

    public static int[] printNumbers(int n) {
        if(n<1) return new int[]{};
        int maxval = 0;
        while(n!=0){
            maxval = maxval*10 + 9;
            n--;
        }

        int res [] = new int[maxval];
        for(int i = 1 ; i <= res.length ; i++)
            res[i-1] = i;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }
}
