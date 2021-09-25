import java.io.*;
import java.util.*;
public class MinSumAbsDiff {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
   }
   Arrays.sort(arr);
   int skipNum = -1;
   int minSum = 0;
   for(int g=0;g<n;g++){
      if(skipNum == arr[g]){
         continue;
      }else{
         int tempMin = Integer.MAX_VALUE;
         for(int h=0;h<n;h++){
            int temp = Math.abs(arr[g]-arr[h]);
            if(g!=h){
               if(temp==0){
                  tempMin = 0;  
                  skipNum = arr[h];
                  break;
               }else{
                  tempMin = Math.min(tempMin,temp);
               }
            }            
         }
         minSum = minSum + tempMin;  
      }
   }
   System.out.println(minSum);

   }
}
