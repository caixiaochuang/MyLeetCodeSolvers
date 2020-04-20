public class checkPossibility {
    public boolean checkPossibility(int[] nums) {
        if(nums.length < 3) return true;
        int bp_count = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] < nums[i]) {
                bp_count++;
                if(bp_count>1) return false;
                if(i>0 && nums[i-1] > nums[i+1])
                    nums[i+1] = nums[i];
            }
        }
        return true;
    }
}
