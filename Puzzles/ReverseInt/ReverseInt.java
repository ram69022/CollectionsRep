class Solution {
    /*
    public int reverse(int x) {
    /*
        StringBuilder revSb = new StringBuilder();
        String revStr = "";
        int revX =0;
        boolean negInt = x < 0 ? true : false;
        if(negInt) x = Math.abs(x);
        String xstr = String.valueOf(x);
        int len= xstr.length();
        for(int i=0;i<len;i++){
            int r = x%10;
            x = x/10;        
            if(len>1 && r == 0 && revSb.length()==0)
                revSb.append("");
            
            revSb.append(r);
        }
        revStr = negInt ?"-"+revSb.toString() : revSb.toString();
        try{
            revX = Integer.valueOf(revStr);
        }catch(Exception ex){
        }
        
        return revX;
    }
    /*
    public int reverse(int x) {        
        long revx = 0;
        while(x!=0){
            revx = revx*10+x%10;
            x = x/10;
        }
        if(revx <= Integer.MAX_VALUE && revx >= Integer.MIN_VALUE){
            return (int)revx;
        }else
            return 0;
    }
}
