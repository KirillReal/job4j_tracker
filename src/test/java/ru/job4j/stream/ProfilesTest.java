package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private final Profile profile = new Profile();
    private final Profile profile1 = new Profile();
    private final Profile profile2 = new Profile();
    private final Profile profile3 = new Profile();
    private final Profile profile4 = new Profile();

    private final Address address = new Address("1", "Yablonevaya", 4, 3);
    private final Address address1 = new Address("2", "Gagarina", 3, 21);
    private final Address address2 = new Address("3", "Rodionova", 11, 12);
    private final Address address3 = new Address("4", "Brinskogo", 5, 2);
    private final Address address4 = new Address("1", "Yablonevaya", 4, 3);

    private final List<Profile> profileList = new ArrayList<>();

    @Before
    public void setUp() {
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
    public void whenProfileListThenAddressList() {
        List<Address> rsl = Profiles.collect(profileList);
        List<Address> extended = new ArrayList<>();
        extended.add(address);
        extended.add(address1);
        extended.add(address2);
        extended.add(address3);
        assertThat(rsl, is(extended));
    }
}