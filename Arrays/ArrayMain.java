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

    public  static boolean testBuyAndSellStock(){
        int[] input = new int[5];
        for(int i =0; i< 5; i++){
            input[i] = i+3;
        }
        BuyAndSellStock t1 = new BuyAndSellStock(input);
        if(t1.result != 0){
            return true;
        }
        else{
            return false;
        }

    }


    public  static boolean testContainsDuplicate(){
        int[] input = new int[5];
        for(int i =0; i< 5; i++){
            input[i] = i+3;
        }
        ContainsDuplicate t1 = new ContainsDuplicate(input);
        if(t1.result == false){
            return true;
        }
        else{
            return false;
        }

    }

    public  static boolean testProductExceptSelf(){
        int[] input = new int[4];
        for(int i =0; i< 4; i++){
            input[i] = i+1;
        }
        ProductExceptSelf t1 = new ProductExceptSelf(input);
        int[] res = {24, 12,8, 6};

        for(int i =0; i<t1.result.length ; i++){
            if(res[i] != t1.result[i]){
                return false;
            }

        }
        return true;
    }

    
    public  static boolean testMaxSubArraySum(){
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        
        MaxSubArray t1 = new MaxSubArray(input);
        int res = 6;

            if(res != t1.result){
                return false;
            }
            else{
                return true;
            }
            
    }


    public  static boolean testMaxSubArrayProduct(){
        int[] input = {2,3,-2,4};
        
        MaxSubArrayProduct t1 = new MaxSubArrayProduct(input);
        int res = 6;
        if(res != t1.result){
           return false;
        }
        else{
            return true;            
        }    
    }


    public  static boolean testRotatedSortedArray(){
        int[] input = {8,4,6,7};
        RotatedSortedArray t1 = new RotatedSortedArray(input);
        int res = 4;
        if(res != t1.result){
           return false;
        }
        else{
            return true;            
        }    
    }


    public  static boolean testContainerWithMostWater(){
        int[] input = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater t1 = new ContainerWithMostWater(input);
        int res = 49;
        if(res != t1.result){
           return false;
        }
        else{
            return true;            
        }    
    }


    public static void main(String[] args){
        int count =1;
        System.out.println("Sl No:"+count+ "  Running Two Sum  Test: "+ testTwoSum());
        count++;
        System.out.println("Sl No:"+count+ "  Running Buy and Sell Stock  Test: "+ testBuyAndSellStock());
        count++;
        System.out.println("Sl No:"+count+ "  Running Contains Duplicate  Test: "+ testContainsDuplicate());
        count++;
        System.out.println("Sl No:"+count+ "  Running Product Except Self  Test: "+ testProductExceptSelf());
        count++;
        System.out.println("Sl No:"+count+ "  Running Max SubArray Sum  Test: "+ testMaxSubArraySum());
        count++;
        System.out.println("Sl No:"+count+ "  Running Max SubArray Product  Test: "+ testMaxSubArrayProduct());
        count++;
        System.out.println("Sl No:"+count+ "  Running Rotated Sorted Array  Test: "+ testRotatedSortedArray());
        count++;
        System.out.println("Sl No:"+count+ "  Running Container With Most Water  Test: "+ testContainerWithMostWater());
    }
}
