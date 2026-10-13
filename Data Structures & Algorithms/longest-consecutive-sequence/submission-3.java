class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums) set.add(i);

        int longest = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int suffix = 1;
                while(set.contains(num + suffix)) suffix++;
                if(suffix > longest) longest = suffix;
            }
        }
        return longest;
    }
}
