package Trees;

// Breaking down the idea!!   Beautiful problem if done in Java :P
/*
        1) Store the tree as a pre-order traversal string.  Root->Left->Right
        2) During deserialization-> Remember to remove all the stop words and convert the string to a queue
        3) After that, start building the tree. How?
            1) Poll the front of the queue.
                2) If null return null
                3) If element is present
                        a) create a new node initialized with this value.
                        b) attach left subtree by calling the function recursively
                        c) attach right subtree by calling the function recursively
                            NOTE: Order same when u serialized.

        To make sure you understand, printed out the tree! Everytime it generates random tree... do check out the code. 


*/






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
