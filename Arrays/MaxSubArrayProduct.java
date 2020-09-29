package Arrays;

public class MaxSubArrayProduct {

    int[] input;
    int result;
    MaxSubArrayProduct(int[] input){
        this.input = input;
        this.result = runMaxSubArrayProduct();

    }

    int runMaxSubArrayProduct(){
        if(input.length == 0){
            return 0;
        }
        
        int len = input.length;
        int max = input[0], min = input[0], result =input[0];

        for(int i=1; i< len; i++){
            int temp = max;
            max = Math.max(Math.max(min*input[i], max*input[i]), input[i]);
            min = Math.min(Math.min(min*input[i], temp*input[i]), input[i]);

            if(max >= result){
                result = max;
            }
        }
        
        return result;
    }



    



    
}
