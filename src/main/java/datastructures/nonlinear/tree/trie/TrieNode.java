package datastructures.nonlinear.tree.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private boolean isEndOfWord;
    private Map<Character,TrieNode> childrens;

    public TrieNode(){
        isEndOfWord = false;
        childrens = new HashMap<>();
    }
    public Map<Character, TrieNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(Map<Character, TrieNode> children) {
        this.childrens = children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }
}
