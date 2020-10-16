package Trees;





public class lowestCommonAncestor {

    public static TreeNode createBST(int[] arr){
            
        TreeNode root = null;
        for(int i : arr){
            if(root == null){
                root = new TreeNode(i);
                continue;
            }
            insert(root, i);
        }
        
        return root;
    }


    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        else{
            if(root.value > val){
                root.left = insert(root.left, val);
            }
            else{
                root.right = insert(root.right, val);
            }
            return root;
        }
    }
    


    public static TreeNode runlowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root.value > p.value && root.value >q.value){
            return runlowestCommonAncestor(root.left, p, q);
        }
        else if(root.value < p.value && root.value < q.value){
            return runlowestCommonAncestor(root.right, p, q);
        }
        else{
            // this is the lowest common ancestor
            return root;
        }
        
    }

}
