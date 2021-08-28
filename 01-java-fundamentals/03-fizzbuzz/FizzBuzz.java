public class FizzBuzz {
    public String fizzBuzz(int number) {
        String answer;
        if(number % 3 == 0  && number % 5 == 0){
            answer = "FizzBuzz";
        }else if(number % 5 == 0) {
            answer = "Buzz";
        }else if(number % 3 == 0) {
            answer = "Fizz";
        }else {
            answer = String.valueOf(number);
        }
    return answer;
    }

    public String fizzBuzz(
        int number, 
        String multOf3Word, 
        String multOf5Word, 
        String multOf15Word
        ) {
            String answer;
            if(number % 3 == 0 && number % 5 == 0) {
                answer = multOf15Word;
            }else if(number % 5 == 0){
                answer = multOf5Word;
            }else if(number % 3 == 0) {
                answer = multOf3Word;
            }else {
                answer = String.valueOf(number);
            }
            return answer;
        }
}