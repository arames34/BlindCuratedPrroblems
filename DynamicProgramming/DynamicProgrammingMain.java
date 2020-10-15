package DynamicProgramming;

import javax.naming.spi.DirStateFactory.Result;

public class DynamicProgrammingMain {
    public static boolean testClimbingStairs(){
            ClimbingStairs c = new ClimbingStairs(3);
            return (3 == c.result);
    }

    public static boolean testCoinChange(){
        int[] input = {1,2,5};
        CoinChange c = new CoinChange(input, 11);
        return (3 == c.result);
    }




    public static void main(String[] args){
        System.out.println("Running Climbing stairs test: Result: "+testClimbingStairs());
        System.out.println("Running Coin Change test: Result: "+testCoinChange());
        
    }
}
