/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //    while(root!=null){
        //     if(p.val>root.val && q.val>root.val){
        //         root=root.right;
        //     }else if(p.val<root.val && q.val<root.val){
        //         root=root.left;
        //     }else{
        //         return root;
        //     }
        //    }
        //    return null;

        if(root==null){
            return root;
        }
         if(p.val>root.val && q.val>root.val){
               return lowestCommonAncestor(root.right,p,q);
            }else if(p.val<root.val && q.val<root.val){
             return lowestCommonAncestor(root.left,p,q);
            }else{
                return root;
            }
        
    }
}