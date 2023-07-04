// public class Grade{
//   public static void main(String[] args){
//     String grade = args[0];
//     double result;
//     switch(grade){
//       case "A+":
//         result = 5.0;
//         break;
//       case "A":
//         result = 5.0;
//         break;
//       case "A-":
//         result = 4.5;
//         break;
//       case "B+":
//         result = 4.0;
//         break;
//       case "B":
//         result = 3.5;
//         break;
//       case "B-":
//         result = 3.0;
//         break;
//       case "C":
//         result = 2.5;
//         break;
//       default:
//         result = 0;
//         break;
//     }
//     System.out.println("CAP for grade " + grade + " is " + result + true); //concatenating different types
//   }
// }

public class Grade{

  public static double[] getMultipleGradeCaps(String[] grades){
    double[] result = new double[grades.length];
    for (int i = 0; i < grades.length; i++){
      result[i] = getGradeCap(grades[i]);
    }
    return result;
  }
  public static double getGradeCap(String grade){
    double result;
    switch(grade){
      case "A+":
        result = 5.0;
        break;
      case "A":
        result = 5.0;
        break;
      case "A-":
        result = 4.5;
        break;
      case "B+":
        result = 4.0;
        break;
      case "B":
        result = 3.5;
        break;
      case "B-":
        result = 3.0;
        break;
      case "C":
        result = 2.5;
        break;
      default:
        result = 0;
        break;
    }
    return result;
  }
  public static void main(String[] args) {
    String[] grades = new String[]{"A+", "A", "A-"};
    double[] caps = getMultipleGradeCaps(grades);
    for (int i = 0; i < grades.length; i++) {
      System.out.println(grades[i] + ":" + caps[i]);
    }
  }
}
