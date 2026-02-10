class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
    
        for(int i=0; i<nums.length;i++){
           if(nums[i]==0){
                continue;
            }
            int count=0;
            int temp=nums[i];
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}