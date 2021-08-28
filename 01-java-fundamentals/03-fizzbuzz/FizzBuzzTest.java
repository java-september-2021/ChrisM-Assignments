public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzzTest = new FizzBuzz();

        String testFizzBuzz = fizzBuzzTest.fizzBuzz(3);
        String secondFizzBuzz = fizzBuzzTest.fizzBuzz(5);
        String thirdFizzBuzz = fizzBuzzTest.fizzBuzz(15);
        String fourthFizzBuzz = fizzBuzzTest.fizzBuzz(7);
        String overloadedFizzBuzz = fizzBuzzTest.fizzBuzz(15, "Yee", "Haw", "YeeHaw");
        
        System.out.println(testFizzBuzz);
        System.out.println(secondFizzBuzz);
        System.out.println(thirdFizzBuzz);
        System.out.println(fourthFizzBuzz);
        System.out.println(overloadedFizzBuzz);

        //Got creative with the loop and overload
        for(int i = 1; i <= 50; i++) {
            System.out.println(fizzBuzzTest.fizzBuzz(i, "Yee", "Haw", "YeeHaw"));
        }
    }
}