public class BreakContinue {
    public static void main(String[] args) {
      //break statement can also be used to jump out of lopp (not only out of switch)
      for (int i = 0; i < 10; i++){
          if (i==4) {
              break;
          }
          System.out.println(i);
          }
      //continue statement breaks one iteration (in the loop) if condition occurs and continues with next iteration in the loop
        //skip value:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        //break in  while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        //continue in while loop
        /*int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/



    }}
