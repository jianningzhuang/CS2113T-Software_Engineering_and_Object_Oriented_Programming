import java.util.Scanner;
import java.util.Arrays;


public class Main {

    // You can add more methods here

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        double total = 0;

        System.out.print("Your expenses while overseas?");
        line = in.nextLine();
        String[] arr = line.split(" ");
        String[] result = new String[arr.length];
        int index = 0;
        for (String ele : arr){
          if (ele.charAt(0) == '$'){
            result[index] = ele;
            index++;
            String temp = ele.substring(1, ele.length());
            double val = Double.parseDouble(temp);
            total += val*1.7;
          }
        }
        String[] result1 = Arrays.copyOf(result, index);
        System.out.println("Expenses in overseas currency:" + Arrays.toString(result1));
        System.out.printf("Total in local currency: $%.2f", total);
    }
}
