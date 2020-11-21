package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    private Address address;

    public static List<Address> collect(List<Profiles> profiles){
       return profiles
               .stream()
               .map(
                       profile -> profile.address
               )
               .collect(Collectors.toList());
    }
}
