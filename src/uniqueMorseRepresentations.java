import java.util.HashSet;
import java.util.Set;

public class uniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        String[] password = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();
        for (String word : words) {
            String res = "";
            for (char s : word.toCharArray()) {
                res +=password[s - 'a'];
            }
            set.add(res);

        }
        return set.size();
    }
}
