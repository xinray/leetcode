package leetcode.twohundred200;

/**
 * Created by ray on 7/14/17.
 */
public class Q105ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length,preorder,inorder);
    }

    public TreeNode helper(int prestart,int instart,int end,int[] preorder,int[] inorder){
        if(prestart> preorder.length-1 || instart>end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int index =0;
        for(int i= instart;i<=end;i++) {
            if(inorder[i] == root.val) {
                index =i;
            }
        }
        root.left = helper(prestart+1,instart,index-1,preorder,inorder);
        root.right = helper(prestart+index-instart+1,index +1,end,preorder,inorder);

        return root;
    }
}
