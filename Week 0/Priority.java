public class Main {

  public enum Priority {
      LOW, MEDIUM, HIGH
  }

    public static void describe(String s, Priority p){
      switch (p){
        case LOW:
          System.out.println(s + " indicates low priority");
          break;
        case MEDIUM:
          System.out.println(s + " indicates medium priority");
          break;
        case HIGH:
          System.out.println(s + " indicates high priority");
          break;
        default:
          System.out.println("Invalid priority");
          break;
      }
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
