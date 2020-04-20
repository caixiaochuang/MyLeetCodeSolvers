public class mirrorTree {

    public TreeNode mirrorTree(TreeNode root) {

        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }
}
