class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        function(start,s);
        }
     
    static void function(int start ,char []s){
        int n=s.length;
        if(start>=n/2){
            return;
        }
        swap(start,s.length-start-1,s);
        function(start+1,s);
    }
    
    static void swap(int start,int end,char[]s){
        
        char temp;
        temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        
    }
    
    
}