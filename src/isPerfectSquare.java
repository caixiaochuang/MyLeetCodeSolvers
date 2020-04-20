public class isPerfectSquare {

    public static  boolean isPerfectSquare(int num) {
        int i = 0 ,j = num  ;
        while(i<j)
        {
            int middle = i + (j-i)/2;
            if(num / middle == middle)  return true;
            if(middle > num / middle) j = middle ;
            else
                i = middle+1;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
