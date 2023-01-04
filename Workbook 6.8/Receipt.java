public class Receipt {
    public static void main(String[] args) {

        String[] brand = {"Gala","Granny Smith", "Macintosh"};
        double[] price = {1.99,1.49,1.29};
        System.out.println("Here's your receipt:\n");
        for(int i = 0; i< brand.length;i++){
            System.out.println(brand[i]+ ":  "+price[i]);
        }

        
        
        // See instructions on Learn the Part (Workbook 6.8)
    
    }
}
