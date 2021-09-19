/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class MaxShopping {
   public static void main(String args[] ) throws Exception {

   try{
	//Write code here
   Scanner sc = new Scanner(System.in);
   int maxS = sc.nextInt();
   int jeansN = sc.nextInt();
   int tshirtN = sc.nextInt();
   
   int[] jArr = new int[jeansN];
   for(int i=0;i<jeansN;i++){
      jArr[i]= sc.nextInt();
   }
   int[] tArr = new int[tshirtN];
      for(int j=0;j<tshirtN;j++){
      tArr[j]= sc.nextInt();
   }

   Arrays.sort(jArr);
   Arrays.sort(tArr);

   System.out.println(getMax(jArr,tArr,0,jeansN,0,tshirtN,maxS));
   }
   catch(Exception ex){
   System.out.println(-1);
   }


   }

   public static int getMax(int[] a, int[] b, int astart,int aend,int bstart, int bend, int maxS){
      int aLen = astart+aend;
      int bLen = bstart+bend;
      int aMid = astart+(aend - astart)/2;
      int bMid = bstart+(bend - bstart)/2;
      int maxSumPossible = -1;
      
      if(astart < 0 || aend < 0 || bstart < 0 || bend < 0 || astart > aend || bstart > bend){
         return maxSumPossible;
      }

      if(a[aMid] >= maxS){
         //only left array should be validated
         maxSumPossible = getMax(a,b,astart,aMid-1,bstart,bend,maxS);

      }

      if(b[bMid] >= maxS){
         maxSumPossible = getMax(a,b,astart,aend,bstart,bMid-1,maxS);

      }

      if((a[aMid]+b[bMid]) >= maxS){
         //only left array should be validated for both
         maxSumPossible = getMax(a,b,astart,aMid-1,bstart,bMid-1,maxS);

      }

      
      for(int Ji=astart;Ji<aend;Ji++){
         for(int Ti=bstart;Ti<bend;Ti++){
            int temp = a[Ji]+b[Ti];
            if((temp > maxSumPossible) && (temp <= maxS)){
               maxSumPossible = temp;
            }
         }
      }
      return maxSumPossible;
   }
}
