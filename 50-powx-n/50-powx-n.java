class Solution {
    public double myPow(double x, int n) {
       
         int nn=n;
        if(n<0){
             nn=n*-1;
        }
       if(n==0){
           return 1;
       }
        else{
            if(n<0){
                return (double)1/(double)(  myPow(x,nn-1)*x);
            }
            else{
                if(nn%2 == 0){
                    double val = myPow(x,nn/2);
                    return val*val;
                }
                else{
                   return myPow(x,nn-1)*x;   
                }
                 
            }
        } 
    }
}