public class Person implements Printable {

    private String name;

    public Person(String name){
      this.name = name;
    }

    @Override
    public int area(){
      return 0;
    }

    @Override
    public void print(){
      System.out.println("Person of name " + this.name);
    }
}
