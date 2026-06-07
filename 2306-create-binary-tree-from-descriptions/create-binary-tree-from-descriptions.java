import java.util.*;

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nd = new HashMap<>();
        Set<Integer> child = new HashSet<>();
        
        for (int[] a : descriptions) {
            int pVal = a[0];
            int childVal = a[1];
            int isLeft = a[2];
            
            child.add(childVal);
            
            nd.putIfAbsent(pVal, new TreeNode(pVal));
            nd.putIfAbsent(childVal, new TreeNode(childVal));
            
            TreeNode pNode = nd.get(pVal);
            TreeNode cNode = nd.get(childVal);
            
            if (isLeft == 1) {
                pNode.left = cNode;
            } else {
                pNode.right = cNode;
            }
        }
        
        for (int pVal : nd.keySet()) {
            if (!child.contains(pVal)) {
                return nd.get(pVal);
            }
        }
        
        return null;     
    }
}