class Solution {
    public boolean isDigit(char c){
        return c>='0' && c<='9';
    }
    public int myAtoi(String s) {
        int i=0;
        int num=0;
        int sign=1; //1 is for positive default & -1 for negative
         //1.WhiteSpace
         while(i<s.length() && s.charAt(i)==' '){
            i=i+1;
         } 

         //2.Signedness

         if(i<s.length()){
            if(s.charAt(i)=='-'){
                sign=-1;
                i=i+1;
            }else if(s.charAt(i)=='+'){
                i=i+1;
            }
         }

         //3.Conversion
         while(i<s.length() && isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';// '6'-'0'=>6

            //4. Rounding
            if(num==Integer.MAX_VALUE/10){
                if(sign==1){
                    if(digit>=7){
                        return Integer.MAX_VALUE;
                    }
                }else if(sign==-1){
                    if(digit>=8){
                        return Integer.MIN_VALUE;
                    }
                }
            }
            //maxvalue*10(2,147,483,64)
            //Minvalue*10 (-2,147,283,650) digit=6
            if(num>Integer.MAX_VALUE/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            num=num*10 + digit;
            i=i+1;
         }
    return sign*num;
    }
}