
public class Program {

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations(); 
        
        dictionary.add("Hej", "Hi");
        dictionary.add("Hej", "Hello");
        dictionary.add("Hej", "Hi");
        
        dictionary.add("Full", "ShitFaced");
        dictionary.add("Full", "Drunk");
        
        
        System.out.println(dictionary.translate("Hej"));
        System.out.println(dictionary.translate("Full"));
        
        dictionary.remove("Hej");
        
        dictionary.translate("Hej"); 
    }
}
