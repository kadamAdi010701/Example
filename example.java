import java.util.*;

class example{
    public static int maxSum(int [] arr){
        
        Arrays.sort(arr);
        int len = arr.length;

        int first = arr[0] * arr[1] * arr[len -1];
        int last = arr[len -1] * arr[len -2] * arr[len -3];

        return Math.max(first,last);
    }
    public static void main(String [] args){
        int [] num = {-2, 6, 5, -9, 5};

        System.out.println(maxSum(num));
    }
}