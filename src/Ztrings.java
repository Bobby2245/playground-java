public class Ztrings {
    public static  void main(String[] args) {

        //Java Strings
        String txt = "Hello World";//all referred to this String

        // .length()
        System.out.println(txt.length());//Outputs 11

        // .toUpperCase() && .toLowerCase()
        System.out.println(txt.toUpperCase());//Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());//Outputs "hello world"

        // .indexOf()
        System.out.println(txt.indexOf("World"));//Outputs 6

        //String Concatenation
        String firstName = "Benjamin";
        String lastName = "Boateng";
        System.out.println(firstName + " " + lastName);

        // .concat() alternative to "+"
        /*String firstName = "Benjamin";
        String lastName = "Boateng";
        System.out.println(firstName.concat(lastName));*/

        //quotation marks in String (\") or (\')
        String txt2 = "We are the so-called \"Vikings\" from the north."; //double quote in String
        String txt3 = "It\'s alright";
        String txt4 = "The character \\ is called backslash"; //Outputs single backslash in string

        /* \n = New Line
           \r = Carriage Return
           \t = Tab
           \b = Backspace
           \f = Form Feed

         */














    }}
