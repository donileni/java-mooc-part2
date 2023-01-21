package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveableDictionary {

    private HashMap<String, String> hashmap;
    private File file;

    public SaveableDictionary() {
        this.hashmap = new HashMap<String, String>();
    }

    public SaveableDictionary(String file) {
        this();
        File f = new File(file);
        this.file = f;
    }

    public boolean load() {
        try {

            Scanner fileReader = new Scanner(this.file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                String finnish = parts[0];
                String english = parts[1];

                this.add(finnish, english);

            }
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        }
    }

    public boolean save() {
        
        ArrayList<String> usedStrings = new ArrayList<String>();
            
        try {
            PrintWriter writer = new PrintWriter(this.file.toString());
            
            for (Map.Entry<String, String> entry : hashmap.entrySet()) {
                String finnish = entry.getKey();
                String english = entry.getValue();
                
                if (usedStrings.contains(english)){
                    usedStrings.add(finnish);
                    continue;
                }
                writer.println(finnish + ":" + english);
                usedStrings.add(finnish);
                
                
            }
            writer.close();
            return true;

        } catch (FileNotFoundException ex) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.hashmap.containsKey(word)) {
            this.hashmap.put(word, translation);
            this.hashmap.put(translation, word);
        }
    }

    public String translate(String word) {
        return this.hashmap.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);

        hashmap.remove(word);
        hashmap.remove(translation);
    }

}
