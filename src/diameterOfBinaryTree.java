public class diameterOfBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null)
        {
            max = Integer.max(getlength(root),max);
            diameterOfBinaryTree(root.left);
            diameterOfBinaryTree(root.right);
        }
        return max ;
    }

    //计算二叉树的高度
    public int getlength (TreeNode node)
    {
        if(node ==null) return 0;
        int lenleft = getHeight(node.left);
        int lenright = getHeight(node.right);
        return  lenleft+lenright;
    }

    public int getHeight (TreeNode root) {
        if (root == null) return 0;
        return Integer.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
    }

}
