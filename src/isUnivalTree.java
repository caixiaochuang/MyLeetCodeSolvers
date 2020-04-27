public class isUnivalTree {

    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root,root.val);
    }

    public boolean isUnivalTree(TreeNode root , int val)
    {
            if(root!=null) return  root.val == val&&isUnivalTree(root.left,val)&&isUnivalTree(root.right,val);
            return true;
    }

}
