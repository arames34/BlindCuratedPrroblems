package Arrays;


public class BuyAndSellStock {
    
    int result;
    int[] input;
    int target;


    BuyAndSellStock(int[] input){
        this.input = input;
        this.result = runBuyAndSellStock();
    }

    int runBuyAndSellStock(){
        int min= Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i< input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
            else{
                int temp = input[i] - min;
                if (temp > maxProfit){
                    maxProfit = temp;
                }
            }
        }
        return maxProfit;
    }

}
