public class createTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums.length == 0) return new int[]{};

        int res[] = new int[nums.length];
        for(int i = 0 ;i <res .length ;i++)
                res[i] = Integer.MIN_VALUE;
        for(int i = 0 ;i < nums.length ;i++)
        {

            if(res[index[i]] == Integer.MIN_VALUE)
             res[index[i]] = nums[i];

            else{

                for(int j = res.length-1 ; j > index[i] ;j-- )
                        res[j] = res[j-1];

                res[index[i]] = nums[i];
            }

        }



        return res;
    }
}
