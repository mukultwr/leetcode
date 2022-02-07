class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i  = 0;i<nums.length;i++){
            if(nums[i] == 1) x.add(i);
        }
        int n = x.size();
        if(n == 0) {
            res.add(nums.length);
            return res;
        }
        if(n == nums.length){
            res.add(0);
            return res;
        }
        int m = nums.length - n;
        res.add(nums.length);
        int score = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            score = x.get(i)-i + n-i;
            if(score>m){
                m = score;
                res = new ArrayList<>();
                res.add(x.get(i));
            }else if(score == m){
                res.add(x.get(i));
            }     
            
        }
        return res;
        
    }
}