public class AlfredTest {

    public static void main(String[] args) {
    // Make an instance of AlfredQuotes to access all it's methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // creating the various String objects
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String chrisGuestGreeting = alfredBot.guestGreeting("Chris Morton", "morning");
        String mistyGuestGreeting = alfredBot.guestGreeting("Misty Morton", "afternoon");
        String jiraiyaGuestGreeting = alfredBot.guestGreeting("Jiraiya Morton", "Nightime");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play that funky music.");
        String alfredTest = alfredBot.respondBeforeAlexis("Help!  I can't find my yoyo.  Maybe Alfred knows where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about.  Not winning, but failing...");
        String angryAlfredTest = alfredBot.angryAlfred("you're not listening to me!");

        // Testing all of the different responses possible
        System.out.println(testGuestGreeting);
        System.out.println(chrisGuestGreeting);
        System.out.println(mistyGuestGreeting);
        System.out.println(jiraiyaGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(angryAlfredTest);
        
    }
}
