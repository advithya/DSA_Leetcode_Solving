class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original = x;
        int result=0;
        while(x>0){
            result =result*10+x%10;
            x=x/10;
        }
        if(result==original){
            return true;
        }else{
            return false;
        }
    }
}