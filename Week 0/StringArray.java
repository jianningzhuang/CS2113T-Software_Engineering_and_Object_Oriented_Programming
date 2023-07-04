import java.util.Arrays;

public class Main {
    public static String[] filterEmails(String[] items){
        String[] result = new String[items.length];
        int index = 0;
        for (String item : items){
          if (item.contains("@")){
            result[index] = item;
            index++;
          }
        }
        return Arrays.copyOf(result, index);
    }

    public static void printItems(String[] items){
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}
