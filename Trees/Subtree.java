package Trees;

public class Subtree {
    
    /* 
        The whole idea of finding a subtree of a tree is
        1) Find the pre-order string of the tree S
        2) Find the pre-order string of the tree T
        3) If the pre-order string T is substring of pre-order string S, return True or else return false;
    
        NOTE: Make sure to differentiate between null in the left link as lNull and null in the right link as Rnull or else it wont work
    
    */




    public static TreeNode createTreeS(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(0);
        return root;
    }

    public static TreeNode createTreeT(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        return  root;
    }

    public static boolean runSubTree(TreeNode S, TreeNode T){
        
        String tree1 = preOrder(S, true);
        String tree2 = preOrder(T, true);

        // System.out.println("Tree1: "+tree1);
        // System.out.println("Tree2: "+tree2);
        return tree1.indexOf(tree2) >= 0;
    }


    public static String  preOrder(TreeNode root, boolean left){
        if(root == null){
            if(left){
                return " lnull ";
            }
            else{
                return " rnull ";
            }
        }
        String result = Integer.toString(root.value) +" "+preOrder(root.left, true)+" "+preOrder(root.right, false);
        return result;
    } 




}
