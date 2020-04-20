public class generateTheString {

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0)
        {
            sb.append('x');
            for(int i = 0 ;i < n-1;i++)
                sb.append('y');
           return sb.toString();
        }else{
            sb.append("xy");
            for(int i = 0 ;i < n-2;i++)
                sb.append('z');
            return sb.toString();
        }
    }

}
