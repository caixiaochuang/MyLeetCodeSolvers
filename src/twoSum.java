import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        // nums = [2,7,11,15], target = 9
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums .length ;i++)
        {
            if(map.containsKey(nums[i]))
                return new int[]{nums[i],map.get(nums[i])};
            else
                map.put(target -nums[i],nums[i]);
        }
        return null;
    }

}
