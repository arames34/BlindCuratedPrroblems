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

    int runCoinChange(){
        int[] min = new int[amount+1];

        for(int i=1; i<= amount; i++){
            min[i] = Integer.MAX_VALUE;
            for(int j =0; j<input.length; j++){
                if(input[j] <= i&& min[i - input[j]] != Integer.MAX_VALUE){
                      min[i] = Integer.min(min[i], 1+min[i-input[j]]);
                }
            }
        }

        if (min[amount] != Integer.MAX_VALUE){
            return min[amount];
        }
        else{
            return-1;
        }
    }
}
