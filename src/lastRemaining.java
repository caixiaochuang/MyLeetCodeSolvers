public class lastRemaining {

    //约瑟夫环问题
    //0 1 2 3 4
    public static int lastRemaining(int n, int m) {
            int f = 0;
            for (int i = 2; i != n + 1; ++i)
                f = (m + f) % i;
            return f;
        }

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }

}
