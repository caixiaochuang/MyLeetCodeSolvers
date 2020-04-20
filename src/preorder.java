import java.util.ArrayList;
import java.util.List;

public class preorder {

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if(root!=null){
            res.add(root.val);
            List<Node> nodes = root.children;
                for (Node node :nodes)
                    preorder(node);
        }
        return res;
    }
}
