class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int val = 1;val <= 9;val++) {
             solve(n,k,val + "",list);   
        }
        
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    

public void  solve(int n,int k,String s,ArrayList<Integer> list){
    if(s.length()==n){
        int toAdd=Integer.parseInt(s);
        list.add(toAdd);
        return;
    }
    for(int i=0;i<=9;i++){
        int prev = Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
              int diff = Math.abs(prev - i);
              if(diff == k) {
                  solve(n,k,s + i,list);
              } 
    }
    
}
}