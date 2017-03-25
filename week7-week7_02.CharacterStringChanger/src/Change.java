
public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString){

        String buildString = "";
        
        for (int i = 0; i < characterString.length(); i++){
            if (characterString.charAt(i) == this.fromCharacter){
                buildString += this.toCharacter;
            }
            else{
                buildString += characterString.charAt(i);
            }
            
        }
        
        return buildString;
        
    }
    
    
    
}
