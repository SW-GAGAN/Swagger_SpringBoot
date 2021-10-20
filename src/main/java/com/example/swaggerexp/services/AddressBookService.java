package com.example.swaggerexp.services;

import com.example.swaggerexp.model.Contact;

import java.util.List;

public interface AddressBookService {

    public List<Contact> getContacts();

    public Contact getContacts(long contactId);

    public Contact addContact(Contact contact);

    public Contact updateContact(Contact contact);

}
