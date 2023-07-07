import java.util.*;
public class BinaryTreeLevelOrderTraversal {
    
public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                temp.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            ans.add(temp);
        }

         return ans;
    }

   
}
