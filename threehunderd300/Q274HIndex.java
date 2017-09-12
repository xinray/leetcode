package leetcode.threehunderd300;

import java.util.Arrays;

/**
 * Created by ray on 9/12/17.
 */
public class Q274HIndex {
    public int hIndex(int[] citations) {

        if (citations.length == 0) return 0;

        Arrays.sort(citations);
        int len=citations.length;
        for(int i=0;i<len;i++){
            if(citations[i]>=len-i) return len-i;

        }
        return 0;
    }
}
