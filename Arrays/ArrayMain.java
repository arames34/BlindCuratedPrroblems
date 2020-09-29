package Arrays;

public class ArrayMain {
    

 public  static boolean testTwoSum(){
        int[] input = new int[5];
        for(int i =0; i< 5; i++){
            input[i] = i+3;
        }

        int target = 13;
        TwoSum t1 = new TwoSum(input, target);
        if(t1.result != null){
            return true;
        }
        else{
            return false;
        }

    }



    public static void main(String[] args){
        int count =0;
        System.out.println("Sl No:"+count+ "  Running Two Sum  Test: "+ testTwoSum());

                        
    }
}
