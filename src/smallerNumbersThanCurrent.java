public class smallerNumbersThanCurrent {

  /*  public int[] smallerNumbersThanCurrent(int[] nums) {

        int [] res = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j< nums .length ;j++)
                if(nums[i]>nums[j])
                    res[i]++;
        }
        return res;
    }
*/

    public int[] smallerNumbersThanCurrent(int []nums) {
        int [] cnt = new int[101];
        int [] vec = new int[nums.length];

        for (int i = 0;i < nums.length; ++i){
            cnt[nums[i]]++;
        }
        for (int i = 1;i <= 100; ++i)
            cnt[i] += cnt[i-1]; // 求前缀和

        for (int i = 0;i < nums.length; ++i){
            if (nums[i]!=0)
                vec[i] = cnt[nums[i] - 1];
        }

        return vec;
    }
}
