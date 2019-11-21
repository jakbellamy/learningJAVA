public class Main {

    public static void main(String[] args) {
        String userInput = "entertainment";

        String upperCased = userInput.toUpperCase();
        System.out.println(upperCased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println(userInput.contains("Enter"));
        System.out.println(userInput.contains("Enter".toLowerCase()));
    }
}
