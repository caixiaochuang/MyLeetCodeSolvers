import java.util.HashSet;
import java.util.Set;

public class singleNumbers {

 /*   public int[] singleNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if(set.contains(num)){
                set.remove(num);
            }else
                set.add(num);
        }

        int[] res = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            res[i++] = integer;
        }
        return res;
    }*/

    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        int[] res = new int[2];
        for(int num : nums){
            sum ^= num;
        }
        int lowbit = sum & (-sum);
        for(int num : nums){
            if((num & lowbit) == 0){
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }
        return res;
    }
}
