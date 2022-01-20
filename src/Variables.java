public class Variables {
    public static void main(String[]args){

        String name = "Leon";
        System.out.println(name); //short: sout

        int birthYear = 1999;            //primitiver Datentyp; int -2 to 2 billion, then long
        System.out.println(birthYear);

        int addNumberLater;
        addNumberLater = 15;
        System.out.println(addNumberLater);

        final int number = 69;
        //number = 70;          final variables can not be changed!

        float myFloatNum1 = 3.14f;         //primitiver Datentyp
        float newFloat = myFloatNum1/2;
        System.out.println(newFloat);


        char myLetter = 'B';             //primitiver Datentyp
        boolean myBool = true;

        //adding variables strings, declare many variables
        String firstName = "Benjamin", lastName = "Boateng", fullName = firstName +" "+ lastName; //space
        System.out.println(fullName);

        //adding variables integers with small result
        double x = 50;//µg/mL                       //cave all double!!
        double y = 50000;//µg/mL
        double z = 30;//mL
        double volAmpicillin = (x*z)/y;
        System.out.println(volAmpicillin);

















    }

}