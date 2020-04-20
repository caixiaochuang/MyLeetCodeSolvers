import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class canConstruct {

    public static boolean canConstruct1(String ransomNote, String magazine) {
        HashMap<Character,Integer> set = new HashMap<>();
        char[] charsm = magazine.toCharArray();
        char[] charsr = ransomNote.toCharArray();
        for (char s : charsm) {
                if(set.containsKey(s))
                    set.put(s,set.get(s)+1);
                else
                    set.put(s,1);

        }

        for (char c : charsr) {
            if(!set.containsKey(c)) {
                return false;
            }
            else if(set.containsKey(c)&&set.get(c)>0)
            {
                set.put(c,set.get(c)-1);
                continue;
            }
            else return false;
        }

        return true;
    }
    public static boolean canConstruct(String ransom, String magazine) {
        if (magazine.length() < ransom.length()) return false;
        int caps[] = new int[26];
        for (char c : ransom.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1)
                return false;
            caps[c - 97] = index + 1;
        }
        return true;
    }

    public static void main(String[] args) {

        //System.out.println("abcd".indexOf("a",2));

        System.out.println(canConstruct("aab","aaabb"));
    }

}
