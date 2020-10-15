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
            while(count !=0){
                boolean left = randomInt%2 == 0;
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
                        curr.left = new TreeNode(rand.nextInt(30));
                        curr = curr.left;
                    }
                }
                else{

                    if(curr.right != null){
                        curr = curr.right;
                    }
                    else{
                        curr.right = new TreeNode(rand.nextInt(30));
                        curr = curr.right;
                    }
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
        }
    

}
