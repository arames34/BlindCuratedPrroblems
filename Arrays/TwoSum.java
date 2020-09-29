package Arrays;
import java.util.*;


class TwoSum{

    ArrayList<Integer> result;
    int[] input;
    int target;

    TwoSum(int[] input, int target){
        this.input = input;
        this.target = target;
        this.result = runTwoSum();
    }

    ArrayList<Integer> runTwoSum(){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< input.length; i++){
            int complement = target - input[i];
            if(map.containsKey(complement)){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(input[i]);
                result.add(input[map.get(complement)]);
                return result;
            }
            map.put(input[i], i);
        }
        return null;
    }



}