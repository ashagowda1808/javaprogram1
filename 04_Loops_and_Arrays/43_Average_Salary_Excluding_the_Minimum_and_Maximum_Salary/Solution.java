class Solution {
    public double average(int[] salary) {
        int min=salary[0],max=salary[0],sum=0;
        for(int v:salary){
            sum+=v;
            if(v<min)min=v;
            if(v>max)max=v;
        }
        return (double)(sum-min-max)/(salary.length-2);
    }
}
