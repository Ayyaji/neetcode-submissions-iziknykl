class Solution {
    public int getSum(int a, int b) {
     int c=1;
     while(c!=0)  {
        c=(a&b) <<1;
        a=a^b;
        b=c;
     } 
     return a;
    }
}
