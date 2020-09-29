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
        a =3 = 011
        b =1 = 001
        carry = a&b 001
        a = a^b 010
        b = carry << 1 == 010

        
        for every bit, the AND gate contains the carry
        and the XOR gate contains the sum
       
    
    */
    public void printBinary(int a){
        int i =1;
        StringBuilder b1 = new StringBuilder();
        while(i !=0){
            if((a&i) > 0){
                b1.append(1);
            }
            else{
                b1.append(0);
            }
            i = i<<1;
        }
        b1 = b1.reverse();
        String res = b1.toString();
        System.out.println(res); 
    }



    int runSumOfTwoIntegers(){
        //int count =0;

        while (b != 0)  
        {   
            // System.out.println("Round"+ count);
            // printBinary(a);
            // printBinary(b);
            // carry now contains common  
            //set bits of x and y 
            int carry = a & b;  // This will have the carry bits

            // Sum of bits of x and y where at  
            //least one of the bits is not set
            a = a ^ b; 
            
            // Carry is shifted by one so that adding 
            // it to x gives the required sum 
            b = carry << 1; 
          //  count++;
        } 
        return a; 
   }
}
