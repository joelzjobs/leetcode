package leetcode_java.problem100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of the nodes is null, the trees are not the same
        if (p == null || q == null) {
            return false;
        }

        // Create a queue for level-order traversal
        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();

        // Add the root nodes to the queues
        queueP.add(p);
        queueQ.add(q);

        while (!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode nodeP = queueP.poll();
            TreeNode nodeQ = queueQ.poll();

            // If the values of the current nodes are not the same, the trees are not the same
            if (nodeP.val != nodeQ.val) {
                return false;
            }

            // Add the left children to the queues
            if (nodeP.left != null && nodeQ.left != null) {
                queueP.add(nodeP.left);
                queueQ.add(nodeQ.left);
            } else if (nodeP.left != nodeQ.left) {
                // If one tree has a left child and the other does not, the trees are not the same
                return false;
            }

            // Add the right children to the queues
            if (nodeP.right != null && nodeQ.right != null) {
                queueP.add(nodeP.right);
                queueQ.add(nodeQ.right);
            } else if (nodeP.right != nodeQ.right) {
                // If one tree has a right child and the other does not, the trees are not the same
                return false;
            }
        }

        // If both queues are empty, the trees are the same
        return queueP.isEmpty() && queueQ.isEmpty();
    }
}
