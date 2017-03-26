package leetcode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ray on 3/26/17.
 */
public class binary {
    public class TreeNode {
            int val;
           TreeNode left;
            TreeNode right;
           TreeNode(int x) { val = x; }
    }

    public class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List result = new ArrayList<>();

            Stack<TreeNode> st = new Stack<TreeNode>();

            TreeNode rot = root;

            while (rot != null || !st.isEmpty()) {
                while(rot!=null) {
                    st.add(rot);
                    rot = rot.left;
                }
                rot = st.pop();
                result.add(rot.val);
                rot = rot.right;
            }


            return result;
        }
    }
}
