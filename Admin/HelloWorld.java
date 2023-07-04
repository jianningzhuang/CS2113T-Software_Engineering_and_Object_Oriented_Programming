public class HelloWorld {
  public static void printLine(String s) {
    System.out.println(s);
  }
  public static void main(String[] args) {
    int[] counts = new int[4];
    for (int i = 0; i < counts.length; i++) {
      printLine(String.valueOf(i));
    }
    printLine("Hello, World! ");
    
  }
}