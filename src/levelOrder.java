import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    public void levelorder(TreeNode root){

        Queue<TreeNode> que = new LinkedList<>();
        if(root!=null)
            que.add(root);

        while(!que.isEmpty()){

            TreeNode cur = que.poll();
            System.out.println(cur.val);
            if(cur.left!=null)
                que.add(cur.left);
            if(cur.right!=null)
                que.add(cur.right);
        }

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(5);
        TreeNode left1 = new TreeNode(8);
        TreeNode right1 = new TreeNode(14);
        TreeNode left2 = new TreeNode(55);
        TreeNode right2 = new TreeNode(65);
        TreeNode left3 = new TreeNode(74);
        TreeNode right3 = new TreeNode(48);

        root.left = left;
        root.right = right;

        left.left = left1;
        left.right =right1;

        right.left = left2;
        right.right = right2;

        left1.left = left3;
        left1.right = right3;

        new levelOrder().levelorder(root);

    }

}
