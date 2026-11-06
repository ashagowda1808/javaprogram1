import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> out=new ArrayList<>();
        for(int r=0; r<matrix.length; r++){
            int mc=0;
            for(int c=1; c<matrix[r].length; c++)if(matrix[r][c]<matrix[r][mc])mc=c;
            int x=matrix[r][mc];
            boolean largest=true;
            for(int rr=0; rr<matrix.length; rr++)if(matrix[rr][mc]>x)largest=false;
            if(largest)out.add(x);
        }
        return out;
    }
}
