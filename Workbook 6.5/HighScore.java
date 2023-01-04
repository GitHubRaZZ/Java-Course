public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] array = {randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
        for(int i = 0; i < array.length-1;i++){
            System.out.print("\n Here are the scores: "+array[i]);
            if (array[i] > highScore) {
                highScore = array[i];
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    
    public static int randomNumber(){
        double randomNumber = Math.random()*49999 +1;
        return  (int)randomNumber;
    }
}
