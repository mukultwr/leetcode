class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
       int []A=new int [n+1];
        
        A[0]=0;
        
                A[1]=1;
        for(int i=2;i<n+1;i++){
            A[i]=A[i-1]+A[i-2];
            
        }
        
             return A[n];  
        
    }
}