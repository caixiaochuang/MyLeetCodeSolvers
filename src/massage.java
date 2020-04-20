public class massage {
    public int massageq(int[] nums) {
        if(nums.length== 0) return 0;
        if(nums.length == 1) return nums[0];
        int []dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2 ; i <nums.length;i++)
        {
            dp[i] = Integer.max(dp[i-1],dp[i-2]+nums[i]);

        }
        return dp[nums.length-1];
    }

    public int massage(int[] nums) {

        return  massage(nums,0);
    }

    public int massage(int[] nums,int i) {

        if(i < nums .length) {
            int res1 = nums[i] + massage(nums, i + 2);
            int res2 = massage(nums, i + 1);
            return Integer.max(res1,res2);

        }else
            return 0;
    }
}
