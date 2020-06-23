import java.util.Arrays;

public class Permutation {


    public static int count = 0;
    public static void swap(int arr[] ,int p ,int q)
    {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
    //全排列算法
    public static void  perm(int []arr ,int left ,int right){

        //表示只有一个元素
        if(left == right) {
            System.out.println(Arrays.toString(arr));
            count++;
            return ;
        }

        for (int i = left ; i < right ; i++) {
            swap(arr , left, i);

            perm(arr , left+1 , right);

            swap(arr , left , i );

        }
    }


    public static void main(String[] args) {

        int arr[] =  {1,2,3,4} ;
        perm(arr,0,arr.length);
        System.out.println("count = " + count);
    }
}
