import javax.lang.model.util.SimpleTypeVisitor9;

public class PhoneTester {
    public static void main(String[] args) {
        IPhone iPhoneTen = new IPhone("X", 100, "AT&T", "Zing");
        Galaxy s9 = new Galaxy("S9", 99, "TMobile", "Ring, Ring, Ring!");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iPhoneTen.displayInfo();
        System.out.println(iPhoneTen.ring());
        System.out.println(iPhoneTen.unlock());
    }
}
