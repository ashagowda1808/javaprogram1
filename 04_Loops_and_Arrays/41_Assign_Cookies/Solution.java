import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int[] greed=g.clone(),cookies=s.clone();
        Arrays.sort(greed);
        Arrays.sort(cookies);
        int child=0,cookie=0;
        while(child<greed.length&&cookie<cookies.length){
            if(cookies[cookie]>=greed[child])child++;
            cookie++;
        }
        return child;
    }
}
