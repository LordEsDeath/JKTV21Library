/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Reader {
    private String firstname;
    private String lastname;
    private String phone;

    public Reader(String firstname, String lastname, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Reader() {
    }

    public String getFirstname() {
        return firstname;
    }
    
      public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getPhone() {
        return phone;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Reader{" + "firstname=" + firstname + ", lastname=" + lastname + ", Phone"+ phone +'}';
    }
    
}
