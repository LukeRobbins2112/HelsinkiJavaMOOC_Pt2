
package wordinspection;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {
    
    private File file;

    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        int numberOfWords = 0;
        
        while (reader.hasNextLine()){
            reader.nextLine();
            numberOfWords++;
        }
        
        return numberOfWords;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        
        List<String> wordsWithZ = new ArrayList<String>();  
        Scanner reader = new Scanner(this.file, "UTF-8");
        String dicWords = "";
        
        while (reader.hasNextLine()){
            dicWords = reader.nextLine();
            if (dicWords.contains("z")){
                wordsWithZ.add(dicWords);
            }
        }
        return wordsWithZ;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        List<String> endsWithL = new ArrayList<String>();  
        Scanner reader = new Scanner(this.file, "UTF-8");
        String dicWord = "";
        
        while (reader.hasNextLine()){
            dicWord = reader.nextLine();
            String desired = Character.toString(dicWord.charAt(dicWord.length() - 1));
            if (desired.equalsIgnoreCase("l")){
                endsWithL.add(dicWord);
            }
        }
        return endsWithL;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        List<String> pals = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        String word = "";
        String reverseWord = "";
        
        while (reader.hasNextLine()){
            word = reader.nextLine();
            for (int i = word.length() - 1; i >= 0; i--){
                reverseWord += word.charAt(i);
            }
            
            if (word.equals(reverseWord)){
                pals.add(word);
                reverseWord = "";
            }
            else{
                reverseWord = "";
            }
        }
        
        return pals;
        
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> wordsWithVowels = new ArrayList<String>();
        String nextWord = "";
        
         while (reader.hasNextLine()){
            nextWord = reader.nextLine();
            if (nextWord.contains("a") && nextWord.contains("e") && nextWord.contains("i") && nextWord.contains("o") && nextWord.contains("u") && nextWord.contains("y") && nextWord.contains("ä") && nextWord.contains("ö")){
                wordsWithVowels.add(nextWord);
            }
        }
        
        return wordsWithVowels;
    }

    
}
