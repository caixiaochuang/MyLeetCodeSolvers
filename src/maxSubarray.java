public class maxSubarray {

    public int maxSubArray(int[] nums) {
        return maxSubArray(nums,0,nums.length-1);
    }

    public int maxSubArray(int[] nums,int low , int high) {

        if(low == high) return nums[low];
        else
        {
            int middle = low + (high - low)/2;
            int leftsum = maxSubArray(nums,low,middle);
            int rightsum = maxSubArray(nums,middle+1,high);
            int corssing = maxSum(nums,low,middle,high);
            return Integer.max(corssing,Integer.max(leftsum,rightsum));
        }
    }

    public int maxSum (int [] nums ,int left ,int middle ,int right )
    {
        int sum = 0 ;
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        for(int i = middle ; i>=left ;i--)
        {
            sum += nums[i];
            if(sum>leftSum) leftSum=sum;
        }
        sum = 0;
        for(int i = middle+1 ; i<=right ;i++)
        {
            sum += nums[i];
            if(sum>rightSum) rightSum=sum;
        }
        return  leftSum+rightSum;
    }

    public static void main(String[] args) {
        System.out.println(new maxSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
