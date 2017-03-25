import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.dictionary = dictionary;
        this.reader = reader;
    }
    
    public void start(){
        System.out.println("Statements:\n" +
"  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface");
        
        String input;
       
       while (true){
        
        System.out.println("Statement: ");
        input = reader.nextLine();
        input = stringCleaner(input);
        
        
        if (input.equals("quit")){
            break;
        }
        else if (input.equals("add")){
            this.add();
        }
        else if (input.equals("translate")){
            this.translate();
        }
        else{
            System.out.println("Unknown statement");
        }
        }  
    }
    
    public void add(){
        
        System.out.print("In Finnish: ");
        String finnishWord = reader.nextLine();
        System.out.print("Translation: ");
        String englishWord = reader.nextLine();
        this.dictionary.add(finnishWord, englishWord);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
    
    private static String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
}
