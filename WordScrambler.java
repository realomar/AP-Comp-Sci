/**
 * Write a description of class WordScrambler here.
 * 
 */
public class WordScrambler
{
    private String[] scrambledWords;
    private String[] defaultWords = {"word", "grape", "apple", "orange"};
    
    public WordScrambler()
    {
        scrambledWords = mixedWords(defaultWords);
    }
    
    public WordScrambler(String[] wordArr)
    {
        scrambledWords = mixedWords(wordArr);
    }
    
    private String recombine(String word1, String word2)
    {
        String cutWord1 = word1.substring(0, word1.length() / 2)
        String cutWord2 = word2.substring(word2.length() / 2)
        return cutWord1 + cutWord2;
    }
    
    private String[] mixedWords(String[] words)
    {
        
    }
}



