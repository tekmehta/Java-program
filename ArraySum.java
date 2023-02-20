//completed
import java.util.*;
class ArraySum{
    public static void main(String args[])
    {
        int[] arr = {25,35,12,4,36,48};
        int arrlength= arr.length;
        int[] newarr = new int[arrlength];
        System.out.println(arrlength);
        int sum=0;
        for(int i=0;i<arrlength;i++){
            sum = sum +arr[i];
            System.out.print(sum+ " ");
        }
    }
}