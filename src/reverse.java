public class reverse {
    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            x = -x;
            String ri = sb.append(Integer.toString(x)).reverse().toString();
            if(Long.parseLong(ri)>Integer.MAX_VALUE) return 0;
            else return -(int)Long.parseLong(ri);
        } else {
            String ri = sb.append(Integer.toString(x)).reverse().toString();
            if(Long.parseLong(ri)>Integer.MAX_VALUE) return 0;
            else return (int)Long.parseLong(ri);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(3231));
    }
}
