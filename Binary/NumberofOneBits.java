package Binary;

public class NumberofOneBits {
    
    int input;
    int result;

    NumberofOneBits(int input){
        this.input = input;
        this.result = runNumberOfOneBits();
    }

    int runNumberOfOneBits(){
        int count =0;
        int i = 1;
        while(i !=0){
            if((input&i) > 0){
                count++;
            }
            i = i<<1;
        }
        return count;
    }



}
