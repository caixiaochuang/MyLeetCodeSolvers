public class replaceSpace {
    public String replaceSpace(String s) {

        String res = "";
        char []arr = s.toCharArray();
        for (char c : arr)
        {
            if(c == ' ')
                res+="%20";
            else
                res +=c;
        }
        return res;
    }
}
