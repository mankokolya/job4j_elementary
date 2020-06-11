package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        Stream<Address> result = profiles.stream().map(Profile::getAddress);
        return result.sorted().distinct().collect(Collectors.toList());
    }
}
