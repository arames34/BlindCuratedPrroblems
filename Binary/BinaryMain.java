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


    
    public static void main(String[] args){
        int count =1;
        System.out.println("Sl No:"+count+ "  Running Sum Of Two Integers: "+ testSumOfTwoIntegers());
        count++;
        System.out.println("Sl No:"+count+ "  Running Number Of One Bits: "+ testNumberOfOneBits());
    }
}
