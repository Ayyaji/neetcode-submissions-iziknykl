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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String data="";
        if(root==null) return data+"N";
        data = root.val + "," + serialize(root.left) + "," + serialize(root.right);
        return data;
    }

    // Decodes your encoded data to tree.
   public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        if(arr[0]=="N"|| arr[0]=="") return null;
        Deque<String> dq = new LinkedList<>();

        for (String s : arr) {
            dq.offer(s);
        }

        return helper(dq);
    }

    private TreeNode helper(Deque<String> dq) {
        String val = dq.poll();

        if (val.equals("N")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = helper(dq);
        root.right = helper(dq);

        return root;
    }
        }
    

