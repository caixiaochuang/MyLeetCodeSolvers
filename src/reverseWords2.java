public class reverseWords2 {

    public String reverseWords(String s) {

        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < ss.length ;i++)
        {
            if(i!=ss.length-1) res .append(new StringBuilder(ss[i]).reverse().toString()+" ");
            else res.append(new StringBuilder(ss[i]).reverse().toString());
        }
        return res.toString();
    }
}
