public class isSubsequence {

    //双指针法
    public static boolean isSubsequence1(String s, String t) {
        int i = 0 ,j=0;
        int lens = s.length();
        int lent = t.length();
        if(lens == 0) return true;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        while(i<lens&&j<lent)
        {
            if(ss[i] == tt[j])
            {
                i++;
                j++;
            }
            else
                j++;
        }
        return i==lens;
    }

    public static boolean isSubsequence(String s, String t) {
        char[] arr = s.toCharArray();
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            j = t.indexOf(arr[i], j + 1);
            if (j == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSubsequence("","adbfcd"));
    }
}
