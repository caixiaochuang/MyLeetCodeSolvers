import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbsDifference {

    /*public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res  = new ArrayList<>();
        // 1 2 3 4
        //1 4 5 7 8 9
        Arrays.sort(arr);

        int i = 0 ;
        int j = i+1;

        int min = Math.abs( arr[0]) -Math.abs(arr[1]));

        while(j < arr.length){

            int abs =  Math.abs(Math.abs(arr[i]) -Math.abs(arr[j]));
            if(abs < min )
            {
                res.clear();
                min = abs;
            } else if(abs == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                res.add(list);
            }
            i = j ;
            j++;
        }
        return res;
    }*/
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List list=new ArrayList();
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int result=arr[i+1]-arr[i];
            if(result<min){
                min=result;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}
