package ru.job4j.lambda;

import java.util.Objects;

public class Address implements Comparable<Address> {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        } else if (obj != null) {
            if (getClass() == obj.getClass()) {
                Address other = (Address) obj;
                result = Objects.equals(this.city, other.city);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    public String getCity() {
        return city;
    }


    @Override
    public int compareTo(Address o) {
        return this.city.compareTo(o.city);
    }
}
