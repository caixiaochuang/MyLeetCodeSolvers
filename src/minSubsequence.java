import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minSubsequence {

    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ;i++)
            sum+=nums[i];
        int res = 0 ;
        List<Integer> list = new ArrayList<>();


        for(int i = nums.length-1 ; i >=0 ;i--)
        {
            res +=nums[i];
            sum-= nums[i];
            if(res > sum )
                break;
            else
                list.add(nums[i]);

        }
        return list;

    }
}
