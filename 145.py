# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.ans = []
        self._postorderTraversal(root)
        return self.ans

    def _postorderTraversal(self, root):
        if root is None:
            return
        self._postorderTraversal(root.left)
        self._postorderTraversal(root.right)
        self.ans.append(root.val)