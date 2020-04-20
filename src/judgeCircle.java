public class judgeCircle {

    //有 R（右），L（左），U（上）和 D（下）
    public boolean judgeCircle(String moves) {

        int r = 0;
        int l = r;
        int u = r;
        int d = r;

        char[] directions = moves.toCharArray();
        for (char c : directions) {
            if(c == 'L') l++;
            if(c == 'R') r++;
            if(c == 'U') u++;
            if(c == 'D') d++;
        }
        return r == l && u == d;
    }
}
