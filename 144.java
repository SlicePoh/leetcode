class Solution {    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.peek();
            stack.pop();
            if (t != null) {
                list.add(t.val);
                stack.add(t.right);
                stack.add(t.left);
            }
        }       
        return list;
    }
}
