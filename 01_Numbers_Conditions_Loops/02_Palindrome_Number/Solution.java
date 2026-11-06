class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0))return false;
        int rest=x,half=0;
        while(rest>half){
            half=half*10+rest%10;
            rest/=10;
        }
        return rest==half||rest==half/10;
    }
}

