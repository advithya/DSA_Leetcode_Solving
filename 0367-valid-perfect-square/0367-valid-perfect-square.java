class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <2){
            return true;
        }
        int low=0; 
        int high=num/2;
        

        while(low<=high){
            int mid=(low+high)/2;
            long integer= (long)mid*mid;

            if(integer==num){
               return true;
            }else if(integer<num){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}