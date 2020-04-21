public class searchBST {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root != null) {
            if (root.val > val)
                return searchBST(root.left, val);
            else if (root.val < val)
                return searchBST(root.right, val);
            return root;
        }

        return null;

    }
}
