package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ray on 7/29/17.
 */
public class Q187RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set st = new HashSet();
        Set ss = new HashSet();

        for(int i=0;i<s.length()-9;i++){
            String re = s.substring(i,i+10);
            if(!st.add(re)){
                ss.add(re);
            }

        }
        return new ArrayList<>(ss);
    }
}
