package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Profile {
    private Address address;
    public Profile(){
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profile)) return false;
        Profile profile = (Profile) o;
        return getAddress().equals(profile.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress());
    }
}