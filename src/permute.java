import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permute {

    /*输入:[1,2,3]
        输出:
        [
          [1,2,3],
          [1,3,2],
          [2,1,3],
          [2,3,1],
          [3,1,2],
          [3,2,1]
        ]
    */

    static List<List<Integer>> allSorts = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        permutation(nums, 0, nums.length - 1);
        return allSorts;
    }

    public static void permutation(int[] nums, int start, int end) {
        if (start == end) { // 当只要求对数组中一个数字进行全排列时，只要就按该数组输出即可
            List<Integer> res = new ArrayList<>();
            for (int i=0; i<=end; i++) {
                res.add(nums[i]);
            }
            allSorts.add(res); // 将新的排列组合存放起来
        } else {
            for (int i=start; i<=end; i++) {
                int temp = nums[start]; // 交换数组第一个元素与后续的元素
                nums[start] = nums[i];
                nums[i] = temp;
                permutation(nums, start + 1, end); // 后续元素递归全排列
                nums[i] = nums[start]; // 将交换后的数组还原
                nums[start] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }

}
