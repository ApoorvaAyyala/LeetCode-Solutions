/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return ans;
    }

    private void helper(TreeNode root) {
        if (root.left != null) {
            // Check if left child is a leaf
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                helper(root.left);
            }
        }

        if (root.right != null) {
            // Only recurse if it's not a leaf
            if (root.right.left != null || root.right.right != null) {
                helper(root.right);
            }
        }
    }
}