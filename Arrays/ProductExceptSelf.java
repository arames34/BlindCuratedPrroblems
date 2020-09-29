package Arrays;

public class ProductExceptSelf {
    int[] input;
     
    int[] result;
    ProductExceptSelf(int[] input){
        this.input = input;
        this.result = runProductExceptSelf();
    }

    int[] runProductExceptSelf(){
        int[] l = new int[input.length];
        int[] r = new int[input.length];
        l[0] = 1;
        r[input.length-1] =1;
        for(int i=0; i< input.length-1; i++){
            l[i+1] = l[i]*input[i]; 
        }
        for(int i=input.length-2; i >=0; i--){
            l[i-1] = l[i]*input[i]; 
        }

        int[] result = new int[input.length];
        for(int i=0; i <input.length; i++){
             result[i] = l[i]*r[i];
        }



        return result;
    }
}
