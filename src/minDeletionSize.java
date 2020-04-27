public class minDeletionSize {

    public int minDeletionSize(String[] A) {

        char [][]res = new char[A.length][A[0].length()];
        for(int i = 0 ;i < A.length ;i++)
            res[i] = A[i].toCharArray();

        int result = 0;
        for(int i = 0 ; i < res[0].length ;i++)
        {
            for(int j = 0 ; j < res.length-1 ;j++)
            {

                if(res[j][i] > res[j][i+1])
                {
                    result++;
                    break;
                }


            }

        }
        return result;

    }

}
