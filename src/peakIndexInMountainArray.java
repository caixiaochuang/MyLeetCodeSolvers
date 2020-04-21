public class peakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] A) {

        int low = 0;
        int high = A.length - 1;
        while(low <= high)
        {

            int middle = low + (high - low) / 2;
            System.out.println(middle);
            if(A[middle] > A[middle-1]&&A[middle] > A[middle+1]) return middle;
            if(A[middle] < A[middle+1]) low = middle + 1 ;
            else high = middle -1;

        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(peakIndexInMountainArray(new int[]{18,29,38,59,98,100,99,98,90}));
    }
}
