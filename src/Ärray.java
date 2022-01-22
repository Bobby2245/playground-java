public class Ärray {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "mouse"};
        int[] myNum = {10, 20, 30};

        //Access the Elements of an Array
        System.out.println(animals[0]); //Outputs "dog"

        //Change an Array element, refer new element to the index number
        animals[0] = "shark"; //Now Outputs shark instead of dog

        //Array Length
        System.out.println(animals.length); // Outputs 3

        //Loop through an Array
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);  //loop through array with for loop and use length property to specify times the loop should run
        }
        //Loop through Array with For-Each
        for (String i : animals) {
            System.out.println(i);/*for each String element i, print out the value of i,; for each loop is easier to
            write, does not require a counter (length property)*/
        }

        // Multidimensional Array = Array of Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        //Access elements of Multidimensional Array
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2]; // which Array, which position in Array
        System.out.println(x); // Outputs 7

        //alternative for accessing elements in multidimensional array: for loop inside for loop
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }





    }}
