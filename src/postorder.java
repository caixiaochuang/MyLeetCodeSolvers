import java.util.ArrayList;
import java.util.List;

public class postorder {

    List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root != null && root.children != null) {
            //后序遍历  左子树 右子树  跟节点
            List<Node> nodes = root.children;
            for (Node node : nodes) {
                postorder(node);
                res.add(root.val);
            }
        }
        return res;
    }
}
