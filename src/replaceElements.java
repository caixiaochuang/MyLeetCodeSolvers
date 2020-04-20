import java.util.Arrays;

public class replaceElements {

   /* public static int[] replaceElements(int[] arr) {
        for(int i = 0 ;i<arr.length ;i++){
            int j = i+1;
            if(i == arr.length-1){
                arr[i] = -1;
                break;
            }
            else{
                int max = j;
                while(j < arr.length-1){
                    if(arr[max] <arr [j+1])
                        max = j+1;
                    j++;
                }
                arr[i] = arr[max] ;
                if(i+1 == max&&max!=arr.length){
                    arr[max] = Integer.MIN_VALUE;
                }
            }
        }
        return arr;
    }*/

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; --i) {
            ans[i] = Integer.max(ans[i + 1], arr[i + 1]);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        //[18,6,6,6,1,-1]
    }
}
