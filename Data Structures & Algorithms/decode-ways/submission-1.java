class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int  a=1;
        int b=1;
        for(int i=2;i<=s.length();i++){
            int c=0;
            int o=s.charAt(i-1)-'0';
            int t=Integer.parseInt(s.substring(i-2,i));
            if(o!=0) c+=a;
            if(t>=10 && t<=26) c+=b;
            b=a;
            a=c;
        }
        return a;
    }
}
