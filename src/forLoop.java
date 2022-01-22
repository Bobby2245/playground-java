public class forLoop {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // int i sets a variable before loop starts
        //i<... defines condition for loop to run, if condition ist true loop starts again, if false stops
        // i++ increases value each time the code block has been executed

        //for-each loop: loop through elements in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }}
