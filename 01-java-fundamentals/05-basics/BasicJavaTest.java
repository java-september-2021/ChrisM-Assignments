import java.util.ArrayList;
import java.util.*;
public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava javaTest = new BasicJava();

        // javaTest.countTo255();
        // javaTest.printOddto255();
        // System.out.println(javaTest.sigma255());
        // I used these arrays for each test later on.  Left uncommented
        int[] intArray = {1,3,5,7,9,13};
        int[] negArray = {-3,-5,-7};
        int[] allArray = {0, -2, 9,25,-8, 45};
        // javaTest.iterateArr(intArray);
        // javaTest.findMax(intArray);
        // javaTest.findMax(negArray);
        // javaTest.findMax(allArray);
        // ArrayList<Integer> odd = javaTest.oddArray();
        // System.out.println(odd);
        
        // Below is the Ninja Bonuses and then I'll seperate Sensei bonuses if I complete them

        // Get Average Test Cases
        
        // javaTest.average(intArray);
        // javaTest.average(negArray);
        // javaTest.average(allArray);

        //Greater Than Y Test Cases

        // int greaterTest = javaTest.greaterThanY(intArray, 3);
        // System.out.println(greaterTest);

        // int greaterTest2 = javaTest.greaterThanY(negArray, -4);
        // System.out.println(greaterTest2);

        // int greaterTest3 = javaTest.greaterThanY(allArray, 1);
        // System.out.println(greaterTest3);

        //Squared array test cases
        // int[] squaredTest = javaTest.squaredArray(intArray);
        // for(int i = 0; i<squaredTest.length; i++) {
        //     System.out.println(squaredTest[i]);
        // }
        
        // int[] squaredTest2 = javaTest.squaredArray(negArray);
        // for(int i = 0; i<squaredTest2.length; i++) {
        //     System.out.println(squaredTest2[i]);
        // }

        // int[] squaredTest3 = javaTest.squaredArray(allArray);
        // for(int i = 0; i<squaredTest3.length; i++) {
        //     System.out.println(squaredTest3[i]);
        // }

        //Eliminate negative numbers test
        // int[] noNegTest = javaTest.noNegatives(negArray);
        // for(int i : noNegTest){
        //     System.out.println(i);
        // }
        
        // int[] noNegTest2 = javaTest.noNegatives(allArray);
        // for(int i : noNegTest2){
        //     System.out.println(i);
        // }
        

        // ***** Sensei Bonus!!! ******

        // Max, Min, and Average Tests
        // int[] maxMinAvgTest = javaTest.maxMinAvg(intArray);
        // for(int i : maxMinAvgTest){
        //     System.out.println(i);
        // }

        // int[] maxMinAvgTest2 = javaTest.maxMinAvg(negArray);
        // for(int i : maxMinAvgTest2){
        //     System.out.println(i);
        // }

        // int[] maxMinAvgTest3 = javaTest.maxMinAvg(allArray);
        // for(int i : maxMinAvgTest3){
        //     System.out.println(i);
        // }


        // Shift Values Test
        int[] shiftTest = javaTest.shiftValues(intArray);
        for(int i : shiftTest){
            System.out.println(i);
        }
    
        int[] shiftTest2 = javaTest.shiftValues(negArray);
        for(int i : shiftTest2){
            System.out.println(i);
        }

        int[] shiftTest3 = javaTest.shiftValues(allArray);
        for(int i : shiftTest3){
            System.out.println(i);
        }
    }
}