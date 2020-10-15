package Trees;
import java.util.Random;

class TreeNode implements PrintableNode{

        int value;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val){
            this.value = val;
            this.left =null;
            this.right = null;
        }
        
        /** Get left child */
        public PrintableNode getLeft(){
            return this.left;
        }


        /** Get right child */
        public PrintableNode getRight(){
            return this.right;
        }
    
    
        /** Get text to be printed */
        public String getText(){
            return Integer.toString(this.value);
        }
} 


public class TreesMain {
  
        TreeNode createRandomTree(int number){
            // Randomize insertion to left and right
            // Randomize value of the node to be inserted
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            TreeNode root = new TreeNode(randomInt);
            TreeNode curr = root;
            int count = number-1;
            boolean left = randomInt%2 == 0;
            int tooManyLefts = 0; 
            while(count !=0){
                

                if(tooManyLefts==2){
                    left = false;
                    tooManyLefts =0;
                }
                if(left){
                    curr.left = new TreeNode(rand.nextInt(100));
                    
                }
                else{
                    curr.right = new TreeNode(rand.nextInt(50));
                    
                }
                left = rand.nextInt(100)%2 ==0;
                if(left){
                    if(curr.left != null){
                        curr = curr.left;
                    }
                    else{
                        left = rand.nextInt(100)%2 ==0;
                        if(left){
                            curr.left = new TreeNode(rand.nextInt(30));
                        curr = curr.left;
                        }        
                        else{
                            curr = curr.right;
                        }
                        
                    }
                }
                else{
                    left = rand.nextInt(100)%2 ==0;
                    if(curr.right != null){
                        curr = curr.right;
                    }
                    else{
                        if(left){
                            curr.right = new TreeNode(rand.nextInt(30));
                            curr = curr.right;
                        }
                        else{
                            curr = curr.left;
                        }
                        
                    }
                }
                if(left){
                    tooManyLefts +=1;
                }
                count--;
            }
            return root;
        }

        public static void main(String[] args) 
        {
            TreesMain t1 = new TreesMain();
            TreeNode root = t1.createRandomTree(5);
            TreePrinter.print(root);
            // Serializing the tree
            System.out.println("Serialized result");
            System.out.println(Serialize.runSerialize(root));
            
            //Deserializing the tree
            TreeNode newTree = Deserialize.deserialize(Serialize.runSerialize(root));
            TreePrinter.print(newTree);

            

        }
    

}


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


