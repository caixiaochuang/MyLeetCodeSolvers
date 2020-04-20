import java.util.ArrayList;
import java.util.List;

public class readBinaryWatch {

    //表示的是在 n个里面选出 m个
    public static int fib(int m, int n) {
        if (m == 0) return 0;
        int fibn = 1, fibm = 1, fibmn = 1;
        for (int i = 1; i <= m; i++)
            fibm *= i;
        for (int i = 1; i <= n; i++)
            fibn *= i;
        for (int i = 1; i <= n - m; i++)
            fibmn *= i;
        return fibn / (fibm * fibmn);
    }
       public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for(int i = 0 ;i < 12 ; i++)
        {
            for(int j = 0 ;j<60 ; j++)
            {
                if(Integer.bitCount(i)+Integer.bitCount(j) == num)
                    list.add(String.format("%d:%02d",i,j));

            }

        }
        return list;
    }

    public static List<String> readBinaryWatch2(int num) {
        List<String> ans = new ArrayList<String>();
        String[][] hstrs = {{"0"}, {"1", "2", "4", "8"}, {"3", "5", "6", "9", "10"}, {"7", "11"}};
        String[][] mstrs = {{"00"}, {"01", "02", "04", "08", "16", "32"}, {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"}, {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"}, {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"}, {"31", "47", "55", "59"}};

        for (int i = 0; i <= Math.min(3, num); i++) {
            if (num - i > 5) continue;
            String[] hstr = hstrs[i];
            String[] mstr = mstrs[num - i];
            for (int j = 0; j < hstr.length; j++) {
                for (int k = 0; k < mstr.length; k++) {
                    ans.add(hstr[j] + ":" + mstr[k]);
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(0));

    }
}
