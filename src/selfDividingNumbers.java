import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if(isDivideBySelf(i)) list.add(i);

        }
        return list;
    }

    public static boolean isDivideBySelf(int n) {
        if (n == 0) return false;

        int temp = n;
        while (n != 0) {
            int yushu = n % 10;
            if (yushu != 0 && temp % yushu == 0) {
                n /= 10;
            } else {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //out  [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
        //espect [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
        System.out.println(selfDividingNumbers(1,22));
    }

}
