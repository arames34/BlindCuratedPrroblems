package DynamicProgramming;

public class DynamicProgrammingMain {
    public static boolean testClimbingStairs(){
            ClimbingStairs c = new ClimbingStairs(3);
            return (3 == c.result);
    }
    
    public static void main(String[] args){
        System.out.println("Running Climbing stairs test: Result: "+testClimbingStairs());
    }
}
