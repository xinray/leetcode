package leetcode.threehunderd300;

/**
 * Created by ray on 8/20/17.
 */
public class Q211AddandSearchWordDatastructuredesign {
    class WordDictionary {

        WordNode root ;

        private class WordNode{
            boolean isLeaf;
            WordNode[] children = new WordNode[26];
        }

        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new WordNode();
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            char chars[] = word.toCharArray();
            addWord(chars, 0, root);

        }

        private void addWord(char[] chars, int index, WordNode parent) {
            char c = chars[index];
            int idx = c-'a';
            WordNode node = parent.children[idx];
            if (node == null){
                node = new WordNode();
                parent.children[idx]=node;
            }
            if (chars.length == index+1){
                node.isLeaf=true;
                return;
            }
            addWord(chars, ++index, node);
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return search(word.toCharArray(), 0, root);
        }

        private boolean search(char[] chars, int index, WordNode parent){
            if (index == chars.length){
                if (parent.isLeaf){
                    return true;
                }
                return false;
            }
            WordNode[] childNodes = parent.children;
            char c = chars[index];
            if (c == '.'){
                for (int i=0;i<childNodes.length;i++){
                    WordNode n = childNodes[i];
                    if (n !=null){
                        boolean b = search(chars, index+1, n);
                        if (b){
                            return true;
                        }
                    }
                }
                return false;
            }
            WordNode node = childNodes[c-'a'];
            if (node == null){
                return false;
            }
            return search(chars, ++index, node);
        }
    }
}
