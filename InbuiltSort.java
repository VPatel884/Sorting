import java.util.*;

public class InbuiltSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
    }
}
