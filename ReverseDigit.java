class Solution {
    public int reverse(int x) {
        int rev=0;
        int temp=x;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10)
                 return 0;
            if(rev<Integer.MIN_VALUE/10)
                 return 0;
            rev=rev*10+rem;
        }
        return rev;
    }
}
