package leetcode.twohundred200;

import java.util.*;

/**
 * Created by ray on 7/19/17.
 */
public class Q127WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);

        // Mark visited word
        Set<String> visited = new HashSet<String>();
        visited.add(beginWord);

        int level =1;
        while(!queue.isEmpty()) {
            String str = queue.poll();

            if(str != null) {
                char[] ch = str.toCharArray();

                for(int i=0;i<ch.length;i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        ch[i] = c;
                        String word = new String(ch);

                        // Found the end word
                        if (word.equals(endWord)) return level + 1;

                        // Put it to the queue

                        if(wordList.remove(word)) {
                            queue.add(word);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
