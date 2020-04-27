public class diStringMatch {

    public int[] diStringMatch(String S) {

        char[] ss = S.toCharArray();

        int res[] = new int[ss.length+1];

        int i = 0 ,j = ss.length;

        for(int k = 0 ; k < ss.length ;k++)
        {
            if(ss[i] == 'I'){
                res[i] = i;
                i++;
            }else{
                res[i] = j;
                j--;
            }
        }

        res[ss.length] = i;
        return res;
    }

}
