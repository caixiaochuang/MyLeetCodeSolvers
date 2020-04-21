import java.util.List;

public class hanota {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {

        for (int i = 0; i < A.size() - 1; i++)
            B.add(A.get(i));
        C.add(A.get(A.size() - 1));

        for (int i = 0; i < B.size(); i++)
            C.add(B.get(i));

    }

}
