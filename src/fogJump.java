public class fogJump {

    /*public static int numWays(int n) {
        if(n<=2) return n;
        else return (numWays(n-1)+numWays(n-2))%1000000008;
    }*/




    public static int numWays(int n) {
        if(n==0) return 1;
        if(n==1||n==2) return n;
        int [] dp = new int[n];
        dp[0] = 1 ;
        dp[1] = 2 ;
        for(int i = 2 ; i <n;i++)
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        return dp[n-1];
    }

    public static void main(String[] args) {
        //1346269 1346269
        System.out.println(numWays(100));
    }
}
