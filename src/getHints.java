public class getHints {

    /*
    Time complexity: O(n)
    Space complexity: O(n)
 */
    private  static String getHint(String secret, String guess){
        int A = 0, B = 0 ;
        int map[] = new int[10];
        char[] secrets = secret.toCharArray();
        char[] guesses = guess.toCharArray();
        for (int i=0; i<secrets.length ; i++)
            if (secrets[i] == guesses[i]) A++;
            else map[secrets[i]-'0']++;
        for (int i=0; i<guesses.length; i++)
            if (map[guesses[i]-'0']!=0 && secrets[i] != guesses[i]) {
                B++;
                map[guesses[i]-'0']--;
            }
        return A + "A" + B + "B";
    }


    public static void main(String[] args) {
        System.out.println(getHint("1123","0111"));

    }
}
