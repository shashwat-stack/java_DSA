import  java.util.*;
public class Sub_Array_01 {
    static  int max_sub_array(int arr[], int n){
        int sum =0;
        int Max_sum= 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            Max_sum= Math.max(Max_sum, sum);
            if(sum<0){
                sum = 0;
            }
        }
        if(Max_sum<0){
            Max_sum= 0;
        }
        return Max_sum;

    }
    public static void main(String[] args) {
        int a[]= {1,-2,1};
        int ans =max_sub_array(a, 3);
        System.out.println("Max Subarray is: "+ ans);





    }
}