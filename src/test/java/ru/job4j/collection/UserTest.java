package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>(Set.of(
                new User("Petr", 32),
                new User("Ivan", 31)
        ));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenNamesEquals() {
        Set<User> users = new TreeSet<>(Set.of(
                new User("Petr", 32),
                new User("Ivan", 31),
                new User("Petr", 33)
        ));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
        assertThat(it.next(), is(new User("Petr", 33)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertTrue(rsl > 0);
    }
}
