
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys(":/");
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        
        if (characterString.length()%2 != 0){
            characterString += " ";
        }
        
        characterString = ":) " + characterString + " :)";
        
        String smileyBrackets="";
        
        for (int i = 0; i<characterString.length(); i+=2){
            smileyBrackets+=":)";
        }
        
        System.out.println(smileyBrackets);
        System.out.println(characterString);
        System.out.println(smileyBrackets);
        
    }

}
