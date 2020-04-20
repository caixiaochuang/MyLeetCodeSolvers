public class findNumbers {
    public int findNumbers(int[] nums) {
        int odd = 0 ;
        for(int i : nums)
        {
            if(isOdd(i))
                odd++;
        }
        return odd;
    }

    public boolean isOdd(int n){

        int weishu = 0;

        while(n!=0)
        {
            n/=10;
            weishu++;
        }

        return weishu%2==0;
    }

}
