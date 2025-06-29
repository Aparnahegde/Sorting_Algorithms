import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
   int[] arr={5,4,3,6,1};
    arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        // for remaining element any one the array may be exhausted and for remaining element any one of this loop execute
        while(i<first.length){    //if first array having more element
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){ // if second array having more element
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
