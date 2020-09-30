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

}
