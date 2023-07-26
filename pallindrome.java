class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int r=0,sum=0;
        while(x>0){
           r=x%10;
           sum=(sum*10)+r;
           x=x/10;
        }

        if(sum==temp)
            return true;
        else
            return false;
    }
}
