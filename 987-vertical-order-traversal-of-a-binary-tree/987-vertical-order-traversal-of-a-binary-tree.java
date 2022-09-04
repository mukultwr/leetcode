class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Map<Integer,List<pair>> map = new TreeMap<>();
        traversal(root,0,0,map);
        
        //bhara hua map aa gaya hai
        for(int item:map.keySet()) {
           List<pair> list = map.get(item);
            //level ke basis par sort karao aur agar level same hai to value ke basis par sort karao
            Collections.sort(list,Comparator.comparing(pair::getLevel).thenComparing(pair::getValue));
            
            List<Integer> intList = new ArrayList<>();
            for(int i=0;i<list.size();i++) {
                intList.add(list.get(i).value);
            }
            ans.add(intList);
        }
        
        
        return ans;
    }
    
    public void traversal(TreeNode root,int hd,int level,Map<Integer,List<pair>> map) {
        if(root == null) return;
        
        
        //apne aap ko handle karo
        if(map.containsKey(hd)){
              map.get(hd).add(new pair(level,root.val));
        }
        else{
            List<pair> toAdd = new ArrayList<>();
            map.put(hd,toAdd);
            map.get(hd).add(new pair(level,root.val));
        }
        
        
        traversal(root.left,hd-1,level+1,map);
        traversal(root.right,hd+1,level+1,map);
        
    }
}


class pair {
    int level;
    int value;
    pair(int level,int value) {
        this.level = level;
        this.value = value;
    }
    
    int getLevel() {
        return level;
    }
    
    int getValue() {
        return value;
    }
}