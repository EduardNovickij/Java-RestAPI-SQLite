package com.AGroupInterviewTask.entities;

import com.AGroupInterviewTask.compositeKeys.PersonAddressKey;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//Class representing PersonAddress entity.
@Entity
@Table(name = "PersonAddress")
public class PersonAddress {

    //Data stored in PersonAddress entity:
    @EmbeddedId
    private final PersonAddressKey personAddressKey;
    private final String city;
    private final String street;
    private final String appartment;

    //Constructor:
    @JsonCreator
    public PersonAddress(@JsonProperty("addressType") String addressType,
                         @JsonProperty("personId") Integer personId,
                         @JsonProperty("city") String city,
                         @JsonProperty("street") String street,
                         @JsonProperty("appartment") String appartment) {
        this.personAddressKey = new PersonAddressKey(personId, addressType);
        this.city = city;
        this.street = street;
        this.appartment = appartment;
    }

    //Getters:
    public String getAddressType() {
        return personAddressKey.getAddressType();
    }

    public Integer getPersonId() {
        return personAddressKey.getPersonId();
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getAppartment() {
        return appartment;
    }

    //ToString:
    @Override
    public String toString() {
        return "{" +
                "addressType=" + personAddressKey.getAddressType() +
                ", personId=" + personAddressKey.getPersonId() + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", appartment='" + appartment + '\'' +
                '}';
    }
}
