public class Main {

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
                result = 0.0;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("A+: " + getGradeCap("A+"));
        System.out.println("B : " + getGradeCap("B"));
    }
}
