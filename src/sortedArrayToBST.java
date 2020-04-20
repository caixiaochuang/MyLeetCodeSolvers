import java.util.Arrays;

public class sortedArrayToBST {

    /**
     * Definition for a binary tree node.
     * struct TreeNode {
     * int val;
     * TreeNode *left;
     * TreeNode *right;
     * TreeNode(int x) : val(x), left(NULL), right(NULL) {}
     * };
     */
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0)
            return null;

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));

        return root;
    }
}
