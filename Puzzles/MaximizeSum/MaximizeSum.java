import java.util.*;


class MaximmizeSum {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            for(int i =0;i<N;i++){
                int len = s.nextInt();
                int q = s.nextInt();
                HashMap<Integer,Integer> ss = new HashMap<Integer,Integer>();
                for(int j=0;j<len;j++){
                    int num = s.nextInt();
                    if(num >0){
                        if(ss.containsKey(num)){
                            ss.put(num,ss.get(num)+1);
                        }else{
                            ss.put(num,1);
                        }
                    }
                }
                //Arrays.sort(arr);
                long op = 0;
                int hs = ss.size();
                long[] arrS = new long[hs];
                int l = 0;
                for(Integer k:ss.keySet()){
                    arrS[l] = (long)ss.get(k)*(long)k;
                    l++;
                }
                Arrays.sort(arrS);

                for(int z=0;z<q && z<hs;z++){
                    op = op + (long)arrS[hs-1-z];
                }
                
                System.out.println(op);
            }
    }
}
