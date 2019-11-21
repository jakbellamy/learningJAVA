import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("User One — Enter a Word:");
        String userOneKey = sc.next().toLowerCase();
        System.out.println("User Two — Without Cheating, See If You Can Guess a Letter in User One's Word");
        String userTwoGuess = sc.next().toLowerCase();

        boolean result = userOneKey.contains(userTwoGuess);

        if(result){
            System.out.println("Player Two Wins!");
        } else {
            System.out.println("Player Two Loses!");
        }
    }
}
