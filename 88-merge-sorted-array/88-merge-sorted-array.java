class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int []ans=new int [m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(a[i]<b[j]){
                ans[k]=a[i];
                i++;
                k++;
            }
            else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k]=a[i];
                i++;
                k++;
        }
         while(j<n){
            ans[k]=b[j];
                j++;
                k++;
        }
       for(int ii=0;ii<ans.length;ii++){
           a[ii] = ans[ii];
       }
    }
}