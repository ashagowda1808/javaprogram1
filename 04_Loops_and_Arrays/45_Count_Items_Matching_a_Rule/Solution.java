import java.util.ArrayList;
import java.util.List;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int field=0;
        if(ruleKey.equals("color"))field=1;
        else if(ruleKey.equals("name"))field=2;
        int count=0;
        for(List<String> item:items)if(item.get(field).equals(ruleValue))count++;
        return count;
    }
}
