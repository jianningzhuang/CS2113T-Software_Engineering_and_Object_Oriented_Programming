public class Main {

    public static void printPrice(String item) {
      String[] arr = item.split("--", 2);
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      String name = arr[0].trim();
      name = name.toUpperCase();
      String price = arr[1].replace("/", ".");
      price = price.substring(1);
      System.out.println(name + ": " + price);

    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
