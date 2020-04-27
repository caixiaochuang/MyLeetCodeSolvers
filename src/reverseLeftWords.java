import java.util.Arrays;

public class reverseLeftWords {

    public static String reverseLeftWords(String s, int n) {

        //abcdefg
        char[] ss = s.toCharArray();
        //System.out.println(Arrays.toString(ss));
        char temp ;
        for(int i = 0 ;i < n/2 ;i++)
        {
            temp = ss[i] ;
            ss[i] = ss[n-1-i];
            ss[n-1-i] = temp;
        }



        for(int i = 0 ;i < (ss.length-n)/2 ;i++)
        {
            temp = ss[i+n] ;
            ss[i+n] = ss[ss.length-i-1];
            ss[ss.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(ss));

        for(int i = 0 ;i < ss.length/2 ;i++)
        {
            temp = ss[i] ;
            ss[i] = ss[ss.length-i-1];
            ss[ss.length-1-i] = temp;
        }
        return new String(ss);
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
        //gfcdeab
        //bagfedc
        //cdefgab
        //cdefgab
        //cdefgab
    }


}
