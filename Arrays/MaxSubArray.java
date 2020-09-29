package Arrays;

public class MaxSubArray {
    
    int[] input;
    int result;
    MaxSubArray(int[] input){
        this.input = input;
        this.result = runMaxSubArray();
    }

    public int runMaxSubArray() {
        int maxSoFar=input[0], maxEndingHere=input[0];
        for (int i=1;i<input.length;++i){
    	    maxEndingHere= Math.max(maxEndingHere+input[i],input[i]);
    	    maxSoFar=Math.max(maxSoFar, maxEndingHere);	
        }
        return maxSoFar;
    }
}
