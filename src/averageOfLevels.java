import java.util.*;

public class averageOfLevels {

    //二叉树的层序遍历
     /*    3
         /   \
        9    20
      /  \  /  \
     12  8  15  7

     */
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double>  res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty())
        {
            double sum = 0;
            int count = 0;
            //在层序遍历的基础之上使用循环 即可完成层寻遍历
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(node!=null) {
                    count++;
                    sum+=node.val;
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(sum/count);
        }
        return res;
    }
}
