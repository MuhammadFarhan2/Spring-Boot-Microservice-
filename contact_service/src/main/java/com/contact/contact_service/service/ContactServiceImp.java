package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImp implements ContactService{
//    fake Data

    List<Contact> contactList = List.of(
        new Contact(1L,"sk@gmail.com","Sikandar",1311L),
        new Contact(2L,"ak@gmail.com","Ahsan",1311L),
        new Contact(3L,"shah@gmail.com","Shahzad",1311L),
        new Contact(4L,"sammar@gmail.com","sammar",1311L),
        new Contact(5L,"salam@gmail.com","Salam",1312L),
        new Contact(6L,"farhan@gmail.com","farhan",1312L),
        new Contact(7L,"abc@gmail.com","abc",1313L)
    );


    @Override
    public List<Contact> getContactOfUsers(Long userId) {
        return this.contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
