class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int opp = target - nums[i];
            if(map.containsKey(opp)){
                if(i < map.get(opp)) return new int[]{i, map.get(opp)};
                else return new int[]{map.get(opp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
