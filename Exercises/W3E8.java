public class Main {

    public static void printTotalScore(String[] values){
        int total = 0;
        for (String value : values){
            total += Integer.parseInt(value);
        }
        for (int i = 0; i < values.length; i++){
            total += Integer.parseInt(values[i]);
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
