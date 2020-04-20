import java.util.Arrays;

public class exchange {
    //首尾双指针
    public int[] exchange1(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

            if (nums[i] % 2 == 1) i++;
            if (nums[j] % 2 == 0) j--;
        }

        return nums;
    }
    //快慢双指针
    public int[] exchange(int[] nums) {
        int low = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast]%2==1) {

                int temp = nums[low];
                nums[low] = nums[fast];
                nums[fast] = temp;
                low ++;
            }
            fast ++;
        }
        return nums;
    }


    public static void main(String[] args) {
        String arrs = Arrays.toString(new exchange().exchange(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(arrs);


    }
}
