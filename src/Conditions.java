public class Conditions {
    public static void main(String[] args) {
        //if Statement + else Statement
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); //Outputs "Good evening."
        }
        /*Ternary Operator
        variable = (condition) ? expressionTrue : expressionFalse; */

        //instead of
        int time2 = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //use
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


    }}
