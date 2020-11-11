package DynamicProgramming;

public class CoinChange {
    
    int[] input;
    int amount;
    int result;

    CoinChange(int[] input, int amount){
        this.input = input;
        this.amount = amount;
        this.result = runCoinChange();
    }


    // I ---> COST---> AMOUNT VALUE 
    // INPUT[I] == COIN COST

    //  [3, 6] 
    // 7 ---> 

    // 3< 7 ? YES
        // [7-3] == 4
        // MIN[4]  != INFINITY

    

        //[3, 6]

      // 4?

      // 3 < 4?
        // MIN[4-3] == MIN[1]

    
      // 1?
      // 3< 1?
        // MIN[1]  == INFINITI




    int runCoinChange(){
        int[] dp = new int[amount+1];
        
        for(int i=1; i<= amount ; i++){
            dp[i] = Integer.MAX_VALUE;
            // ITERATE THROUGH COIN ARRAY
            for(int j =0; j < input.length; j++){
                int coinAmount = input[j];
                int Amount =i;
                
                if(coinAmount <= Amount  &&  dp[Amount-coinAmount] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1+dp[Amount-coinAmount]);
                }
                
            }
        
        }

        if(dp[amount] <= amount ){
            return dp[amount];
        }
        else{
            return -1;
        }
    }
}
