import java.util.Arrays;

public class oddCells {

    public int oddCells(int n, int m, int[][] indices) {

        int res[][] = new int[n][m];
        for(int i = 0 ; i < res.length ;i++)
            Arrays.fill(res[i],0);

        //[][]
        //[][]

        int odd = 0;
        for (int i = 0 ;i < indices.length;i++)
        {
            int row = indices[i][0];
            int column = indices[i][1];

            for(int j = 0 ; j < m ;j++)
                res[row][j]++;
            for(int j = 0 ; j < n ;j++)
                res[j][column]++;
        }

        for(int i = 0;i<n ;i++ )
        {
            for(int j = 0 ; j< m ;j++)
            {

                if(res[i][j]%2==1) odd++;

            }

        }

        return odd;

    }


}
