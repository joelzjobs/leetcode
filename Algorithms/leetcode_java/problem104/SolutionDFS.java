import java.util.Stack;

class SolutionDFS {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depths = new Stack<>();
        stack.push(root);
        depths.push(1);
        int maxDepth = 0;

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            int currentDepth = depths.pop();
            maxDepth = Math.max(maxDepth, currentDepth);

            if (currentNode.left != null) {
                stack.push(currentNode.left);
                depths.push(currentDepth + 1);
            }

            if (currentNode.right != null) {
                stack.push(currentNode.right);
                depths.push(currentDepth + 1);
            }
        }

        return maxDepth;
    }
}
