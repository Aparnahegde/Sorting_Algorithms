import java.util.*;
/*Reference Nikhil Lohia*/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr,int start,int end){
        if(start<end){
            int partition=findpartition(arr,start,end);
            //left part
            quick(arr,start,partition-1);

            //right part
            quick(arr,partition+1,end);

        }
    }
    public static int findpartition(int[] arr, int start,int end){
        int pivot=arr[end];
        int i=start-1;
        
        for (int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;

                swap(arr,i,j);
            }

        }
        //swap lastly pivot element
        swap(arr,i+1,end);
        return i+1;
    }

    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
