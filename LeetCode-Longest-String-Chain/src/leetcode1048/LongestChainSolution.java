package leetcode1048;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestChainSolution {
    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        
        Arrays.sort(words, (a,b) -> a.length() - b.length()); // Need to be sorted
        
        for(String word : words){
            int max = 0;
            
            for(int i = 0; i < word.length(); i++){
                String previous = word.substring(0, i) + word.substring(i + 1);
                
                max = Math.max(max, dp.getOrDefault(previous, 0) + 1);
            }
            
            dp.put(word,max);
        }
        
        int res = 0;
        
        for(int v : dp.values()){
            res = Math.max(res, v);
        }
        
        return res;
    }
}
