class Solution {
    public int maximumWealth(int[][] accounts) {
        int cursum=0;
        for(int[] wealth : accounts){
            int sum=0;
            for(int account : wealth){
                sum+=account;
            }
            if(sum>cursum){
                cursum=sum;
            }
        }
        return cursum;
    }
}