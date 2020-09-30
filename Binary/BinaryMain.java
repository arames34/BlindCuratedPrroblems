package Binary;


public class BinaryMain {
    public static boolean testSumOfTwoIntegers(){
        int a =3;
        int b= 6;
        SumOfTwoIntegers s1 = new SumOfTwoIntegers(a, b);
        if(s1.result == 9){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean testNumberOfOneBits(){
        int a =3;
        NumberofOneBits s1 = new NumberofOneBits(a);
        if(s1.result ==2){
            return true;
        }
        else{
            return false;
        }
    }


    public static boolean testCountingBits(){
        int a =5;
        CountingBits s1 = new CountingBits(a);
        int[] output = {0,1,1,2,1,2};
        int count =0;
        for (int i: output){
            if(i != s1.output[count]){
                return false;
            }
            count++;
        }
        return true;
    }

    public static boolean testMissingNumber(){
        int[] a ={9,6,4,2,3,5,7,0,1};
        MissingNumber s1 = new MissingNumber(a);
        if(s1.result == 8){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean testReverseBits(){
        String input = "00000010100101000001111010011100";
        String output ="00111001011110000010100101000000";
        ReverseBits s1 = new ReverseBits(input);
        if(s1.result.equals(output)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){
        int count =1;
        System.out.println("Sl No:"+count+ "  Running Sum Of Two Integers: "+ testSumOfTwoIntegers());
        count++;
        System.out.println("Sl No:"+count+ "  Running Number Of One Bits: "+ testNumberOfOneBits());
        count++;
        System.out.println("Sl No:"+count+ "  Running Counting Bits: "+ testCountingBits());
        count++;
        System.out.println("Sl No:"+count+ "  Running Test Missing Number: "+ testMissingNumber());
        count++;
        System.out.println("Sl No:"+count+ "  Running Test Reverse Bits : "+ testReverseBits());
    }
    
}
