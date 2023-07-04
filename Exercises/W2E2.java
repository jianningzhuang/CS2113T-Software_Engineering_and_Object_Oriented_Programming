public class Main{
  public static void main(String[] args){
    try{
      String first = args[0];
      String second = args[1];
      System.out.println("Words given: " + first + ", " + second);
      System.out.println("They are the same: " + first.equals(second));
    }
    catch(Exception e){
      //do nothing
    }
  }
}
