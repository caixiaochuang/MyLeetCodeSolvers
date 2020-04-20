import java.util.TreeSet;

public class thirdMax {

    public static int thirdMax1(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("error");
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer elem : nums) {
            set.add(elem);
            if (set.size() > 3) set.remove(set.first());
        }
        return set.size() < 3 ? set.last() : set.first();   // set.last() 里面最大的元素
    }
    public static int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("nums is null or length of 0");
        int n = nums.length;

        int one = nums[0];
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;

        for (int i = 1; i <  n; i++) {
            int now = nums[i];
            if (now == one || now == two || now == three) continue;    // 如果存在过就跳过不看
            if (now > one) {
                three = two;
                two = one;
                one = now;
            } else if (now > two) {
                three = two;
                two = now;
            } else if (now > three) {
                three = now;
            }
        }

        if (three == Long.MIN_VALUE) return one;  // 没有第三大的元素，就返回最大值
        return (int)three;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,2,3,2,1,2,2,2}));
    }

}
