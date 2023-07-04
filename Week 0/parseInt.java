
public class Main {

    public static void printTotalScore(String[] values){
        int total = 0;
        for (String val : values){
          total += Integer.parseInt(val);
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
