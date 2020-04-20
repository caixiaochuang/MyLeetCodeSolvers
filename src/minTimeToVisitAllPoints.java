public class minTimeToVisitAllPoints {

    /**
     * 输入：points = [
     * [1,1],
     * [3,4],
     * [-1,0]
     * ]
     * 输出：7
     * 解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
     * 从 [1,1] 到 [3,4] 需要 3 秒
     * 从 [3,4] 到 [-1,0] 需要 4 秒
     * 一共需要 7 秒
     * @param points
     * @return
     */

    public int minTimeToVisitAllPoints(int[][] points) {
        int length = 0;
        int len = points.length;
        if(len<2) return 0;
        for(int i = 1 ; i < points.length ; i++)
        {
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            if(x1!=x2&&y1!=y2)
            {
                length += Integer.max(Math.abs(x1 - x2),Math.abs(y1 - y2));
            }else if(x1==x2&&y1!=y2)
                length +=Math.abs(y1-y2);
            else  if(x1!=x2&&y1==y2)
                length +=Math.abs(x1-x2);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil(3.2));
    }


}
