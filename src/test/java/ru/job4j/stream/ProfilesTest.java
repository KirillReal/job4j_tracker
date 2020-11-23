package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class ProfilesTest {
    Profile profile = new Profile();
    Profile profile1 = new Profile();
    Profile profile2 = new Profile();
    Profile profile3 = new Profile();
    Profile profile4 = new Profile();

    Address address = new Address("1", "Yablonevaya", 4,3);
    Address address1 = new Address("2", "Gagarina", 3, 21);
    Address address2 = new Address("3", "Rodionova", 11, 12);
    Address address3 = new Address("4", "Brinskogo", 5, 2);
    Address address4 = new Address("1", "Yablonevaya", 4,3);

    List<Profile> profileList = new ArrayList<>();

    @Before
    public void setUp(){
        profile.setAddress(address);
        profile1.setAddress(address1);
        profile2.setAddress(address2);
        profile3.setAddress(address3);
        profile4.setAddress(address4);
        profileList.add(profile);
        profileList.add(profile2);
        profileList.add(profile1);
        profileList.add(profile4);
        profileList.add(profile3);
    }

    @Test
    public void whenProfileListThenAddressList(){
        List<Address> rsl = Profiles.collect(profileList);
        List<Address> extended = new ArrayList<>();
        extended.add(address);
        extended.add(address1);
        extended.add(address2);
        extended.add(address3);
        assertThat(rsl, is(extended));
    }
}