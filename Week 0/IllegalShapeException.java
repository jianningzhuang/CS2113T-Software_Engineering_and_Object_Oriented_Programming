public class IllegalShapeException extends Exception {
  //no other code needed
}


public class Main {

    public static void printArea(String descriptor){
        try {
          System.out.println(descriptor + "=" + calculateArea(descriptor));
        }
        catch (NumberFormatException e){
          System.out.println("WIDTH or HEIGHT is not a number: " + descriptor);
        }
        catch (IndexOutOfBoundsException e){
          System.out.println("missing dimensions");
        }
        catch (IllegalShapeException e){
          System.out.println("illegal shape");
        }
        finally {
          System.out.println("cleaning up");
        }
    }

    private static int calculateArea(String descriptor) throws IllegalShapeException{
        //TODO: modify the code below
        String[] dimensions = descriptor.split("x");
        if (dimensions.length > 2){
          throw new IllegalShapeException();
        }
        return Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);
    }

    public static void main(String[] args) {
        printArea("3x4");
        printArea("3xy");
        printArea("3x");
        printArea("3");
        printArea("3x4x5");
    }
}
