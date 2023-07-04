import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String[] process(String line) {
        String[] words = line.split(" ");
        String[] expanses = new String[words.length];
        int counter = 0;
        for (String word : words){
            if (word.startsWith("$")){
                expanses[counter] = word;
                counter++;
            }
        }
        return Arrays.copyOf(expanses, counter);
    }

    public static String convert(String[] expanses) {
        double total = 0;
        for (String expanse : expanses) {
          expanse = expanse.substring(1);
            total += Double.parseDouble(expanse) * 1.7;
        }
        return String.format("%.2f", total);

    }

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Your expenses while overseas?");
        line = in.nextLine();
        String[] expanses = process(line);
        System.out.print("Expenses in overseas currency:");
        System.out.println(Arrays.toString(expanses));
        System.out.print("Total in local currency: $");
        String amount = convert(expanses);
        System.out.println(amount);
    }
}
