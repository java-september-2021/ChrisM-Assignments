import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

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

    public static Character charGenerator(){
        Random random = new Random();
        ArrayList<Character> charList = new ArrayList<Character>();
        // generate an array of the alphabet using a for loop
        for(char c = 'a'; c<='z'; ++c){
            charList.add(c);
        }
        Character charReturn = charList.get(random.nextInt(26));
        return charReturn;
    }

    public static String generatePassword(){
        String password = "";
        for(int i=0; i<8; i++){
            password = password + charGenerator();
        }
        return password;
    }
    
    public static ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }


    public ArrayList<String> shuffleArray(ArrayList<String> arr){
        Collections.shuffle(arr);
        return arr;
    }
}