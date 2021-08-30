import java.util.ArrayList;
public class BasicJava {
    
    // print all numbers from 1 to 255
    public static void countTo255() {
        for(int i = 1; i<256; i++){
            System.out.println(i);
        }
    }
    // print odd numbers from 1 to 255
    public static void printOddto255(){
        for(int i=1 ; i<=255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    // Return the sum of all numbers from 1 to 255
    public static int sigma255(){
        int sum = 0;
        for(int i=1; i<=255; i++){
            sum += i;
        }
        return sum;
    }
    // Iterate through a given array and print each item
    public static void iterateArr(int integers[]){
        for(int i : integers){
            System.out.println(i);
        }
    }
    // Find max value in a given array and print
    public static void findMax(int integers[]) {
        int max = integers[0];
        for(int i=1; i<integers.length; i++) {
            if(max<integers[i]) {
                max = integers[i];
            }
        }
        System.out.println(max);
    }

    // create an array that contains all odd numbers from 1 to 255
    public static ArrayList<Integer> oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i<=255; i++) {
            if(i % 2 != 0) {
                y.add(i);
            }
        }
        return y;
    }

    // Below is the Ninja Bonus Items

    // Print the average of a given array
    public static void average(int integers[]) {
        double sum = 0;
        double avg = 0;
        for(int i = 0; i<integers.length; i++) {
            sum += integers[i];
        }
        avg = sum/integers.length;
        System.out.println(avg);
    }

    // Check a given array to find and return how many items are greater than a given int
    public static int greaterThanY (int integers[], int y) {
        int count = 0;
        for(int i = 0; i<integers.length; i++) {
            if(integers[i]>y) {
                count++;
            }
        }
        return count;
    }

    // Square the values in a given array and return it back
    public static int[] squaredArray(int integers[]) {
        for(int i = 1; i<integers.length; i++) {
            integers[i]*= integers[i];
        }
        return integers;
    }

    //Take a given array and change any negative values to 0 then return the array
    public static int[] noNegatives(int integers[]) {
        for (int i=0; i<integers.length; i++) {
            if(integers[i]<0){
                integers[i]=0;
            }
        }
        return integers;
    }

    // ******** Sensei Bonus Below  *********

    // Take a given array and find the maximum number, minimum number and the average of the array 
    // return an array with these 3 values
    public static int[] maxMinAvg(int integers[]) {
        int max = integers[0];
        int min = integers[0];
        int sum = 0;
        int avg = 0;
        for(int i=0; i<integers.length; i++){
            if(max<integers[i]){
                max = integers[i];
            }
            if(min>integers[i]){
                min=integers[i];
            }
            sum += integers[i];
        }
        avg = sum/integers.length;
        int[] result = {max, min, avg};
        return result;
    }
    
    // Take a given array and shift all items -1 index.  Final index can stay 0 
    public static int[] shiftValues(int integers[]) {
        for(int i = 1; i<integers.length; i++) {
            integers[i-1] = integers[i];
            if(i == integers.length-1) {
                integers[i]=0;
            }
        }
        return integers;
    }
}