import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();
        int score = 0;
        while(true){
        int diceRoll = rollDice();
        if(diceRoll == 6){
            System.out.println("End of Game");
            break;
        }else if(diceRoll == 4){
            System.out.println("Zero Points. Keep rolling!");
            rollDice();
        }else{
            System.out.println("One point, keep rolling!");
            score++;
            rollDice();
        }
        
        }
        if(score >= 3){
            System.out.println("Wow, that's lucky. You win!");
           
        }else{
            System.out.println("Tough luck, you lose :( ");
        } 

    }
    public static int rollDice(){
        double randomNumber = Math.random()*6+1;
        return (int)randomNumber;
    }
  

  
  
}
