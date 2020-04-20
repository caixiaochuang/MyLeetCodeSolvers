public class minCount {

    public int minCount(int[] coins) {
        int count = 0;
        for(int i = 0 ; i < coins.length ;i++)
        {
            if(coins[i] <=2) count++;
            else{

                while (coins[i] >=0)
                {
                    count++;
                    coins[i]-=2;

                }
            }
        }
            return count;
    }
}
