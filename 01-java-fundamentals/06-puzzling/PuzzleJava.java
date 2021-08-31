import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {

    

    public static ArrayList<Integer> make10Random(){
        Random random = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            int randInt = random.nextInt(19)+1;
            randArray.add(randInt);
        }
        return randArray;
    }

    public static char[] charGenerator(){
        Random random = new Random();
        ArrayList<Character> charList = new ArrayList<Character>();
        // generate an array of alphabet using a for loop
        for(char c = 'a'; c<='z'; c++){
            
            charList.add(c);
        }
        int randInt = random.nextInt(25);
        char[] charReturn = charList.get(randInt);
        return charReturn;
    }


}