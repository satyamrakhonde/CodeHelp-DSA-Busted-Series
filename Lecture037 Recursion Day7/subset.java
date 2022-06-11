class Solution {
    
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
    
        //Base Condition
        if(index == nums.length){
            ans.add(new ArrayList(output));
            return;
        }
       
        
        //include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index+1, ans);
        
         
        //exclude
        output.remove(output.size()-1);
        solve(nums, output, index+1, ans);
        
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
}
