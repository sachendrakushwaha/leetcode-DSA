class Solution {
    private long maxProd = 0;
    private long totalSum = 0;

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        checkMaxProduct(root);
        return (int) (maxProd % 1000000007);
    }

    private long getTotalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
    }

    private long checkMaxProduct(TreeNode root) {
        if (root == null) return 0;

        long subtreeSum = root.val + checkMaxProduct(root.left) + checkMaxProduct(root.right);
        maxProd = Math.max(maxProd, subtreeSum * (totalSum - subtreeSum));

        return subtreeSum;
    }
}