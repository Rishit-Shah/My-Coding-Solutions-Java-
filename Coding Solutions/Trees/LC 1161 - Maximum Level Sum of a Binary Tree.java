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
    public int maxLevelSum(TreeNode root) {
        int level=0, sum=Integer.MIN_VALUE, ans=0;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            level++;
            int sumoflevel=0;
          
        for(int i=queue.size()-1;i>=0;i--){
             TreeNode node = queue.poll();
            sumoflevel+=node.val;
          

            if(node.left!=null){
               queue.add(node.left);

            }
            if(node.right!=null){
                queue.add(node.right);

            }

        }

        if(sum<sumoflevel){
            sum=sumoflevel;
            ans=level;
        }

        }
        
        return ans;
    }
}
