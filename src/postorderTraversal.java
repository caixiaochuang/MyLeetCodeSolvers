import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {

    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root!=null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
        }
        return res;
    }

}
