import java.util.HashSet;
import java.util.Set;

public class numJewelsInStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char s : J.toCharArray())
            set.add(s);

        for(char s : S.toCharArray())
            if(set.contains(s))
                count++;
        return count;
    }


}
