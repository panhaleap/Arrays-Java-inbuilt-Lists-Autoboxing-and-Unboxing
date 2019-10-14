package arraylist_challenge;

import java.util.ArrayList;

public class Contact {
    private String contactName;
    private ArrayList<String> phoneNumbers= new ArrayList<>();

    public Contact(String contactName, ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        this.contactName = contactName;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
