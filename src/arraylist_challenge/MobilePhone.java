package arraylist_challenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addNewContact(String contactName, ArrayList<String> phoneNumbers){
        FoundContact foundContact = searchContactByContactName(contactName.trim());
        if(foundContact == null){
            contacts.add(new Contact(contactName.trim(), phoneNumbers));
            System.out.println("****** Add contact Successfully! ******");
            printPhoneNumbers(contactName, phoneNumbers);
        }else {
            System.err.println("This contact name "+ contactName +" is already exist!");
        }
    }

    public void modifyContact(String contactName, String newContactName){
        FoundContact foundContact = searchContactByContactName(contactName);
        if(foundContact == null){
            System.err.println("Nothing was modified!");
            return;
        }
        Contact contact = foundContact.getContact();
        contact.setContactName(newContactName);
        contacts.set(foundContact.getIndex(), contact);
    }

    public void modifyContact(String contactName, String newPhoneNumber, int optional){
        FoundContact foundContact = searchContactByContactName(contactName);
        if(foundContact == null){
            System.err.println("Nothing was modified!");
            return;
        }
        Contact contact = foundContact.getContact();
        boolean phoneExist = contact.getPhoneNumbers().contains(newPhoneNumber);
        if (phoneExist){
            System.err.println("This phone already existed, nothing was modified!");
            return;
        }
        contact.getPhoneNumbers().add(newPhoneNumber);
        contacts.set(foundContact.getIndex(), contact);
        System.err.println("Successfully added New Phone Number "+ newPhoneNumber +" to Contact Name "+ contactName);
    }

    public void modifyContact(String contactName, String oldNumber, String newPhoneNumber){
        FoundContact foundContact = searchContactByContactName(contactName);
        if(foundContact == null){
            System.err.println("Nothing was modified!");
            return;
        }
        Contact contact = foundContact.getContact();
        int indexPhoneNumber = contact.getPhoneNumbers().indexOf(oldNumber);
        if(indexPhoneNumber < 0){
            System.err.println("This phone number "+ oldNumber +" doesn't exist in Contact "+ contactName+"!");
            return;
        }
        contact.getPhoneNumbers().set(indexPhoneNumber, newPhoneNumber);
        contacts.set(foundContact.getIndex(), contact);
        System.err.println("Successfully edit old Phone Number "+ oldNumber +" to New Phone Number "+ newPhoneNumber +" to Contact Name "+ contactName);
    }

    public void removeContact(int index){
        if( index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        }else {
            System.err.println("Nothing was deleted!\n");
        }
    }

    public void findContact(String contactName){
        FoundContact foundContact = searchContactByContactName(contactName);
        if(foundContact != null) {
            Contact contact = foundContact.getContact();
            printPhoneNumbers(contactName, contact.getPhoneNumbers());
        }else {
            System.out.println("Nothing found!");
        }
    }

    public FoundContact searchContactByContactName(String contactName){
        int foundIndex = 0;
        for (Contact contact : contacts){
            if(contact.getContactName().equalsIgnoreCase(contactName.trim())) {
                return new FoundContact(foundIndex, contact);
            }
            foundIndex++;
        }
        return null;
    }

    public void printContacts(){
        System.out.println("****************** All Contacts ******************");
        if(contacts.size() == 0){
            System.out.println("No contacts to be printed!");
        }
        for(Contact contact: contacts){
            printPhoneNumbers(contact.getContactName(), contact.getPhoneNumbers());
        }
        System.out.println("**************************************************");
    }

    private void printPhoneNumbers(String contactName, ArrayList<String> phones){
        System.out.println("Name: "+ contactName);
        System.out.println("Phone Numbers: ");
        for(String phone : phones){
            System.out.println(phone);
        }
        System.out.println("--------------");
    }

    private class FoundContact{
        private int index;
        private Contact contact;

        private FoundContact(int index, Contact contact) {
            this.index = index;
            this.contact = contact;
        }

        private int getIndex() {
            return index;
        }

        private Contact getContact() {
            return contact;
        }
    }
}
