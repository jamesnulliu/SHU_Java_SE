import java.util.Random;
import java.util.Scanner;

enum PSS {
    PAPER, SCISSOR, STONE
}

public class paperScissorsStone {

    void test3() {
        System.out.println("Let's play Paper Scissor Stone! Enter \"paper\" or \"scissor\" or \"stone\":");
        String userInput;
        PSS userPSS = null;
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            flag = false; // Initialize {flag} to <false>.
            userInput = scanner.nextLine(); // Scan input string.
            userInput = userInput.toLowerCase(); // Standardize the string.
            switch (userInput) {
                case "paper" -> userPSS = PSS.PAPER;
                case "scissor" -> userPSS = PSS.SCISSOR;
                case "stone" -> userPSS = PSS.STONE;
                default -> {
                    System.out.println("[ERROR] Invalid input. Enter \"paper\" or \"scissor\" or \"stone\":");
                    flag = true;
                }
            }
        } while (flag);

        PSS bot = generateAResult();
        System.out.print("[ROBOT] ");
        switch (bot) {
            case PAPER -> System.out.println("paper!");
            case SCISSOR -> System.out.println("scissor!");
            case STONE -> System.out.println("stone!");
        }
        int diff = userPSS.compareTo(bot);
        switch (diff) {
            case -1, 2 -> System.out.println("You loose!");
            case 0 -> System.out.println("Draw!");
            case 1, -2 -> System.out.println("You win!");
        }
    }

    PSS generateAResult() {
        Random r = new Random();
        int i = r.nextInt(3) + 1; // Generate {1,2,3}.
        switch (i) {
            case 1 -> {
                return PSS.PAPER;
                // With enhanced switch, `break;` is not necessary.
            }
            case 2 -> {
                return PSS.SCISSOR;
            }
            case 3 -> {
                return PSS.STONE;
            }
        }
        return null;
    }
}
