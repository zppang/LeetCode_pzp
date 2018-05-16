class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		if (nums == null || nums.length < 3)  
	        return result;

		Arrays.sort(nums);
		
		if(nums[0] > 0) return result;
		
		for(int i = 0; i < nums.length; i++)
		{

			if(i > 0 && nums[i] == nums[i-1] ) continue;
			
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == 0){
					List<Integer> result_tmp =  new ArrayList<>();
					result_tmp.add(nums[i]);
					result_tmp.add(nums[j]);
					result_tmp.add(nums[k]);
					result.add(result_tmp);
					j++;
					k--;
					
					while(j < k && nums[j] == nums[j - 1])
						j++;
					while(j < k && nums[k] == nums[k + 1])
						k--;
				}
				else if(sum > 0)
					k--;
				else {
					j++;
				}
			}
			
		}
		return result;	
	}
}