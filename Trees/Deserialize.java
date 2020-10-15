package Trees;

import java.util.*;

public class Deserialize {
    
    public static TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<String>();
        System.out.println("Deserialization begins here");
        String[] input = data.strip().split(" ");
        for(String s: input){
            if(!s.equals("")){
                nodes.add(s);
            }
        }
         return buildTree(nodes);
    }
    
    public static TreeNode buildTree(Queue<String> nodes) {
        String curr = nodes.poll();
        if(curr.equals("n")){
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(curr));
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
}
