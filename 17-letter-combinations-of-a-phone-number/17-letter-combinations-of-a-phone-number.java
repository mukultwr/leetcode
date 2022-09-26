class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new LinkedList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
         map.put('3',"def");
         map.put('4',"ghi");
         map.put('5',"jkl");
         map.put('6',"mno");
         map.put('7',"pqrs");
         map.put('8',"tuv");
         map.put('9',"wxyz");
        
        solve(map,digits,0,"",result);
        return result;
    }
    
    
    public void solve(  Map<Character, String> map,String digits,int index,String psf,List<String> result )  {
        
        if(index == digits.length()){
            if(digits.length() > 0)
            result.add(psf);
            return;
        }
    
        char ch = digits.charAt(index); 
        for(int i=0;i<map.get(ch).length();i++) {
            solve(map,digits,index+1,psf + map.get(ch).charAt(i),result);
        }
    }
}