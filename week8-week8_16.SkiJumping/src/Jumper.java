import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private ArrayList<Integer> jumps;
    private int jumpScore;
    private int[] judges;
    private String judgeScores;
    
    public Jumper(String name, int points){
        this.name = name;
        this.points = points;
        this.jumps = new ArrayList<Integer>();
        this.jumpScore = 0;
        this.judges = new int[5];
        this.judgeScores = "[";
    }
    
    public void setName(Scanner reader){
        this.name = reader.nextLine();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void setPoints(int newPoints){
        this.points = newPoints;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.points + " points)";
    }
    
    @Override
    public int compareTo(Jumper j){
        return this.points - j.points;
    }
    
    public int jumpLength(){
        Random r = new Random();
        this.jumpScore = (r.nextInt(61) + 60);
        this.jumps.add(this.jumpScore);
        return this.jumpScore;
    }
    
    public int[] judgeScores(){
        Random r = new Random();
        
        for (int i = 0; i < 5; i++){
            this.judges[i] = (r.nextInt(11) + 10);
            this.judgeScores += "" + this.judges[i] + ", ";
        }

        this.judgeScores += (this.judgeScores().length - 1) + "]";
        
        return this.judges;
    }
    
    public String judgeStringScores(){
        return this.judgeScores;
    }
    
    public int jumpScore(){
        
        int judgePoints = 0;
        
        Arrays.sort(this.judgeScores());
        
        for (int i = 1; i < 4; i++){
            judgePoints += this.judges[i];
        }
        
        this.jumpScore += judgePoints;
        
        return jumpScore;
    }
    
    public String jumpLengthString(){
        String jumps = "";
        
        for (int i = 0; i < this.jumps.size() - 1; i++){
            jumps += (this.jumps.get(i) + " m, ");
        }
        
        jumps += this.jumps.get(this.jumps.size() -1) + "m";
        
        return jumps;
    }
    
}
