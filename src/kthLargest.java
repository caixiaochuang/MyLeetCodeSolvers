import java.util.ArrayList;
import java.util.List;

public class kthLargest {


    public int kthLargest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        kthLargest(root,res);
        Object[] objects = res.toArray();
        return (int)objects[objects.length-k];


    }

    public void kthLargest(TreeNode root, List<Integer> res) {
        if(root!=null){
            kthLargest(root.left,res);
            res.add(root.val);
            kthLargest(root.right,res);
        }
    }
}
