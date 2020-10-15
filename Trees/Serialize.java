package Trees;


public class Serialize {

    public static String runSerialize(TreeNode root){
        if(root == null){
            return "n ";
        }
        
        String curr = Integer.toString(root.value);
        String left = runSerialize(root.left);
        String right = runSerialize(root.right);
        return curr+" "+left+" "+right+" ";
        
    }
}
