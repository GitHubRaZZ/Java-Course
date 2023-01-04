import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        System.out.print("Pick a number to count by: ");
        int number = scan.nextInt();
        System.out.print("Pick a number to start counting from: ");
        int countingNumber = scan.nextInt();
        System.out.print("Pick a number to count to: ");
        int countToNumber = scan.nextInt();
        for(int i = countingNumber;i <= countToNumber;i+=number)
        System.out.print(i+" ");
        scan.close();
    }
}
