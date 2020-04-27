public class findComplement {

        public int findComplement(int num) {
            double max = 0;
            for(int index = 0; num >= max; index++) {
                max = Math.pow(2, index);
            }
            int res = (int)(max - 1);
            return num ^ res;
        }
}
