import java.util.Date;
public class AlfredQuotes {


    // Generic greeting given in assignment
    public String basicGreeting() {
    return "Hello, lovely to see you. How are you?";
    }

    // Returns a greeting that includes the person's name as well as the day period.
    public String guestGreeting(String name, String dayPeriod) {
        String greeting;
        if (dayPeriod.equals("morning")){
            greeting = String.format("Good %s, %s. Would you like some coffee?", dayPeriod, name);
        }else if (dayPeriod.equals("afternoon")) {
            greeting = String.format("Good %s, %s. Would you like to stay for some tea?", dayPeriod, name);
        }else if(dayPeriod.equals("evening")) {
            greeting = String.format("Good %s, %s. How about a nightcap?", dayPeriod, name);
        }else {
            greeting = String.format("This is unfamiliar ground we're treading here, %s. I'm not aware of the time of %s", name, dayPeriod);
    }
    return greeting;
    }

    // Returns a polite announcement of the date
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("Todays date is: %tc", date);
    }
    // Alfred is listening Final Challenge
    public String respondBeforeAlexis(String conversation) {
        String response;
        if(conversation.indexOf("Alexis") != -1) {
            response = "She isn't capable of handling your request.  I'll take care of things from here.";
        }else if(conversation.indexOf("Alfred") != -1) {
            response = "As you wish!";
        }else {
            response = "It would appear that I'm no longer needed here.";
        }
        return response;
    }

    //NINJA BONUS
    //Write your own AlfredQuote method using any of the String methods that you have learned!
    public String angryAlfred(String statement) {
        String shout = statement.toUpperCase();
        return shout;
    }

}

