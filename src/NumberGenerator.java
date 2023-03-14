import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {

    public static void main(String[] args) {
        //Task 2:
//    Generate a random number 1 to 100,
//    ask the user to guess the number
//    and print if inserted number is higher,
//    lower or equal to the number.
//
//    Ask the question until user has entered "exit"
//
//    Hint: Math.random()

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        System.out.println(secretNumber);
        System.out.println("Hello! I've generated a random number between 1 and 100. Please guess what?");


        String input = scanner.nextLine();;
        while (!input.equals("exit")) {
            if (secretNumber == Integer.parseInt(input)) {
                System.out.println("Wow! You are a genius!" + " " + secretNumber + " is correct answer!");
                break;
            } else if (Integer.parseInt(input) < secretNumber) {
                System.out.println("The number is bigger than you guessed. Please try again!");
            } else if (Integer.parseInt(input) > secretNumber) {
                System.out.println("The number is smaller than you guessed. Please try again!");
            } input = scanner.next();
        } System.out.println("You have finished the game. Bye!");
    }
}