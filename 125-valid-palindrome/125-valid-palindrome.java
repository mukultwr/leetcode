
        class Solution {
    public boolean isPalindrome(String s) {
        String sb = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
               (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' &&s.charAt(i) <= '9')){
                sb += s.charAt(i);
            }
        }
        
        sb = sb.toUpperCase();
        return check(0,sb);
    }
       
      static boolean check(int i,String s){
      
        int n=s.length();
        int j=n-i-1;
        
        if(i>=n/2){
            return true;
        }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        return check(i+1,s);
    }
}