public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if(wallet >= toyCar){
            System.out.println("sure");
            wallet -= toyCar;
        }else{
            System.out.println("Sorry,i only have " +wallet+ " left");
        }
    

        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(wallet >= nike){
            System.out.println("sure!");
            wallet -= nike;
        }else{
            System.out.println("Sorry i only have "+wallet+" left");
        }
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.

    }
}