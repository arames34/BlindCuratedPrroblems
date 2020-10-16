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



        public static void runSerializationDeserializationTest(){
            System.out.println("************STARTS**************************************************************************************************");
            TreesMain t1 = new TreesMain();
            TreeNode root = t1.createRandomTree(5);
            TreePrinter.print(root);
            // Serializing the tree
            System.out.println("Serialized result");
            System.out.println(Serialize.runSerialize(root));
            
            //Deserializing the tree
            TreeNode newTree = Deserialize.deserialize(Serialize.runSerialize(root));
            TreePrinter.print(newTree);
            System.out.println("************END**************************************************************************************************");
            System.out.println();
            System.out.println();
        }


        public static void runSubtreeTest(){
            TreeNode S = Subtree.createTreeS();
            TreeNode T = Subtree.createTreeT();
            TreePrinter.print(S);
            System.out.println();
            TreePrinter.print(T);

            System.out.println("Result: "+Subtree.runSubTree(S, T));
        }

        public static void main(String[] args) 
        {
            System.out.println("Uncomment to run tests");
            // runSerializationDeserializationTest(); 
             //runSubtreeTest();

             int[] testArray = {1, 5, 6, 2, 4, 3, 11 ,9,8};
             TreeNode root = lowestCommonAncestor.createBST(testArray);
             TreePrinter.print(root);

             TreeNode p = new TreeNode(3);
             TreeNode q = new TreeNode(8);

             System.out.println("The value of the Ancestor is :"+lowestCommonAncestor.runlowestCommonAncestor(root, p, q).value);
             
        }
    

}





