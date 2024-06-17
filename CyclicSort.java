import java.util.*;
public class CyclicSort {                     //It is for 1 to N numbers
    public static void main(String[] args) {
        int[] arr={2,4,1,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;   //for 1st when i=0 correct=2-1=1
            if(arr[i]!=arr[correct]){ //arr[0]!=arr[1]--->(2!=4)
                swap( arr,i,correct);  // swapping [4,2,1,5,3]-->[5,2,1,4,3]-->[3,2,1,4,5]-->[1,2,3,4,5]
            }else{
                i++;
            }
        }
    }
    static void swap( int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
