package Arrays;

public class ContainerWithMostWater {
    int[] input;
    int result;

    ContainerWithMostWater(int[] input){
        this.input = input;
        this.result = runContainerWithMostWater();
    }

    int runContainerWithMostWater()
    {
        int maxArea =0, l=0, r=input.length-1;
        while(l<r){
            maxArea = Math.max(maxArea, Math.min(input[l], input[r])*(r-l));
            if(input[l] < input[r]){
                l++;
            }       
            else{
                r--;
            }     
        }
        return maxArea;
    }

}
