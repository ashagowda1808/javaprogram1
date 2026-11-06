import java.util.Arrays;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] a=arr.clone();
        Arrays.sort(a);
        int diff=a[1]-a[0];
        for(int i=2; i<a.length; i++)if(a[i]-a[i-1]!=diff)return false;
        return true;
    }
}
