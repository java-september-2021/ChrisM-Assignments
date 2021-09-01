import java.util.Random;
import java.util.ArrayList;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzleTester = new PuzzleJava();

        // System.out.println(puzzleTester.make10Random());
        // System.out.println(puzzleTester.charGenerator());

        // System.out.println(puzzleTester.generatePassword());
        
        ArrayList<String> newSet = puzzleTester.getNewPasswordSet(10);

        
        for(int i=0; i<newSet.size(); i++){
            System.out.println(newSet.get(i));
        }
        

    }
}