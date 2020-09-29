package Arrays;

import java.util.*;
public class ContainsDuplicate {

     int[] input;
     boolean result = false;
    ContainsDuplicate(int[] input){
        this.input = input;
        this.result = runContainsDuplicate();
    }

    boolean runContainsDuplicate(){
        Arrays.sort(input);
        for(int i=0; i< input.length-1; i++){
            if(input[i] == input[i+1]){
                return true;
            }
        }
        return false;
    }

}
