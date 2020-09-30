package Binary;


/*
Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Input: [3,0,1]
Output: 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

*/


public class MissingNumber {
    int[] input;
    int result;

    MissingNumber(int[] input){
        this.input = input;
        this.result = runMissingNumber();
    }


    int runMissingNumber(){
        int max = input[0];

        for(int i: input){
            if(max < i){
                max = i;
            }
        }
        int sum = max*(max+1)/2;

        int sumMissing  =0;
        for(int i: input){
            sumMissing+= i;
        }
        return (sum - sumMissing);
    }

}
