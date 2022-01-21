public class Zwitch {
    public static void main(String[] args) {
        //Syntax

        /* int expression = ...;
        switch(expression) {
            case x:
                // code block w/ e.g. System.out.println()
                break;
            case y:
                // code block
                break;
            default:
                // code block
        } */
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend"); // Outputs "Looking forward to the Weekend"
        }
        //Note that if the default statement is used as the last statement in a switch block, it does not need a break.






    }}
