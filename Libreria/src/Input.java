import java.util.Scanner;

public class Input {
    private static final Scanner tastiera = new Scanner(System.in);

    public static int getInt() {
        int x = -1;
        String temp = tastiera.nextLine();

        try {
            x = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            return x;
        }

        return x;
    }
}
