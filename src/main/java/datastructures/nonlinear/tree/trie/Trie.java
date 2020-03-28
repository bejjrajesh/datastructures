package datastructures.nonlinear.tree.trie;

public class Trie {

    private TrieNode root;

    public void insert(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode childNode = current.getChildrens().get(ch);
            if(childNode == null){
                childNode = new TrieNode();
                childNode.getChildrens().put(ch,childNode);
            }
            current = childNode;
        }
        current.setEndOfWord(true);
    }


    public boolean search(String word){
        TrieNode current = root;
        boolean isStringFound = true;
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.getChildrens().get(ch);
            if(node == null){
                isStringFound = false;
                break;
            }
        }
        return isStringFound && current.isEndOfWord();
    }

    public void delete(TrieNode parentNode, String word, int index){
        if(index == word.length()-1){
            if(!parentNode.isEndOfWord()){
                //return false;
            }
            parentNode.setEndOfWord(false);
          //  return parentNode.getChildrens().isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.getChildrens().get(ch);
       // boolean shouldDeleteNode = delete(currentNode,word,index+1);
    }
}
