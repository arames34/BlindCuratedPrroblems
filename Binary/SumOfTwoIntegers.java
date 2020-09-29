package Binary;

public class SumOfTwoIntegers {

    int a;
    int b;
    int result;


    SumOfTwoIntegers(int a, int b){
        this.a = a;
        this.b=b;
        this.result = runSumOfTwoIntegers();
    }   

    /*
        So the idea here is to use the binary representation of numbers and use logical operators to perform addition

        1) XOR performs blind bit add
        2) AND performs Carry

        How?
        3 = 011
        1 = 001
        
        for every bit, the AND gate contains the carry
        and the XOR gate contains the sum

        What we do is:
        int addRes = 
        
        If u add both, you get the result


    
    */

    int runSumOfTwoIntegers(){
        
        
        return 0;
    }
}
