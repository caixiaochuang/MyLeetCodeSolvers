public class MaxSubarry2 {
    //

    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int dp[] = new int[nums.length];
        int res = Integer.MIN_VALUE;
        dp[0] = nums[0];
        res = Integer.max(dp[0],res);
        for(int i = 1 ;i < nums.length ;i++)
        {
            dp[i] = dp[i-1]>0?dp[i-1]+nums[i]:nums[i];
            res = Integer.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubarry2().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
