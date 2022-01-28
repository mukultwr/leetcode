class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        function(start,end,s);
        }
     
    static void function(int start,int end,char []s){
        if(start>end){
            return;
        }
        swap(start,end,s);
        function(start+1,end-1,s);
    }
    
    static void swap(int start,int end,char[]s){
        
        char temp;
        temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        
    }
    
    
}