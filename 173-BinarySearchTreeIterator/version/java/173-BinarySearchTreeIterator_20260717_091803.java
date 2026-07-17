// Last updated: 7/17/2026, 9:18:03 AM
1import java.util.Stack;
2
3class BSTIterator {
4
5    private Stack<TreeNode> stack = new Stack<>();
6
7    public BSTIterator(TreeNode root) {
8        pushLeft(root);
9    }
10
11    private void pushLeft(TreeNode node) {
12        while (node != null) {
13            stack.push(node);
14            node = node.left;
15        }
16    }
17
18    public int next() {
19        TreeNode node = stack.pop();
20        pushLeft(node.right);
21        return node.val;
22    }
23
24    public boolean hasNext() {
25        return !stack.isEmpty();
26    }
27}