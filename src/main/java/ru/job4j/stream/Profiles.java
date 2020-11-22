package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    private static Profile profile;
    private Address address;
    public static List<Address> collect(List<Profiles> profiles){
       return profiles
               .stream()
               .map(
                  profiles1 -> profile.getAddress()
               )
               .collect(Collectors.toList());
    }
}
