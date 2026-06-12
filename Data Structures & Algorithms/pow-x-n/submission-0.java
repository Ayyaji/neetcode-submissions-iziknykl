class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1/myPow(x,-n);
        if(n==0) return 1;
        double h=myPow(x,n/2);
        if(n%2==0) return h*h;
        else return h*h*x;
    }
}
