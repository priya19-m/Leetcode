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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        dfs(root, targetSum, 0, new ArrayList<>());
        return ans;
    }
    private void dfs(TreeNode node, int targetSum, int sum, List<Integer> path){
        if(node==null){
            return;
        }
        sum += node.val;
        path.add(node.val);

        if(node.left == null && node.right == null){
            if(sum == targetSum){
                ans.add(new ArrayList<>(path));
            }
        }

        dfs(node.left, targetSum, sum, path);
        dfs(node.right, targetSum, sum, path);

        path.remove(path.size()-1);
    }
}