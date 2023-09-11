/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args){
        for_loop();
//        System.out.print("\n");
//        while_loop();
    }
    private static void for_loop() {

        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }

    private static void while_loop(){
        int i = 1;
        while (i < 100){
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy5 && divBy3){
                System.out.println("Fizz Buzz");
            } else if (divBy5) {
                System.out.println("Buzz");
            } else if (divBy3) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            i ++;
        }
    }
}
