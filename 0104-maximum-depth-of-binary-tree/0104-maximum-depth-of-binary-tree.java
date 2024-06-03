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
    public int maxDepth(TreeNode root) {
        // 만약 루트 노드가 null이면 트리의 깊이는 0 ( break point)
        if (root == null) {
            return 0;
        } else {
            // 왼쪽 서브트리의 최대 깊이 계산
            int leftDepth = maxDepth(root.left);
            // 오른쪽 서브트리의 최대 깊이 계산
            int rightDepth = maxDepth(root.right);
            // 왼쪽과 오른쪽 서브트리 중에서 더 깊은 쪽의 깊이를 선택하고 1을 더하여 반환
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
