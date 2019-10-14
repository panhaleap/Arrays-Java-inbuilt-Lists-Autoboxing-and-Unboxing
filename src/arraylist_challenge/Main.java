package arraylist_challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        ArrayList<String> conPhone1 = new ArrayList<>();
        conPhone1.add("010 10 10 01");
        conPhone1.add("010 10 10 02");

        ArrayList<String> conPhone2 = new ArrayList<>();
        conPhone2.add("010 10 10 03");
        conPhone2.add("010 10 10 04");

        mobilePhone.addNewContact("Panha Leap", conPhone1);
        mobilePhone.addNewContact("Hor", conPhone2);

        mobilePhone.modifyContact("Panha Leap", "010 10 10 07", 0);
        mobilePhone.modifyContact("Panha Leap", "010 10 10 07", "010 10 10 12");

        mobilePhone.removeContact(-3);
        mobilePhone.printContacts();
    }
}
