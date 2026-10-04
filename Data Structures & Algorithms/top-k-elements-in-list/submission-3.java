class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        ArrayList<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
            arr.sort((a,b) -> b[0] - a[0]);
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = arr.get(i)[1];
        }
        return ans;
    }
}
