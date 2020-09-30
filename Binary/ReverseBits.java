package Binary;

public class ReverseBits {
    String input;
    String result;

    ReverseBits(String input){
        this.input = input;
        this.result = runReverseBits();
    }

    String runReverseBits(){
        StringBuilder s1 = new StringBuilder();

        for(char i : input.toCharArray()){
            if(i =='1'){
                s1.append('1');
            }
            else{
                s1.append('0');
            }
            
        }
        s1.reverse();
        return s1.toString();
    }


    // Take in integer and return integer, define the function as below
    public int reverseBits(int n) {
        StringBuilder s1 = new StringBuilder();
        int count = 0; 
        while(count !=32){
            if((n&1) == 0){
                s1.append(0);
            }
            else{
                s1.append(1);
            }
            n= n>>1;
            count++;
        }
        
        s1.reverse();
        String reversed = s1.toString();
        
        int result =0;
        int multiplier =1;
        for(char c: reversed.toCharArray()){
            if(c =='1'){
                result += multiplier;
            }
            multiplier = multiplier*2;
            
        } 
        return result;
        
        
    }



}
