package Arrays;

public class RotatedSortedArray {
    int[] input;

    int result;

    RotatedSortedArray(int[] input){
        this.input = input;
        int low =0;
        int high = input.length-1;
        int mid = (low+high)/2;
        this.result = runRotatedSortedArray(low, high);
    }

    int runRotatedSortedArray(int low, int high){
        if (low == high){
            return input[low];
        }

        int mid = (low+high)/2;
        // Check if input[mid] < input[low]?    LOW<->MID CONTAINS THE INFLECTION POINT  [3,4,5,6,7,1,2]
        if(input[low] > input[mid]){
            return runRotatedSortedArray(low, mid);
        }
        else{
            return runRotatedSortedArray(mid+1, high);
        }
    }


}
