import java.util.ArrayList;
class NotAnIntegerException extends Exception{}


public class ExceptionLists {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
    
        try{
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Value has been cast to integer for " + myList.get(i));
            }
        }catch(Exception e) {
            System.err.println(e.getMessage() + "This can not be cast to an integer.");
        } finally {
            System.out.println("The try is finished");
        }
    }
}