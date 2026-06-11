class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> tree=new TreeMap<>();
        for(int card : hand)
            tree.put(card, tree.getOrDefault(card, 0) + 1);
        while(!tree.isEmpty()){
            int first=tree.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!tree.containsKey(first+i)) return false;
                if(tree.get(first+i)==1)
                    tree.remove(first+i);
                else
                    tree.put(first+i,tree.get(first+i)-1);
            }
        }
        return true;
    }
}
