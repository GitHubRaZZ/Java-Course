public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = -1;  

        String forecast = "";
        if (temp <= -1){
            System.out.println("The forecast is freezing Stay Home");
        }else if(temp <=10){
            System.out.println("The forecast is chilly, Wear a coat");
        }else{
            System.out.println("It's warm, go outside!");
        }
        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        
        System.out.println(forecast);
    }
}
