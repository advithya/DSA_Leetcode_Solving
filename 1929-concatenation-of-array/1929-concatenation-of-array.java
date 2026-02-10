class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length;
        int num[]=new int[2*size];

        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            num[i+size]=nums[i];
        }
        return num;
    }
}