import java.util.HashMap;
import java.util.Map;

public class repeatedNTimes {

    public int repeatedNTimes(int[] A) {
        int len = A.length;
        Map<Integer ,Integer> res = new HashMap<>();
        for(int i = 0 ; i < len ;i++)
        {
            if(res.containsKey(A[i]))
            {
                //1 2 2
                int val = res.get(A[i]);
                if(A[i] == len/2)
                    return  A[i];
                else
                    res.put(A[i],len+1);
            }else
                res.put(A[i],1);
        }

        return 0;
    }

}
