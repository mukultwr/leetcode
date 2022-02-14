class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       for(int x: nums)
	if(((int)Math.log10(x) + 1) % 2 == 0)++count;
        return count;
    }
}