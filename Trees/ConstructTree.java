package Trees;
import java.util.*;

public class ConstructTree {

    /*
    Pre-Order: [3,9,20,15,7]
    InOrder: [9,3,15,20,7]
    
    Result:
                     3
                    / \
                   9  20
                     /  \
                    15   7

    
    Getting back to basics:

    Pre-order: Root-> left-> right
    In-Order: left--> root--> right


    So we are sure that the first element must be the root in Pre-Order
    Note that 3 is the root in the result which validates the premise

    Also note: inorder, 3 acts as a dividing factor for left and right subtrees

    Note: 1 element is present before 3 in Inorder string:
          That 1 element is actually serating the next root :O


          So what to do?
          1) Take the first element from pre-order, Make it root

          2) Find the element in InOrder
          
          3) Recursively call the same function
                a) With preorder array leaving out the root/ the first element
                   inorder array from start to the root node

                b) With preorder array starting from 
                    Pre-order: [3,9,20,15,7]
                    InOrder: [9,3,15,20,7]
                    
                    
                    So we know that 3 is the root
                        In inorder array---> we see 9 is the only element to the left of 3
                        So in the recursive call 
                        root-> left = recursive call to the same function with (Preorder, inorder)==> 
                                    Preorder array will span from after 3 until 9. thats just [9]
                                    Inorder array will span everything before 3  thats just [9]
                        root-> right = recursive call to the same function with (Preorder, inorder)==> 
                                    Preorder array will span from after 9 until end thats  [20, 15, 7]
                                    Inorder array will span everything after 3  thats  [15, 20, 7]
                        
                        This continues

                        Recursive call base condition:
                            if only one element, make a node and return that Node
    
    
    
    
    */







    public static TreeNode runConstructTree(int[] preorder, int[] inorder){
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
    
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        return root;

    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if(preStart > preEnd || inStart > inEnd) return null;
    
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.value);
        int numsLeft = inRoot - inStart;
    
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);
    
        return root;
    }



}
