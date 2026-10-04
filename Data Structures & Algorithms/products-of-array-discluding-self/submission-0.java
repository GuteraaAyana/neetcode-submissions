class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int total = 1;
        int num_zeros = 0;
        int idx_zeros = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == 0){
                num_zeros += 1;
                idx_zeros = i;
                continue;
            }
            total *= nums[i];
        }

        for(int i = 0; i < len; i++){
            if(num_zeros > 1){
                return output;
            }
            else if (num_zeros == 1){
                output[idx_zeros] = total;
            }
            else{
                output[i] = total / nums[i];
            }
        }
        return output;
    }
}  
