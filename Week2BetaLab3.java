public class Week2BetaLab3 {

    public static void main(String[] args) {
        //A loop that prints each number from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Break in code");
        //A loop that prints each number from 10 to 0 backwards
        for (int d = 10; d >=0; d--) {
            System.out.println(d);
        }
        System.out.println("Break in code");
        //A loop that prints each other number from 0 to 100, I used remainder of zero to determine even numbers
        for (int e = 0; e <= 100; e++) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }
        System.out.println("Break in code");
        //A loop that prints numbers 0 through 100 and states if it is even or odd
        for (int eo = 0; eo <= 100; eo++) {
            if (eo % 2 == 0) {
                System.out.println(eo + " EVEN");
            } else {
                System.out.println(eo + " ODD");
            }
        }
        System.out.println("Break in code");
        //A while loop that starts at 100 backwards to 0; it takes the number and divides by 3 and prints the remainder
        int num = 100;
        while (num > 0) {
            System.out.println(num + " Remainder: " + (num % 3));
            num--;
        }
    }
}