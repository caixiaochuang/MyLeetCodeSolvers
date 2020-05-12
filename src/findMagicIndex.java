public class findMagicIndex {

    public static int findMagicIndex(int[] nums) {

        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] != mid) {
                if (nums[mid] >= 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }


    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{0,1,2,2,3,4,5,6}));
    }
}
