public class minStartValue{

        public int minStartValue(int[] nums) {

            int minvale = 0;
            //[-3,2,-3,4]
            // [1,-2,-3]
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {

                sum += nums[i];
                if (sum < 1)//-1 0
                {
                    minvale = Integer.max(Math.abs(sum) + 1,minvale);

                }
            }
            return minvale;

        }

}
