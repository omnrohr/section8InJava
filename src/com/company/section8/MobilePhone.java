package com.company.section8;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact>myContact = new ArrayList<>();

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is exist.");
            return false;
        }

        myContact.add(contact);
        return true;

    }
    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }
    private int findContact(String contactName){
        for (int i =0; i<myContact.size();i++){
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)) return i;
        }return -1;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int contactId = findContact(oldContact);
        if (contactId<0) {
            System.out.println("the contact not found.");
            return false;
        }
        this.myContact.set(contactId,newContact);
        System.out.println("contact hase been updated successfully.");
        return true;
    }
    public String queryContact(Contact contact){
        if (findContact(contact)>=0)return contact.getName();
        return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContact.get(position);
        }

        return null;
    }
    public boolean removeContact(Contact contact){
        int contactId = findContact(contact);
        if (contactId>=0) {
            this.myContact.remove(contact);
            System.out.println("Contact has been removed successfully.");
            return true;
        }
        else {
            System.out.println("Contact not found.");
            return false;
        }
    }
    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContact.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContact.get(i).getName() + " -> " +
                    this.myContact.get(i).getPhoneNumber());
        }

    }
}
