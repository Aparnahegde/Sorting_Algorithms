import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean swapped;                             
      int[] arr={99,92,37,48,23};
      int temp=0;
      for(int i=0;i<arr.length;i++){                           //if we input sorted array, only once loop will iterate
          swapped=false;
          for(int j=1;j<(arr.length-i);j++){
              if(arr[j-1]>arr[j]){
                 temp=arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;
                 swapped=true;
              }
          }
          if(swapped==false){
              break;
          }
      }
        System.out.println(Arrays.toString(arr));
     }

    }
