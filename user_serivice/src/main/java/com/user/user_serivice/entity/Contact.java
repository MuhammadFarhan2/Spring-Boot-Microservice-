package com.user.user_serivice.entity;

public class Contact {

    private Long contactId;
    private String contactEmail;
    private String contactName;
    private Long userId;

    public Contact(Long contactId, String contactEmail, String contactName, Long userId) {
        this.contactId = contactId;
        this.contactEmail = contactEmail;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
