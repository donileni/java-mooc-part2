
import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordsAndTranslations; 
    
    public DictionaryOfManyTranslations(){
        this.wordsAndTranslations = new HashMap<>(); 
    }
    
    public void add(String word, String translation){
        this.wordsAndTranslations.putIfAbsent(word, new ArrayList<String>());
        
        this.wordsAndTranslations.get(word).add(translation); 
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> list = new ArrayList<>(); 
        
        return this.wordsAndTranslations.getOrDefault(word, list); 
    }
    
    public void remove(String word){
        this.wordsAndTranslations.remove(word); 
    }
}
