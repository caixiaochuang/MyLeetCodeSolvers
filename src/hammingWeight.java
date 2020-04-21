public class hammingWeight {

    public int hammingWeight(int n) {

        int res = 0;
        while(n!=0){
            int temp = n&1;
            if(temp == 1) res ++;
            n = n>>>1;
        }

        return res;
    }

}
