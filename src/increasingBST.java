public class increasingBST {

    TreeNode demyNode = new TreeNode(0);
    TreeNode temp = demyNode;


    public TreeNode increasingBST(TreeNode root) {

        if (root != null)
        {
            increasingBST(root.left);
            temp.right = new TreeNode(root.val);
            temp = temp.right;
            increasingBST(root.right);
        }
        return demyNode.right;

    }
}
