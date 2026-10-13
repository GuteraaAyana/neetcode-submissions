class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> double_list = new ArrayList<>();
        int start = 0;
        int end = 0;
        List<Integer> single_list;
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            start = i + 1;
            end = nums.length - 1;
            while(start < end){
                if(-nums[i] > nums[start] + nums[end]) start++;
                else if(-nums[i] < nums[start] + nums[end]) end--;
                else{
                    double_list.add(new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end])));
                    while(start < end && nums[start] == nums[start + 1]) start++;
                    while(start < end && nums[end] == nums[end - 1]) end--;
                    start++;
                    end--;
                }
            }
        }
        return double_list;
    }
}
