package com.company;

import java.util.Date;

public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person other) {
        //-10, -100, 12, 17, 17, -21, -9
        //-100, -21, -10, -9, 12, 17

        //this - a
        //o (other) - b

        //-1 - means less than (other goes first)
        //0 - means yes
        //1 - mean greater than (this goes first)

        boolean areEqual = other.personId.equals(this.personId);
        if (areEqual) {
            return 0;
        } else {
            //                      3                   2
            boolean isGreaterThan = other.getPersonId() < this.getPersonId();
            if (isGreaterThan) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    private Integer personId;
    private String firstName;
    private String lastName;
    private Date createdOn;


    public Person(Integer personId, String firstName, String lastName, Date createdOn) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdOn = createdOn;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "----------------------------\n" +
                "Person ID: " + personId + "\n" +
                "FirstName: " + firstName + "\n" +
                "LastName: " + lastName + "\n" +
                "CreatedOn: " + createdOn + "\n" +
                "----------------------------\n";
    }
}
