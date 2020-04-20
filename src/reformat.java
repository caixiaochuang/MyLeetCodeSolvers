import java.util.ArrayList;
import java.util.List;

public class reformat {

    //s = "a0b1c2"
    public String reformat(String s) {

        List<Character> sint = new ArrayList<>();
        List<Character> schar = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9')
                schar.add(c);
            else sint.add(c);
        }
        StringBuilder sb = new StringBuilder();
        if (schar.size() == sint.size()) {
            for (int i = 0; i < sint.size(); i++)
                sb.append(schar.get(i)).append(sint.get(i));
        }
        else if(!(schar.size() == sint.size() + 1 || schar.size() + 1 == sint.size())) return "";
        else if(schar.size() > sint.size()){
            for (int i = 0; i < sint.size(); i++)
                sb.append(schar.get(i)).append(sint.get(i));
            sb.append(schar.get(schar.size()-1));
        }else{
            for (int i = 0; i < schar.size(); i++)
                sb.append(sint.get(i)).append(schar.get(i));
            sb.append(sint.get(sint.size()-1));
        }
        return sb.toString();

    }
}
