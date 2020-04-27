public class sortArrayByParity {

    public int[] sortArrayByParity(int[] A) {

        int low = 0;
        int high = A.length;

        while (low <=high)
        {

            if(A[low]%2==0){
                low++;
                continue;
            }
            if(A[high]%2==1)
            {
                high--;
                continue;
            }
            else{
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
            }
        }
        return A;
    }

}
