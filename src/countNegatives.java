public class countNegatives {

    /*
     grid =
     [
             [4,3,2,1],
             [3,2,1,-1],
             [1,1,-1,-2],
             [-1,-1,-2,-3]
     ]
    *
    *
    * */
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for(int i = 0 ;i< grid.length ;i++){
            int index = binarysearchNegative(grid[i],0,grid[i].length-1);
            if(index == -1) continue;
            else count+= grid[i].length - index;
        }
        return count;
    }

    public static int binarysearchNegative(int []num ,int low,int high){

        if(num[low] < 0) return low;

        if(num[high]>=0) return -1;

        while(low < high)
        {
            int middle = low +(high - low) /2 ;
            if(num[middle] < 0 &&num[middle-1]>=0) return middle;
            if(num[middle] < 0)
                high = middle-1;
            else low = middle+1;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        }));


    }

}
