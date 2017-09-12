package leetcode.threehunderd300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 9/12/17.
 */
public class Q257BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root != null) searchAllPath(result, "" , root);

        return result;
    }

    public void searchAllPath(List<String> result, String path, TreeNode root) {
        if (root.left == null && root.right == null) result.add(path + root.val);
        if (root.left != null) searchAllPath(result, path + root.val + "->", root.left);
        if (root.right != null) searchAllPath(result, path + root.val + "->", root.right);
    }
}
