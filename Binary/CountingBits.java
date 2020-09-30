package Binary;


/*
Counting Bits
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
Example 1:
Input: 2
Output: [0,1,1]

Input: 5
Output: [0,1,1,2,1,2]


Algorithm
1) So we have even and odd integers

First integer is 0 --> Even  --> it has 0 1's

Second integer is 1 --> Odd--> it has 1 1's

Third integer is 2 --> Even --> it has 1 1's

Fourth integer is 3 ---> Odd ---> it has 2 1's

Fifth integer is 4 --> Even ---> it has 1 1's

Sixth Integer is 5 ---> Even ---> it has 2 1's




Can u let me know the pattern here?  No? Neither did i get it the first time


So--> For Even numbers, number of 1's is same as that number divided by 2
For odd numbers, number of 1's is same as that number divided by 2 + 1(Last digit of the odd number is always 1)

This becomes a Dynamic Programming Approach and we start bottom up from the number 0

0 ---> 0

1 ---> odd --> Right shift 1 ---> 0 ---> Add 1 as its odd---> So ans is 1

2----> even ---> Right Shift---> gets u 1---> We know the result of 1 already ---> So ans is 1

3 ---> odd ---> Right Shift --> gets u 1--> We know the result of 1 already--->Add 1 as the number is odd ---> So ans =2

4----> even ----> Right Shift ---> gets u 2 ---> We know the value of 2 already--> So the Ans  is 1

5---> odd ---> Right Shift--> gets u 2 --> We know the value of 2 already---> So the ans is 2 as we add 1 to ans as its odd.




*/ 

public class CountingBits {
    int input;
    int[] output;

    CountingBits(int input){
        this.input = input;
        this.output = runCountingBits();
    }

    int[] runCountingBits(){
        // Single pass algorithm to find counting bits 
        int[] output = new int[input+1];
        output[0] = 0;

        for(int i=1; i<=input; i++){
            if((i & 1) == 0){
                // Even number
                output[i] = output[(i>>1)];
            }
            else{
                output[i] = output[i>>1] +1;
            }
        }

        return output;
    }
    
}
