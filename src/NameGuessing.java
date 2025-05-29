import java.util.Scanner;

public class NameGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();

        String cleanName = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                cleanName += ch;
            }
        }

        int sum = 0;
        for (int i = 0; i < cleanName.length(); i++) {
            char ch = cleanName.charAt(i);
            int letterValue = ((ch - 'A') % 9) + 1;
            sum += letterValue;
        }

        System.out.println("Sum Of Your Name Is: " + sum);

        int reduced = reduceToSingleOrMaster(sum);
        System.out.println("Your Name Number is: " + reduced);

        String description = getPersonalityDescription(reduced);
        System.out.println("Your Character Description: " + description);

        scanner.close();
    }

    static int reduceToSingleOrMaster(int number) {
        while (number > 9 && number != 11 && number != 22) {
            int newSum = 0;
            while (number > 0) {
                newSum += number % 10;
                number = number / 10;
            }
            number = newSum;
        }
        return number;
    }

    static String getPersonalityDescription(int number) {
        switch (number) {
            case 1: return "Independent and ambitious.";
            case 2: return "Peaceful and cooperative.";
            case 3: return "Expressive and fun-loving.";
            case 4: return "Practical and disciplined.";
            case 5: return "Curious and adaptable.";
            case 6: return "Responsible and loving.";
            case 7: return "Analytical and spiritual.";
            case 8: return "Ambitious and efficient.";
            case 9: return "Compassionate and generous.";
            case 11: return "Visionary and intuitive.";
            case 22: return "Master builder and leader.";
            default: return "Unknown personality.";
        }
    }
}
