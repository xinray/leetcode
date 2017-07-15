package leetcode.twohundred200;

/**
 * Created by ray on 7/15/17.
 */
public class Q106ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper( 0, 0, inorder.length - 1, postorder.length- 1,inorder, postorder);
    }

    public TreeNode helper(int instart,int postart,int inend,int posend,int[] inorder,int[] postorder ) {

        if(postart>posend) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postart]);
        int index = 0;
        for(int i=instart;i<=inend;i++) {
            if(root.val == inorder[i]) {
                index = i;
                break;
            }
        }
        root.left = helper(instart,postart-1,index-1,postart + index - instart -1,inorder,postorder);
        root.right = helper(index+1,posend-inend+index,inend,posend-1,inorder,postorder);

        return root;
    }
}
