public class Casting {
    public static void main(String[] args) {
        //widening casting: byte -> short -> char -> int -> long -> float -> double
        //narrowing casting: double -> float -> long -> int -> char -> short -> byte

        //widening
        int myInt = 21;
        System.out.println(myInt);
        double myDouble = myInt;        //Automatic casting
        System.out.println(myDouble);

        //narrowing
        double myDouble2 = 9.78d;
        System.out.println(myDouble2);
        int myInt2 = (int) myDouble2;   //manual casting '(int)'
        System.out.println(myInt2);
    }
}
