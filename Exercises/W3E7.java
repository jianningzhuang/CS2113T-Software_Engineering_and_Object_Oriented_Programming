public class Main {

    public static void printPrice(String item) {
        String[] parts = item.split("--");
        String name = parts[0];
        String price = parts[1];
        name = name.trim();
        name = name.toUpperCase();
        price = price.substring(1);
        price = price.replace("/", ".");
        System.out.println(name + ": " + price);


    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
