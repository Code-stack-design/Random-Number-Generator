import java.util.Random;

public class RandomLuckyNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to the Random Number Generator!");

        Random random = new Random();
        int number = random.nextInt(100) + 1; // Generates a number from 1 to 100

        System.out.println("Your number is: " + number);

        if (number > 90) 
            System.out.println("Lucky you! That is a high number! 🎉");
       else
             System.out.println("Awh! Better luck next time...");
        
    }
}
