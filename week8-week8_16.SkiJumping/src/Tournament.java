import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.Random;

public class Tournament implements Comparator<Jumper>{
    
    private ArrayList<Jumper> jumpers;
    int roundNumber;
    
    public Tournament(){
        this.jumpers = new ArrayList<Jumper>();
        this.roundNumber = 1;
    }
      
    public void start(){
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Kumpula ski jumping week\n" +
"\n" +
"Write the names of the participants one at a time; an empty string brings you to the jumping phase.\n" +
"  Participant name: ");
        
        String entry = reader.nextLine();
        
        while (true){
            if (entry.equals("")){
                break;
            }
            jumpers.add(new Jumper(entry, 0));
            System.out.print("  Participant name: ");
            entry = reader.nextLine();
        }
        
        System.out.println("");
        System.out.print("The tournament begins!\n" +
"\n" +
"Write \"jump\" to jump; otherwise you quit: ");
        
        String anotherRoundDecision = reader.nextLine();
        
        System.out.println("");
        
        while (true){
            
           if (!anotherRoundDecision.equals("jump")){
            break;
        }
           this.playTournamentRound();
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            anotherRoundDecision = reader.nextLine();
        }
        
        this.printResults();  
        
    }
    
    public void playTournamentRound(){
        
        this.printJumpingOrder();
        this.jump();
               
    }
    
    public void printJumpingOrder(){
        Collections.sort(this.jumpers);
        
        System.out.print("Round 1\n" +
"\n" +
"Jumping order:\n");
        
        //Goes through list of jumpers and prints a list of their toString() configuration: "1. Jumper (x points)"
        
        for (int i = 0; i < jumpers.size(); i++){
            System.out.println("  " + (i+1) + ". " + jumpers.get(i));
        }
        
        System.out.println("");
    }
    
    public void jump(){

        System.out.println("Results of round " + this.roundNumber);
        
        
        
        for (int i = 0; i < jumpers.size(); i++){
            System.out.println("  " + this.jumpers.get(i).getName());   //Prints the jumper's name
            System.out.println("    length: " + this.jumpers.get(i).jumpLength()); //Generates and prints the length of their jump 
            System.out.println("    judge votes: " + this.jumpers.get(i).judgeStringScores()); //Generates and prints ALL judge scores, not just those used for calculations
            this.jumpers.get(i).setPoints(this.jumpers.get(i).getPoints() + this.jumpers.get(i).jumpScore()); //Changes jumper's total number of points, adding this round's score (length + 3 middle judge scores)
            System.out.println("");
        }
        
        this.roundNumber++;
        
    }
    
    public void printResults(){
        System.out.println("Thanks!\n" +
"\n" +
"Tournament results:\n" +
"Position    Name\n");
        
        Collections.sort(this.jumpers);
        Collections.reverse(this.jumpers); //Combinaiton of these two orders Jumpers in points order so they're listed from best to worst 
        
        for (int i = 0; i < jumpers.size(); i++){ //Goes through list of Jumpers
            System.out.println((i+1) + "           " + jumpers.get(i).toString()); //Prints Jumpers' names and total points
            System.out.println("            jump lengths: " + jumpers.get(i).jumpLengthString()); //Prints list of jump lengths
        }
        
    }
    
        public int compare(Jumper first, Jumper second){ //For use in sorting, from fewest to most points (for purpose of jumping in ordeer that way)
        return first.getPoints() - second.getPoints();
    }
    
}
