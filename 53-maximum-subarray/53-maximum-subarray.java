class Solution {
    public int maxSubArray(int[]A) {
       int max=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<A.length;i++){
   sum +=A[i];
   max=Math.max(sum,max);
   if(sum<0){
       sum=0;
   }
}
return max;
    }
}