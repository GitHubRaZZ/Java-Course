import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
        double secret = Math.random()*5;
        int guess = scan.nextInt();
        while(guess == (int)secret){
            System.out.println("Guess again!");
            guess = scan.nextInt();
            
        }
        System.out.println("You got it!");
        scan.close();
    }

}
